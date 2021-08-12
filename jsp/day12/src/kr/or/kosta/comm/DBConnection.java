package kr.or.kosta.comm;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


//트랜잭션으로 묶어주기 위해 연결객체 따로
public class DBConnection {
	
	private static DBConnection dbInstance = new DBConnection();
	public static DBConnection getdbInstance() {
		return dbInstance;
	}
	private DBConnection() {};
	
	public Connection getConnection() throws SQLException,NamingException {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/kosta");
		
		Connection conn = ds.getConnection();
		return conn;
	}
}
