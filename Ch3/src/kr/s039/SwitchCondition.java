package kr.s039;


// switch~case로 입력된 문자에 대한 카드값 구하기

public class SwitchCondition {

	public static void main(String[] args) {
		char c = 'a';
		int result = toNum(c);
		System.out.printf("%c => %d", c, result);
	}

	private static int toNum(char c) {
		int total = 0;
		switch (c) {
		case 'A':
			total = 1;	break;
		case 'T':
			total = 10;	break;
		case 'J':
			total = 11;	break;
		case 'Q':
			total = 12;	break;
		case 'K':
			total = 13;	break;
		default:
			total = c-'0';
//			문자 -> 숫자
//			문자 - '0'
			// 문자 9를 숫자 9로 변환하는 방법
			// '9' - '0' == 57 - 48 == 9
			break;
		}
		return total;
	}

}
