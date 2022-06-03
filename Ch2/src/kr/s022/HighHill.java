package kr.s022;

public class HighHill {

	public static void main(String[] args) {
//		실수 타입의 변수 사용하기
//		하이힐의 높이에 영향을 주는 여러 요인들의 값을 실수로 입력받아 적절한 힐의 높이를 구하자
//		아니 근데 저게 무슨 변수야;;
		double size = 6;
		double percent = 0.75;	//히트할 확률 75%
		double L = 200;	//200파운드 -> 1787원/1파운드
		double T = 0;	//0년(올해 유행) 1년 전 유행
		double A = 1;	//음주양 0잔 -> 8.83cm, 1잔 -> 4.42cm
		double Y = 2;	//착용년도
		
		double ups1 = percent*L*(Y+9);
		double downs = (T+1)*(A+1)*(Y+10)*(L+20);
		double ups2 = 12+3*size/8.0;
		//밝혀낸 식..........
		double high = ups1 / downs * ups2;
		double sample = 3.128;
		System.out.printf("적당한 하이힐 높이는 %fcm입니다.\n", high);
//		%1$, %2$ ... 몇번째 변수를 가져올지 정하는 것. 없으면 첫번째 변수
		System.out.printf("적당한 하이힐 높이는 %2$.2fcm입니다.\n", high, sample);
		System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.\n", high, sample);

	}

}
