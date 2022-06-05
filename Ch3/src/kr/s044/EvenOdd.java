package kr.s044;

import java.util.Scanner;

// do~while 문 : 적어도 한번은 실행하는 반복문
public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		showOddEven(input);
		scanner.close();
	}

	private static void showOddEven(int input) {
		int temp = input;
		do {
			if(temp%2 != 0) {
				temp = temp*3 + 1;
			}else {
				temp /= 2;
			}
			System.out.print("["+temp+"] ");
		} while (temp>1);
		System.out.println("\n---------------");
	}

}
