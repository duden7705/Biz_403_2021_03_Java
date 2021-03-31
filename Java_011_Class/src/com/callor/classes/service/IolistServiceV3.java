package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV3 extends IolistServiceV1{

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("거래일자(yyyy-mm-dd) >>");
		String date =scan.next();
		
		System.out.print("거래처명 >>");
		String dname = scan.next();
		
		System.out.print("매입매출 구분 >>");
		String inout = scan.next();
		
		System.out.print("수량 >>");
		Integer qty = scan.nextInt();
		
		Integer iprice = this.inputPrice("매입");
		if(iprice == null) {
			return;
		}
		
		Integer oprice = this.inputPrice("매출");
		if(oprice == null) {
			return;
		}
		
		IolistVO vo = new IolistVO();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setOprice(oprice);
			
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
