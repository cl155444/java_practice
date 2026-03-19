package com.kh.loop;

import java.util.Scanner;

public class WhileSum {
	public void sumTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		
		int number = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= number) {
			sum += i;
			i++;
		}
		System.out.println("총 합 : " + sum);
		
	}

}
