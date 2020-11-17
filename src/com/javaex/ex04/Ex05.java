package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	private static final int J = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("다음과 같이 출력되는 구구단을 출력하세요.");

		for(int dan=2; dan<10; dan++) {
			
			for (int times=1; times<10; times++) {
	
				System.out.println(dan + "X" + times +"="+ dan*times);
			}
				System.out.println();
		
		}
		
		sc.close();
	}

}
