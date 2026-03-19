package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {
	Scanner sc = new Scanner(System.in);

	public void arithmetic() {
		// 산술연산자 -> 이항연산자 우선순위는 수학과 동일
		// +,-,*,/
		// % 모듈러(Modular) => 나눗셈의 나머지를 구하는 연산
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// test();
		System.out.println("num1 + num2 : " + num1 + num2); // num + num2 : 103

		// 이를 10+3 값으로 만드는 방법
		System.out.println("num1 + num2 : " + (num1 + num2));
		int sum = num1 + num2;
		System.out.println("num1 + num2 : " + sum);
		System.out.printf("num1 + num2 : %d\n", num1 + num2);

		// 빼기를 진행하는 경우
		System.out.println("num1 + num2 : " + (num1 - num2));

		// 곱하기, 나누기, %(모듈러)의 경우
		System.out.println("num1 x num2 : " + (num1 * num2));
		// 괄호 필요없지만 가독성을 위해 소괄호를 사용하는 것을 권장함

		// 조심해야하는 부분
		// System.out.println(10/0); 0으로 나누면 에러난다.

		// 사탕갯수 구하기 프로그램 구현하기
		// 메소드 : presentToStudent()

		// 사용자에게 값을 입력받기 Scanner
		// 1. 나눠줄 학생의 수 = nestInt();
		// 2. 사탕 개수 = nextInt();

		// 1인당 받을 수 있는 사탕의 개수 ; 사탕 개수 / 학생 수 산술 연산자
		// 남은 사탕의 개수 : 사탕 개수 % 학생 수 = 산술 연산자

		// 출력형식
		// 학생 한 명당 받을 수 있는 사탕 개수 : X개 = println();
		// 남은 사탕 개수 : X개 = println();

	}

	public void presentToStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력해주세요 > ");
		int students = sc.nextInt();
		System.out.println("학생수 : " + students);

		System.out.println("사탕 개수를 입력해주세요 > ");
		int candies = sc.nextInt();
		System.out.println("사탕 개수 : " + candies);

		int result = candies / students;
		int mod = candies % students;
		System.out.println(result);
		System.out.println(mod);

		System.out.println("한명 당 가질 수 있는 사탕의 개수 : " + result + "개");
		System.out.println("남는 사탕의 개수 : " + mod + "개");

	}

	public void inDecrease() {
		/*
		 * 증감연산자 : 단항연산자로 한번에 1 증가하거나 1감소하는 연산 ++ : 값을 1 증가시킴 -- : 값을 1 감소시킴 증감을 먼저 하건지,
		 * 아니면 나중에 할 건지에 따라 연산자의 위치가 달라짐
		 * 
		 * 전위 연산 : ++값, --값 -> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리 후위 연산 : 값++, 값-- (이를 선호하는 것이
		 * 관행) -> 먼저 값을 처리하고 나서 증가하거나 감소
		 */

		int num = 10;
		//System.out.println(num); // 10
		//num++;
		//System.out.println(num); // 11
		//num--;
		//System.out.println(num); // 10
		//System.out.println(num++); // 10
		//System.out.println(num++); // 11
		//System.out.println(num); // 12
		
		int number = num++;
		System.out.println("num : " + num) ; // 11
		System.out.println("number : " + number); // 10
		
		int a = 20;
		int b = a--;
		System.out.println(a); // 19
		System.out.println(b); // 20
		
		int c = 20;
		int d = c++ * 3; // ++는 d에 영향을 주지 않는다.
		System.out.println(c); // 21
		System.out.println(d); // 60
		
		int e = 10;
		int f = ++e;
		System.out.println(e); // 11
		System.out.println(f); // 11
		
		int g = 20;
		int h = ++g *3;
		System.out.println(g); // 21
		System.out.println(h); // 63
		

	}
	
	public void compound() {
		/* = 대입연산자
		 * 산술연산자에 대입연산자를 합친 연산자 : 복함 대입 연산자
		 * +=, -=,*=,/=,%= =가 앞으로 가면 대입이 되니 주의
		 */
		int endDay = 128;
		System.out.println(endDay);
		endDay = endDay - 1;
		System.out.println(endDay);
		endDay -= 1;
		System.out.println(endDay);
	}
	
	public void logicalNagation() {
		/*
		 * 논리 부정 연산자 : 논리값(true,false)을 반대로 바꿔주는 연산자
		 */
		System.out.println(!true);
		
	}
	
	public void comparison() {
		
		/*
		 * 관계 연산자(비교 연산자)
		 * 
		 * 두개의 값을 가지고 비교하는, 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것(반복문에서도 사용됨)
		 * 
		 */
		
		/*
		 * 종류
		 * 1. 동등비교 : 일치함을 비교
		 * 
		 * a == b (의문형으로 생각할 것. a와 b가 일치합니까?)
		 * a != b : a와 b가 일치하지 않습니까?
		 * 
		 * 2. 대소비교 : 크고 작음을 비교
		 * a < b : a가 b보다 작습니까?
		 * a <= b : a가 b와 같거나 작습니까?
		 * =<이 되면 대입이 되어버린다.
		 * 
		 */
		
		int firstNumber = 10;
		System.out.print("firstNumber가 짝수입니까? ");
		// true가 출력되도록 연산해야한다.
		// 나는 무슨 값을 가지고 연산을 해야하는가? -> firstNumver
		// 무슨 연산을 해야하는가? -> 비교연산
		// 짝수 = 2로 나누었을 때 나머지가 0과 같음
		System.out.println(firstNumber % 2 == 0); // true
		
	}
	public void logical() {
		/*
		 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
		 * 
		 * [표현법]
		 * 논리값 논리연산자 논리값 -> 논리갓
		 * 
		 * 종류
		 * 1. AND 연산 (논리값 && 논리값)
		 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
		 * 
		 * 2. OR 연산 (논리값 || 논리값)
		 * 좌항과 우항의 값이 하나라도 true일 경우 최종 결과값이 true
		 * 
		 */
		
		/*
		 * 계획
		 * 1. 사용자에게 한 개의 정수값을 입력받음 (int)
		 * 2. 입력한 정수 값이 0보다 크면서 짝수인지 연산
		 * 3. 그러고나서 결과를 출력
		 */
		
		//1.
		Scanner sc = new Scanner(System.in); // 입력값을 넣을 스캐너 세팅
		System.out.print("정수 값을 입력해주세요. > ");
		int num = sc.nextInt(); // 정수 입력
		
		//2.
		//어떤 값에 넣을 것인가? num
		// 무슨 연산에 넣을 것인가?
		// 1. 대소비교 -> num > 0
		// 2. 동등비교 -> num %2 == 0
		
		// AND 연산자 사용
		// &&의 의미 : 그리고, ~~이면서, ~~이고
		
		boolean result = (num > 0) && (num % 2 == 0); 
		// 참 거짓 논리값을 나타내기 위해 boolean을 사용
		
		System.out.println("입력값이 0보다 크면서 짝수인가요? > " + result);
	}
	public void andOper() {
		// 사용자에게 정수 값을 하나 입력받기
		// 입력받은 정수값을 변수에 대입한 뒤
		// 콘솔창에 출력해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 하나 입력해주세요 > ");
		int num = sc.nextInt();
		System.out.println("입력한 정수값 : " + num);
		
		//사용자가 입력한 정수가 1~ 10 사이의 값인지 확인하기
		boolean result = (num <= 10) && (num >= 1);
		System.out.println(result);
		
		
	}
	public void orOper() {
		//사용자에게 한 글자를 입력받기
		// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 글자를 입력해주세요.");
		char letter = sc.nextLine().charAt(0); 
		// charAt - 문자열에서 몇번째 글짜를 추출할 것인가(0이 첫번째 글자이다.)
		System.out.println(letter);
		//index : 0부터 시작
		// 1. 무슨 값에 넣을 것인가 letter, 0,1
		// 2. 무슨 연산에 넣을 것인가 동등연산 ==,
		// 단일문자의 경우, char형이 int형으로 자동형변환이 일어난 뒤 연산
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("사용자가 입력한 값이 에이인가요? > " + result);
		
	}
	
	/* 
	 * 삼항 연산자 : 피 연산자가 3개
	 * -> 3개의 값과 1개의 연산자로 구성됨
	 * 조건문의 형식으로 쓰인다.
	 * [ 표현식 ]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 */
	
	// 치킨
	public void triple() {
		System.out.println("깐부치킨에 오신것을 환영합니다!");
		System.out.println("1. 회장님의 입맛 그대로 A!치킨");
		System.out.println("2. 바삭한 식스팩치킨");
		System.out.println("3. 치킨의 근본 후라이드 치킨");
		
		Scanner sc = new Scanner(System.in);
		// 자동완성하는 법 ctrl + shift + O import java.util.Scanner; 단축키
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		// 계획
		// 사용자가 메뉴번호로
		// 1번을 입력하면 회장님의 입맛 그대로 AI치킨을 주문하셨습니다.
		// 2번을 입력하면 바삭한 식스팩 치킨을 주문하셨습니다.
		// 3번을 입력하면 치킨의 근본 후라이드 치킨을 주문하셨습니다.
		// 1,2,3번이 아니면 없는 메뉴를 주문하셨습니다.
		
		// ↑ 이런 식으로 출력하도록
		//System.out.println(menuNo);
		
		// 메뉴번호가 1번일 시 AI치킨 소개문이 나오게하고 1번이 아닐 시 없는 메뉴입니다. 라고 출력
		String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다." 
						: menuNo == 2 ? "바삭한 식스팩 치킨을 주문하셨습니다."
						: menuNo == 3 ? "치킨의 근본 후라이드 치킨을 주문하셨습니다"
						: "없는 메뉴를 주문하셨습니다.";
		
		System.out.println(selected);
		
	}
}
