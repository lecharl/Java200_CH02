package kr.s063;
// ArithmeticException
public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 20 / (5-x);
		} catch (ArithmeticException e) {
			System.out.println("==> 0으로 나눴는지 확인하기");
			e.printStackTrace();
			System.err.println(e.getMessage());
		}finally {
			System.out.println("난 수행되어야만 함");
		}

	}

}
