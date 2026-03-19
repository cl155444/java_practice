package com.kh.cafe;

import java.util.Scanner;

public class CafeMenu {
	public void orderMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("KH 카페에 오신 것을 환영합니다");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 바닐라라떼");
		System.out.print("메뉴를 선택하세요 > ");
		
		String menu = sc.nextLine();
		if((menu.equals("아메리카노"))) {
			System.out.println ("선택한 메뉴 : " + menu);
			System.out.println ("몇 잔을 주문하시겠습니까? >");
		} else if((menu.equals("카페라떼"))) {
			System.out.println ("선택한 메뉴 : " + menu);
			System.out.println ("몇 잔을 주문하시겠습니까? >");
		} else if((menu.equals("바닐라라떼"))) {
			System.out.println ("선택한 메뉴 : " + menu);
			System.out.print ("몇 잔을 주문하시겠습니까? >");
		} else {
			System.out.println("메뉴를 정확하게 입력해주세요");
			return; // 함수를 종료시킨다.
			}
		int howMany = sc.nextInt();
			System.out.println(menu + " " + howMany + "잔 주문하셨습니다.");
		

	}
}
