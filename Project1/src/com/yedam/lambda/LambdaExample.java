package com.yedam.lambda;
//class MyFuncClass implements MyFunctionlInterface {

//
//	@Override
//	public void run() {
//		System.out.println("gogo");
//	}
//}

public class LambdaExample {
	public static void main(String[] args) {

		MyFunctionlInterface f1 = (a,b) -> {
			int result = a+b;
			System.out.println(result);
			
			return result;
			}; //new MyFunctionlInterface() { 익명 구현객체
//			@Override
//			public void run() {
//				System.out.println("gogo");
//			}
//		};
		System.out.println(f1);
		f1.run(5, 3);
        
	}
}
