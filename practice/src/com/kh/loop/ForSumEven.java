package com.kh.loop;

import java.util.Scanner;

public class ForSumEven {
	public void sumEven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.print("총 합 : " + sum);

	}

}
