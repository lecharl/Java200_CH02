package kr.s019;

public class JavaComment {

	public static void main(String[] args) {
//		0~9 임의의 정수 구하기
		/*
		 * 0.0 <= 실수값 < 10.0 을 (int)하면 정수만 반환
		 * -> 0~9 사이의 임의의 정수 반환
		 * 
		 * 0.0 <= x < 1.0  <- *10
		 * 0.0 <= x < 10.0
		 * 
		 */
		int makeOne=0;
		for(int i=0; i<10; i++) {
			//양끝에 괄호!!
			makeOne = (int)(Math.random()*10);
			System.out.println(makeOne);
		}

	}

}
