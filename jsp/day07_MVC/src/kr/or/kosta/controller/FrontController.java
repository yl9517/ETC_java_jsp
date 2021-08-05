package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		System.out.println(path);
		
		Action act = null;
		if(path.equals("/list.do")) {
			act = new ListAction();
		}else if (path.equals("/insert.do")) {
			act = new InsertAction();
		}else if (path.equals("/insertresult.do")) {
			act = new InsertResultAction();
		}else if (path.equals("/detail.do")) {
			act = new DetailAction();
		}else if (path.equals("/del.do")) {
			act = new DelAction();
		}else if (path.equals("/modify.do")) {
			act = new ModifyAction();
		}else if (path.equals("/modifyresult.do")) {
			act = new ModifyResultAction();
		}
		
		
		Forward forward = act.execute(request, response); //경로 받아옴
		
		if(forward.isForward()) {
			RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
			disp.forward(request, response);
		}else {
			response.sendRedirect(forward.getPath());
		}
		
//		RequestDispatcher disp = request.getRequestDispatcher(urlpath);
//		disp.forward(request, response);  //forward = disp(list.jsp)에 제어권 넘기겠다
		
	}

}
