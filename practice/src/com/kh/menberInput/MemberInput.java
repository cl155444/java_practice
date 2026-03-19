package com.kh.menberInput;

import java.util.Scanner;

public class MemberInput {
	public void inputMenber() {
		Scanner sc = new Scanner(System.in);
		// 이름 입력 -> "이름 : 입력값" 출력
		System.out.print("이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		
		System.out.print("이메일을 입력해주세요 > ");
		sc.nextLine();
		String eMail = sc.nextLine();
		
		System.out.println("--------------------");
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + eMail);
	}

}
