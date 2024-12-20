package com.practice;

public class practie {
	
	public static String schoolname = "royal-school";
	public String studentname = "vasubabu";
	public int studentroolno = 001;
	
	
	
	public static void main(String[] args) {
		
	System.out.println(schoolname);
		
		practie s1 = new practie();
		s1.studentname = "koteswararao";
		System.out.println(s1.studentname);
		 
		practie s2 = new practie();
		s2.studentroolno = 002;
		System.out.println(s2.studentroolno);
		
	}

}