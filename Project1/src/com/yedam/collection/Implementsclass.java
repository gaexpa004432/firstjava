package com.yedam.collection;

interface Runnable<T> {
	public void run(T t);
}

class Car implements Runnable<String> {

	@Override
	public void run(String str) {
		System.out.println("run");
	}

}

class Bus implements Runnable<String> {

	@Override
	public void run(String str) {
		System.out.println("BusBUs!!!!");

	}

}

public class Implementsclass {
	public static void callRun(Runnable<String> runnable) {
		runnable.run("Hello");
	}

	public static void main(String[] args) {

		Runnable<String> runnable = new Car();
		runnable.run("");
		runnable= new Bus();
		runnable.run("");

		callRun(new Car());
	}
}
