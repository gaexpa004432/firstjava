package com.yedam.collection;

public interface EmpService {
	
	//한건생성
	public void createEmp(Employee emp); // public abstract void createEmp();
	public void getEmpList();// 전체조회
	public void changeEmp(Employee emp);// 한건수정 
	public void removeEmp(int empId); //제거
}
