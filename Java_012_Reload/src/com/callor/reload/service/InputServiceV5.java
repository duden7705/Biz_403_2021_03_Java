package com.callor.reload.service;

/*
 * InputServiceV5 class의 클래스 영역에
 * 		Scanner scan;
 * 		List<NumberVO> numList 객체 선언
 * 
 * 클래스 생성자에서 scan, numList 객체 생성(초기화)
 * 
 * inputNum() 선언 키보드를 통해 2개의 정수를 입력 받아
 * 		numList에 추가
 * 		이때, 두번째 입력한 정수는 처음 값보다 작아야 합니다
 * 
 * printNum() method에서
 * 		numList의 요소에 저장된 두 정수의 뺼셈을 계산하여 출력
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {
	
	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();		
	}
	public void inputNum() {
		System.out.println("2개의 정수를 입력하세요");
		System.out.print(" 두번쨰 정수는 첫번쨰보다 작게 ");
		System.out.print("첫번째 >>");
		String strNum1 = scan.nextLine();
		
	
			
		}
	
		
			// continue
		
	
			//continue
	
			
		
	public void printNum() {
		for(int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			
			System.out.print(vo.getNum1());
			System.out.print(" _ ");
			System.out.print(vo.getNum2());
			
			System.out.print(" = ");
			
		}
	}
}
