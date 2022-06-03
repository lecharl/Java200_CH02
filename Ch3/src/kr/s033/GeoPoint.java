package kr.s033;

// 객체를 이용하여 위도, 경도 표현하기
public class GeoPoint {

	public static void main(String[] args) {
		double lat1 = 11.1241566;
		double lng1 = 12.5673573;
		
		double lat2 = 21.4574573;
		double lng2 = 22.6709232;
		
		Geo geo1 = new Geo();
		geo1.lat = lat1;
		geo1.lng = lng1;
		System.out.println(geo1);
		
		Geo geo2 = new Geo();
		geo2.lat = lat2;
		geo2.lng = lng2;
		System.out.println(geo2);
	}
}
