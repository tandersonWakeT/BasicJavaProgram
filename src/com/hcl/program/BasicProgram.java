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
        System.out.println("\nEnter an integer value: ");
        int j = kb.nextInt();
        kb.close();
        
        int k = 0;
        while (k < j) {
        	System.out.println(k);
        	k++;
        }
		
        System.out.println("\nDay of the week example: ");
        
        // Switch conditional statement
        int day = 3;
        switch(day) {
        	case 1:
        		System.out.println("Monday");
        		break;
        	case 2:
        		System.out.println("Tuesday");
        		break;
        	case 3:
        		System.out.println("Wednesday");
        		break;
        	case 4:
        		System.out.println("Thursday");
        		break;
        	case 5:
        		System.out.println("Friday");
        		break;
        	case 6:
        		System.out.println("Saturday");
        		break;
        	case 7:
        		System.out.println("Sunday");
        		break;
        	default:
        		System.out.println("This is not a day of the week");
        }
	}
}
