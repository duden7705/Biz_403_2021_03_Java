package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ScoreService;
import com.duden7705.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2Ex implements ScoreService{

		protected MenuServiceImplV1 MenuService;
		protected List<ScoreService> scoreList;
	/* 
	 * 보통 맴버변수(클래스영역에 선언된 변수들) 객체는
	 * 이 클래스의 생성자에서 만드는 것이 좋다
	 * 
	 * 하지만
	 * 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여
	 * 수행해야할 연산코드가 있을 경우는
	 * 객체를 사용하기 전에 객체를 생성하는 코드를
	 * 작성하여도 된다
	 */
	@Override
	public void selecMenu() {
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		
		
		
		MenuService = new MenuServiceImplV1();
		
		while(true) {
			Integer menu = ((com.duden7705.standard.MenuService) MenuService).selectMenu();
			if(menu == null) {
				System.out.println("업무종료!!");
				break;
			}
			if(menu ==1) {
				this.inputScore();
			}else if(menu ==2) {
				this.printScore();
			}else if(menu ==3) {
				this.saveScore();
			
		
	}

	@Override
	public void inputScore() {
		
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, list에 추가
		// =ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
		// =ScoreVO 에 담고
		inService = InputServiceImplV1();
		
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일이름을 입력하세요");
		System.out.print(">>");
		String strFileName = scan.nextLine();
		if(strFileName.equals("")) {
			System.out.println("파일 이름을 입력해야 합니다");
			return;
		
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
