package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.InputService;

public class ScoreServiceImplV1 {
	
	protected MenuServiceImplV1 menuService;
	protected InputService inputService;
	protected Scanner scanner;
	protected List<ScoreVO> scoreList;

	@Override
	public String toString() {
		
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("1. 학생정 등록");
		menuList.add("2. 성적등록");
		menuList.add("3. 성적정보 열기");
		menuList.add("4. 성적정보 저장");
		menuList.add("5. 성적정보 출력");
		menuService = new MenuServiceImplV1();
		
		
		return super.toString();
	}
	
	/*
	 * MenuServiceImplV1 클래스의 생성자는
	 * 	두개의 매개변수(아규먼트, 파라메터)를 전달하면서
	 * 호출을해야한다.
	 * 첫번째 매개변수는 프로젝트의 title
	 * 두번째 매개변수는 업무 리스트를 담을 List형 객체
	 * 
	 * title은 단순 문자열이기 때문에 바로 전달할수 있는데 
	 * List형 객체는 list 객체를 생성하고, 데이터를 daa 한후
	 * 전달해야하므로 약간의 추가 연산 코드가 필요하다
	 * 
	 * 이럴때는 생성자 method에서 작성하지 않고
	 * 객체를 사용하는 method에서 작성하는 것이 좋다
	 */
	
	/*
	 * 만약 menu 변수의 값이 1일때
	 * menu가 1일때 코드가 실행되고
	 * 코드가 종료되면
	 * 
	 * 또다시 menu 값이 2인가, menu 값이 3인가를
	 * 검사하는 부릴요한 코드가 실행된다
	 */
	
	/*
	 * 만약 menu 변수의 값이 1이면
	 * menu가 1일때가 실행되고
	 * 코드가 종료되면
	 * else이후의 코드는 무시하고
	 * 바로 if 문이 종료된다
	 * 
	 * 1번 코드에 비하면 약간이나마 
	 * 효율적인 코드가 된다
	 */
}
