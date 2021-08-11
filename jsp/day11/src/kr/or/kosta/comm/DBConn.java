package kr.or.kosta.comm;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConn {
	
	private static DBConn dbInstance = new DBConn();
	public static DBConn getdbInstance() {
		return dbInstance;
	}
	private DBConn() {};
	
	public Connection getConnection() throws SQLException,NamingException {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/kosta");
		
		Connection conn = ds.getConnection();
		return conn;
	}
}
