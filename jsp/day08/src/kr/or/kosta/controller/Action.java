package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;

public interface Action {
	//인터페이스는 기본으로 추상메소드(몸통x)
	//	     + 디폴트,static 메소드 (몸통O) 생성가능
	
	public Forward execute(HttpServletRequest request, HttpServletResponse response)  //추상메소드
			throws ServletException, IOException;
}
