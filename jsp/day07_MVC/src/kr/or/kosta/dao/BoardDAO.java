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
	
	//하나 데이터 가져오기
	public BoardDTO detailData(int bno) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select bno, btitle, bcontent, bwriter, bwritedate, breadno");
		sql.append(" from board ");
		sql.append(" where bno=? ");
		
		ResultSet rs= null;
		BoardDTO dto = new BoardDTO();
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		   ){
			pstmt.setInt(1, bno);

			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBwriter(rs.getString("bwriter"));
				dto.setBwritedate(rs.getString("bwritedate"));
				dto.setBreadno(rs.getInt("breadno"));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			if(rs!=null) try { rs.close();}catch(SQLException e) {};
		}
		return dto;
	}
	
	//조회수 올리기
	public void addReadCount(int bno) {
		StringBuilder sql = new StringBuilder();
		sql.append(" update board set breadno=nvl(breadno,0)+1 "); //nvl breano가 null이면 0, 아니면 breano
		sql.append(" where bno=? ");
		
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		   ){
			pstmt.setInt(1, bno);
			
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//데이터 저장
	public int insertData(String btitle, String bcontent, String bwriter) {
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into board values(boardseq.nextval, ?,?,?,sysdate,0) ");
		
		int result =0;
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
		){
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bwriter);
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	//데이터 삭제
	public void deleteData(int bno) {
		StringBuilder sql = new StringBuilder();
		sql.append(" delete from board where bno=?");
		
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString())	){
			pstmt.setInt(1, bno);
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}

	}
	
	//데이터 수정
	public void updateData(BoardDTO dto) {
		StringBuilder sql = new StringBuilder();
		sql.append(" update board ");
		sql.append(" set btitle=?, bcontent=? ");
		sql.append(" where bno = ? ");
		
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString())	){
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setInt(3, dto.getBno());

			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
}
