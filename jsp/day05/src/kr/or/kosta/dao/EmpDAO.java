package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.dto.EmpDTO;

public class EmpDAO {
	//db연결
	private Connection getConnection() {
		
		String className="oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String pwd = "hr";
		
		Connection conn = null;
		try {
			Class.forName(className);
			conn = DriverManager.getConnection(url,user,pwd);
		}catch (ClassNotFoundException |SQLException e) {
			System.out.print(e);
		}
		return conn;
	}
	
	//전체 자료수
	public int totalCount() {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select count(*) from emp");
		
		int totalCount =0;
		try(
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			){
			if(rs.next())
				totalCount = rs.getInt(1);	
		}catch (Exception e) {
			System.out.println(e);
		}
		return totalCount;
	}
	
	public List<EmpDTO> getList(int startrow, int endrow) {
		StringBuilder sql = new StringBuilder();
		sql.append("select e.*			"
				+ "   from (select rownum as rn, employee_id, first_name, salary, department_id"
				+ "			from emp)e"
				+ "   where rn>=? and rn<=?");
		
		ResultSet rs = null;
		ArrayList<EmpDTO> arr = new ArrayList<EmpDTO>();
		
		try(
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setDepartment_id(rs.getInt("department_id"));
				arr.add(dto);
			}
		

		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			if(rs!=null) try {rs.close();} catch (SQLException e2) {}
		}
		return arr;
	}
	
}
