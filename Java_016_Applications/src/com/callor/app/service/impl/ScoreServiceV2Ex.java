package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVo;
import com.callor.app.service.Values;
import com.duden7705.standard.InputService;
import com.duden7705.standard.impl.InputServiceImplV1;

/*
 * selectMeun는 그대로 활용
 * inputScore()만 다시 작성
 */
public class ScoreServiceV2Ex extends ScoreServiceImplV2Ex{

	protected InputService inService;
	protected List<ScoreVo> scoreList;
	protected Scanner scan;
	
	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	// 과목명, 과목점수가 담긴 배열에 대한 위치를 
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여 
	// 배열의 index 값을 상수로 선언해 둔다
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceV2Ex() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVo>();
		scan = new Scanner(System.in);
		
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];
	}
	public void inputScore() {
		
		Integer intNum = inService.inputValue("학번",1);
		if(intNum == null) {
			return;
		}
		// 1을 입력했으면 001로 만들어라
		String strNum = String.format("2021%03d",intNum);
		
		String strnName = null;
		while(true) {
			
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력중단");
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return;
			} else if(strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
		}
			break;
		}
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하기를
		// 하려고 하니 귀찮다
		// 창조적 게으름을 피워보기
		
		// 입력받을 과목명을 배열 변수로 선언하고
		// String[] subject = {"국어","영어","수학"};
		// subject 배열을 맴버영역으로 이동 subjectList로
		// 점수를 입력하는 곳에서 사용하기 위하여
		//		과목명을 담을 배열을 선언했는데
		//		생각해 보니 다른 method에서도 사용할수 있을 것다
		// 		그래서 클래스 영역으로 이동하였다
		String[] subject = {"국어","영어","수학"};
		
		
		
		// 과목수 만큼 점수를 저장할 배열을 선언 
		
		Integer[] intScore = new Integer [ subject.length] ;
		
		for(int i = 0 ; i < subject.length; i++) {
			subScoreList[i] = inService.inputValue(subject[i],0,100) ;
			if(intScore[i] == null) {
				return;
			}
		}			
		
		ScoreVo scoreVO = new ScoreVo();
		scoreVO.setNum(strNum);
		ScoreVo.setName(strnName);
		scoreVO.setName(strnName);
		
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setKor(subScoreList[영어]);
		scoreVO.setKor(subScoreList[수학]);
		
		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setKor(subScoreList[Values.영어]);
		scoreVO.setKor(subScoreList[Values.수학]);
	}
	public void printScore() {
		
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(50));
		
		System.out.print("학번\t");
		System.out.print("이름\t");
		
		for(int index = 0 ; index < subjectList.length; index++) {
			System.out.print(subjectList[index] + "\t");
			
		}
		System.out.print("총점\t");
		System.out.println("평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize ; i ++) {
			ScoreVo vo = scoreList.get(i);
			System.out.println(vo.getNum() + "\t");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\t");
		}
		System.out.println("=".repeat(80));
		
		while(true) {
			
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">>");
			String strFileName = scan.nextLine();
			if(strFileName.equals("")) {
				System.out.println("파일 이름을 입력해야 합니다");
				continue;
		}
			FileWriter filewriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			try {
				filewriter = new FileWriter(strFileName);
				out = new PrintWriter(filewriter);
				
				int nSize1 = scoreList.size();
				for(int i = 0; i < nSize1 ; i++) {
				ScoreVo vo = scoreList.get(i);
				out.print(vo.getNum()+ ",");
				out.print(vo.getName()+ ",");
				out.print(vo.getKor()+ ",");
				out.print(vo.getEng()+ ",");
				out.print(vo.getMath()+ ",");
				}
				out.flush();
				out.close();
				
			} catch (IOException e) {
				System.out.println("파일을 생성할수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;
		}
	}		
}