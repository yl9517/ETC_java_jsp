package kr.or.kosta.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.or.kosta.comm.DBConnection;
import kr.or.kosta.dao.BoardDAO;
import kr.or.kosta.dto.BoardDTO;
import kr.or.kosta.dto.SubboardDTO;

public class BoardService {
	private static BoardService instance = new BoardService();
	
	public static BoardService getInstance(){
		return instance;
	}
	private BoardService() {};
	
	public List<BoardDTO> getList(){
		
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = dbconn.getConnection();
			
			conn.setAutoCommit(false);
			
			//dao연결
			BoardDAO dao = BoardDAO.getInstance();
			list = dao.getList(conn);
			
			conn.commit();
			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
			try {conn.rollback();}catch (SQLException e2) {}
		}finally {
			if(conn!=null) try {conn.close();}catch ( SQLException e) {}
		}
		
		return list;
	}
	
	public BoardDTO detail(int num) {
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		BoardDTO dto = new BoardDTO();
		try {
			conn= dbconn.getConnection();
			
			//dao 연결
			BoardDAO dao = BoardDAO.getInstance();
			dto = dao.detail(conn,num);
			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
		}finally {
			if(conn!=null) try {conn.close();}catch ( SQLException e) {}
		}
		
		return dto;
	}
	
	
	//댓글작성
	public void insertSub(SubboardDTO dto) {
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		try {
			conn = dbconn.getConnection();
			
			//dao
			BoardDAO dao = BoardDAO.getInstance();
			dao.insertSub(conn,dto);
			
		}catch (SQLException | NamingException e) {
			System.out.println();
		}finally {
			if(conn!=null) try {conn.close();}catch ( SQLException e) {}
		}
	}
	public List<SubboardDTO> subDetail(int num) {
		
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		List<SubboardDTO> list = new ArrayList<SubboardDTO>();
		try {
			conn = dbconn.getConnection();
			
			
			//dao연결
			BoardDAO dao = BoardDAO.getInstance();
			list = dao.subDetail(conn,num);
			
			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
		}finally {
			if(conn!=null) try {conn.close();}catch ( SQLException e) {}
		}
		
		return list;
	}
}
