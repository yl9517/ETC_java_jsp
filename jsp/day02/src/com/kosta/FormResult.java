package com.kosta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormResult
 */
@WebServlet(name = "a",urlPatterns = {"/result"})
public class FormResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReq(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReq(request, response);
	}
	
	private void doReq(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name= request.getParameter("name");
		String gen = request.getParameter("gender"); //���� �ϳ��̹Ƿ�
		String[] fav = request.getParameterValues("fav"); //üũ�ڽ� �� ������ �迭�� �ޱ�
		String addr = request.getParameter("addr"); 
		String talk = request.getParameter("talk"); 

		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out = response.getWriter();
		out.print("이름:"+id+"<br>");
		out.print("패스워드:"+pwd+"<br>");
		out.print("이름:"+name+"<br>");
		out.print("성별:"+gen+"<br>");
		
		String favResult = "���:";
		for(String item:fav) {
			favResult+=item+"  ";
		}
		out.print(favResult+"<br>");
		
		out.print("주소:"+addr+"<br>");
		out.print("비고:"+talk+"<br>");
		
		
	}

}
