package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;

public class DetailAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int bno =Integer.parseInt(request.getParameter("bno"));
		
		BoardDAO dao = BoardDAO.getInstance();
		
		//두개는 하나의 기능이므로 트랜잭션 묶기
		BoardDTO dto = dao.detailData(bno); //게시글 가져오기
		dao.addReadCount(bno);	 //조회수 올리기
		
		request.setAttribute("dto", dto);
		
		Forward forward = new Forward();
		forward.setForward(true); //forward 방식
		forward.setPath("detail.jsp");
		
		return forward;
		
		//return "detail.jsp";
	}

}
