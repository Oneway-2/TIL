import acc.Account;
import acc.SpecialAccount;

public class AccountTest2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
	
		bank.makeAccount(new Account(101, "홍길동", 10000));
		bank.makeAccount(new SpecialAccount(102, "고길동", 200000, "Gold"));
		bank.makeAccount(new Account(103, "무길동", 300));
		bank.makeAccount(new SpecialAccount(104, "부길동", 400000, "VIP"));
		
		bank.printAllAccount(); // 모든 계좌 다가져오기
		bank.printSpecialAccount(); // Special계좌만 가져오기
		bank.printAccount(); // 일반 계좌만 가져오기
		bank.printSpecialAccount("VIP"); // 특정 등급을 가진 Special Account만 출력
	}
	
}
