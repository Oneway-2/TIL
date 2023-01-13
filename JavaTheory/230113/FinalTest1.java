class MyClass2 {
	// instance final은 생성과 동시에 초기화하거나, 생성자를 통해서 초기화 해야만 한다.
	// 왜냐면 각 객체가 갖는 변하지 않는 상수여야 하기 때문.
	
	final int num;
	MyClass2(int num) {
		this.num = num;
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		int n = 10;
		n = 20;
		
		// final 은 수정이 안된다.
		final int m = 20;
//		m = 30;
	}
}
