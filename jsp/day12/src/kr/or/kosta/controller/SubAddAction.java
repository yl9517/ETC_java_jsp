package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.Action;
import kr.or.kosta.comm.Forward;
import kr.or.kosta.dto.SubboardDTO;
import kr.or.kosta.service.BoardService;

public class SubAddAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		int num=Integer.parseInt(request.getParameter("num"));
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		SubboardDTO dto = new SubboardDTO();
		dto.setSubcontent(content);
		dto.setWriter(writer);
		dto.setBoardno(num);
		
		BoardService service = BoardService.getInstance();
		service.insertSub(dto);
		
		Forward forward = new Forward();
		forward.setForward(false);
		forward.setPath("detail.do?num="+num);
		
		return forward;
	}

}
