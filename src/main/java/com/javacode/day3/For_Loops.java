package com.javacode.day3;

public class For_Loops {

	public static void main(String[] args) {
		
		// For loop diagram
		// first step - initialization 
		// second step - condition
		// third step - if condition is true it will go inside the body of for loop 
		// third step - if condition is false it will come outside of the for loop
		// 4th step - it will execute the logic inside the for loop body
		// 5th step - it will update the value as per the increment/decrement operator 
		// 6th step - check the condition again 
		// 7th step - if condition is true it will again go inside the for loop body
		// 7th step - if condition is false it will go out of the for loop
		
		
		for (int i = 1; i <= 5; i++) {       // i=1 now initialized value of i -> 1 <= 5 condition is true -> control will go inside the For Loop body and it will print 1.
			System.out.print(i + " ");       // then it will jump to the updation i will become 2 -> 2 <= 5 then it will print 2 etc     
			                                      
			
			
		}
		
		 System.out.println();
         System.out.println("************************************");		
		
		// WAP to print from 100 to 1 using for loop
		 
		for (int t = 100; t >= 1; t--) {
			System.out.print(t + " ");
	    
			
		}
           System.out.println();
           System.out.println("************************************");
		
        // sum 100+99+98+97+.......+1 = ?
           
         
           int sum = 0;
           for (int j = 100; j >= 1; j--) {
   			System.out.print(j + " ");      // 100, 99, 98
                
   			sum = sum + j;            // sum = 0 + 100 = 100, sum = 100 + 99 = 199, sum = 199 + 98 = 297
			System.out.println(sum);  //  100, 199, 297
        } 
           
           System.out.println();
           System.out.println("************************************");
           
           System.out.println("The sum from 100 decreasing to 1 is : " + sum);
           
           System.out.println();
           System.out.println("************************************");
           
         // WAP to print from 500 till 25 with a difference of 25 and add the numbers
         // 500, 475, 450, ...., 25  
        
           
           
          for (int e = 500; e >= 25; e-=25) {
        	  System.out.print(e + " ");  
        	  
          }
          
          
          System.out.println();
          System.out.println("************************************");
          
          //sum1 500 + 475 + 450 + .......... + 25 = ?
          
          int sum1 = 0; 
          
          for (int l = 500; l >= 25; l-=25) {
        	  System.out.print(l + " ");  
        	
        	  sum1 = sum1 + l;
        	 System.out.println(sum1);
          }	
           
          System.out.println();
          System.out.println("************************************");
           
           
           
           
	}
           

}
