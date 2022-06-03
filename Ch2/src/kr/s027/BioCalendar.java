package kr.s027;

public class BioCalendar {
	static final int PHYSICAL = 23;

	public static void main(String[] args) {
//		연산자와 연산순위를 확인하기
//		변수와 상수의 차이점 이해하기
		
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(vals);
		System.out.println(Math.toDegrees(vals)+"도");

	}

}
