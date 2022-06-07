package kr.s066;
// 문자열이 동일한지 판별
public class StringMain {

	public static void main(String[] args) {
//		같은 문자열에 대하여 new로 생성한 문자열의 
//		stack의 레퍼런스는 다르지만 Heap의 해시코드는 동일하다.
		String city1 = "Asia";
		String city2 = "Europe";
		System.out.println("city1 :: "+city1);
		System.out.println("city1.length() :: "+city1.length());
		System.out.println("city1 == city2 :: "+(city1 == city2));
		System.out.println("city1.equals(city2) :: "+city1.equals(city2));
		
		String city3 = new String("Asia");
		String city7 = "Asia";
		System.out.println("city1 == city3 :: "+(city1 == city3));
		System.out.println("-> '==' :: stack의 레퍼런스 비교");
		
//		같은 문자열에 대하여 new로 생성하지 않은 문자열은
//		stack의 레퍼런스와 Heap의 해시코드가 동일하다.
		System.out.println("city1 == city7 :: "+(city1 == city7));
		System.out.println("-> 둘다 같은 레퍼런스를 가리키고 있기 때문에");
		
		System.out.println("city1.equals(city3) :: "+(city1.equals(city3)));
		System.out.println("city1.equals(city7) :: "+(city1.equals(city7)));
		System.out.println("-> 'equals()' :: Heap의 해시코드 비교");
		
		String city4 = String.format("%s-%s", city1, city2);
		System.out.println("String.format(\"%s-%s\", city1, city2) :: "+city4);
		String city5 = city1 + "-" + city2 + 1+2;
		System.out.println("city1 + \"-\" + city2 + 1+2 :: "+city5);
		// 앞에서부터 뒤로
		String city6 = 1+2 + city1 + "-" + city2;
		System.out.println("1+2 + city1 + \"-\" + city2 :: "+city6);
	}

}
