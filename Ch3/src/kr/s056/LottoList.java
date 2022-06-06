package kr.s056;

import java.util.ArrayList;
import java.util.List;

// list 사용하기
// add(?) <=> get(?)
public class LottoList {

	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<Integer>();
		// 넣기
		for (int i = 1; i < 11; i++) {
			iList.add(i);
		}
		// 가져오기
		for (int i = 0; i < iList.size(); i++) {
			System.out.print(iList.get(i)+"\t");
		}
		System.out.println();
		System.out.println(iList);
	}

}
