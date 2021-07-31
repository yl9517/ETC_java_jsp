package com.kosta;

/*
 *   servlet(����) lifecycle(�����ֱ�)
 *   init : ������ ���ʷ� ����ɶ� ù �ѹ��� ����
 *   		=> server ���� �� ������ ó������ �Ҷ�
 *   service : ��û�� �Ͼ������ ��ӵ���
 *   		=> doGet Ȥ�� doPost�� ����!!
 *   destory : ���� ��ü�� ��������
 *   		=> ������ ����ɶ� �ѹ��� ����
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
