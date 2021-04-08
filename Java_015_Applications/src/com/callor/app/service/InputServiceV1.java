package com.callor.app.service;
/*
 * inputValue(String title),
 * inputValue(String title, int start),
 * inputValue(String title, int start, int end)
 * method를 선언
 * title + " 값을 입력하세요 " prompt 를 보여주고
 * 정수 또는 QUIT를 키보드를 통해 입력 받는다.
 * 입력 값이 QUIT이면 null을 return하고
 * 정수이면 입력한 정수 값을 return한다.
 * Exception이 발생할 경우 적절하 예외 처리를 수행한다
 */
import java.util.Scanner;

public class InputServiceV1 {
	Scanner scan;
	
	public InputServiceV1() {
		scan = new Scanner(System.in);					
		}
	public void inputValue(String title) {
		System.out.println(title + " 값을 입력하세요(QUIT:입력취소)");
		System.out.println(" >> ");
		String strInput = scan.nextLine();
		Integer intNum = null;
		if(strInput.equals("QUIT")) {
			return;			
		} 
		try {
			intNum = Integer.valueOf(strInput);
				
		}
	}	
}
