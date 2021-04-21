package com.callor.blackjackgame;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGame {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		Random rnd = new Random();
		
		int deck[] = new int[52]; // 카드덱 저장공간 생성
		String Shape[] = { "클로버♣", "스페이드♠", "하트♥", "다이아몬드◆" }; // 카드모양 선언
		String CardNumber[] = { "A", "J", "Q", "K", "2", "3", "4", "5", "6", "7", "8", "9", "10" }; // 카드숫자 선언
		
		// 카드생성
		for(int i = 0; i < 52; i++) { // 카드선언
			deck[i] = i;							
			}
		// 카드섞기
		for(int i = 0; i < 50; i++) { // 카드를 50번 섞는다는 의미
			int rNumber = rnd.nextInt(52);
			int temp;
			temp = deck[0];
			deck[0] = deck[rNumber];
			deck[rNumber] = temp;
			
			int deckIndex = 0;
			int userADeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // 카드 받을 횟수 10번으로 잡고 배열선언
			int userBDeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; 
			int userAIndex = 0;
			int userBIndex = 0;
			boolean userAFlag = true;
			boolean userBFlag = true;
			int ScoreASum = 0;
			int ScoreBSum = 0;
			
			for(int j = 0; j < 10 ; i++) { // 분배할 카드의 횟수 10으로 지정
				if(userAFlag) {
					System.out.println("userA님, 계속 카드를 받으시겠습니까? 0-No/1-Yes");
					if( scr.nextLine().equals("0")) {
						userAFlag = false;						
					}
				}	
				if(userBFlag) {
					System.out.println("userB님, 계속 카드를 받으시겠습니까? 0-No/1-Yes");
					if( scr.nextLine().equals("0")) {
						userBFlag = false;
					}
				}
			}
		}
	}
}