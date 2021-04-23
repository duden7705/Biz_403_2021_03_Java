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
			// 카드를 한장씩 뽑아서 플레이어에게 나눠주는 작업 (중복되면 안되므로 나눠준 카드와 나눠줄 카드를 구분해야 한다)
	        // -1이란 값은 -1이라는 숫자를 랜덤하게 나눠받은 카드에 대입하고자 사용함
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
				if(!(userAFlag || userBFlag)) {
					break;
				}
				if(userAFlag) {
					userADeck[userAIndex] = deck[deckIndex];
					deckIndex++; // 0 더하기 1
					userAIndex++; // 1을 더해서 값이 1로 변경된다
				}
				if(userBFlag) {
					userBDeck[userBIndex] = deck[deckIndex];
					deckIndex++;
					userBIndex++;
				}
				// userADeck 점수계산
				ScoreASum = 0;
				for(int i1 = 0; i1 < userAIndex; i1++) { //vvvvvv
					int ScoreA = 0;
					ScoreA = userADeck[i1] % 13 + 1;
					if(ScoreA > 10) {
						ScoreA = 10;
					}
					ScoreASum = ScoreASum + ScoreA;
				}
				for(int i1 = 0; i1 < userAIndex; i1++) { // A카드의 점수를 1점으로 정할것인지 11점으로 정할것인지 선택하자
					if(userADeck[i1] % 13 == 0) {						
						if((ScoreASum + 10) <= 21) { // 만약 A카드가 있다면 10을 더할텐데, 여기서 22가 넘지 않으면 10을 더해주고 넘으면 더하지 않으면 된다
						ScoreASum = ScoreASum + 10 ;	
						}
					}
				}
				System.out.println(" ");
				System.out.println("***total userA점수:" + ScoreASum);
				if(ScoreASum>21) {
					System.out.println("21점을 초과했습니다");
					break;
				}
				 // userBDeck 점수계산
				ScoreBSum = 0;
				for(int i1 = 0; i < userBIndex; i++) {
					int ScoreB = 0;
					ScoreB = userBDeck[i] % 13 +1;
					if(ScoreB > 10) {
						ScoreB = 10;
					}
					ScoreBSum = ScoreBSum + ScoreB; 
				} 
				if(ScoreBSum>21) {
					System.out.println("21점을 초과했습니다");
					break;
				}
				for(int i1 = 0; i < userAIndex; i++) {
					if(userADeck[i] % 13 == 0) {						
						if((ScoreASum + 10) <=21 ) {
							ScoreASum = ScoreASum + 10;
						}
					}
				}
				  // userA와 userB가 어떤 카드를 받았는지 출력
				System.out.println("[A user] Card");
				for (int i1 : userADeck) {
					if(i != -1) {
						 // System.out.println(i + " "); A유저가 뽑은 카드 덱 번호 (출력되지 않아도 무관하므로 주석처리)	
						  System.out.println("카드 모양: " + CardNumber[i / CardNumber.length]);
					System.out.println("카드숫자:" + CardNumber[i % CardNumber.length]);
					System.out.println("-".repeat(50));					
					}
				}
				System.out.println(" ");
				System.out.println("[B user] Card");
				for(int i1 = 0; i < userBIndex; i++) {
					 // System.out.println(userBDeck[i] + " "); B유저가 뽑은 카드 덱 번호 (출력되지 않아도 무관하므로 주석처리)
					System.out.println("카드 모양: " + CardNumber[userBDeck[i] / CardNumber.length]);
					System.out.println("카드 숫자: " + CardNumber[userBDeck[i] % CardNumber.length]);
					System.out.println("-".repeat(50));
				}
				System.out.println("***total userB 점수:" + ScoreBSum);
				System.out.println(" ");
			}	
			String playState = "계속 진행하세요 ";
			if(ScoreASum > 21) {
				playState = "B user 승리";
			} else {
				if(ScoreBSum > 21) {
					playState = "A user 승리";
				} else {
					if(ScoreASum > ScoreBSum) {
						playState = "A user 승리";
					} else if (ScoreASum == ScoreBSum) {
						playState = "무승부";
					} else {
						playState = "B user 승리";
					}
				}
			}
			System.out.println(playState);
		}
	}
}