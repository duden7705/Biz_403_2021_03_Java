package com.callor.app.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.duden7705.standard.InputService;
import com.duden7705.standard.impl.InputServiceImplV1;

/*
 * 1.메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다.
 * 		가. 학번
 * 		나. 학생이름 : inputName()
 * 		다. 과목별 성적 : inputScore()
 * 
 * 		가. 학생성적 입력 :  inputScore() 시작
 * 			- 학번입력
 * 			- 이름입력
 * 			- 점수입력
 * 
 * 		나. 학생의 이름을 입력하는 inputName() method는
 * 			return type String 형이기 때문에
 * 			학생이름을 입력받고 입력받은 학생이름을 return한다
 * 			이 return 학생이름을 inputScore() 에서
 * 			변수에 담아 처리를 할수 있다
 */
public class ScoreServiceImplV1 implements InputService {

	List<ScoreVO> scorList;
	InputService inService;
	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		Scanner scan = new Scanner(System.in);
		
		
	}
	
	@Override
	public Integer inputValue(String arg0) {
		// TODO 성적처리 메뉴선택
		return null;
	}

	@Override
	public Integer inputValue(String arg0, int arg1) {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가
		
		String strNum = this.inputNum();
		if(strNum == null) {
			
		}
		
		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면
		// 		정수 값이 intNum에 담길것이고
		// QUIT를 입력했으면 
		// 		null 값이 intNum에 담길것이다
		Integer intNum = inService.inputValue("학번",1);
		// intNum에 null 값이 담겨있으면 종료하고
		// 다시 메뉴로 돌아간다
		if(intNum == null) {
			return;
		}
		
		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d", 1) 전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하는 문자열 만들기
		// 		"   1"
		// String.format(%03d",1)
		// 		전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하고
		//		왼쪽의 빈칸에 0을 채워라
		//		"001"
		String strNum
			= String.format("2021%d",intNum); // 2021001
		
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if(strName ==null) {
			return;
		}
		
		Integer intKor = inputValue("국어",0,100);
		if(intKor == null) {
			return;
		}
		Integer intEng = inputValue("영어",0,100);
		if(strName == null) {
			return;
		}
		Integer intMath = inputValue("수학",0,100);
		if(strName == null) {
			return;
		}
		
		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후
		 * 한 과목이라도 QUIT하면 종료하는 코드이다
		 * 만약 국어 과목에서 QUIT를 하여도
		 * 영어, 수학 점수를 입력받은 Prompt가 나타나고 3과목을
		 * 모두 통과 한 후 입력종료 된다
		 */
	}
	
	private String inputNum() {
		// TODO Auto-generated method stub
		return null;
	}

	ScoreVO scoreVO = new ScoreVO();
	scoreVO.setName(strName);
	scoreVO.setNum(strNum);
	scoreVO.setKor(intKor);
	scoreVO.setEng(intEng);
	
	

	private String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method
		
		while(true) {
			System.out.println(strNum + " 학생의 이름 입력");
			System.out.print(" >> ");
			Object scan;
			String strName = ((Scanner) scan).nextLine();
			if(strName.equals("QUIT")) {
				// return null;
				break;
			} else if (strName.equals("")) { // 입력 없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
			
		}// end while
		
		
	}

	@Override
	public Integer inputValue(String arg0, int arg1, int arg2) {
		// TODO 리스트 출력하기
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int index = 0 ; index < scorList.size() ; index++) {
			
			ScoreVO vo = scoreList.get(index);
			
		}
		
		
		
		return null;
	}

	
}