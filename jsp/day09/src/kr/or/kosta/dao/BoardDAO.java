package kr.or.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.dto.BoardDTO;

public class BoardDAO {
	private static BoardDAO dao = new BoardDAO();
	
	public static BoardDAO getDAO() {
		return dao;
	}
	private BoardDAO() {}
	
	//전체 자료수
	public int totalCount(Connection conn) {
		StringBuilder sql = new StringBuilder();
		sql.append("select count(*) ");
		sql.append(" from board ");

		int total = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery(); ) {

			if(rs.next()) {
				total = rs.getInt(1);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return total;
	};
	
	
	//리스트(페이징)
	public List<BoardDTO> getList(Connection conn, int sr, int er) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select *                          ");
		sql.append(" from  (                           ");
		sql.append("         select rownum as rn, e.*  ");
		sql.append("         from ( select bno, btitle, bcontent, bwriter, bwritedate, breadno ");
		sql.append("                from board         ");
		sql.append("                order by bno  )e   ");
		sql.append("        )                          ");
		sql.append(" where rn >= ? and rn <=?          ");

		ResultSet rs = null;
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			pstmt.setInt(1, sr);
			pstmt.setInt(2, er);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBwriter(rs.getString("bwriter"));
				dto.setBwritedate(rs.getString("bwritedate"));
				dto.setBreadno(rs.getInt("breadno"));
				
				list.add(dto);
			}
			
		}catch (SQLException e) {
			System.out.println();
		}finally {
			if(rs!=null)try {rs.close();}catch (SQLException e2) {}
		}
		return list;
	}
	
	
	
}
