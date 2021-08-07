package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.dto.EmpDTO;

public class EmpDAO {

	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}
	private EmpDAO() {}; //바깥에서 객체 못만들게 생성자 Private
	
	/*
		empno, ename, job, sal, hiredate를 읽어서 list에 저장
		
		@param
		@return List
		@throws SQLException
		
	 */
	public List<EmpDTO> empList(Connection conn){  //Connection이 밖에서 들어오기때문에 여기서 안끊김
		StringBuilder sql = new StringBuilder();
		sql.append(" select empno, ename, job, sal, hiredate ");
		sql.append(" from emp02 ");
		 
		
		ArrayList<EmpDTO> arr = new ArrayList<EmpDTO>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			) {
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setSal(rs.getFloat("sal"));
				dto.setHiredate(rs.getDate("hiredate"));
				
				arr.add(dto);			
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return arr;
	}
	
	public void addEmp(Connection conn,EmpDTO dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into emp02 ");
		sql.append("values(emp02_seq.nextval,?,?,?,sysdate) ");
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setString(1, dto.getEname());
			pstmt.setString(2, dto.getJob());
			pstmt.setFloat(3, dto.getSal());
			
			pstmt.executeUpdate();
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
	
}
