package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.or.kosta.dto.EmpDTO;

public class EmpDAO {
	
	private static EmpDAO dao = new EmpDAO();
	public static EmpDAO instance() {
		return dao;
	}
	private EmpDAO() {};
	
	
	//db연결 
	public Connection getConnection(){
		Connection conn = null;
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/kosta");
			conn = ds.getConnection();			
		}catch (SQLException | NamingException e) {
			System.out.println(e);
		}
		return conn;
	}
	
	//리스트 뽑아오기
	public List<EmpDTO> getList(){
		StringBuilder sql = new StringBuilder();
		sql.append("select employee_id, first_name, hire_date, salary, department_id ");
		sql.append(" from emp2  ");
		
		ArrayList<EmpDTO> arr = new ArrayList<EmpDTO>();
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();){
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getLong("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setHire_date(rs.getString("hire_date"));
				dto.setSalary(rs.getFloat("salary"));
				dto.setDepartment_id(rs.getInt("department_id"));
				
				arr.add(dto);
			}
			
		}catch (Exception e) {
			System.out.println();
		}
		return arr;
	}
	
}
