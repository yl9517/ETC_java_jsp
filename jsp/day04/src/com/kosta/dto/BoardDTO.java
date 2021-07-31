package com.kosta.dto;

import java.util.Date;

public class BoardDTO {
	
	//번호,제목,내용,작성자,날짜,조회수
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bwritedate;
	private int breadno;
	
	public int getBno() {
		return bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBwritedate() {
		return bwritedate;
	}
	public void setBwritedate(Date bwritedate) {
		this.bwritedate = bwritedate;
	}
	public int getBreadno() {
		return breadno;
	}
	public void setBreadno(int breadno) {
		this.breadno = breadno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}

	

}
