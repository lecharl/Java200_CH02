package kr.s046;
// while을 이용해 서로 다른 세 정수 만들기
// Math.random()
public class BioRandom {

	public static void main(String[] args) {
		int range = 100;
		int start = 1;
		int a=0, b=0, c=0;
		
//		a != b != c 가 될 때까지 계속 돌리기
		while(true) {
			a = (int)(Math.random()*range + start);
			b = (int)(Math.random()*range + start);
			c = (int)(Math.random()*range + start);
			if(a!=b && b!=c && c!=a) break;
		}
		System.out.printf("a = %d, b = %d, c = %d", a,b,c);
	}

}
