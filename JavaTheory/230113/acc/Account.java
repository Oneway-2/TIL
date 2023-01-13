package acc;

// 다른 패키지에 있는 클래스를 불러와서 그곳의 메서드를 직접 쓰기 위해서는 public 으로 설정해주어야한다.

public class Account {
	int num;
	String name;
	int balance;
	
	public String info() {
		return "번호: " + num + ", 이름: " + name + ", 잔액: " + balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			System.out.printf("%s님, %d원 인출했습니다.\n", name, money);
			balance -= money;
		}
		else {
			System.out.println("잔액이 모자랍니다.");
		}
	}
	
	// 생성자의 사용
	public Account(int num, String name, int balance) {
		super();
		this.num = num;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// getter setter 자동생성하기
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}