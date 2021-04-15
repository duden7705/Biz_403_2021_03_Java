package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * StudentServce 인터페이스를 implments하여 클래스 작성
 * loadStudent() method에서
 * 		student.txt 파일을 읽어 학생 정보를 추출한 후
 * 		List<StudentVO> studentList에 추가
 * StudentServiceImplV1 생성자에서
 * 		loadStudent()를 호출 자동으로 학생 정보(list) 생성
 */
public interface StudentServiceImplV1  {

	
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/student.txt";
				
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		while(true) {
			String reader = buffer.readLine();
			System.out.println(reader);
		}
}
}


