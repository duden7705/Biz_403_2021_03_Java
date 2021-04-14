package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_05 {
	
	private static Object scoreList;

	public static void main(String[] args) {
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		/*
		 * List에 있는 removeAll() method는
		 * 2개의 list에 중복된 데이터가 있으면
		 * 중복된 데이터를 삭제하는 method
		 * 
		 * List type 에 데이터를 새로 추가하고자 할때는
		 * 기존의 데이터를 삭제하고 추가를 해야 한다
		 * 이때 사용할수 있는 코드
		 * 
		 * 파일이나 데이터베이스에서 데이터를 가져와서
		 * List에 반영하고자 
		 */
		scoreList.remove(scoreList);
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = null;
				try {
					reader = buffer.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(reader == null) {
					break;
				}
				//System.out.println(reader);
				
				// 문자열.splite("기준문자열")
				// 문자열에 저장된 값을 기준문자열로 나누어
				// 문자열 배열로 만들어주는 method
				 String[] scores = reader.split(":");
				System.out.printf("학번:%s, 국어:%s, 영어:%s, 수학:%s\n", scores[0], scores[1], scores[2], scores[3]);
				
				int intKor = Integer.valueOf(scores[1]);
				int intEng = Integer.valueOf(scores[2]);
				int intMath = Integer.valueOf(scores[3]);	
				int sum = intKor + intEng + intMath;
			}
			buffer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}