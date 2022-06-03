package kr.s028;

public class BioCalendar {
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
//		Math 를 사용하여 신체지수 구하기
		int index = PHYSICAL;
		int days = 1200;
//		sin()
		double phyval = 100* Math.sin((days % index)*2*Math.PI /index);

		System.out.printf("나의 신체 지수 %1$.2f", phyval);
	}

}
