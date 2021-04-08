package com.callor.app.service;

import com.duden7705.standard.InputService;

/*
 * InputService interface를 활용하여
 * 한 학생의 국어, 영어, 수학점수를 입력받고
 * 총점과 평균을 계산하여 출력
 * 단, 점수는 0 ~ 100까지만 입력할 수 있음
 */
public class ScoreServiceV1 {

	Integer kor; 
	Integer eng;
	Integer math;
	Integer sum;
	float avg;
	public class InputServiceImplV1 implements InputService {
		
	}
}