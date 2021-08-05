package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;

public class ModifyResultAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardDTO dto = new BoardDTO();
		dto.setBno(bno);
		dto.setBtitle(btitle);
		dto.setBcontent(bcontent);
		
		dao.updateData(dto);
		
		Forward forward = new Forward();
		forward.setForward(false);
		forward.setPath("list.do");
		
		return forward;
		
		//return "/update.jsp";
	}

}
