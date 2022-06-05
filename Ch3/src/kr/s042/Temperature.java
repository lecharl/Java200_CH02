package kr.s042;

// 정수-실수 변환으로 섭씨를 화씨로 바꾸기
public class Temperature {

	public static void main(String[] args) {
		for (int i = 0; i < 41; i++) {
			// ***왼쪽을 .0 으로***
			double f = 9.0/5*i + 32;
			System.out.printf("섭씨 %d도 -> 화씨 %.2f도\n", i, f);
		}

	}

}
