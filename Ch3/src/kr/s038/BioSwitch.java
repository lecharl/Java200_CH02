package kr.s038;

// enum의 값에 따라 신체, 감정, 지성값 출력하기
public class BioSwitch {

	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println(textInfor(index, value));
		// enum을 int로 변환
		System.out.println("신체 지수 주기값: "+index.getPeiValue());
		
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);

	}

	private static String textInfor(PEI index, double value) {
		String result = "";
		switch (index) {
		case PHYSICAL:
			result = "신체 지수: "; break;
		case EMOTIONAL:
			result = "감정 지수: "; break;
		case INTELLECTUAL:
			result = "지성 지수: "; break;
		default:
			result = "미결정"; break;
		}
		return result+value*100;
	}

}
