package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * Random 클래스를 사용하여 0 ~ 100 까지 범위의 난 수 2개를
 * 		생성한 후 4칙 연산을 수행한다.
 * FileWriter, PrintWriter 클래스를 사용하여
 * 		src/com/callor/app/data.txt 파일에 4칙 연산 열과를
 * 		다음과 같이 저장한다
 * * 뺄셈과 나눗셈은 큰수 - 작은수,큰수 / 작은수로 연산
 */
public class FileWrierEx_01 {
	
	public static void main(String[] args)  {
		
		
		
		Random rnd = new Random() ;
		
		/*
		 * eClipse를 사용하여 프로젝트를 만들었을때
		 * project의 소스코드가 저장되는 곳은
		 * project/src 폴더 이후에 패키지 이름으로 만들어진다
		 * 새로운 파일을 만들기 위해서
		 * src/packege-name폴더를 지정하는데
		 * 타이핑을 직접하다보면 오타가 발생할수 있기때문에
		 * Copy Qulalified..를 사용하여 임의 파일 이름을 가져오고
		 * 필요한 파일로 이름을 변경하여 사용한다
		 */
		String fileName  = "src/com/callor/app/data.text";
		
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		
		// 2개의 난수로 4칙연산을 수행
		// 뺄셈과 나눗셈은 반드시 큰수 - 작은수, 큰수 / 작은수
		if(num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int sum = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int div = num1 / num2;
		
		// file과 관련된 클래스를 사용할때는
		// 객체선언과 생성문을 분리하여 작성한다.
		
		
		// Filewriter, printwriter를 객체로 선언
		FileWriter filewriter = null;
		PrintWriter out = null;
		
		// 객체 생성
		// FileWriter 클래스를 객체로 생성할때
		// 만들(작성할, 새로 생성할) 파일이름(경로포함)을 
		// 		생성자 매개변수로 전달해 주어야 한다.
		try {
			// FileWriter 클래스의 객체만으로도
			// 		파일에 기록할수 있지만
			// 		상당히 복잡하고, 불편한 코드를 만들어야 한다
			// PrintWriter 클래스의 객체를
			//		FileWriter 클래스의 객체와 연결하여
			// 		System.out의 print 관련 method와 똑같은 방법으로
			// 		파일에 Text들을 저장한다.
			
			// OS <-> FileWriter <-> PrintWriter가 서로 연결되어
			// 데이터를 파일에 기록한다
			filewriter = new FileWriter(fileName);
			out = new PrintWriter(filewriter);
			
			out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
			out.printf("%d - %d = %d\n",num1, num2, num1 + num2);
			out.printf("%d * %d = %d\n",num1, num2, num1 + num2);
			out.printf("%d / %d = %d\n",num1, num2, num1 + num2);
			
			out.flush();
			out.close();
			
			// printwriter를 닫으면 
			filewriter.close();
			
			System.out.println("작업완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일을 생성할수 없음");
		}						
	}
}