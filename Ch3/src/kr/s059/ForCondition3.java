package kr.s059;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

// list, Stream을 이용해 홀수의 합 구하기
public class ForCondition3 {

	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<Integer>();
		// list에 저장 1~100까지
		for(int i=1; i<101; i++) {
			iList.add(i);
		}
//		System.out.println(iList);
		
		int result = 0;
		// 초기값 0
//		1~100의 합
//		list.stream().reduce(초깃값, Integer::sum)
		result = iList.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합 :: "+result);
		
//		1~100 홀수의 합
//		filter :: 조건 검색
//		list.stream().filter(조건)
		result = iList.stream().filter(i -> i%2 == 1).reduce(0, Integer::sum);
		System.out.println("1~100사이의 홀수의 합 :: "+result);
		
		result = iList.stream().filter(i -> i%2 == 1).reduce(0, (x,y) -> x+y);
		System.out.println("1~100사이의 홀수의 합 :: "+result);
		
		result = iList.stream().filter(i -> i%2 != 0).reduce(0,
				new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
				});
		System.out.println("1~100사이의 홀수의 합 :: "+result);

	}

}
