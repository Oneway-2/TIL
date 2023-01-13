import acc.Account;

// 다른 패키지에 있는 클래스 불러오기

public class ClassTest1 {
	public static void main(String[] args) {
		Account account1 = new Account(1001, "홍길동", 100000);
//		account1.num = 1001;
//		account1.name = "홍길동";
//		account1.balance = 100000;
		
		System.out.println(account1.info());
		
		Account account2 = new Account(1002, "홍진호", 222222);
//		account2.num = 1002;
//		account2.name = "홍진호";
//		account2.balance = 222222;
		
		System.out.println(account2.info());
		
		account2.withdraw(2222);
		
		System.out.println(account2.info());
	}
}
