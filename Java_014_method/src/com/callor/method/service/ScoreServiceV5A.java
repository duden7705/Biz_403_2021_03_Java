package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {
	
	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;
	
	InputServiceV2 intService;
	Integer[] subject;
	
	public ScoreServiceV5A() {
		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();
		inService = new InputService();
	}
}
