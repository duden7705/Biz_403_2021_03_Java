package com.callor.score;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Word_01 {
	
	public static void main(String[] args) {
	
		String fileName = null;
		PrintWriter out = null;
		BufferedReader buffer = null;
		FileWriter fileWriter = null;
		
		String word = "src/com/callor/score/word txt";
		
		try {
			fileWriter = new FileWriter(word);
			out = new PrintWriter(fileReader);
			while(true) {
				System.out.print(">>");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
