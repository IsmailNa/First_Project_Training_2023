package com.javacode.day2;

import org.openqa.selenium.devtools.v112.systeminfo.SystemInfo;

public class increment_Decrement_Operator {

	public static void main(String[] args) {
	
           int i , j, k, l;
           
           i = 1;
           j = ++i;
         
           k = i++ + ++i +j++;  // k = 8 , i = 4 , j = 3
           
           l = k-- - --k + i-- - --i + j++ - --j;
           
           // l = 8 -  6 + 4   -  2  +  3  -  3 = 4
           // k = 7   6                         = 6
           // i =          3      2             = 2
           // j =                       4     3 = 3
       
           
        System.out.println(j);   
		System.out.println(i);
		System.out.println(k);
		System.out.println(l);
	}

}
