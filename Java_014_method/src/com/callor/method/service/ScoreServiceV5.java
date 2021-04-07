package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

/*
 * 과목명을 subject = { "국어", "영어", "수학" } 배열에 선언
 * 과목의 점수를 담을 3개의 List를 선언
 * List<Integer> kors,
 * List<Integer> engs,
 * List<Integer> math,
 * InputServiceV2의 inputValue() method를 사용하여
 * 5명 학생의 각 과목의 점수를 입력
 * 입력 받은 점수를 kors, engs, mths list에 add()
 * printScore() method를 사용하여 성적 리스트 출력
 */
public class ScoreServiceV5 {

	protected String[] subject;
	protected InputServiceV2 inservic;

	List<Integer> kors = new ArrayList<Integer>();
	List<Integer> engs = new ArrayList<Integer>();
	List<Integer> maths = new ArrayList<Integer>();

	public ScoreServiceV5() {
		subject = new String[] { "국어", "영어", "수학" };
		inservic = new InputServiceV2();
	}

	public void ScoreList() {
	}

	public void printScore() {
		for (int i = 0; i < 5; i++) {
			Integer score = inService.inputvalue(subject[i], 0, 100);
			kors.add(score);
			engs.add(score);
			maths.add(score);
		}
	}
	public void printscore() {
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("%d\t" + kors);
		System.out.printf("%d\t" + engs);
		System.out.printf("%d\t" + maths);
	}
}