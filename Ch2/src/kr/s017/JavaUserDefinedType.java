package kr.s017;

//public 붙일 수 없음 주의!!!!
class JLocation{
	public double lat = 0.0;
	public double lng = 0.0;
}

public class JavaUserDefinedType {

	public static void main(String[] args) {
		//두개의 기본타입
		double latitue = 37.52127220511242;
		double longtitude = 127.0074462890625;
		//사용자 정의 객체 생성
		JLocation jLoc = new JLocation();
		jLoc.lat = latitue;
		jLoc.lng = longtitude;
		
		JLocation newLoc = jLoc;
		System.out.println(newLoc.lat);
		System.out.println(newLoc.lng);

	}

}
