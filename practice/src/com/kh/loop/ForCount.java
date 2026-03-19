package com.kh.loop;

import java.util.Scanner;

public class ForCount {
	public void countTest(){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int number = sc.nextInt();
		
		// 입력한 숫자까지 중에서 "짝수의 개수"를 구한다.
		// number 5 -> 2,4의 숫자 수를 센다 -> 2개로 출력한다.
		int count = 0; // 숫자를 세는 변수이기에 이름은 count
		int sum = 0; // 숫자를 합치는 변수이기에 이름은 sum
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				count++;
				sum +=i;
			}
		}
		
		System.out.println("짝수의 개수 : " + count);
		System.out.println("짝수 합 : " + sum);
		
	}

}
