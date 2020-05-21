package com.yedam.generic;

import java.util.List;
import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		Object[] strAry = new Object[5];
		List list = new ArrayList();
		list.add("Hello");
		list.add("world");
		list.add(new Double(2.4));
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		strAry[0] = "hello";
		strAry[1] = new Integer(0);
		//Integer num1 = (Integer) strAry[0];
		
		String str = (String) strAry[0];
		//Double d1 = (Double) list.get(0);
		
		//generic
		List<String> strList = new ArrayList<String>();
		//strList.add(new Integer(0)); error
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
	}

}
