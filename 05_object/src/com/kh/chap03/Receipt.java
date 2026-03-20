package com.kh.chap03;

public class Receipt {
	
	// 영수증
	//가격, 결제방법, 상점명, 일시
	
	//결제금액
	private int price;
	//페이먼트 : 현금, 카드
	private String payment;
	//결제처 
	private String storeName;
	
	// 일시 : 자바에서 날짜를 저장할 수 있는 JDK에서 제공되는 클래스가 존재함
	// 하지만 지금은 String으로 받는다.
	private String date;
	
	// 생성자부 -> 월요일에 할 예정
	
	// 메소드부
	// getter() / setter() / info() 사용
	

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPayment() {
		return payment;
	}
	public void setPayment(String Payment) {
		this.payment = payment;
	}
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName() {
		this.storeName = storeName;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	// info()
	public void info() {
		String info = "상품명 : " + storeName
					+ ", 금액 : " + price
					+ ", 결제수단 : " + payment
					+ ", 결제일시 : " + date;
	}
}
