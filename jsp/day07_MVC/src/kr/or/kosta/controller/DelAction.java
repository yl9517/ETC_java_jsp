package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;

public class DelAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.deleteData(bno);
		
		Forward forward = new Forward();
		forward.setForward(false); //redirect 방식
		forward.setPath("list.do");
		
		return forward;
		
		//return "del.jsp";
		//return "list.do"; 얘도 가능한데 forward방식이라 url이 이상함
	}

}
