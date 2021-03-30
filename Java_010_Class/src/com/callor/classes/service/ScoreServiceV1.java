package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

/*
 * ScoreServiceV1을 extends(상속, 확장)
 * ScoreServiceV1에 있는 method를 그대로 이어받아서
 * ScoreServiceV2에 마치 복사 붙이기 한것처럼 사용하겠다
 * 
 * V1에서 작성된 inputScore() 를
 *  V2에서는 새롭게 개선(기능 업그레이드)
 */


public class ScoreServiceV2 extends ScoreServiceV1 {
	
	/*
	 * V1에서 protected로 만든 변수는 V2에서 바로사용가능
	 */
	
	/*
	 * 접근제한자(참조제한자)
	 * public, private, protected
	 * 
	 * class, method, 맴버변수를 선언할때 사용하는 keyword
	 * 접근제한자는 사용하지 않아도 
	 * 문법적인 오류가 발생하지는 않는다
	 * 
	 * 객체이론에 
	 * 		"정보은닉
	 * (감춘다,
	 *  제한적으로 접근하게 한다
	 *  ,데이터를 보호한다
	 *  )"
	 *  
	 *  pubilc : 모두에게 개방한다. 모두에게 공개한다
	 *  		누구나 접근(읽기,쓰기, 실행)을 하게 한다
	 *  		Class obj = new Class()
	 *  		obj.method();
	 *  		obj.변수 = 100;
	 *  
	 *  private : 현재 파일에 있는 코드에서만 접근가능
	 *  		obj.변수 = 100 ; // 문법 오류가 난다
	 *  
	 *  protected : 생성된 객체를 통해서는 직접 접근 금지
	 *  		Class obj = new Class()
	 *  		obj.method() 방식으로는 접근이 안된다.
	 *  		클래스를 상속받게 하겠다 라는 전제하에
	 *  		상속을 받으ㅏㄴ 클래스에서는 자유롭게 접근이 가능
	 *  
	 *  		부모클래스와 상속받은 자식클래스 간에 공유하는 목적
	 */
	
	public ScoreServiceV1() {
		
		
		/*
		 * 맴버변수를 protected로 선언을 해 두면
		 * 현재 클래스(V1)를 상속받은 자식 클래스에서
		 * 변수가 선언된 것처럼 동작할 수 있다.
		 * 
		 * 상속을 허락하고, 맴버변수를 공유하고자 할떄는
		 * protected를 추가한다.
		 */
		protected Scanner scan;
		List<ScoreVO> scoreList;
		
		
			scan = new Scanner(System.in);
			scoreList = new ArrayList<ScoreVO>();
			
			public Integer inputScore(String strNum, String strSub) {
				int intKorScore = 0;
				while(true) {
					
				System.out.println(strNum
						+ "국어점수를 입력하세요(중단:-1)");
				System.out.print(">>");
				intKorScore = scan.nextInt();
				if(intKorScore == -1) {
					return null;
				} else if (intKorScore < 0 || intKorScore > 100) {
					System.out.println("국어점수는 0 ~100까지!!");
					continue;
				}
				break;
				
			
		}
				return intScore;
				
				
				
				
		public Integer inputScore() {
			
			String[] strSubject = {"국어","영어","수학"};
			Integer[] intScores = new Integer[strSubject.length];
		}
						
			
			/*
			 * scoreList의 데이터 개수를 계산하여
			 * 입력할 학번을 자동으로 생성하기
			 */
			int nSize = scoreList.size();
			String strNum = String.format("%03d", nSize + 1);			
			
			for(int i = 0 ; i < strSubject.length; i++) ;
			intScores[i]					
			= this.inputScore(strNum, strSubject[i]);
			if(intScores[i] == null) {
				return null;
			}
			
			
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.num = strNum;
			scoreVO.Kor = intScores[0];
			scoreVO.Eng = intScores[1];
			scoreVO.Math = intScores[2];			
			scoreList.add(scoreVO);
			
			
			
		} 
										
		}
		
	

