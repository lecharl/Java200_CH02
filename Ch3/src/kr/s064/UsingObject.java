package kr.s064;
// Object 이해하고 사용하기 :: Object의 특징과 메서드를 이해하고 사용해보기
public class UsingObject {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		obj.hashCode() :: jvm이 구별하는 고유주소 해시코드 리턴, native 메서드, 10진수
		System.out.println("obj1.hashCode() :: "+obj1.hashCode());
//		Integer.toHexString(obj.hashCode()) :: 해시코드를 16진수로 변환
		System.out.println("Integer.toHexString(obj1.hashCode()) :: "+Integer.toHexString(obj1.hashCode()));
//		== :: 스택 영역의 레퍼런스 비교
//		new로 생성하는 참조타입의 레퍼런스는 객체마다 고유함!! -> '==' : false
		System.out.println("obj1 == obj2 ? :: "+(obj1 == obj2));
		System.out.println("obj1.equals(obj2) :: " +obj1.equals(obj2));
//		obj == obj.toString() :: 타입@16진수해시코드
		System.out.println("obj1 :: "+obj1);
		System.out.println("obj2.toString() :: "+obj2.toString());
		
//		obj.getClass() :: 객체타입?
		System.out.println("obj1.getClass() :: "+obj1.getClass());
//		obj.getClass().getName() :: obj의 클래스 이름
		System.out.println("obj1.getClass().getName() :: "+obj1.getClass().getName());
		String str1 = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
		System.out.println(str1);
		
//		다형성
		Object obj3 = new String("Good");
		System.out.println("obj3.toString() :: "+obj3.toString());
		System.out.println("obj3 instanceof Object :: "+obj3 instanceof Object);
		System.out.println("obj3 instanceof String :: "+obj3 instanceof String);

	}

}
