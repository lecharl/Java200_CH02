package kr.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// foreach && lambda 형식을 이용해 list 출력
public class ForeachLambdaLotto {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1,6,16,22,23,33);
		iList.forEach(i -> {System.out.print(i+"\t");});
		System.out.println();
		
//		Consumer :: 매개값을 소비하는 역할만 하며, 소비한다는 말은 사용만하고 리턴값이 없다
		Consumer<Integer> consume = (Integer i) -> System.out.print(i+"\t");
		iList.forEach(consume);
		consume.accept(100);
		
	}

}
