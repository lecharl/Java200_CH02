package kr.s060;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream의 map(), collect() 사용하여 홀수의 제곱의 합 구하기
public class ForLambdaCondition {

	public static void main(String[] args) {
//		list에 담기
		List<Integer> iList = new ArrayList<Integer>();
		for(int i=1; i<11; i++) {
			iList.add(i);
		}
//		System.out.println(iList);
//		map(이거를 -> 이렇게 처리하라)
//		alist = blist.stream().처리.collect(Collectors.toList()) : alist에 새로 처리한 blist를 담아라

		iList = iList.stream()
				.filter(i -> i%2 == 1)
				.map(i -> i*i)
				.collect(Collectors.toList());
		iList.forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		
//		합
		int result = 0;
		result = iList.stream().reduce(0, Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합 :: "+result);

	}

}
