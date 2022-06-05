package kr.s040;

import java.util.Scanner;

// switch~case 환율 구하기
// 입력받은 문자열에 따라 달러/엔/위안을 한화로 환전하자
public class SwitchStringCondition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String money = scanner.next();
		double result = toMoney(money);
		System.out.printf("%s => %f", money, result);

		scanner.close();
	}

	private static double toMoney(String money) {
		double rate = 0.0;
		switch (money) {
		case "USD":
			rate = 1126.5; break;
		case "JPY":
			rate = 110.6; break;
		case "CNY":
			rate = 10.5; break;
		default:
			rate = 1; break;
		}
		return rate;
	}

}
