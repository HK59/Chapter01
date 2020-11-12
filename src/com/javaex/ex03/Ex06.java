package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		} else if(point>=89) {
			System.out.println("B등급");
		} else if(point>=79) {
			System.out.println("C등급");
	 	} else if(point>=69){
	 		System.out.println("D등급");
	 	} else if (60>point)
	 		System.out.println("F등급");
		sc.close();
	}

}
