package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2345;
		double d= 3.14;
		String str= "굿모닝";
		char c ='한';
		String s ="한";
		
		String name = "강현혜";
		
		System.out.println("안녕하세요.");
		
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.print("하세요!");
		System.out.print("11/11");
		
		System.out.println(2+5);
		System.out.println(i+i);
		System.out.println(i+d);
		
		System.out.println(str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		
		System.out.println(str+" 랑 "+i);
		
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s);
		
		//제 이름은 강현혜 입니다.
		String a = "제 ";
		String b = "이름은 ";
		String ab = " 입니다.";
				
		
		System.out.println(a+b+name+ab);
		
		//안녕하세요 
		System.out.println("안녕하세요");
		//안녕"하"세요
		String var01= "하";
		String var02= "안녕";
		
		System.out.println("안녕\"하\"세요");
		
		//안녕\하\세요
		System.out.println("안녕\\하\\세요");
		
		System.out.println("안녕\t하세요");
		
		System.out.println("안녕\n하\n세요");
	}

}
