package com.hcl.program;
import java.util.Scanner;

public class BasicProgram {
	
	public static void main(String[] args) {
		
		System.out.println( "Hello World! -Tristan" );
        
		// For loop with a conditional statement inside
        for (int i = 0; i < 10; i++) {
        	
        	if (i == 5) {
        		continue;
        	}
        	System.out.println(i);
        }
        
        // Take input from user and use a while loop to execute 'j' number of times
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int j = kb.nextInt();
        kb.close();
        
        int k = 0;
        while (k < j) {
        	System.out.println(k);
        	k++;
        }
		
        // Switch conditional statement
        
	}
}
