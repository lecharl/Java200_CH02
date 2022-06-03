package kr.s030;

//	멤버 메서드를 이용하여 신체 지수 구하기
//	사용자가 정의한 멤버 메서드(non static)를 이용하기
public class BioCalendar {
	public static final int PHYSICAL = 23;
	
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI / index);
	}

	public static void main(String[] args) {
		int days = 1200;
		double phyval = new BioCalendar().getBioRhythm(days, PHYSICAL, 100);
		
		System.out.printf("나의 신체지수 %.3f", phyval);

	}

}
