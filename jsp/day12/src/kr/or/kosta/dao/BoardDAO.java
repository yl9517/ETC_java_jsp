package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.binding.StringBinding;
import kr.or.kosta.dto.BoardDTO;
import kr.or.kosta.dto.SubboardDTO;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	private BoardDAO() {};
	
	public List<BoardDTO> getList(Connection conn){
		StringBuilder sql = new StringBuilder();
		sql.append(" select boardno, boardtitle, boardcontent  ");
		sql.append(" from kostaboard                           ");
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();	) {
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBoardno(rs.getInt("boardno"));
				dto.setBoardtitle(rs.getString("boardtitle"));
				dto.setBoardcontent(rs.getString("boardcontent"));
				list.add(dto);
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return list;
	}
	
	public BoardDTO detail(Connection conn,int num) {
		StringBuilder sql = new StringBuilder();
		sql.append("select boardno , boardtitle, boardcontent ");
		sql.append("  from kostaboard where boardno=? ");
		
		ResultSet rs= null;
		BoardDTO dto = new BoardDTO();
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setBoardno(rs.getInt("boardno"));
				dto.setBoardtitle(rs.getString("boardtitle"));
				dto.setBoardcontent(rs.getString("boardcontent"));
			}
			
		}catch (SQLException  e) {
			System.out.println(e);
		}finally {
			if(rs!=null) try {rs.close();}catch ( SQLException e) {}
		}
		return dto;
	}
	public void insertSub(Connection conn, SubboardDTO dto) {
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into kostasubboard values(subseq.nextval,?,?,?");
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			
			pstmt.setString(1, dto.getSubcontent());
			pstmt.setString(2,dto.getWriter());
			pstmt.setInt(3, dto.getBoardno());
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	
}
