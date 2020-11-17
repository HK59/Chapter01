package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 10까지의 합을 구하시오");

		int sum=0;
		for(int i=1; i<=10;i++) {
		
		sum = sum+ i;//검증해볼것 
		}
		
		
		System.out.println("1부터 10까지의 합은" +sum + "입니다");
		 sc.close();
	}
	
   

		
	}


