package kr.s041;

import java.util.Scanner;

// 논리 연산자로 윤년 판별하기
public class JCalendar {

	public static void main(String[] args) {
		System.out.println("연도를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
//		JCalendar jc = new JCalendar();
//		jc.isLeapYear(year);
		System.out.println("윤년입니까? >> "+new JCalendar().isLeapYear(year));

		scanner.close();
	}

	private boolean isLeapYear(int year) {
		boolean isL = false;
		if(year/4==0 && year/100 != 0 || year/400 == 0) {
			isL = true;
		}
		return isL;
	}

}
