package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {
	
	// 객체선언 했음
	protected Random rnd; 
	protected List<Integer> primeList; 
	
	// 객체생성(초기화) 했음
	public PrimeServiceV4() { // Ctrl + space
		// TODO Auto-generated constructor stub
		rnd = new Random(); 
		primeList = new ArrayList<Integer>();
		
	}
	public void primeNum() {
		for(int i = 0 ; i < 50 ; i++) {
			int rndNum = rnd.nextInt(51) + 50;
			
			boolean notPrime = false;
			for(int index = 2 ; index < rndNum ; index ++) {
				if(rndNum % index == 0) {
					notPrime = true;
					break;
				}
			}
			if(!notPrime) {
				
			} else {
				
			}
				}
			}		 				 
		
	public void printPrime() {
	}
	}
