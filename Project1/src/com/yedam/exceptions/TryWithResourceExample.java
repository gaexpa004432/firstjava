package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
	
		try(FileInputStream fis = new FileInputStream("src/com/yedam/exceptions/AccountExample.java");) {// 트라이안에 넣으면 예외시 리소스 반환
		//	fis = new FileInputStream("src/com/yedam/exceptions/AccountExample.java");
			int readByte;

			while ((readByte = fis.read()) != -1) { //읽어올 값이 없으면 -1 리턴
				System.out.write(readByte);
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
		}
		
	}

}
