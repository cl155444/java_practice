package com.kh.loop;

import java.util.Scanner;

public class ForMultiple {


	public void printMultiple() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			if(i % 3 == 0) {
			System.out.println(i + " ");
			}
		}

	}
}
