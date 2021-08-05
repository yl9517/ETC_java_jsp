package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;

public class InsertAction implements Action{

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Forward forward = new Forward();
		forward.setForward(true); //forward 방식  (jsp로 넘길때에는 forward방식)
		forward.setPath("/insertform.jsp");
		
		return forward;
		//return "/insertform.jsp";
	}

}
