package kr.s047;
// 다른 방법
public class BioRandom {

	public static void main(String[] args) {
		int range = 10;
		int start = 100;
		int a=0, b=0, c=0;
		
//		***적어도 두개가 같은 정수면 계속 돌리는것. 다 다른 수여야지 break
		while(a==b || b==c || c==a) {
			a = (int)(Math.random()*range + start);
			b = (int)(Math.random()*range + start);
			c = (int)(Math.random()*range + start);
		}
		System.out.printf("a = %d, b = %d, c = %d", a,b,c);
	}

}
