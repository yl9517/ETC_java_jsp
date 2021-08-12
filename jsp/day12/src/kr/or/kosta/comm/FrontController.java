package kr.or.kosta.comm;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(urlPatterns = {"*.do"}	// url
			, initParams = {@WebInitParam(name="init", value="WEB-INF/prop.properties")}) //최초 실행 시 제공하는 Param
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() {
        super();
    }
    /* collections = 객체를 묶어놓은,, list,map,set이 있음
     * list - 중복허용,순서 보장 - (arraylist 비동기, vector동기 - 배열 / LinkedList)
     * map - 키,값으로 저장 (hashmap 비동기, hashtable 동기)
     * set - 중복불가, 순서보장X 
     */
    private Map<String, Action> hm = Collections.synchronizedMap(new HashMap<String, Action>());
    											// map으로 넘김
    @Override
    public void init(ServletConfig config) throws ServletException{
    	String param = config.getInitParameter("init");  //WEB-INF/prop.properties
 //   	System.out.println(param);
    	
    	String realpath = config.getServletContext().getRealPath(param);  // 실제 컴퓨터 내 경로
//    	System.out.println(realpath);
    	
    	Properties prop = new Properties();
    	try {
    		prop.load(new FileReader(realpath));  //prop 파일 읽어옴
    		Iterator ita = prop.keySet().iterator();
    		
    		while(ita.hasNext()) {
    			String key = (String)ita.next();		//list.do
    			String value = (String) prop.get(key);  //kr.or.kosta.controller.ListAction 문자

    			Class c = Class.forName(value);	//문자를 객체로 만들어줌 (객체는 Class로 받아야함)
    			Action act = (Action) c.newInstance();  //hm에 담을 수 있는 객체로 변환
    			
    			hm.put(key, act); //hashmap에 담기 - hm(문자,객체)
    		}
    		
    	}catch (Exception e) {
			System.out.println(e);
		}
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReq(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReq(request, response);
	}
	
	private void doReq(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		//원래는 if 어쩌구...
		Action act = hm.get(path); //key 경로 hm에 넣으면 .. 해당 key의 value값 불러와짐
		
		Forward forward = act.execute(request, response);
		
		if(forward.isForward()) {
			RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
			dis.forward(request, response);
		}else {
			response.sendRedirect(forward.getPath());
		}
		
	}
}
