package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {
	
	Scanner scan;
	List<Integer> intList;
	
	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}
	public void inputNum() {
		
	while(true) {
		System.out.println("정수 50 ~ 150 까지 입력");
		System.out.print(" >> ");
		String strNum = scan.nextLine();
		Integer intNum = 0;
		try { 
			// int intNum1 = Integer.valueOf(strNum);
			intNum = Integer.valueOf(strNum);			
				
		} catch (Exception e) {
			System.out.println("값은 정수형 숫자로만 입력");
			continue;
			}
		if(intNum > 50 && intNum < 150) {
			
		}
		intList.add(intNum);
		break;
		
		}
			System.out.println("정수는 50 ~ 150 범위에서 입력");
		}
	}
