package kr.s032;

// 1,2차원 배열로 위도, 경도 표현하기
public class GeoPoint {

	public static void main(String[] args) {
		double lat1 = 11.123124124;
		double lng1 = 12.241324235;
		double lat2 = 21.323232335;
		double lng2 = 22.567721244;
		
		//실수 1차원 배열
		double latlng1[] = {lat1, lng1};
		double latlng2[] = {lat2, lng2};
		
		//실수 2차원 배열
		double latlng[][] = {
				{lat1, lng1},
				{lat2, lng2}
		};

	}

}
