package com.yedam.classes.statics;

public class AccountMain {

	public static void main(String[] args) {
		//AccountApplication app =new AccountApplication(); 
		//app.execute();
		String[] a = new String [10] ;
		a[1]=" ";

		for(int i=1; i<10;i++ ) {
			for(int j=1; j<10;j++) {
				a[i] += (j+"x"+i+"="+j*i+"\t");
				
			}
			System.out.println(a[i]);
		}
	}
}
