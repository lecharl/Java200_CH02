package kr.s062;

import java.util.Scanner;

// 정수를 입력받을 때 발생할 수 있는 예외 처리하기
// 정수 타입 문자열을 입력받아 정수로 변환할 때 발생할 수 있는 예외를 처리해보자.
public class FormatTryCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int a = Integer.valueOf(scanner.next());
			// 아래는 예외가 발생하면 수행안됨
			System.out.println("예외발생하지 않고 잘 넘어옴 :: "+a);
		} catch (NumberFormatException e) {
			System.out.println("int인지 확인하기!");
//			빨간글씨로 에러 표시하네!!? 그리고 윗줄보다 먼저 나옴;
			System.err.println(e.getMessage());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("exception!");
		}finally {
			System.out.println("난 수행되어야만 해");
		}

	}

}
