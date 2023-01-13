import acc.SpecialAccount;

public class AccountTest {
	public static void main(String[] args) {
		// 상속받는 이유:
		// 없는 기능을 추가해서 쓰거나
		// 있는 기능을 변경해서 쓰기 위함임.
		
		SpecialAccount sacc = new SpecialAccount(100, "홍길동", 100000, "VIP");
		System.out.println(sacc.info());
		sacc.deposit(100000);
		System.out.println(sacc.info());
		
	}
}
