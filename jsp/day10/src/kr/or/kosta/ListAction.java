package kr.or.kosta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class ListAction
 */
@WebServlet("/list.do")
public class ListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListAction() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8"); //json으로 작성할 문서야
		//mime type (마임타입)
		
		PrintWriter out = response.getWriter();
		JSONArray arr = new JSONArray();
		JSONObject o1 = new JSONObject();
		
		o1.put("name", "홍길동");
		o1.put("age",20);
		
		JSONObject o2 = new JSONObject();
		o2.put("name", "김하나");
		o2.put("age",10);
		
		arr.add(o1);
		arr.add(o2);
		
		out.print(arr);
		
	}

}
