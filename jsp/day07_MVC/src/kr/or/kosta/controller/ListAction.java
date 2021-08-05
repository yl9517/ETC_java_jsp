package kr.or.kosta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;

public class ListAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response) //String인 이유는 경로를 보낼것이기 때문
			throws ServletException, IOException {
			BoardDAO dao = BoardDAO.getInstance();
			List<BoardDTO> list = dao.getList();  //1. 모델(dao)에 보내고, 자료 받아옴
			
			request.setAttribute("list",list);
			
			Forward forward = new Forward();
			forward.setForward(true); //forward 방식
			forward.setPath("/list.jsp");
			
			return forward;
		
			
			//받아온 자료 FrontController에 "경로" 보내기 (fc에서 뷰로 보내기)
		//return "/list.jsp";
	}

}
