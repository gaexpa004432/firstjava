package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// 사우너 등록
	public void insertEmp(Emp emp) {
		Connection conn = null; // db 연결을 위해 커넥션 객체 생성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		String sql = "insert into emp values(" + emp.getEmployee_id() + "," + "'"+emp.getLastName()+"'" + "," + emp.getSalary()+",'"
				+ emp.getHireDate() + "')";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// employee table view result
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}

		String sql = "select * from employees";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql); // 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp;

//				System.out.println("employee_id"+ " " + rs.getString("first_name") +" " + rs.getString("last_name")
//+" "			+ rs.getString("email")+" " + rs.getString("Phone_Number")+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회완료");
		return emps;

	}
}
