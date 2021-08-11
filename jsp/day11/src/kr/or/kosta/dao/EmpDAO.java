package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.dto.EmpDTO;

public class EmpDAO {

	private static EmpDAO dao = new EmpDAO();
	
	public static EmpDAO getDAO() {
		return dao;
	}
	private EmpDAO(){};
	
	
	//전체자료갯수
	public int getTotalCount(Connection conn,String search, String searchtxt) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select count(*) from employees ");
		
		if(!search.equals("") && !searchtxt.equals("")) {
			if(search.equals("employee_id"))
				sql.append(" where employee_id like ? ");		
			else if(search.equals("first_name"))
				sql.append(" where lower(first_name) like ? ");		
			else if(search.equals("email"))
				sql.append(" where lower(email) like ? ");			
		}
	
		int count =0;
		ResultSet rs = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			 ){
			if(!search.equals("") && !searchtxt.equals("")) {
				pstmt.setString(1, "%"+searchtxt.toLowerCase()+"%");
			}
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}				
		}catch (SQLException e) {
			System.out.println(e);
		}finally{
			if(rs!=null)try {rs.close();}catch (SQLException e2) {}
		}
		return count;
		
	}
	
	//리스트
	public List<EmpDTO> getList(Connection conn, int sr, int er,String search, String searchtxt){
		StringBuilder sql = new StringBuilder();
		sql.append(" select *                                  ");
		sql.append(" from ( select rownum as rn, e.*           ");
		sql.append("        from  ( select employee_id, first_name, email, salary ");
		sql.append("                from employees                                ");
		if(!search.equals("") && !searchtxt.equals("")) {
			if(search.equals("employee_id"))
				sql.append(" where employee_id like ?                                 ");		
			else if(search.equals("first_name"))
				sql.append(" where lower(first_name) like ?                           ");		
			else if(search.equals("email"))
				sql.append(" where lower(email) like ?                                ");		
		}
		sql.append("               order by employee_id  )e                       ");
		sql.append("       )                                   ");
		sql.append(" where rn>=? and rn<=?                     ");
		
		ResultSet rs = null;
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
			int no = 1;
			if(!search.equals("") && !searchtxt.equals("")) {
				pstmt.setString(no++, "%"+searchtxt.toLowerCase()+"%");
			}
			pstmt.setInt(no++, sr);
			pstmt.setInt(no++, er);
			
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setEmail(rs.getString("email"));
				dto.setSalary(rs.getFloat("salary"));
				
				list.add(dto);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}finally{
			if(rs!=null)try {rs.close();}catch (SQLException e2) {}
		}
		return list;
	}
	
}
