package kr.or.kosta.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import kr.or.kosta.comm.DBConnection;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;

public class BoardService {

	private static BoardService service = new BoardService();
	
	public static BoardService getService() {
		return service;
	}
	private BoardService() {};
	
	
	//전체 자료수
	public int getTotalCount() {
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		int totalcount =0;
		try {
			conn= dbconn.getConnection();
			BoardDAO dao = BoardDAO.getDAO();
			totalcount = dao.totalCount(conn);
			
		}catch(SQLException | NamingException e) {
			System.out.println(e);
		}finally {
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}		
		return totalcount;
	}

	//리스트 가져오기
	public List<BoardDTO> list(int sr, int er) {
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		List<BoardDTO> pagelist = null;
		try{
			conn = dbconn.getConnection();
			//dao 연결
			BoardDAO dao = BoardDAO.getDAO();
			pagelist = dao.getList(conn,sr,er);
			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
		}finally {
			if(conn!=null)try {conn.close();}catch (SQLException e2) {}
		}
		return pagelist;
	}

}
