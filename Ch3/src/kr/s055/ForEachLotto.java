package kr.s055;
// varargs가변인자 ...: 임의의 개수로 사용할 수 있는 아규먼트
// 아규먼트의 개수가 몇개라도 배열처럼 사용 가능
// 한 개 이상의 변수를 배열처럼 받아서 사용할 수 있다.

// 가변인자를 사용해 배열 출력하기
public class ForEachLotto {

	public static void main(String[] args) {
		int[] mm = {1,6,16,22,23,33};
		// 배열도 되고
		print(mm);
		int a=1, b=6, c=16;
		// 1개짜리도 되고
		print(a);
		
		// 3개짜리도 된다!!
		print(a,b,c);
		
	}

	private static void print(int ... arr) {
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
