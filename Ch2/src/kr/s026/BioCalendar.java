package kr.s026;

public class BioCalendar {

	public static final int PHYSICAL = 23;
	// static final : 
	// 객체마다 값이 바뀌는 것이 아닌 클래스에 존재하는 상수이므로 **선언과 동시에 초기화**를 해 주어야하는 클래스 상수이다.
	//	********* main 안에 X ***********
	
	// final : 
	// 한번 정하면 바꿀 수 없게 하는데, 객체마다 값은 바꾸고 싶을 때
	// 선언과 초기화를 동시에 안해도 된다!
	// main 안에 해도 됨!
	// 예) 각 식당의 오픈시간
	public static void main(String[] args) {
//		상수 선언, 사용하기
		System.out.println(PHYSICAL);
		
		int index = PHYSICAL;
		double vals = 2*Math.PI / index;
		System.out.println(vals + "라디안");

	}

}
