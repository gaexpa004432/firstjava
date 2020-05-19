package com.yedam.interfaces;
interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{
	String dbTyep ="Oracle DB";
	@Override
	public void select() {
		System.out.println(dbTyep+" 에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(dbTyep+" 에서 추가");
	}

	@Override
	public void update() {
		System.out.println(dbTyep+" 에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbTyep+" 에서 삭제");
	}
	
}
class MySqlDao implements DataAccessObject{
	String dbTyep ="MySql DB";
	@Override
	public void select() {
		System.out.println(dbTyep+" 에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(dbTyep+" 에서 추가");
	}

	@Override
	public void update() {
		System.out.println(dbTyep+" 에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbTyep+" 에서 삭제");
	}
	
}
		
public class DAOExample {
	public static void main(String[] args) {
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
	}
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
