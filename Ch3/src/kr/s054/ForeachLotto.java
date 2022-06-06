package kr.s054;
// 향상된 for문ㅇ로 배열 출력하기
public class ForeachLotto {

	public static void main(String[] args) {
		int[] intArr = {1,6,16,22,23,33};
		for (int i : intArr) {
			System.out.print(i+", ");
		}
		System.out.println();

		for (int i = 0; i < intArr.length; i++) {
			int j = intArr[i];
			if(i == 0) {
				System.out.print("["+j+", ");
			}else if(i == intArr.length-1) {
				System.out.print(j+"]");
			}else {
				System.out.print(j+", ");
			}
		}
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			int j = intArr[i];
			if(i == 0) {
				System.out.print("["+j);
			}else if(i == intArr.length-1) {
				System.out.print(", "+j+"]");
			}else {
				System.out.print(", "+j);
			}
		}
	}

}
