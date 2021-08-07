package kr.or.kosta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dto.EmpDTO;
import kr.or.kosta.service.EmpService;

public class ListAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmpService service = EmpService.getEmpService();
		
		List<EmpDTO> list = service.list();
		
		request.setAttribute("list", list);
		
		Forward forward = new Forward();
		forward.setForward(true);
		forward.setPath("/list.jsp");
		
		return forward;
	}

}
