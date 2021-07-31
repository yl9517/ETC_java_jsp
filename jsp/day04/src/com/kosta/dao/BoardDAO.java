package com.kosta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kosta.dto.BoardDTO;

/*
 * 		DAO : data access object
 * 		list.jsp
 * 			1. db연결
 * 			2. 쿼리만들기
 * 			3. 실행
 * 			4. 출력
 * 
 * set - 집합
 * 
 */
public class BoardDAO {
	
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
	
	//전체 게시글 가져오기
	public List<BoardDTO> getList() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select bno, btitle, bcontent, bwriter, bwritedate, breadno from board");
		

		ArrayList<BoardDTO> arr = new ArrayList<BoardDTO>();
		try {
			pstmt =  conn.prepareStatement(sql.toString());			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBwriter(rs.getString("bwriter"));
				dto.setBwritedate(rs.getDate("bwritedate"));
				dto.setBreadno(rs.getInt("breadno"));
				
				arr.add(dto);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			disconn(conn,pstmt);
		}
		
		return arr;
	
	}
	
	//하나의 게시글 가져오기
	public BoardDTO getone(int bno) {
		Connection conn  = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("select bno, btitle, bcontent, bwriter, bwritedate, breadno");
		sql.append(" from board ");
		sql.append(" where bno=? ");
		
		BoardDTO dto = new BoardDTO();
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBwriter(rs.getString("bwriter"));
				dto.setBwritedate(rs.getDate("bwritedate"));
				dto.setBreadno(rs.getInt("breadno"));
			}
		
		}catch (SQLException e) {
			System.out.print(e);
		}finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			disconn(conn, pstmt);
		}
		return dto;
	}
	
	//게시글 등록
	public int addData(BoardDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null ;
		int result = 0;
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into board values(boardseq.nextval, ?, ?, ?, sysdate, 0)");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setString(3, dto.getBwriter());
			
			result = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			disconn(conn, pstmt);
		}
		return result;
	}
	
	//게시글 수정
	public int modifyData(BoardDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		sql.append("update board set btitle=?, bcontent=?, bwriter=?, bwritedate=sysdate where bno=?");
		
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setString(3, dto.getBwriter());
			pstmt.setInt(4,dto.getBno());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			disconn(conn, pstmt);
		}
		return result;
	}
	
	//게시글 삭제
	public int delDate(int bno) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		sql.append("delete from board where bno=?");
		
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, bno);
			
			result = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println();
		}finally {
			disconn(conn, pstmt);
		}
		return result;
		
	}
	
	private void disconn(Connection conn, PreparedStatement pstmt) {
		if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
		if(conn!=null) try {conn.close();} catch(SQLException e) {}
	}

}
