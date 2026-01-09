package com.yedam.java.app;

import java.sql.*;

public class SQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. DB 접속: 연결할 DB정보 필요
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String password = "hr";
		Connection conn = DriverManager.getConnection(url, username, password);

		// 3. SQL 실행
		/****************** INSERT ******************/
		// 3-1. Statement or PreparedStatement 객체 생성
		String insert = """
				INSERT INTO employees
				VALUES(?,?,?,?,?,?,?,?,?,?,?)
				""";
		PreparedStatement ps = conn.prepareStatement(insert);
		ps.setInt(1, 1000);
		ps.setString(2, "Kil-Dong");
		ps.setString(3, "Hong");
		ps.setString(4, "kdHong@google.com");
		ps.setString(5, "82.10.1234.1234");
		ps.setString(6, "21/11/05");
		ps.setString(7, "SA_REP");
		ps.setDouble(8, 6000);
		ps.setDouble(9, 0.15);
		ps.setInt(10, 149);
		ps.setInt(11, 80);

		// 3-2. SQL 전달 및 실행
		int result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("inset 결과: " + result);

		/****************** UPDATE ******************/
		// 3-1. Statement or PreparedStatement 객체 생성
		String update = """
				UPDATE employees
				SET last_name = ?
				WHERE employee_id = ?
				""";
		ps = conn.prepareStatement(update);
		ps.setString(1, "Kang");
		ps.setInt(2, 1000);

		// 3-2. SQL 전달 및 실행
		result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("update 결과: " + result);

		/****************** SELECT ******************/
		// 3-1. Statement or PreparedStatement 객체 생성
		String select = """
				SELECT *
				FROM employees
				ORDER BY employee_id
				""";
		ps = conn.prepareStatement(select);

		// 3-2. SQL 전달 및 실행
		ResultSet rs = ps.executeQuery();

		// 3-3. 반환결과 처리
		while (rs.next()) {
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.println("이름: " + lastName + " " + firstName);
		}

		/****************** DELETE ******************/
		// 3-1. Statement or PreparedStatement 객체 생성
		String delete = """
				DELETE FROM employees
				WHERE employee_id = ?
				""";
		ps = conn.prepareStatement(delete);
		ps.setInt(1, 1000);

		// 3-2. SQL 전달 및 실행
		result = ps.executeUpdate();

		// 3-3. 반환결과 처리
		System.out.println("delete 결과: " + result);

		// 4. 자원해제
		// -> 역순으로 close 할 것
		// -> ResultSet -> Statement -> Connection
		if (rs != null) {
			rs.close();
		}

		if (ps != null) {
			ps.close();
		}

		if (conn != null) {
			conn.close();
		}

	} // main
} // class
