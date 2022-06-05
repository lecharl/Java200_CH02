package kr.s038;

public enum PEI {
//	초기화, 바꿀 수 없음
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
//	위와 같이 초기화가 되어 있다면, ***생성자 반드시***
	private final int peiValue;
	PEI(int pie) {
		this.peiValue = pie;
	}
	public int getPeiValue() {
		return peiValue;
	}
	
}
