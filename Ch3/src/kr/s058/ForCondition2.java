package kr.s058;

import java.util.ArrayList;
import java.util.List;

// 1~10사이의 홀수의 제곱의 합 구하기
public class ForCondition2 {

	public static void main(String[] args) {
//		list 활용하기
		int start = 1;
		int end = 10;
		List<Integer> iList = new ArrayList<Integer>();
		for(int i=start; i<=end; i++) {
			iList.add(i);
		}
		System.out.println(iList);
		int result = 0;
		for (int i : iList) {
			if(i%2 != 0) {
				System.out.print(i*i+"\t");
				result += i*i;
			}
		}
		System.out.println();
		System.out.printf("%d~%d 사이의 홀수의 제곱의 합은? :: %d", start, end, result);

	}

}
