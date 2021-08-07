package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;

/**
 * Servlet implementation class Frontcontroller
 */
@WebServlet("*.kosta")
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Frontcontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();

		Action act = null;
		
		if( path.equals("/list.kosta")) {
			act = new ListAction();
		}else if (path.equals("/empinsert.kosta")) {
			act = new InsertFormAction();
		}else if (path.equals("/insertresult.kosta")) {
			act = new InsertResultAction();
		}
		
		Forward forward = act.execute(request, response);
		if(forward.isForward()) { //true면 forward로 보내기
			RequestDispatcher dispatch = request.getRequestDispatcher(forward.getPath());
			dispatch.forward(request, response);
		}else {
			response.sendRedirect(forward.getPath());
		}
		
	}

}
