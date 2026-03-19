package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {
	
	// 사용자에게 강아지의 정보를 입력받아서
	// 입력받은 강아지의 정보를 출력해주고
	// 강아지와 함께 놀아줄 수 있는 프로그램
	
	public void run() {
		System.out.println("🐶강아지 다마고치🐶");
		Scanner sc = new Scanner(System.in);
		
		Puppy puppy = new Puppy();
		
		//Puppy 타입의 변수 선언 = new 변수 선언
		
		System.out.print("강아지가 귀엽네요~ 이름을 알려주세요 > ");
		puppy.name = sc.nextLine();
		
		System.out.print("아이구 ~ 무슨 종이에요? > ");
		puppy.spcies = sc.nextLine();
		
		System.out.print("암컷이에요? 수컷이에요? > ");
		puppy.gender = sc.nextLine();
		
		System.out.print("몇살이에요? > ");
		puppy.age = sc.nextInt();
		
		System.out.print("몸무게가...? > ");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			System.out.println("-----");
			// 강아지 이름 출력해보기
			System.out.println(puppy.name + "의 정보!");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 : " + puppy.gender);
			System.out.println("종 : " + puppy.spcies);
			System.out.println("몸무게 : " + puppy.weight);
			System.out.println();
			System.out.println("-----");
			
			// 1. 짓기, 2. 앉기, 3. 프로그램 종료, 그외 입력시 "이외의 메뉴는 없습니다." 에 대한 기능 만들기
			System.out.println("메뉴를 선택해주세요 > ");
			// 과체중일 경우 운동시키기 기능 추가하기
			if(puppy.weight > 10) {
				System.out.println("※ 운동을 위해 앉기를 추천드립니다~");
				
			}
			System.out.print("1. 짖기 / 2. 앉기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			
			switch(menuNo) {
			case 1 : puppy.bark(); break;
			case 2 : puppy.sit(); break;
			case 3 : return; // while의 무한반복문 안 인데 break를 넣어버리면 다음 while의 처음으로 돌아가버린다.
			default : System.out.print("메뉴를 다시 선택해주세요!");
			
			}
			
		}
		
	}

}
