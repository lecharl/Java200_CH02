package kr.s065;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Class를 이용하여 클래스에 선언된 메서드와 생성자를 확인하기
public class UsingClass {

	public static void main(String[] args) {
		Object obj = new Object();
//		obj.getClass() :: Class 반환
//		Class :: 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드 제공
		Class cls = obj.getClass();
		System.out.println(cls.getName());
		System.out.println("-----constructor-----");
//		Reflection
//		Constructor :: 
//		getDeclaredConstructors() :: 선언한 생성자 제공
		Constructor[] constructor = cls.getDeclaredConstructors();
		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2.getName());
		}
		System.out.println("-----Method-----");
//		Method ::
//		getMethods() :: 선언된 메서드 제공
		Method[] method = cls.getMethods();
		for (Method method2 : method) {
			System.out.println(method2.getName());
		}
		

	}

}
