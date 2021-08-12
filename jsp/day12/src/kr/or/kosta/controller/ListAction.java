package kr.or.kosta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.Action;
import kr.or.kosta.comm.Forward;
import kr.or.kosta.dto.BoardDTO;
import kr.or.kosta.service.BoardService;

public class ListAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardService service = BoardService.getInstance();
		
		List<BoardDTO> list = service.getList();
	

		request.setAttribute("list", list);
		
		Forward forward = new Forward();
		forward.setForward(true);
		forward.setPath("WEB-INF/board/list.jsp");
		
		return forward;
	}

}
