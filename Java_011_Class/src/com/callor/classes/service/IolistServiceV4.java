package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV4 extends IolistServiceV1{

	private String pname;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("상품명(QUIT:입력중단)>>");
			pname = scan.nextLine();
		}
			
	}
	
	private Integer inputPrice(String title) {
		
		while(true) {
			
			System.out.println(title + " 단가를 입력하세요");
			System.out.println(title + " 단가는 0이상 입력하세요");
			System.out.println("-1을 입력하면 입력 입력을 중단합니다");
			System.out.print(title + " 단가 >>");
			Integer price = scan.nextInt();
			
			if(price == -1) {
				
			}
			if(price < 0) {
				System.out.println(title + " 단가는 0 이상입니다");
			} else {
				return price;
			}
		}
		
	}
	
	

}
