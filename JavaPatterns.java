package com.java.ajith.patterns;

public class JavaPatterns {

	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		for (int i = 1; i <=4; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		****
//		***
//		**
//		*
//		for (int i = 1; i <=4; i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		*
//		**
//		***
//		****
//		***
//		**
//		*
//		for (int i = 1; i <=4; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <=3; i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		    *
//		   **
//		  ***
//		 ****
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		 ****
//		  ***
//		   **
//		    *
//		 for(int i=1;i<=4;i++){
//			 for(int j=1;j<=i;j++) {
//				 System.out.print(" ");
//			 }
//			 for(int j=4;j>=i;j--) {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }

//		    *
//		   **
//		  ***
//		 ****
//		  ***
//		   **
//		    *
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=3;k>=i;k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//	     *
//	    * *
//	   * * *
//	  * * * *
//		for(int i=1;i<=4;i++) {
//			for(int j=3;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}

//	     *
//	    ***
//	   *****
//	  *******
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			for(int l=2;l<=i;l++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}

//		 *******
//		  *****
//		   ***
//		    *
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=4;k>=i;k--) {
//				System.out.print("*");
//			}
//			for(int l=3;l>=i;l--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*
//		 *
//		  *
//		   *
//		    *
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				if(i>=2 && j<= i-1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//	     *
//	    * 
//	   *  
//	  *   
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				if(i>=2 && k>1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//	      *
//	     * *
//	    *   *
//	   *     *
//	  *       *
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++) {
//				if(k>1 && k<(i*2)-1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		*       *
//		 *     *
//		  *   *
//		   * *
//		    *
//		for(int i=5;i>=1;i--) {
//			for(int j=5;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++) {
//				if(k>1 && k<(i*2)-1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		*   *
//		 * * 
//		  *  
//		 * * 
//		*   *
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i==j || i+j==5-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		****
//		*  *
//		*  *
//		****
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i>=2 && j>=2 && i<=3 && j<=3) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
	}
}
