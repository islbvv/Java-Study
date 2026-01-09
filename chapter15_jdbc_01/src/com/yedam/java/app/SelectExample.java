package com.yedam.java.app;

import java.sql.*;

public class SelectExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. DB 접속: 연결할 DB정보 필요
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "hr";

		Connection conn = DriverManager.getConnection(url, userName, password);

		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();

		// 3-2. SQL 전달 및 실행
		String SQL = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(SQL);

		// 3-3. 반환결과 처리
		while (rs.next()) {
			String empId = rs.getString("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.printf("EMP_ID: %s\t 이름: %s %s\n", empId, lastName, firstName);
		}

		// 4. 자원해제
		// -> 역순으로 close 할 것
		// -> ResultSet -> Statement -> Connection
		if (rs != null) {
			rs.close();
		}

		if (stmt != null) {
			stmt.close();
		}

		if (conn != null) {
			conn.close();
		}

	} // main
} // class

/** 1. JDBC Driver Load **/

/** 2. DB 접속: 연결할 DB정보 필요 **/
// -> DB와 연결

/** 3. SQL 실행 **/
// 3-1. Statement or PreparedStatement 객체 생성
// 3-2. SQL 전달 및 실행
// 3-3. 반환결과 처리

/** 4. 자원해제 **/
// -> 역순으로 close 할 것
// -> ResultSet -> Statement -> Connection
