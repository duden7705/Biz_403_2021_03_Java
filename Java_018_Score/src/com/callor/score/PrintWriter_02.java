package com.callor.score;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class PrintWriter_02 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/print.txt";
		InputStreamReader key = null;
		BufferedReader buffer = null;
		
		key = new InputStreamReader(System.in);
		buffer = new BufferedReader(key);
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
