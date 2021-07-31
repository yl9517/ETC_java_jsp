package com.kosta;

/*
 *   servlet(서블릿) lifecycle(생명주기)
 *   init : 서블릿이 최초로 실행될때 첫 한번만 동작
 *   		=> server 도작 후 서블릿이 처음동작 할때
 *   service : 요청이 일어날때마다 계속동작
 *   		=> doGet 혹은 doPost로 동작!!
 *   destory : 서블릿 객체가 없어질때
 *   		=> 서버가 종료될때 한번만 동작
 * 
 */

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */

public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destory");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service");
	}

}
