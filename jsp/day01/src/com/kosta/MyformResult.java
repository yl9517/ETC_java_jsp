package com.kosta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyformResult
 */

public class MyformResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyformResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("post");
		
		request.setCharacterEncoding("utf-8");
		
		//요청 ( 이름,나이 줘 )
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		
			response.setContentType("text/html;charset=utf-8");
		
		//응답 (보내기)
		PrintWriter out = response.getWriter();
		out.print("name :"+name+"\n");
		out.print("age :"+age+"\n");
		
	}

}
