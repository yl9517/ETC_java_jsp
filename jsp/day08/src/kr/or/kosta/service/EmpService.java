package kr.or.kosta.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import kr.or.kosta.comm.util.DBConnection;
import kr.or.kosta.dao.EmpDAO;
import kr.or.kosta.dto.EmpDTO;

public class EmpService {
	private static EmpService empService = new EmpService();
	public static EmpService getEmpService() {
		return empService;
	}
	private EmpService() {};
	
	//list 서비스
	public List<EmpDTO> list(){
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn=null;
		List<EmpDTO> list = null;
		try {
			conn = dbconn.getConnection();
			conn.setAutoCommit(false); //수동커밋으로 하겠음
			
			EmpDAO dao=EmpDAO.getInstance(); //연결
			list = dao.empList(conn);	 //리스트 가져오기
			
			conn.commit(); //커밋
		}catch (SQLException | NamingException e) {
			//System.out.println(e);
			try {conn.rollback();} catch(SQLException e2) {} //안되면 롤백
		}finally {
			if(conn!=null) try {conn.close();}catch (SQLException e) {}
		}
		return list;
	}
	
	//emp저장
	public void insertEmp(EmpDTO dto) {
		DBConnection dbconn = DBConnection.getdbInstance();
		
		Connection conn = null;
		try {
			conn=dbconn.getConnection();
			conn.setAutoCommit(false);
			
			EmpDAO dao = EmpDAO.getInstance();
			dao.addEmp(conn, dto);
			
			conn.commit();
			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
			try {conn.rollback();} catch(SQLException e2) {} 
		}finally {
			if(conn!=null) try {conn.close();}catch (SQLException e) {}
		}
	}
	
}
