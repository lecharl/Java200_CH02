package kr.s034;

import java.util.Scanner;

//	if로 짝/홀수 판별하기

public class EvenOddIfCondition {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		
		if(temp%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
