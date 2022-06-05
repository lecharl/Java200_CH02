package kr.s045;

import java.util.Scanner;

// for
public class showOddEvenFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		showOddEven(input);
		scanner.close();

	}

	private static void showOddEven(int input) {
		int temp = input;
//		***for(; 조건; ) == while(조건)***
		for(; temp>1; ) {
			if(temp%2 != 0) {
				temp = temp*3 + 1;
			}else {
				temp /= 2;
			}
			System.out.print("["+temp+"] ");
		}
		System.out.println("\n----------------");
	}

}
