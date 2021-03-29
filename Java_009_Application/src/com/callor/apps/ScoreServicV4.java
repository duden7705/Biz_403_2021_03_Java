package com.callor.apps;

import java.util.Scanner;

public class ScoreServicV4 {
	
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	public ScoreServicV4(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학" };
				
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
		
		};
		
		
		
		public void makeScores() {
			for(int i = 0; i < intKor.length; i++) {
				
			}
			intKor[0] = this.inputScore(subject[0]);
		}
		private Integer inputScore(String sub) {
			
			for(int i = 0 ; i < intKor.length; i++) {
				Integer score = this.inputScore(subject[0]) ;
			}
			
			Integer score = 0;
			while(true) {
				System.out.println(sub + "점수를 입력하세요");
				System.out.print(" >> ");
				score = scan.nextInt();
				if(score < 0 || score > 100) {
					System.out.println(sub + " 점수는 0 ~ 1100까지만 입력!!");
					//continue;
					
					//continue 명령을 사용하는 대신
					// else를 사용하여 코드를 작성
				} else {
				}
				break;
			}
			
			return score;
		}
	}
	