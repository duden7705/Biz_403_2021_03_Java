package com.callor.score.service;

import com.callor.score.service.impl.ScoreVO;

public interface StudentService {
	
	public void insertStudent();
	public void loadStudent();
	
	// 학번으로 학생정보를 검색하여(조회하여)
	// 학생정보가 담긴 VO를 return하는 method
	public com.callor.score.mdel.ScoreVO getStudent(String num);
	
	public void printStudent();
	void insertScore();
	void printScore();

}
