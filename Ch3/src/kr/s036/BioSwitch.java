package kr.s036;

import java.util.Scanner;

// 입력받은 정수값에 따라 신체, 감정, 지성값 출력하기
// switch case사용

public class BioSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		double value = 0.86;
		
		textInfor(index, value);
		System.out.println(textInfor(index, value));

	}

	private static String textInfor(int index, double value) {
		String result = "";
//		switch(byte/short/int/char/String)
//		case 값비교:
		switch (index) {
		case 23:
			result = "신체지수: ";
			break;
		case 28:
			result = "감정지수: "; 	break;
		default:
			result = "지성지수: ";	break;
		}
		return result+ (value*100);
	}

}
