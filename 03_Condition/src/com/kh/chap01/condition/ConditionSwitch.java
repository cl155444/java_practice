package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionSwitch {
	// 스위치문 공부
	public void method0() {
	Scanner sc = new Scanner(System.in);
	System.out.print("몇 층 가세요?(B1/B2/B3) >");
	
	String floor = sc.nextLine();
	
	switch(floor) { // 이 조건문에 대한 동등 비교를 진행한다.
	case "B1" : System.out.println("지하 1층입니다.문이 열립니다.");
	break;
	case "B2" : System.out.println("지하 2층입니다.문이 열립니다.");
	break;
	case "B3" : System.out.println("지하 3층입니다.문이 열립니다.");
	break;
	}
}
	// 조회를 해보는 프로그램 -> 사람 이름을 입력하면 정보를 조회해주는 프로그램
	public void findByName() {
		// 사용자에게 사람이름을 입력받아서
		// 사람의 정보를 출력해줄 것
		
		// 고길동, 짱구, 둘리, 도라에몽
		
		// 고길동 : 남성, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 술, 싫어하는 것 : 둘리 일당
		// 짱구 : 남성, 서울특별시 초록구 떡잎마을, 좋아하는 것 : 가족, 싫어하는 것 : 피망
		// 둘리 : 수컷, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 장난치기, 싫어하는 것 : 고길동
		// 도라에몽 : 없음, 돜도 네리마구 츠키미다이, 좋아하는 것 : 노진구, 싫어하는 것 : 쥐
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println(name);
		
		//switch(name) {
		//case "고길동" : System.out.println("남성, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 술, 싫어하는 것 : 둘리 일당");
		//break;
		//case "짱구"  : System.out.println("남성, 서울특별시 초록구 떡잎마을, 좋아하는 것 : 가족, 싫어하는 것 : 피망");
		//break;
		//case "둘리" : System.out.println("수컷, 서울특별시 도봉구 쌍문동, 좋아하는 것 : 장난치기, 싫어하는 것 : 고길동");
		//break;
		//case "도라에몽" : System.out.println("없음, 돜도 네리마구 츠키미다이, 좋아하는 것 : 노진구, 싫어하는 것 : 쥐");
		//break;
		//default : System.out.println("검색할 수 없는 이름입니다.");
		
		//}
		
		
		// 첫 번째 모던 스위치 문법
		String address = switch(name) {
		case "고길동", "둘리" -> "서울특별시 도봉구 쌍문동";
		case "짱구" -> "서울특별시 초록구 떡잎마을";
		case "도라에몽" -> "도쿄도 네리마구 츠키미다이";
		default -> "주소지 없음"; 
		};
		
		
		
		//두 번째 중복제거하기
		String favorite = "";
		switch(name) {
		case "고길동" : favorite = "술";
		break;
		case "짱구" : favorite = "가족";
		break;
		case "둘리" : favorite = "장난치기";
		break;
		case "도라에몽" : favorite = "노진구";
		break;
		default : System.out.println("그런 사람은 존재하지 않습니다");
		return; // 현재 메소드 영역을 아예 빠져나가는 구문 -> 나를 호출한 곳으로 돌아감
		}// return이 아닌 break가 들어가면 아래로 빠져나온다.
		
		// if(name.equals("고길동") && name.equals("짱구") &&)
		System.out.println(name + " = " + "거주지 : " + address + ", 좋아하는것 : " + favorite);
		
		
		}
	
	public void login() {
		//웹사이트 만들기
		
		// 구현한다
		// 기획 / 설계
		
		// 기획 / -> 뭘 만들지?
		// 설계 -> 어떻게 만들지?
		
		// 로그인 기능 구현 -> 기획은 끝
		// 설계
		
		// 이를 동해 얻는 것은 무엇인가? -> 아주 작은 규모로 실무 경험을 시켜주는 것
		// "로그인"을 만들어보고 싶은데, 무엇부터 만들어야 하는가?
		// 기능들을 많이 사용하고 -> 분석해보아야 한다.
						//이는 곧	1. 무슨 값을?
							//	2. 무슨 연산을? 넣는 것에 대한 답을 내는 것
		
		
		// 로그인이란 무엇인가?
		// 아이디, 패스워드 -> 입력
		
		// 로그인 구현 시 필요한 값
		// 1. 사용자가 입력한 아이디값 	-> 이 값들의 자료형은 무엇인가  -> 문자열
		// 2. 사용자가 입력한 비밀번호 값 	-> 문자열
		// 무슨 값에 대한 답 -> 문자열
		
		// 로그인을 위해서 필요한 선행작업 : 회원가입
		// 회원가입은 했다고 가정
		String id = "user01";
		String password = "pass01";
		String name = "홍길동";
		
		// 1. 사용자에게 로그인 화면을 출력
		// 2. 사용자에게 아이디와 패스워드를 입력받음
		// 3. 가입 시 입력했던 아이디아 비밀번호를 둘 다 정확히 입력한다면 로그인 성공화면 출력
		// 4. 가입 시 입력했던 아이디 또는 비밀번호가 하나라도 일치하지 않을 경우 로그인 실패 화면 출력
		
		System.out.println("배달의 KH"); // 서비스 명
		System.out.println("---------------------------------");
		System.out.println("로그인 서비스 입니다.");
		System.out.println("---------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================");
		System.out.print("아이디를 입력해주세요 ");
		String userId = sc.nextLine();
		System.out.println("=================================");
		System.out.print("비밀번호를 입력해주세요 ");
		String userPwd = sc.nextLine();
		
		System.out.println("=================================");
		
		// 만약에 사용자가 로그인 시 입력한 아이디 값과 회원가입 시 입력한 아이디 값이 동일하고
		// 사용자가 로그인 시 입력한 패스워드 값과 회원가입시 입력한 패스워드 값이 동일하다면
		// 저장소바꾸고 / 유효성검증 / 비밀번호암호화
		int count = 0;
		if(userId.equals(id) && userPwd.equals(password) && count < 6) {
			System.out.println("로그인 성공 " + name + "님 환영합니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
			++count;
		}
		
	}
	}
	
