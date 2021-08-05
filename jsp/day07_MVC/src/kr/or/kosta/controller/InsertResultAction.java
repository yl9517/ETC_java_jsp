package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;

public class InsertResultAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		request.setCharacterEncoding("utf-8");
		
		String btitle=request.getParameter("btitle");
		String bcontent=request.getParameter("bcontent");
		String bwriter=request.getParameter("bwriter");
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.insertData(btitle,bcontent,bwriter);
		
//		request.setAttribute("result", result);
		
		Forward forward = new Forward();
		forward.setForward(false); //sendRedirect 방식
		forward.setPath("list.do");
		
		return forward;
	}

}
