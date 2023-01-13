class Product {
	static int snum = 12; // 보통 static 변수는 선언하자마자 초기화 해줌. 안그러면 0으로 초기화됨.
	// 지역변수는 초기화 반드시 해줘야함. 안하면 오류난다.
	
	int serialNum;
	
	// 생성자
	public Product () {
		serialNum = ++snum;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		Product[] pros = new Product[] {new Product(), new Product(), new Product()};
		for (int i = 0; i < pros.length; i++) {
			System.out.println(pros[i].serialNum);
		}
//		출력 결과
//		13
//		14
//		15
		
		// 서로 다른 product들이지만, 클래스 내에서 static int를 사용했기 때문에 모두에게 공유되는 데이터를 넣을 수 있음.
	}
}
