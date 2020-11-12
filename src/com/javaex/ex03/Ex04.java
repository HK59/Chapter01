package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("근무시간을 입력하세요.");
		System.out.print("근무시간");
		
		int time = sc.nextInt();
		
		if(time<8) { 
			System.out.println("임금은 "+ 10000*time+ "원 입니다.");
		}else if(time>8) {
			System.out.println( 8*1000+(time-8)*150000+"원 입니다.");
		}
		sc.close();
	}

}

	
