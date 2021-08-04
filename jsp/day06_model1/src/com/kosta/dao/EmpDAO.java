package com.kosta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.kosta.dto.EmpDTO;

public class EmpDAO {
	private static EmpDAO dao = new EmpDAO();
	public static EmpDAO getDAO() {
		return dao;
	}
	private EmpDAO() {};
	
	
	//db연결
	private Connection getConnection() {
		
//		String className="oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "hr";
//		String pwd = "hr";
		
		Connection conn = null;
		try {
//			Class.forName(className);
//			conn = DriverManager.getConnection(url,user,pwd);
			
	//★★★★★★★★driver 방식이 아닌 DBCP 방식!!!!!!!★★★★★★★★
			Context initctx = new InitialContext();
			DataSource ds = (DataSource) initctx.lookup("java:comp/env/jdbc/kosta");
 			conn = ds.getConnection();
			
		}catch ( NamingException | SQLException e) {
			System.out.print(e);
		}
		return conn;
	}
	//페이징처리 ( 전체 자료수)
	public int getCount() {
		StringBuilder sql = new StringBuilder();
		sql.append("select count(*) from emp2 ");
		
		int count =0;
		
		try(	Connection conn= getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				ResultSet rs = pstmt.executeQuery();
			){
			if(rs.next())
				count = rs.getInt(1);			
		}catch (Exception e) {
			System.out.println(e);
		}
		return count;
	}
	
	//페이징 + 검색
	public List<EmpDTO> getList(int firstNo, int lastNo, String topic, String keyword){
		StringBuilder sql = new StringBuilder();
		sql.append("select e.* 	"
				+ " from	(select rownum as rn, employee_id, first_name, hire_date, salary, department_id"
				+ "			 from emp2	"
				+ "			 order by employee_id) e	"
				+ "	where rn >= ? and rn <= ?	");
		
		if(!("".equals(topic)) && !("".equals(keyword))) {
			if("employee_id".equals(topic)) {
				sql.append(" where employee_id like ?");
			}
			else if("first_name".equals(topic)) {
				sql.append(" where first_name like ?");
			}
			else if("department_id".equals(topic)) {
				sql.append(" where department_id like ?");
			}
		}
		ResultSet rs = null;
		ArrayList<EmpDTO> arr = new ArrayList<EmpDTO>();
		
		try(	Connection conn= getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
				pstmt.setInt(1, firstNo);
				pstmt.setInt(2, lastNo);	
				
				if(!("".equals(topic)) && !(keyword.equals(""))) {
					pstmt.setString(3, "%"+keyword+"%");		
				}
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int employee_id = rs.getInt("employee_id");
					String first_name = rs.getString("first_name");
					String hire_date = rs.getString("hire_date");
					int salary = rs.getInt("salary");
					int department_id = rs.getInt("department_id");
					
					EmpDTO dto = new EmpDTO(employee_id, first_name, hire_date, salary, department_id);
					
					arr.add(dto);
				}
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			if(rs!=null)try { rs.close();}  catch (SQLException e2) {}
		}
		return arr;
	}
	

	
	//자료하나
	public EmpDTO getOne(int id) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select employee_id, first_name, hire_date, salary, department_id ");
		sql.append(" from emp2 ");
		sql.append(" where employee_id =? ");
	
		EmpDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int employee_id =  rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				String hire_date =rs.getString("hire_date");
				int salary =rs.getInt("salary");
				int department_id =rs.getInt("department_id");
				
				dto = new EmpDTO(employee_id, first_name, hire_date, salary, department_id);
			}			
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			if(rs!=null) try { rs.close();} catch(SQLException e) {};
			disconn(pstmt, conn);
		}
		return dto;
	}
	
	//자료 저장
	public int saveData(EmpDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into emp2 values(seq2.nextval,?,?,?,?) ");
		
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getFirst_name());
			pstmt.setString(2, dto.getHire_date());
			pstmt.setInt(3, dto.getSalary());
			pstmt.setInt(4, dto.getDepartment_id());
			
			result = pstmt.executeUpdate();
						
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			disconn(pstmt, conn);
		}
		return result;
	}
	
	//자료 수정
	public int modifyData(EmpDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("update emp2 set first_name=?, salary=?, department_id=? ");
		sql.append(" where employee_id =? ");
		
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,dto.getFirst_name());
			pstmt.setInt(2, dto.getSalary());
			pstmt.setInt(3, dto.getDepartment_id());
			pstmt.setInt(4, dto.getEmployee_id());
			
			result = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			disconn(pstmt, conn);
		}
		return result;
	}
	
	//자료 수정
	public int deleteData(int id) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("delete from emp2 where employee_id = ?");
		
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	//반납
	private void disconn(PreparedStatement pstmt, Connection conn) {
		if(pstmt!=null) try { pstmt.close();} catch(SQLException e) {};
		if(conn!=null) try { conn.close();} catch(SQLException e) {};
	}
	
}
