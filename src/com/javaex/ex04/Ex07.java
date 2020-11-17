package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int lineCount = 6;
	int StartCount =1;
	int SpaceCount = lineCount-1;
	
	for(int i=0; i<lineCount; i++) {
		for (int j=0;j<SpaceCount; i++)
			System.out.print(" ");
	}
		for(int j = 0; j<StartCount; j++){
		System.out.println("*");
	}
		for (int j=0;j<SpaceCount; j++)
			System.out.print(" ");
	}
}
