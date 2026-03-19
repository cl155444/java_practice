package com.kh.chap03.escape;

import java.util.Scanner;

public class EscapeBreak {
	/*
	 *  ** 주의사항 : switch문 내부에 작성하는 break;와는 구분 필요
	 *  		해당 내용은 switch문을 빠져나가는 용도로 사용
	 *  
	 *  
	 *  break : break문을 만나는 순간 "가상 가까운 반복문"을 빠져나감
	 *  		break;문이 속해 있는 반복문 "한 겹"을 빠져나감
	 *  
	 */

	public void method1() {
		// 무한 반복을 돌리면서
		// 매 번 사용자에게 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력 -> 몇글자인지를 출력
		// 단, 사용자가 입력한 문자역 "exit"과 같다면 반복을 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 무한반복
			System.out.print("글자수 체크 (종료하고 싶으시면 'exit'을 입력하세요) > ");
			String keyword = sc.nextLine();
			System.out.println(keyword + "은(는)" + keyword.length() + "글자입니다.");
			
			if(/*사용자가 입력한 값이 exit이라면*/keyword.equals("exit")) {
				break; // } 밑으로 내려간다. return 이전으로 돌아가서 멈춘다.
			}
		}
		System.out.println("다음에 또 오세요 ~~");
	}
	
	/*
	 * continue : 반복문 안에서 사용하는 문법
	 * 
	 * 반복문 안에서 continue 를 만나면 이후에 모든 코드를 pass
	 * 반복문 최상단 scope로 이동
	 * 
	 */
	public void checkId() {
		
		System.out.println("회원가입 서비스입니다.");
		Scanner sc = new Scanner(System.in);
		// 사용자에ㅔ 아이디값을 입력받을 것인데 10글자가 넘으면 다시 입력하게 할 것
		//								10글자가 넘지 않으면 다음 파트로 진행할 것
		
		while(true) {
			System.out.print("아이디를 입력해주세요 (10글자 이하) >");
			String userId = sc.nextLine();
		
			if(/* 사용자가 입력한 아이디억 1-글자 이하라면*/userId.length() <= 10) {
				System.out.println("사용 가능한 아이디 입니다.");
				break;
			} else {
				System.out.println("아이디는 10자 이하만 사용가능합니다");
				continue;
			}
		}
		System.out.println("비밀번호를 입력해주세요");
	}
	
}
