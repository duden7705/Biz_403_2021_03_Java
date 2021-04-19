package com.callor.word;

import com.callor.word.service.impl.WordServicImplV1;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		WordServicImplV1 wService = new WordServicImplV1();
		for(int i = 0 ; i < 10 ; i++) {
			wService.startGame();
			
		}
	}

}
