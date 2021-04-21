package com.callor.app.service;

import java.util.List;
import java.util.Random;

import com.callor.app.model.DeckVO;

public class DeckServiceV1 {
	
	protected List<DeckVO> deckList;
	String strSuit = "다이아(◆):하트(♡):스페이드(♠):클로버(♣)";
	String strDenomi = "A234567890KQJ";
	
	public DeckVO getDeck() {	
		Random rnd = new Random();
		int nSize = deckList.size();
		int decKIndex = rnd.nextInt(nSize);
		
		DeckVO retDecKVO = deckList.get(decKIndex);
		deckList.remove(decKIndex);
		return retDecKVO;
		
	}
	
	public void makeDeck() {
		
		String[] denoms = strDenomi.split("");
		String[] suits = strSuit.split(":");
		
		// 4번 반복
		for(String suit : suits) {
			for(String denom : denoms) {
				
				Integer intValue = 0;
				try {
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (NumberFormatException e) {
					// denom 문자열이 A,K,Q,J인 경우 Ex
					if(denom.equals("A")) intValue = 0;
					else intValue = 10;
				}
				
				DeckVO decKVO = new DeckVO();
				decKVO.setSuit(suit);
				decKVO.setDenomiation(denom);
				decKVO.setValue(intValue);
				deckList.add(decKVO);
			}
		}
	}
}
