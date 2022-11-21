package com.KoreaIT.java.BAM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("명령어 : ");
		
		String str = sc.nextLine();
		
		System.out.printf("입력된 문자 : %s\n", str);
		
		System.out.println("==프로그램 끝==");
		sc.close();
	}
}
