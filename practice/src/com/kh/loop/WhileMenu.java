package com.kh.loop;

import java.util.Scanner;

public class WhileMenu {
	public void menuTest() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 게임 시작");
		System.out.println("2. 설정");
		System.out.println("0. 종료");

		
		while(true) {
			
			System.out.print("메뉴 선택 > ");
			int number = sc.nextInt();
			if (number == 1) {
				System.out.println("게임을 시작합니다.");
			} else if(number == 2) {
				System.out.println("설정으로 이동합니다.");
			} else if(number == 0) {
				System.out.println("프로그램 종료.");
				return;
			}else {
				System.out.println("해당 메뉴는 없습니다.");

				}
			}
		}
	}
