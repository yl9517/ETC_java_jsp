package kr.or.kosta.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dto.SubboardDTO;
import kr.or.kosta.service.BoardService;

/**
 * Servlet implementation class SubDetailAction
 */
@WebServlet("/subdetail.do")
public class SubDetailAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SubDetailAction() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReq(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doReq(request, response);
	}


	private void doReq(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("application/json;charset=utf-8");
		int num = Integer.parseInt(request.getParameter("num"));
		BoardService service = BoardService.getInstance();
		List<SubboardDTO> sublist = service.subDetail(num);

}
