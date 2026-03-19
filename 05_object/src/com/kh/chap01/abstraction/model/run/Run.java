package com.kh.chap01.abstraction.model.run;

import com.kh.chap01.abstraction.model.vo.Puppy;
import com.kh.chap01.abstraction.view.PuppyCare;

public class Run {

	public static void main(String[] args) {

		// 현실 세계의 강아지 -> 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무게 : 8, 성별 : 암
		// 강아지 객체 생성해보기
		
		new Puppy/*이를 생성자라고 함*/(); 
		// 이 과정을 객체생성 및 인스턴스화라 함
		// new 라는 예약을 사용
		// Memory heap 영역에 데이터를 올리는 것
		
		// 이를 그대로 두면 주소를 아무도 불러오지 않기 때문에
		// 가비지 컬랙션이 수거해간다.
		// 때문에 주소를 불러오는 변수를 대입해서 해당 주소를 가리키고 있도록 해야한다.
		
		Puppy puppy = new Puppy();
		// 이제 puppy 객체는 Puppy 주소를 가리키게(포인터) 된다.
		
		//System.out.println(puppy);
		//System.out.println(puppy.name); // null
		
		puppy.name = "나폴레옹"; // puppy라는 주소 안의 name에 "나폴레옹"을 대입한다.

		System.out.println(puppy.name); 
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게 : 15, 성별 : 수
		Puppy khan = new Puppy();
		khan.name = "징기스칸"; // khan은 주소를 담은 변수
		System.out.println(khan.name);
		
		
		//정수값 -> 정수 자료형 int, short, byte, long
		// 실수값 -> 실수 자료형
		// 논리값 -> boolean
		
		// 현실 세계의 강아지 값을 담으려면? -> 문제 : 현실세계의 강아지는 1개의 값이 아니다.
		// 때문에 개발자가 직접 강아지 자료형을 만들어준다. -> 이 자료형의 이름을 class라 한다.
		
		puppy.bark();
		khan.bark();
		
		puppy.weight = 8;
		khan.weight = 50;
		
		PuppyCare pc = new PuppyCare();
		pc.run();
		
	}
		
	
}
