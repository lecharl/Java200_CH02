package kr.s021;

public class Grad21 {

	public static void main(String[] args) {
//		정수 타입의 배열 사용하기
		int[] grade = {90, 80, 89};
		int total = 0;
		for (int i = 0; i < grade.length; i++) {
			total += grade[i];
		}
		int avg = total/grade.length;
		
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => \t", grade[0], grade[1], grade[2]);
		System.out.printf("총점 %d점, 평균 %d점\n", total, avg);

	}

}
