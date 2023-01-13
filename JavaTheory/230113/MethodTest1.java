class Calculator {
	int val1;
	int val2;
	
	// method overloading : 동일한 클래스에 동일한 이름의 메서드가 여러개 있을 수 있다.
	// 단, 파라미터의 개수가 다르거나, 타입이 달라야 한다.
	
	int add() {
		return val1+val2;
	}
	
	int add(int data1, int data2) {
		return data1 + data2;
	}
	
	double add(double data1, double data2) {
		return data1 + data2;
	}

	// 이 껍데기만 있는 생성자는 코드로 안만들어놔도 컴파일 할 때 자동으로 만든다.
	// 이거를 까먹지 말고 무조건 만들자. 다른 생성자가 있으면 얘를 자동으로 안만들기 때문에, 오류를 발생시킬 수 있다.
	public Calculator() {}

	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public Calculator(int val1) {
		this.val1 = val1;
		val2 = 500;
	}
	
}

public class MethodTest1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.val1 = 10;
		cal.val2 = 20;
		
		int a = 100, b = 200;

		System.out.println(cal.add());
		System.out.println(cal.add(a, b));
		System.out.println(cal.add((double)a, (double)b));
		
		Calculator cal2 = new Calculator(50);
		System.out.println(cal2.add());
	}
}
