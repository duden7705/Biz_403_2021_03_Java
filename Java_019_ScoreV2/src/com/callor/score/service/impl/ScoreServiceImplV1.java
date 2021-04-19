package com.callor.score.service.impl;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.mdel.ScoreVO;
import com.callor.score.service.StudentService;
import com.duden7705.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements StudentService { // 마우스 올려서 확인
	
	protected Service inService;
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	String[] subjectList;
	private InputServiceImplV1 inServcie;
	private Object intNum;
	private int sSize;
	
	public ScoreServiceImplV1() {
		inServcie = new InputServiceImplV1();
		
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subjectList = new String[] {"국어","영어","수학"};
	}
	/*
	 * 학번입력하면
	 * ScoreList에 같은 학번의 성적이 있는지 확인하여
	 * 있으면 저장이 안되게
	 * 이미 있으면 다시 학번을 입력하도록 해야 한다
	 */

	
	@Override
	public void insertScore() {
		
		// 유효성검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기 때문에 while()전에 선언
		String strNum = null;
		while(true) { // 유효성 검사 
			Integer intNum = inServcie.inputValue("학번",1);
			if(intNum == null);
			return;
			
		}
		// 00001 형식으로 학번 변환(생성)
		strNum = String.format("%05d",intNum);
		
			// 이미 등록된 학번인가를 검사
		ScoreVO scoreVO = this.numCheck(strNum);
		 if(scoreVO != null) {
			continue;
		}
		 // 여기에 도달하면
		 // 		학번에 해당하는 점수가 list에없다!
		 // 학생정보에 등록된 학번인가를 검사하여
		 // 		학생정보에 없으면 다시 학번을 입력받고
		 // 		있으면 점수를 입력하도록 break;
		 StudentVO stVO = stService.getStudent(strNum);
		 if(stVO == null) {
			 System.out.println("학적부에 없는 학생입니다!!");
			 System.out.println("학번을 다시 입력해 주세요");
			 continue;
		 }
		 // 여기 도달하면 학적부에 있는 학번이다
		 System.out.println("=".repeat(30));
		 System.out.printf("학번:%s\n", stVO.getNum);
		 System.out.printf("이름:%s\n", stVO.getName);
		 System.out.printf("학과:%s\n", stVO.getDept);
		 System.out.printf("학년:%s\n", stVO.geGrade);
		 System.out.printf("주소:%s\n", stVO.getAddress);
		 System.out.println("=".repeat(50));
		 System.out.println("학생정보가 맞습니까?");
		 System.out.println("맞으면 : Enter, 틀리면 : No");
		 System.out.print(" >> ");
		 String yesNo = scan.nextLine();
		 if(yesNo.equals("No")) {
			 continue;
		 }
	Integer intKor = null;
	intKor = inService.inputValue("국어",0,100);
	if(intKor == null) {
		return;
	}
	
	
	
	// 위에서 담겨있던 데이터는 clear되고
	// 새로운 scoreVO가 생성된다
	scoreVO = new ScoreVO();
	scoreVO.setNum(strNum);
		
	 // end insertScore()
	
	// 파라메터로 전달받은 학번이 scoreList에 있는 검사
	// 있으면 scoreVO를 return
	// 없으면 null을 return
	protected ScoreVO numCheck(String num) {
		for(ScoreVO vo : scoreList) {
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ScoreVO getStudent(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		int nSize = scoreList.size();
		for(int i = 0; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			StudentVO stu = studentList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			
		}
		for(int i = 0 ; i < sSize; i++) {
			
		}
		System.out.println("-".repeat(80));
		System.out.println("=".repeat(80));
		
	}


	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

}
