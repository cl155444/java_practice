package com.kh.loop;

import java.util.Scanner;

public class WhileTest {
	public void printNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = 1;
		int number = sc.nextInt();
		while(i <= number) {
			System.out.print(i + " ");
			i++;
		}
	}
}
