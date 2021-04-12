package com.duden7705.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.duden7705.standard.MenuService;
import com.duden7705.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	
	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적 입력");
		menuList.add("성적 리스트 출력");
		menuList.add("성적 성적저장");
		menuList.add("성적 정보 이메일 보내기");
		menuList.add("기타여라가지");
		menuList.add("학생정보입력");
		MenuService menuService = (MenuService) new MenuServiceImplV1();
		
		Integer menu = menuService.selectMenu();
	}

}
