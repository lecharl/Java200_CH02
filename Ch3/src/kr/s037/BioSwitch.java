package kr.s037;

// 상수값에 따라 신체, 감정, 지성값 출력하기
import java.util.Scanner;

public class BioSwitch {
	static final int PHYSICAL = 23;
	static final int EMOTIONAL = 28;
	static final int INTELECTUAL = 33;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		double value = 0.86;
		System.out.println(textInfor(index, value));

	}

	private static String textInfor(int index, double value) {
		String result = "";
		switch (index) {
		case PHYSICAL:
			result = "신체지수: "; break;
		case EMOTIONAL:
			result = "감정지수: "; break;
		case INTELECTUAL:
			result = "지성지수: "; break;
		default:
			result = "미결정: "; break;
		}
		return result+value*100;
	}

}
