package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;

public class ModifyAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = dao.detailData(bno);
		request.setAttribute("dto", dto);
		
		Forward forward = new Forward();
		forward.setForward(true); //forward 방식
		forward.setPath("/detailform.jsp");
		
		return forward;
		//return "/detailform.jsp";
	}

}
