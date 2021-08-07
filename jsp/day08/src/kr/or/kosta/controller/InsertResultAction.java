package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.comm.util.Forward;
import kr.or.kosta.dto.EmpDTO;
import kr.or.kosta.service.EmpService;

public class InsertResultAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		float sal = Float.parseFloat(request.getParameter("sal"));
		
		EmpService service = EmpService.getEmpService();
		
		EmpDTO dto = new EmpDTO();
		dto.setEname(ename);
		dto.setJob(job);
		dto.setSal(sal);
		
		service.insertEmp(dto);
		
		Forward forward = new Forward();
		forward.setForward(false);
		forward.setPath("list.kosta");
		
		return forward;
	}

}
