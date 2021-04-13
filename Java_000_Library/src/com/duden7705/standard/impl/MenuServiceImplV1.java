package com.duden7705.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 사용자에게 업무리스트를 보여주고
 * 업무 번호를 입력하면
 * 
 * 해당하는 업무번호를 return
 * QUIT를 입력하면 null을 return
 */
public class MenuServiceImplV1 {
	
	protected String title;
	protected List<String> menuList;
	protected Scanner scan;
	public Object MenuServiceImplV1(String title, List<String> menuList, Integer intM) {
		/*
		 * 생성자에 매개변수 선언
		 * MenuServiceImplV1 클래스를 사용하여 객체를 생성할때는
		 * title 변수와 menuList에 값을 담아서 파라메터로 전달하고
		 * 생성자를 호출해야한다.
		 * 
		 * new MenuServiceImplV1() 형식으로 작성이 안된다
		 * 반드시 String, List형 두개의 값을 전달해 주어야한다
		 * 
		 */
		
		// 객체를 생성할때 전달한 매개변수 title을
		// 맴버변수 this.title
		this.title = title;
		// TODO Auto-generated constructor stub
		menuList = new ArrayList<String>();
		this.menuList = menuList;
		scan = new Scanner(System.in);
		System.out.println("=".repeat(50));
		System.out.println(title);
		System.out.println("-".repeat(50));
		int nSize = menuList.size();
		int menuIndex = 0;
		for(int manuIndex = 0 ; menuIndex < nSize ; menuIndex++) {
			System.out.printf("%d. %s\n",menuIndex + 1, menuList.get(manuIndex));
		}
		System.out.println("QUIT.업무종료");
		System.out.println("-".repeat(50));
		System.out.print("업무선택 (>>");
		String strM = scan.nextLine();
		if(strM.equals("QUIT")) {
				return null;				
	}
		return intM = Integer.valueOf(strM);
}
}
