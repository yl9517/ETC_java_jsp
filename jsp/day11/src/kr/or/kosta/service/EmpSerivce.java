package kr.or.kosta.service;

import java.sql.Connection;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.or.kosta.comm.DBConn;
import kr.or.kosta.dao.EmpDAO;
import kr.or.kosta.dto.EmpDTO;

public class EmpSerivce {

	private static EmpSerivce serivce = new EmpSerivce();
	
	public static EmpSerivce getSerivce() {
		return serivce;
	}
	private EmpSerivce() {};
	
	public int getTotalCount(String search, String searchtxt) {
		DBConn dbconn = DBConn.getdbInstance();
		
		Connection conn = null;
		int count = 0;
		try {
			conn = dbconn.getConnection();
			//오토할건지 말건지
			conn.setAutoCommit(false);
			
			//dao연결
			EmpDAO dao = EmpDAO.getDAO();
			count = dao.getTotalCount(conn,search,searchtxt);		

			conn.commit();
		}catch (SQLException | NamingException e) {
			System.out.println(e);
			try {conn.rollback();}catch (SQLException e2) {}
		}finally {
			if(conn!=null)try {conn.close();}catch (SQLException e2) {}
		}
		return count;
	}
	
	public List<EmpDTO> getList(int sr, int er,String search, String searchtxt){
		DBConn dbconn = DBConn.getdbInstance();
		
		Connection conn = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		try {
			conn = dbconn.getConnection();
			//오토할건지 말건지
			conn.setAutoCommit(false);
			
			//dao연결
			EmpDAO dao = EmpDAO.getDAO();
			list = dao.getList(conn, sr, er,search,searchtxt);
			
			conn.commit();	
		}catch (SQLException | NamingException e) {
			System.out.println(e);
			try {conn.rollback();}catch (SQLException e2) {}
		}finally {
			if(conn!=null)try {conn.close();}catch (SQLException e2) {}
		}
		return list;
	}
	
}
