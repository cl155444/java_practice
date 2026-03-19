package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * (단일) if문
	 * 
	 * [ 표현법 ]
	 * if(조건식) {
	 * 
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * 
	 * => 조건식의 결과값이 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과값이 false일 경우 : if문 Scope({})을 건너뜀
	 * 
	 * 
	 */
	public void method1() {
		//System.out.println("메소드가 잘 수행하는가");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작습니다.");
			
		}
		
		// if문의 조건식 자리에는 결론적으로 true 아니면 flase값이 들어가도록 만들어야 한다.
		
		if(true) {
			System.out.println("이 코드는 if문을 만나면 무조건 수행되는 코드");
			
		}
		
		if(false) {
			System.out.println("이 코드는 if문을 만나면 절대 동작하지 않는 코드");
			
		}
	}
	
	public void quiz() {
		
		int count = 0;
		int wrongCount = 0; //증감 연산자를 통해 이를 증가시킬 것
		
		
		// 문제를 출력해준 뒤
		System.out.println("고양이는 호랑이과일까요?"); // 답은 x
		// 사용자에게 o 또는 x를 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 o 또는 x로 입력해주세요 > ");
		
		// char answer = sc.nestLine(); 사용불가 
		//char은 문자이고 sc.nestLine은 문자열이라서 동일 타입이 아니라 사용할 수 없음
		
		char answer = sc.nextLine().charAt(0); // o/x 
		// charAt에 대해서 이해가 잘 안되니 설명 한번 더 정리해보기
		// 1. 무슨 값을 가지고 -> == 사용자가 입력한 값 ==
		//						'x'
		// 2. 무슨 연산을 할 것인가 -> 동등비교를 사용  ★해당 1,2가 중요★
		if(answer == 'x' || answer == 'X') {
			System.out.println("정답입니다~");
			count++;
			
		}
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다~");
			wrongCount++;
		}
		
		// 경우의 수 사용자가 입력한 값이 x, X, o, O일 경우 -> 빠지도록
		// 1. 무슨 값을 가지고? (answer) / X,x,O,o와 일치하지 않는 값(!=)
		// 2. 무슨 연산?
		
		if((answer != 'X') && (answer != 'x') && (answer != 'o') && (answer != 'O')){
			System.out.println("O 또는 X를 입력해주세요");
		}
		
		// 정답입니다~ / 오답입니다~를 출력해주는 퀴즈 프로그램
		System.out.println("문제 : 여우는 개과일까요?");
		System.out.print("정답을 o/x로 입력해주세요 > ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'o' || answer == 'O') {
			System.out.println("정답니다.");
			count++;
		}
		
		if(answer == 'x' || answer == 'X') {
			System.out.println("오답입니다.");
			wrongCount++;
		
			
		}
		if(!(answer == 'X') || (answer == 'x') || (answer != 'o') || (answer != 'O')){
			System.out.println("O 또는 X를 입력해주세요");
		}

	
		System.out.printf("퀴즈 끝 ~ 정답 %d개, 오답 %d개 입니다", count, wrongCount);
	}
	
	
}
