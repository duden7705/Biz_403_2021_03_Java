package com.callor.apps;

import com.callor.apps.apps.ScoreServiceV1;

public class App_09 {
	
	public static void main(String[] args) {
		
		// 
		ScoreServiceV2 ssV2 = new ScoreServiceV2(100);
		ssV2.makeScore();
		ssV2.makeSum();
		ssV2.printScore();
		
	}

}
