package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.Action;
import kr.or.kosta.comm.Forward;
import kr.or.kosta.dto.BoardDTO;
import kr.or.kosta.service.BoardService;

public class DetailAction implements Action{

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("num");
		
		int boardnum =1;
		if(n!=null) {
			boardnum = Integer.parseInt(n);
		}
		
		BoardService service = BoardService.getInstance();
		BoardDTO dto = service.detail(boardnum);
		
		request.setAttribute("dto", dto);
		
		Forward forward = new Forward();
		forward.setForward(true);
		forward.setPath("WEB-INF/board/detail.jsp");
		
		return forward;
	}

}
