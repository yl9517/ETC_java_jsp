package kr.or.kosta.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.Forward;
import kr.or.kosta.dto.BoardDTO;
import kr.or.kosta.service.BoardService;

public class ListAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int currpage =1; //현재 페이지
		String curr= request.getParameter("curr"); //파라미터로 넘겨주는 페이지
		if(curr!=null) {
			currpage = Integer.parseInt(curr);
		}
		
		//System.out.println(currpage);
		BoardService service = BoardService.getService();
		
		//전체 자료수
		int totalcount = service.getTotalCount();
		
		int pageSize = 3; //1페이지에 보여줄 자료 수
		int totalPage = (int) Math.ceil((float)totalcount/pageSize); //전체페이지 수
		
		
		int startrow =(currpage-1)*pageSize+1; //페이지의 첫번째 행
		int endrow = startrow+pageSize-1;   //페이지의 마지막 행
		if(endrow > totalcount) {
			endrow = totalcount;
		}
		
		//service 보내기
		List<BoardDTO> pagelist = service.list(startrow, endrow);
		
		
		int pageblock =4 ; //한번에 보여줄 페이지 수
		
		int startblock = ((currpage-1)/pageblock)*pageblock+1; //첫번쨰 페이지번호
		int endblock = startblock+pageblock-1;
		if(endblock>totalPage) {
			endblock=totalPage;
		}
		
		
		request.setAttribute("pagelist", pagelist);  //리스트
		request.setAttribute("currpage", currpage); //현재페이지
		request.setAttribute("totalpage", totalPage); //총 전체 페이지
		request.setAttribute("startblock", startblock); //첫번쨰 페이지번호
		request.setAttribute("endblock", endblock); //마지막 페이지번호
		
		Forward forward = new Forward();
		forward.setForward(true);
		forward.setPath("/WEB-INF/board/list.jsp");
		
		return forward;
	}

}
