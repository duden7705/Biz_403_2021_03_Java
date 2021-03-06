package com.callor.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;

public class LocalDate_01 {
	
	public static void main(String[] args) {
		
		/*
		 * java 1.8 부터 사용할수있는 새로운 날짜
		 * 관련 클래스
		 * 
		 * 기존에 Date, Calender 클래스가 있는데
		 * 날짜와 관련된 많은 이슈가 발생한다
		 * 
		 * java 1.8부터 새로운 날짜 시간과 관련된
		 *  코딩을 할때 사용하는 클래스가 만들어 졌다
		 * 
		 */
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println(local.getDayOfMonth());
		System.out.println(local.getDayOfYear());
		System.out.println(local.getDayOfWeek());
		
		System.out.println(local.plusDays(20));
		System.out.println(local.minusDays(10));
		
		System.out.println(local.plusMonths(1));
		
		
	}

}
