package kr.or.kosta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.Action;
import kr.or.kosta.comm.Forward;
import kr.or.kosta.dto.EmpDTO;
import kr.or.kosta.service.EmpSerivce;

public class ListAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//검색
		String search = request.getParameter("search");
		String searchtxt = request.getParameter("searchtxt");
		
		if(search==null) search="";
		if(searchtxt==null) searchtxt="";
		
		//페이징처리
		String curr = request.getParameter("curr");
		
		int currpage = 1;
		if(curr!=null) {
			currpage = Integer.parseInt(curr);
		}		
		
		
		//전체자료 갯수 (= 서비스에서 받기)
		EmpSerivce serivce = EmpSerivce.getSerivce();
		int totalcount = serivce.getTotalCount(search,searchtxt); //전체 자료 
		
		int paperCount = 10; 		//한페이지에 보일 갯수
	
		int totalPage = (int) Math.ceil((float)totalcount/paperCount); //총 페이지 갯수
		
		
		int startrow = (currpage-1)*paperCount+1; //한 페이지의 첫번째 자료번호
		int endrow = startrow+paperCount-1; //한 페이지의 마지막 자료번호
				
		int blockcount = 5; //블록으로 묶을 페이지 갯수
		int startblock = (currpage-1)/blockcount*blockcount+1; //블럭페이지의 첫번째페이지
		int endblock = startblock + blockcount -1; //블럭페이지의 마지막페이지
		
		//마지막 블록이 토탈페이지보다 높다면 설정
		if(endblock>totalPage) {
			endblock=totalPage;
		}
		
		//서비스 연결
		List<EmpDTO> emplist = serivce.getList(startrow, endrow,search,searchtxt);
		
		request.setAttribute("emplist", emplist);
		request.setAttribute("datacount", emplist.size());
		request.setAttribute("currpage",currpage);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("startblock",startblock);
		request.setAttribute("endblock",endblock);
		request.setAttribute("search",search);
		request.setAttribute("searchtxt",searchtxt);
		
		
		Forward forward = new Forward();
		forward.setForward(true);
		forward.setPath("/WEB-INF/board/list.jsp");
		
		return forward;
	}

}
