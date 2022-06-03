package kr.s031;

//	상수의 묶음 클래스 enum 사용하기

public class FruitMain {

	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());		//선언될 때 순서 0
		
		System.out.println(pear2.ordinal());	//선언될 때 순서 2
		
		FRUIT fruit[] = FRUIT.values();
		
		for (FRUIT fruit2 : fruit) {
			System.out.println(fruit2);
		}

	}

}
