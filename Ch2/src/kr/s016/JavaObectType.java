package kr.s016;

import java.util.Calendar;
import java.util.Date;

public class JavaObectType {

	public static void main(String[] args) {
//		API에서 제공하는 참조 타입 사용하기
//		참조타입은 자바에서 제공하는 API 참조타입과
//		API 참조타입을 이용하여 사용자가 만드는 사용자 정의 참조 타입이 있다.
		
		//기본 타입의 배열은 참조 타입
		int[] m = {1, 2, 3};
		int[] n = new int[] {1, 2, 3};
		
		//참조 타입_객체 타입
		//문자열
		String card = "H8";
		
		//객체 생성 방법
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		//자동으로 toString() 붙음
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}

}
