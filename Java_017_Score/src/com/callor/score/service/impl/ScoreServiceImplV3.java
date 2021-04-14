package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2{
	
	// V1, V2로 부터 다음 method를 상속받은 상태
	// selectMenu(),
	// inputScore(),
	// PrintScore(),
	// saveScore()
	
	// readScore()
	
	/*
	 * 
	 */
	public void readScore() {
		
		String readFile = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(readFile);
			while(true) {
				String reader = buffer.readLine();
				// if조건문에 대하여 실행할 명령문이
				// 한줄만 있을경우
				// {}를 생략하고 명령문을 사용할수 있다
				if(reader == null) break;
				
				String[] scores = reader.split(":");
				Integer int intKor = Integer.valueOf(scores)[1];
				Integer int intEng = Integer.valueOf(scores)[2];
				Integer int intMath = Integer.valueOf(scores)[3];
				
				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(scores[0]);
				scoreVO.setKor(intKor);
				scoreVO.setEng(intEng);
				scoreVO.setMath(intMath);
				scoreList.add(scoreVO);
				
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}

}
