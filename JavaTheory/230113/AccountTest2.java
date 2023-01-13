import acc.Account;
import acc.SpecialAccount;

public class AccountTest2 {
	static Account[] accs = new Account[100];
	static int index = 0;
	
	static void makeAccount(Account account) {
		accs[index++] = account;
	}
	
	static void printAllAccount() {
		System.out.println("전체 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			System.out.println(accs[i].info());
		}
	}
	
	static void printSpecialAccount() {
		System.out.println("Special 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			if (accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	static void printSpecialAccount(String grade) {
		System.out.printf("\"%s\" 등급을 가진 Special 계좌만 출력합니다.\n", grade);
		for (int i = 0; i < index; i++) {
			if (accs[i] instanceof SpecialAccount) {
				SpecialAccount tmpSpecialAccount = (SpecialAccount)accs[i]; 
				if (tmpSpecialAccount.getGrade().equals("VIP")) {
					System.out.println(tmpSpecialAccount.info());
				}
			}
		}
	}
	
	static void printAccount() {
		System.out.println("Account 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			if(!(accs[i] instanceof SpecialAccount)) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	public static void main(String[] args) {
//		accs[0] = new Account(101, "홍길동", 10000);
//		accs[1] = new SpecialAccount(102, "고길동", 200000, "VIP");
		makeAccount(new Account(101, "홍길동", 10000));
		makeAccount(new SpecialAccount(102, "고길동", 200000, "Gold"));
		makeAccount(new Account(103, "무길동", 300));
		makeAccount(new SpecialAccount(104, "부길동", 400000, "VIP"));
		
		
		
		printAllAccount(); // 모든 계좌 다가져오기
		printSpecialAccount(); // Special계좌만 가져오기
		printAccount(); // 일반 계좌만 가져오기
		printSpecialAccount("VIP"); // 특정 등급을 가진 Special Account만 출력
	}
	
}
