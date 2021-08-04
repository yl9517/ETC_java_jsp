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

import kr.or.kosta.dto.BoardDTO;

public class BoardDAO {
	//싱글톤
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance(){
		return instance;
	}
	private BoardDAO() {};
	
	//dbcp 연결
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/kosta");
			
			conn = ds.getConnection();
		}catch (SQLException | NamingException e) {
			System.out.println(e);
		}
		return conn;
	}
	
	//전체 데이터 가져오기
	public List<BoardDTO> getList(){
		
		StringBuilder sql = new StringBuilder();
		sql.append("select bno, btitle, bcontent, bwriter, bwritedate, breadno"
				+ " from board ");
		
		ArrayList<BoardDTO> arr = new ArrayList<BoardDTO>();
		ResultSet rs = null;
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBwriter(rs.getString("bwriter"));
				dto.setBwritedate(rs.getString("bwritedate"));
				dto.setBreadno(rs.getInt("breadno"));
				
				arr.add(dto);			
			}
			
		}catch( SQLException e ) {
			System.out.println(e);
		}finally {
			if(rs!=null)try {rs.close();} catch(SQLException e) {};
		}
		return arr;
	}
	
}
