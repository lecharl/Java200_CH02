package kr.s035;

import java.util.Scanner;

// 삼항 연산자로 짝/홀수 판별하기

public class EvenOddTriCondition {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		
		// 변수로 담자!!
		String str = (temp%2 == 1)? "홀수입니다." : "짝수입니다.";
		System.out.println(str);
	}

}
