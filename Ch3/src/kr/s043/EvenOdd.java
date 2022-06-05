package kr.s043;

import java.util.Scanner;

// while을 이용하여 1이 될 때까지 홀수는 3배+1, 짝수는 2로 나누기
// 반복문에서 끝나는 조건이 명확할 때는 while을 사용한다.
public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		showOddEven(input);

	}

	private static void showOddEven(int input) {
		int temp = input;
		while(temp>1) {
			if(temp%2 ==0) {
				temp /= 2;
			}else {
				temp = temp*3 + 1;
			}
			System.out.print("["+temp+"] ");
		}
		System.out.println("\n--------------------");
	}

}
