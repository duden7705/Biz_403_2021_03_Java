package com.callor.apps;

public class ScoreEx_05 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수는 배열로 생성을 하면
		 * 개별 요소들이 모두 자동으로 초기화 된다.
		 */
		int[] nums = new int[10];
		System.out.println(nums[0]);
		ScoreVO[] scores = new ScoreVO[5];
		
		/*
		 * 클래스를 사용한 객체배열은 생성을 하여도
		 * 개별 요소들이 자동으로 초기화 되지 않는다
		 */
		ScoreVO[] scoreVOs = new ScoreVO[5];
		
		// 객체배열은 사용(저장, 읽기)를 시도하기 전
		// 개별 요소를 반드시 생성(초기화)해 주어야한다.
		scores[0] = new ScoreVO();
		
		
		
		
		// 전체 배열 요소를 모두 초기화 하는 코드
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO();
			
		}
	}	
	}


