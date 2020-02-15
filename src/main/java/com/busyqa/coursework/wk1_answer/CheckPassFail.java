package com.busyqa.coursework.wk1_answer;

import java.util.Scanner;

public class CheckPassFail {  // Save as "CheckPassFail.java"
    public static void main(String[] args) {  // Program entry point
    	static void CheckPassFail() 
    	{
    		Scanner Input = new Scanner(System.in);
    		System.out.println("ENTER SCORE: ");
    		
    		int score = Input.nextInt();
    		Input.close();
    		if (score >= 50) {
    			System.out.println("PASS");
    		}
    		else {
    			System.out.println("FAIL");
    		}
    		System.out.println("DONE");
    	}
    	
    }
}