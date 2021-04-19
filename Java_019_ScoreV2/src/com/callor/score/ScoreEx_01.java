package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		ScoreServiceImplV1 sService = new ScoreServiceImplV1();
		sService.insertScore();
	}

}
