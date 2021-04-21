package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++) {
			intList.add( rnd.nextInt(100) + 1);
			
		}
		System.out.println( intList.toString());	
		sort(intList);
		
		// intList
		System.out.println("=".repeat(50));
		System.out.println(intList.toString());
		
	} // end main

	public static void sort(List<Integer> List) {
		
		int nSize = List.size();
		for(int i= 0; i < nSize ; i++) {
			
			for(int j = i+1 ; j < nSize ; j++) {
				if(List.get(i) > List.get(j)) {
					Integer te = List.get(i);
					List.set(i, List.get(j));
					List.set(j, te);
				}
			}
		}
		System.out.println(List);
	}
}
