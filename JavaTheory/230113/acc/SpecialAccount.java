package acc;

public class SpecialAccount extends Account {
	String grade;
	double rate;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		
		if(this.grade.equals("VIP")) rate = 0.04;
		else if(this.grade.equals("Gold")) rate = 0.03;
		else if(this.grade.equals("Silver")) rate = 0.02;
		else if(this.grade.equals("Normal")) rate = 0.01;
	}

	public SpecialAccount(int num, String name, int balance, String grade) {
		super(num, name, balance); // 부모 생성자 함수를 호출할 수 있게 해줌
		this.grade = grade;
		setGrade(grade);
	}

	public SpecialAccount() {}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 등급 : " + grade;
	}

	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		double eja = money*rate;
//		System.out.printf("money = %d, eja = %f, money + eja = %d\n", money, eja, (int)(money+eja));
		int add = (int)(money+eja);
		System.out.printf("%s님 %d원 넣으셨고 %s등급이셔서 이자율 %.2f%%추가하여 %d원 입금됐습니다.\n", name, money, grade, rate, add);
		super.deposit(add);
	}
	
	

	
	
	
	
}
