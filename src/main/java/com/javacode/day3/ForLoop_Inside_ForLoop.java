package com.javacode.day3;

public class ForLoop_Inside_ForLoop {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=3; i++) {     // this is the outer For Loop (rows)
			
			for (int j=1; j<=5; j++) {       // this the inner For loop (columns)
				System.out.println("Green");
			}
		      System.out.println("World");
		}
		
		System.out.println();
		System.out.println("**********************************");

		
		
		/*
		 *  Assignment : * * * * *
		 *               * * * * *
		 *               * * * * *
		 *               * * * * *
		 *               * * * * *
		 */
		
		for (int r=1; r<=5; r++) {
			
			for (int y=1; y<=5; y++) {
				System.out.print("* ");
			}
			    System.out.println();
		}
		
		System.out.println();
		System.out.println("**********************************");
		
		
		/* 
		 *  Assignment : *
		 *               *  *
		 *               *  *  *
		 *               *  *  *  *
		 *               *  *  *  *  *
		 */              
		               
             for (int r=1; r<=5; r++) {
			
			     for (int y=1; y<=r; y++) {            // Just change 5 to r
				    System.out.print("* ");
			    }
			        System.out.println();
             }
	
         	System.out.println();
    		System.out.println("**********************************");
	
             /* 
        	 *  Assignment : *  *  *  *  *
     		 *               *  *  *  *
     		 *               *  *  *
     		 *               *  *  
     		 *               *  
     		 */              
     		  
             for (int r=1; r<=5; r++) {
     			
			     for (int y=5; y>=r; y--) {            // 
				    System.out.print("* ");
			    }
			        System.out.println();
             }
	
             System.out.println();
     		System.out.println("**********************************");
 	
              /* 
         	 *  Assignment : *
         	 *               *  *
         	 *               *  *  *  
         	 *               *  *  *  *
         	 *               *  *  *  *  *
      		 *               *  *  *  *
      		 *               *  *  *
      		 *               *  *  
      		 *               *  
      		 */           
             
     		  for (int r=1; r<=5; r++) {
       			
 			     for (int y=1; y<=r; y++) {            // 
 				    System.out.print("* ");
 			    }
 			        System.out.println();
             
     		  }
     		  
     		 for (int r=1; r<=5; r++) {
      			
			     for (int y=4; y>=r; y--) {            // 
				    System.out.print("* ");
			    }
			        System.out.println();
             }
	}
	

}
