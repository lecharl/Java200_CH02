package kr.s049;

import java.util.Iterator;
import java.util.Scanner;

// 제곱근을 이용해 소수 판별하기
public class PrimMath {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(isPrime(input)) {
			System.out.printf("입력한 %d는 소수입니다.", input);
		}else {
			System.out.printf("입력한 %d는 소수가 아닙니다.", input);			
		}
		scanner.close();
	}

	private static boolean isPrime(int input) {
//		Math.sqrt(double n) => double:: n의 제곱근을 구하는 함수를 이용하기
		boolean isP = true;
		// *** 2~제곱근으로 나누어 떨어지지 않으면 소수!!!
		for(int i=2; i<Math.sqrt(input); i++) {
			// 나누어 떨어지면 바로 break -> 소수 아님
			if(input%i == 0) {
				isP = false;
				break;
			}
		}
		return isP;
	}

}
