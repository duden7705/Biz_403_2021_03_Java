package com.callor.apps;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class App_09 {
	
	public static void main(String[] args) {
		
		int intNum = 3939239;
		DecimalFormat format 
				= new DecimalFormat("###,###");
		
		NumberFormat strForm = null;
		// format(숫자) 명령을 수행하면
		// 숫자를 3자리 구분기호를 부착하여
		// 문자열로 만들어 준다.
		String str = strForm.format(intNum);
		System.out.println(str);		
		System.out.println(strForm.format(392342340));
		
		
	}

}
