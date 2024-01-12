package com.cnt.exam;

public class Pattern {
	public static void main(String[] args) {
		 int total = 5;
		 int row, col;
	        
	        for (row = 0; row < total; row++) {
	            
	            for (col = 0; col < total; col++) {
	                
	                if (row == 0 || col == 0 || row == col - 1
	                    || col == total - 1) {
	                    System.out.print("*");
	                }
	                
	                else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

}


