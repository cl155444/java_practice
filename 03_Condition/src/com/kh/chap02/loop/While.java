package com.kh.chap02.loop;

public class While {
	/* while문
	 * 
	 * [표현법]
	 * 
	 * 초기식 ; // 필수는 아님
	 * 
	 * while(조건식 {
	 * 			반복적으로 실행하고자 하는 코드;
	 * 			증감식: // 필수는 아님
	 * }
	 * 
	 * for과 다른 용도
	 * for -> 개발자가 반복을 몇 번 해야할지 명확하게 알고 있다.
	 * while -> 개발자가 반복을 몇 번 해야할지 가늠을 할 수가 없다.
	 * 
	 * 이 문법은 무한반복을 하는 용도로 사용할 예정
	 */
	
	public void method1() {
		// for문 쓰듯이 초기식 조건식 증감식 사용해보기
		int i = 0; // 초기식
		while(i < 3) { //조건식
			i++; // 증감식
			System.out.println(i);
		}
	}
	public void method2() {
		// 1~10까지의 합계를 구해서 출력
		// 간단하게 하기
		// System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		int i = 1;
		int sum = 0;
		while(/* 10번 반복*/i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	public void method3() {
		//1부터 시작해서
		//1~10 사이의 임의의 정수까지를 모두 더한 합께를 출력
		//random 함수 사용 // 이는 java 자체 클래스에 존재하지만 지금은 사용하지 않음
		// Math라는 클래스가 가지고 있는 random()를 호출해서 만들어볼 예정
		
		double number = Math.random();
		// random()의 결과값은 : 0.0 ~~~ 0.9999999999999999
		// 이를 1~10d으로 바구어 볼 것
		// number에다가 10을 곱하면 -> 0.0 ~~~ 9.9999....
		System.out.println(number * 10);
		// 10을 곱한 결과를 int형으로 강제 형변환
		System.out.println((int)number * 10); // 0만 나온다.
		System.out.println((int)(number * 10)); // 0~9까지 나온다
		//10이 나오도록 하려면
		//10을 곱한 결과를 int형으로 강제형변환을 해준 뒤 정수값 1을 더해줌
		//		1~10
		System.out.println((int)(number * 10) + 1); // 1~10
		
		
		int randomNum = (int)(Math.random() * 10) + 1;
		System.out.println(randomNum); // 1~10
		int i = 1;
		int sum = 0;
		
		while(i <=randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum);
	}
	// 로또 번호 생성기
	public void lotto() {
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("오늘의 운세 ~ %d,%d,%d,%d,%d,%d,"
							,num1,num2,num3,num4,num5,num6);	
	}
	
}

