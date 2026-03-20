package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부

public class AutoSellingMachine { // 단 한 개의 제품을 파는 자판기
	// 객체를 만든다 했으 때, 무엇을 넣을 것인가?
	// 자판기 == 제품이름, 제품가격, 수량
	
	//필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성을 기술하는 부분
	 * = 값을 담는 부분 -> 때문에 변수가 필요하다.(가격?, 재고?)
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 필드의 목적 : 객체들이 가져야할 공통적인 속성을 기술해 놓는 것. 
	 * 중요 : 클래스와 객체를 구분해야한다.
	 * 클래스 : 내가 만들 객체들이 추상화된 형태 = 객체들의 공통점
	 * 객체 : 클래스 안에 추상화된 개념들을 실체화시킨 것
	 */
	
	private String name; // 상품명
	
	private int price; 
	// 가격. 명칭 통일성을 위해 product를 붙여넣는 경우가 많은데,
	// 지금은 오타 방지를 위해 생략
	
	private int amount; // 수량을 넣을 때 Amount를 많이 쓴다.
	
	
	// 하나의 매소드는 하나의 기능만을 수행해야 한다. setPrice는 setter의 역할을 해야하만 한다.
	public void/*리턴타임(반환형) 반환할 것이 비어있다는 뜻*/ setPrice(int price) {
															//parameter 매개변수
															// 메소트 호출 시 초기화가 강제됨 ☆
		System.out.println(price);
		// price = price; 여기서 사용되는 price는 둘 다 지역변수
		// Scope 안에서는 해당 영역에서 있는 지역변수가 식별 우선권을 가진다.
		System.out.println(this);
		// this : 해당 객체의 주소값을 가리키는 역할
		this.price = price;
		// 객체 안에 있는 변수에 지역변수를 가져와 대입한다.
	}
	
	//name 필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void checkAmount() {
		System.out.println(" ");
	}
	public void sellingProduct() {
		amount -= 1;
	}
	public void insert() {
		amount += 3;
	}
	public void openMachine() {
		checkAmount();
		sellingProduct();
		insert();
	}
	
	public void setter() {
		
	}
	
	// 메소드 호출한 곳으로 name필드 값을 돌려주고 싶다
	public String getName() {
		return name;
	}
	
	// 개수를 반환해주는 메소드
	public int getAmount() {
		return amount;
	}
	
	// 가격을 반환해주는 메소드
	public int getPrice() {
		return price;
	}
	public String info(){
		String info = "자판기 = [제품명 : " + name + ", 가격 : " + price + ", 재고 : " + amount + "]";
		return info; 
}		
	
}
