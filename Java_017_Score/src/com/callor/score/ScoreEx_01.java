package com.callor.score;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV2;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO();
		System.out.println(scoreVO.toString());
		
		ScoreServiceImplV2 sService = new ScoreServiceImplV2();
		sService.selectMenu();
	}

}
