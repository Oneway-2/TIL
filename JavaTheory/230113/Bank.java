import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];
	int index = 0;
	
	void makeAccount(Account account) {
		accs[index++] = account;
	}
	
	void printAllAccount() {
		System.out.println("전체 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			System.out.println(accs[i].info());
		}
	}
	
	void printSpecialAccount() {
		System.out.println("Special 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			if (accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	void printSpecialAccount(String grade) {
		System.out.printf("\"%s\" 등급을 가진 Special 계좌만 출력합니다.\n", grade);
		for (int i = 0; i < index; i++) {
			if (accs[i] instanceof SpecialAccount) {
				SpecialAccount tmpSpecialAccount = (SpecialAccount)accs[i]; 
				if (tmpSpecialAccount.getGrade().equals(grade)) {
					System.out.println(tmpSpecialAccount.info());
				}
			}
		}
	}
	
	void printAccount() {
		System.out.println("Account 계좌 정보를 출력합니다.");
		for (int i = 0; i < index; i++) {
			if(!(accs[i] instanceof SpecialAccount)) {
				System.out.println(accs[i].info());
			}
		}
	}
}
