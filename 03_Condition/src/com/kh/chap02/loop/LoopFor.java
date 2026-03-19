package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.condition.ConditionIf;

public class LoopFor {
	public void method0(){
		for(
			int i = 0;
			i < 5;
			i++
			) {
			System.out.print(i+1);
			System.out.println("반복시키고싶은 코드");
		}
		
	}

	public void method1() {
		// 첫째줄에 1, 둘째줄에 2, 셋째줄에 3 나오도록 for문 활용해보기
		//for(int i=1; i<=3; i++) {
			//System.out.println(i + "번 반복");
		
		//for (int i = 0;i < 10; i++ ) {
			//if(i % 2 == 0) {
			//	System.out.println(i);
		//	}
		
		for(int i = 100 ; i >= 1; i--) {
			System.out.println(i);
		}
	}
	public void gugudan() {
		//구구단 프로그램
		//사용자에게 정수를 입력받아서
		// 사용자가 입력한 정수의 단을 출력해보기
		
		/* ※구구단을 외자※
		 *  몇 단을 출력하시겠습니까? > 4
		 *  4단을 출력하겠습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("※ 구구단을 외자 ※");
		System.out.print("몇 단을 출력하시겠습니까? > ");
		
		int dan = sc.nextInt();
		
		//if룰 사용한다면
		//if(dan == 2){ println(2단내용) } else if(dan = 3){ -- } ... 형식으로 만든다.
		// 이 경우 코드에 중복이 많이 발생한다.
		
		for(int i = 1; i<= 9 ; i++) {
			System.out.println(dan + "X" + i + " = " + (dan * i));
		}
	}
	
	//구구단, OX퀴즈 활용해보기
	public void mainMenu() {
		for(;;) {
			System.out.println("메인메뉴입니다.");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. O/X 퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			
			Scanner sc = new Scanner(System.in);
			int menuNo = sc.nextInt();
			sc.nextLine();
			//System.out.println(menuNo); // 출력 실험해보기
			
			if(/* 1번 입력시 */ menuNo == 1) {
				gugudan();// 이전에 만든 동일 클래스 내 구구단 기능을 불러오기
			} else if ( /*2번 입력시 */ menuNo == 2) {
				ConditionIf ci = new ConditionIf(); // 이전에 만든 타 클래스 OX 퀴즈 기능 불러오기
				ci.quiz();
			} else if(/*3번 입력시 */ menuNo == 3) {
			System.out.println("프로그램을 종료합니다.");
			return;
		} else {
			System.out.println("없는 메뉴를 선택하셨습니다.");
			
		}
	}
	}
}
