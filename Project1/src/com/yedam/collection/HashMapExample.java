package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void getMap(Map<Integer, String> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			if (num >= 80) {
				String val = map.get(num);
				System.out.println(val);
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer,String> scores = new HashMap<>(); //
		scores.put(90,"dkdl");
		scores.put(70,"dkdl2");
		scores.put(92,"dkdl3");
		System.out.println("80 more output");
		getMap(scores);
		Set<String> set = new HashSet<>(); // 순서가 없음 ,중복 불가
		Map<String, Integer> map = new HashMap<>(); //
		// key:value
		set.add("Hong");
		set.add("Hwang");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { // 해시 크기만큼 반복
			String str = iterator.next(); // 존재한다면 요소를 들고옴
			System.out.println(str.toString());
		}

		map.put("Hong", 98);
		map.put("Haong", 90);

		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next(); // 키값을 들고옴
			Integer value = map.get(key); // 키에 해당하는 밸류를 리턴
			System.out.println(key + value);
		}
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + value);
		}

	}

}
