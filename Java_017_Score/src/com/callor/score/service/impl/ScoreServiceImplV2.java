package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	
	public void ScoreServiceV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subjectList = new String[] {"국어","영어","수학"};
		
		for(int i = 0; i < subjectList.length; i++) {
			String subject = subjectList[i] + "점수";
			Integer intScore = inService.inputValue(subject,0,100);
			if(intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
		}
		@Override
		public void printScore() {
			System.out.println("=".repeat(80));
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
			System.out.println("-".repeat(80));
			
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				System.out.print(vo.getNum() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMath() + "\t");
				System.out.print(vo.getTotal() + "\t");
				System.out.print(vo.getAvg() + "\n");						
			}
			System.out.println("-".repeat(80));
		} // end printScore()
			
		public void saveScore() {
			
			String fileName = null;
			while(true) {
				System.out.println("저장할 파일 이름을 입력하세요");
				System.out.print(" >> ");
				String fileName1 = scan.nextLine();
				if(fileName1.equals("")) {
					System.out.println("파일이름은 반드시 입력하세요");
					continue;
				}
				break;
			}
			
			String strFileName = "src/com/callor/score/" + fileName;
			
			FileWriter filewriter = null;
			PrintWriter out = null;
			
			try {
				filewriter = new FileWriter(strFileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				int nSize = scoreList.size();
				for(int i = 0 ; i < nSize ; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + "\t");
					out.print(vo.getName() + "\t");
					out.print(vo.getKor() + "\t");
					out.print(vo.getEng() + "\t");
					out.print(vo.getMath() + "\t");
					out.print(vo.getTotal() + "\t");
					out.printf("%3.2f\n",vo.getAvg());
				}
			}
		}
	}
