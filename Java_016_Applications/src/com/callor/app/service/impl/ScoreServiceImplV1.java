package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	Scanner scan = new Scanner(System.in);

	@Override
	public void selecMenu() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("3. 성적 저장");
		System.out.println("QUIT.종료");
		System.out.println("-".repeat(50));
		System.out.println("업무선택 >>");
		String strM = scan.nextLine();
		if(strM.equals("QUIT")) {
			return; 
		}

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override 
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
