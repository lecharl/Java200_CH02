package kr.s024;

public class Hello {
	public static void showHello() {
		System.out.println("showHello 호출");
	}
	
	public void notStaticHello() {
		System.out.println("notStaticHello 호출");		
	}

	public static void main(String[] args) {
//		메서드 선언하고 호출하기

		//static 메소드 -> 객체 생성 없이 호출
		showHello();
		
		//instance 메소드 -> 객체 생성 후 호출
		new Hello().notStaticHello();
	}

}
