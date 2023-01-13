import acc.Account;
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
		
		// upcasting: 자식객체를 부모타입의 레퍼런스 변수에 담을 수 있음.
		Account acc = new SpecialAccount(101, "고길동", 123000, "Gold");
		
		// 근데 acc로 쓸라다보니, SpecialAccount에 있는 grade를 쓸 수가 없음.
		// 왜냐면 acc엔 그런게 없으니께
		// 그래서 쓸려면 downcasting 해줘야한다.
		SpecialAccount downAcc = (SpecialAccount)acc;
		
		// 부모에도 있고 자식에도 있는 메소드를 부모의 타입으로 호출 시,
		// 자식에 있는 메서드가 실행된다. => 다형성ㅎ
		System.out.println(acc.info());
	}
}
