package com.yedam.java.app;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

// DAO
public class EmpDAO {
	// Oracle 연결 정보
	private final String driver = "oracle.jdbc.OracleDriver";
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String username = "hr";
	private final String password = "hr";

	// 각 메서드에서 공통적으로 사용하는 필드
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// 싱글톤
	private static EmpDAO empDAO = null;

	private EmpDAO() {
	}

	public static EmpDAO getInstance() {
		if (empDAO == null) {
			empDAO = new EmpDAO();
		}
		return empDAO;
	}

	// 메서드
	// connect()
	private void connect() {
		try {
			// 1. JDBC Driver Load
			Class.forName(driver);

			// 2. DB 접속
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// disconnect()
	private void disconnect() {
		try {
			// 4. 자원해제
			// -> 역순으로 close 할 것
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체 조회 -> SELECT
	// selectAll()
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<>();

		try {
			connect();
			// 3. SQL 실행
			// 3-1. Statement or PreparedStatement 객체 생성
			String select = """
					SELECT *
					FROM employees
					ORDER BY employee_id
					""";
			ps = conn.prepareStatement(select);

			// 3-2. SQL 전달 및 실행
			rs = ps.executeQuery();

			// 3-3. 반환결과 처리
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 단건조회 -> SELECT
	// selectInfo()
	public Emp selectInfo(Emp emp) {
		Emp findEmp = null;

		try {
			connect();

			// 3. SQL 실행
			// 3-1. Statement or PreparedStatement 객체 생성
			String select = """
					SELECT *
					FROM employees
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(select);
			ps.setInt(1, emp.getEmployeeId());

			// 3-2. SQL 전달 및 실행
			rs = ps.executeQuery();

			// 3-3. 반환결과 처리
			if (rs.next()) {
				findEmp = new Emp();
				findEmp.setEmployeeId(rs.getInt("employee_id"));
				findEmp.setFirstName(rs.getString("first_name"));
				findEmp.setLastName(rs.getString("last_name"));
				findEmp.setEmail(rs.getString("email"));
				findEmp.setPhoneNumber(rs.getString("phone_number"));
				findEmp.setHireDate(rs.getDate("hire_date"));
				findEmp.setJobId(rs.getString("job_id"));
				findEmp.setSalary(rs.getDouble("salary"));
				findEmp.setCommissionPct(rs.getDouble("commission_pct"));
				findEmp.setManagerId(rs.getInt("manager_id"));
				findEmp.setDepartmentId(rs.getInt("department_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findEmp;
	}

	// 등록
	// insertInfo()
	public int insertInfo(Emp emp) {
		int result = 0;

		try {
			connect();
			String insert = """
					INSERT INTO employees
					VALUES(EMPLOYEES_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)
					""";
			ps = conn.prepareStatement(insert);

//			ps.setInt(1, emp.getEmployeeId());
			ps.setString(1, emp.getFirstName());
			ps.setString(2, emp.getLastName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getPhoneNumber());
			ps.setDate(5, emp.getHireDate());
			ps.setString(6, emp.getJobId());
			ps.setDouble(7, emp.getSalary());
			ps.setDouble(8, emp.getCommissionPct());
			ps.setInt(9, emp.getManagerId());
			ps.setInt(10, emp.getDepartmentId());
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 수정
	// updateInfo()
	public int updateInfo(Emp emp) {
		int result = 0;

		try {
			connect();

			String update = """
					UPDATE employees
					SET last_name = ?
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(update);
			ps.setString(1, emp.getLastName());
			ps.setInt(2, emp.getEmployeeId());

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 삭제
	// deleteInfo()
	public int deleteInfo(int empId) {
		int result = 0;
		try {
			connect();

			String delete = """
					DELETE FROM employees
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(delete);
			ps.setInt(1, empId);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
} // class
