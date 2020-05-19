package com.yedam.api;

public class Member {
	public StringExample id;
	public Member() {
		
	}
	public Member(StringExample id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.id.equals(m.id);
//		return super.equals(obj);
	}
	@Override
	public StringExample toString() {
		return "Member [id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
