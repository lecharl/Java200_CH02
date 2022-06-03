package kr.s025;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
//		키보드로 입력받아 콘솔에 출력하기
		Scanner scan = new Scanner(System.in);
		
//		정수 입력받기
		System.out.print("정수를 입력하세요. >> ");
		int nInt = scan.nextInt();
		System.out.println(nInt);
		
//		실수 
		System.out.print("실수를 입력하세요. >> ");
		double nDouble = scan.nextDouble();
		System.out.println(nDouble);
		
//		문자열
		System.out.print("문자열 입력하세요. >> ");
		String nString = scan.next();
		System.out.println(nString);		
		
		scan.close();
	}

}
