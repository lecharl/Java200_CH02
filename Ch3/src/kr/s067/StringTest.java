package kr.s067;
// 문자열 관련 메서드
public class StringTest {

	public static void main(String[] args) {
		String text = " Hello Java4Android";
		String com = " HEllo Java4Android";
		
		System.out.println(text.charAt(2));
		System.out.println(text.concat("s"));
//		원본은 변하지 않음!!***
		System.out.println(text);
		System.out.println(text+"S");
//		마찬가지!!
		System.out.println(text);
		
		System.out.println(text.contains("And"));
		
		System.out.println(text.equals(com));
		System.out.println(text.equalsIgnoreCase(com));
		
//		문자열 또는 문자가 처음 발견된 위치 반환
		System.out.println(text.indexOf("a"));
		
		System.out.println(text.trim());
		System.out.println(text.length());
		
		System.out.println("---------------");
//		0~6은 잘라버리고 7부터~, 원본은 그대로!!
		System.out.println(text.substring(7));
//		*** 0~6은 잘라버리고 7부터~ 11-1 까지!!
		System.out.println(text.substring(7, 11));
		
		System.out.println(text.replace(" ", "-"));
		
		System.out.println(text.replaceAll(" ", "-"));
		
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		System.out.println("===================");
		String[] strArr = text.split(" ");
		for (String string : strArr) {
			System.out.print(string+",");
		}
//		{"", "Hello", "Java4Android"}
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + "\t\t" + strArr[i] + "\t\t"+ strArr[i].length());
		}

	}

}
