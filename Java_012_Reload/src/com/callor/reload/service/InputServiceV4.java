package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {
	
	// 객체선언
	private Scanner scan;
	private List<NumberVO> numList;
	private Integer intNum1;
	
	// 객체생성(초기화)
	public InputServiceV4() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	} 
	public void inputNum() {
		System.out.println("2개의 정수를 입력하세요");
		System.out.print("정수1 >>");
		String strNum1 = scan.nextLine();
		
		System.out.print("정수2 >> ");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		
		numList.add(numberVO);
		
		 
		for(int i = 0 ; i < numList.size(); i++) {
			
			NumberVO vo = numList.get(i);
			
			// System.out.print(vo.getNum1() + " \t");
			// System.out.println(vo.getNum2());
			this.printNum(vo);
		}
		
		
	} 
	public void printNum(NumberVO vo) {
		System.out.print(vo.getNum1() + "\t");
	}
}