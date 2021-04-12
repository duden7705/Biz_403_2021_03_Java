package com.callor.app.impl;

/*
 * ScoreServiceImplV1을 상속받고
 * inputScore() method를 재 정의
 * 학생의 학번을 입력 받을 때
 * 		이미 입력된(추가된) 학생일 경우
 * 이미 입력된 학생임을 메시지로 보여주고 다시 입력 받는다
 * 학생이름, 성적 등은 V1과 같다
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.duden7705.standard.InputService;
import com.duden7705.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService{

	protected List<ScoreVO> scorelist;
	protected InputService inService;
	protected Scanner scan;
	
	public void ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		scorelist = new ArrayList<ScoreVO>();
		
	}
	
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}
}
