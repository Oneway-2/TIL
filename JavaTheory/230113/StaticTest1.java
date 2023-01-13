// static 변수는 method area에 저장되며, 프로그램이 시작될 때 미리 다 저장된다. 그래서 바로 사용 가능.

class TempClass {
	int value; // instance value
	static int svalue; // class value (static value)
	
	void func1 () {
		System.out.println("func1 실행");
		value = 10;
		svalue = 20;
		sfunc1();
	}
	
	void func2 () {
		// instance 메서드에선 static 변수건, 메서드건 다 사용 가능. instance 변수와 메서드는 당연하고.
		func1();
	}
	
	static void sfunc1 () {
		System.out.println("sfunc1 실행");
		// static method에서는 instance 변수에 접근할 수 없다.
		// 또한, instance 메서드도 호출할 수 없다.
		// value = 1;
		// func1();
		
		// 하지만 당연히 static 변수는 쓸 수 있음.
		svalue = 2;
	}
	
	static void sfunc2 () {
		// static 메서드는 static 메서드만 호출할 수 있음.
		sfunc1();
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		TempClass.svalue = 100;
		System.out.println(TempClass.svalue);
		
		TempClass tc = new TempClass();
		tc.value = 200;
		System.out.println(tc.value);
		
		// 일반 변수는 클래스를 선언 해주어야 쓸 수 있다는걸 보여주려는거
		// 객체 생성 후 레퍼런스 변수를 통해서만 접근 가능.
				
		// 선언이 되었으니까, static value를 위에처럼 클래스 명으로 접근했던 것처럼 객체명으로 불러와도 됨.
		// 이것은 TempClass.svalue와 물리적으로 같은 행위.
		System.out.println(tc.svalue);
		
		// func1와 sfunc1를 만든상황에서, TempClass. 라고 치면 sfunc1만 뜨게 됨.
		// 객체 생성 없이 클래스명으로 불러올 수 있다는거. 변수때랑 똑같음.
		TempClass.sfunc1();
		
		// 하지만 static 메서드가 아닌애는 생성한 객체명을 통해서 접근해야한다는 것.
		tc.func1();
		
	
	}
}
