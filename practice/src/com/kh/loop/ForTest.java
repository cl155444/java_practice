package com.kh.loop;

import java.util.Scanner;

public class ForTest {

	public void printNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int i;
		int number = sc.nextInt();
		for(i = 1 ; i <= (int)number ; i++) {
			System.out.print(i + " ");
			
		}
	}
}
