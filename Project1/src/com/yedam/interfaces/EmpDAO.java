package com.yedam.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public void insertEmp(Employee emp) {
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect(); // db 연결 정보
		try {
			pstmt = conn.prepareStatement(sql);// 계정에 구문 입력
			pstmt.setInt(1, emp.getEmployeeId()); // sql 의 ?,?,?,? 값을 설정해줌
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate(); // 명령문 실행
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public Employee[] getEmpList() {
		conn = getConnect();
		String sql = "select * from emp";
		Employee[] employees = new Employee[100];
		int i =0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // rs의 크기만큼 반복
				Employee emp = new Employee(rs.getInt("employee_id"),rs.getString("last_name"),rs.getInt("salary"),rs.getString("hire_date"));
				employees[i++] = emp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public void updateEmp(Employee emp) {
		//급여만 
		conn = getConnect();
		String sql = "update emp set salary = ? where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건 변경");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deleteEmp(int empid) {
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empid);
			int rs = pstmt.executeUpdate();
			System.out.println(rs+"건 삭제");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
