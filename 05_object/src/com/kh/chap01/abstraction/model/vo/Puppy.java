package com.kh.chap01.abstraction.model.vo;
/*
 * public class 클래스식별자 {
 * 이를 3개의 영역으로 나누어서 만들어 볼 것(vo 패키지 안에 들어가는 작업부분)
 * [ 필드부 ]
 * 
 * [생성자부]
 * 
 * [메소드부]
 * 
 * 
 * }
 */

public class Puppy {
	
	// [ 필드부 ] 객체지향에서는 속성이라고 한다. = 번수 선언
	// 다만 class 블럭에서 선언된 변수는 필드라고 읽는다.
	// 접근제한자(public) 자료형 필드식별자; 
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	// 			public > protected > default > private
	// 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙인다.
	// 지금은 public과 private만 알면 된다.
	
	// 이름, 종, 성별, 몸무게, 나이
	
	public String name; 	// 강아지 이름을 저장할 필드
	
	public String spcies; 	// 강아지 종을 저장할 필드
	
	public String gender; 	// 강아지의 성별을 저장할 필드
	
	public int weight; 		// 강아지의 몸부게를 저장할 필드
	
	public int age;			// 강아지의 나이를 저장할 필드
	
	// [ 생성자부 ]
	
	
	
	// [ 메소드부 ] -> Puppy가 수행할 수 있는 행위를 기능토록 하는 것
	// puppy가 하는 행위를 만들어보기(짖기, 앉기) -> 메소드를 만든다는 것
	
	public void bark() { // bark  매소드 입장에서 나의 이름은 어디에? -> 클래스 내부
		System.out.println(name + "이(가) 멍멍하고 짖습니다.");
	}
	
	public void sit() {
		System.out.println(name + "이(가) 앉습니다.");
		weight--;
		
	}
	
	
}
	

