package kr.s023;

public class Letters {

	public static void main(String[] args) {
//		문자와 문자열의 관계
//		애국가에서 '닳'이 몇번째에 있는지 구하자.
		String letters = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		char dalh = '닳';
//		String dalh = "닳"; //안됨!!! IllegalFormat~
		int lettersLength = letters.length();
		
//		String.indexOf(char찾는거)
		int location = letters.indexOf(dalh);
		System.out.println("닳의 위치 : "+location);
		
		System.out.printf("\"%s\" => %d자이며, '%c'은 %d번째에 있다.\n", letters, lettersLength, dalh, location);
		
//		char = String.charAt(int위치)
		char dalh2 = letters.charAt(location);
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letters, location, dalh2);

	}

}
