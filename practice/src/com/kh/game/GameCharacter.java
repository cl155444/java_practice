package com.kh.game;

import java.util.Scanner;

public class GameCharacter {

	public void createCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("캐릭터 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("직업 이름을 입력해주세요 > " );
		String job = sc.nextLine();
		System.out.print("레벨을 입력해주세요 > ");
		int level = sc.nextInt();
		
		System.out.println("캐릭터 생성 완료\n");
		
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("레벨 : " + level);
		
		
	}
}
