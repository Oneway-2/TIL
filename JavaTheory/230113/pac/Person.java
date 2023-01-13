package pac;

public class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			System.out.printf("나이 셋팅 %d로 완료\n", age);
			this.age = age;
		}
		else {
			System.out.println("님 나이가 마이너스셈??");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
