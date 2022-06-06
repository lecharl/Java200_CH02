package kr.s053;

import java.util.Scanner;

// 홀수의 합 구하기
public class ForCondition {

	public static void main(String[] args) {
//		start와 end를 받아서 홀수를 맞다면 더하기
		System.out.print("시작할 정수를 입력하시오. >> ");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		System.out.print("끝날 정수를 입력하시오. >> ");
		int end = scanner.nextInt();
		int result = 0;
		for(int i=start; i<=end; i++) {
			if(i%2 != 0) {
				result += i;
			}
		}
		System.out.printf("%d이상 %d이하의 홀수의 합은? :: %d", start, end, result);
		scanner.close();
	}

}
