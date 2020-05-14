package com.yedam.database;

public class Empexe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Emp emp = new Emp("hong","2020/05/15");
		emp.setEmployee_id(300);
		emp.setSalary(3000);
		dao.insertEmp(emp);	
//		Employee[] employees = dao.getEmpList();
//		for (Employee emp : employees) {
//			if (emp != null) {
//				System.out.println(emp.toString());
//			}
//		}
	}

}
