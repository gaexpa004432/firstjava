package com.yedam.collection;

public class EmpServiceImpl implements EmpService{
	EmpDAO dao = new EmpDAO();
	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void getEmpList() {
		for(Employee emp : dao.getEmpList()) {
			if (null != emp) {
			System.out.println(emp.toString());
		}}
	}

	@Override
	public void changeEmp(Employee emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void removeEmp(int empid) {
		dao.deleteEmp(empid);
	}

}
