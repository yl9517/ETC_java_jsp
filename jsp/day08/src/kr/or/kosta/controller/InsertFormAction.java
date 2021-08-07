package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;

public class InsertFormAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//form을 보여주는 것은 dao(db)와 관련이 없으므로 service 들리지 않고
		//바로 페이지이동방식과 경로를 결정해서 돌려보냄
		Forward forward= new Forward();
		forward.setForward(true);
		forward.setPath("/insertform.jsp");
		
		return forward;
	}

}
