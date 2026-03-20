package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	// 캡슐화(encapsulation)
	public static void main(String[] args) {
		// 객체생성 -> new 키워드를 사용한다.
		// == 메모리(heap)에 적재
		AutoSellingMachine asm = new AutoSellingMachine(); // 생성자를 호출하는 것
		//변수 공간에 대입될 수 있는 값을 딱 9가지
		//boolean 리터럴값, char리터럴값, byte리터럴값, short리터럴값 long리터럴값
		// float리터럴값, double 리터럴값
		// 그외에는 모둔 경우는 주소값 == 객체라는 뜻
		
		//asm.name = "삼양라면";
		//System.out.println(asm.name);
		//asm.price = 1100;
		//System.out.println(asm.price);
		//asm.amount = 12345;
		//System.out.println(asm.amount);
		// 이렇게 만든 객체들을 위험한 상태이다.
		// 외부에서 조작이 잘되는 상태
		//asm.checkAmount();
		// 라면 가격 1500원으로 세팅하고 싶다.
		//asm.setPrice(1500/* argument, 인자값, 인수*/);
		asm.setName("삼양라면");
		asm.setAmount(12345);
		asm.setPrice(5);
		
		String name = asm.getName();
		System.out.println(name);
		
		int amount = asm.getAmount();
		System.out.println(amount);

		int price = asm.getPrice();
		System.out.println(price);

		String info = asm.info();
		System.out.println(info);
	}	

}
