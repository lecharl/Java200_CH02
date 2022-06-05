package kr.s048;

import java.util.Scanner;

// 축약 연산자를 이용해 각 자릿수의 합 구하기
public class Contraction {

	public static void main(String[] args) {
		System.out.println("정수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int result = sumEach(scanner.nextInt());
		System.out.println("입력한 정수의 각 자릿수의 합은 : "+result);
		scanner.close();
	}

	private static int sumEach(int input) {
		int n=0;
//		while(input!=0)
		while(input>0) {
			n += input%10;
			input /= 10;
		}
		return n;
	}

}
