package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
	
        int i = 1;
        while(i<=9){ // i<10;
        
			System.out.println(dan+ "*" + i + "=" + dan*i);
        	
        	i++;
        	
       
        }
	
        sc.close();
	}

}