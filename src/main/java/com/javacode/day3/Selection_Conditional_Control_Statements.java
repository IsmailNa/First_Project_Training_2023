package com.javacode.day3;

public class Selection_Conditional_Control_Statements {

	public static void main(String[] args) {
		
		// if
		// Syntax :
		
		if (2<5) {
			System.out.println("I am learning if Syntax");
			}

		// if else
		
		if (2>5) {
			System.out.println("Print Something");
		}else { 
			System.out.println("The condition is incorrect");
		}
		
		// if else if
		// We learn with a programming concept
		
		// Find the largest of 3 numbers 
		
		int e = 10, t = 20, h = 30; 
		
		if(e>t && e>h)  {
			System.out.println(" e is the greatest :" + e);
		}else if(t>e && t>h) {
			System.out.println(" t is the gretest :" + t);
		}else {
			System.out.println(" h is the greatest :" + h);
		}
		
		// WAP to determine smallest of 5 numbers
		
		int i = 10, j = 20, k = 30, l = 40, m = 50; 
		
		if(i<j && i<k && i<l && i<m) {
			System.out.println(" i is the smallest :" + i);
		}else if(j<i && j<k && j<l && j<m) {
			System.out.println(" j is the smallest :" + j);
		}else if(k<i && k<j && k<l && k<m) {
			System.out.println(" k is the smallest :" + k);
		}else if(l<i && l<j && l<k && l<m) {
			System.out.println(" l is the smallest :" + l);
		}else {
			System.out.println(" m is the smallest :" + m);
		}
		
		// WAP to determine whether the number is even or odd 
			
		int a = 2;
		int b = 3;
		int c = 9;
		int d = 12;
		
		
		
	}

}
