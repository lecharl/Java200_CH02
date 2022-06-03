package kr.s018;

public class JavaTypeConversion {

	public static void main(String[] args) {
//		문자열을 실수로 변환하기
		String slat = " 37.52127220511242    ";
		// 공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim());
		double latitude2 = Double.valueOf(slat);
//		String.trim() :: String의 양쪽 공백 제거
		System.out.println(latitude);
		System.out.println(latitude2);

	}

}
