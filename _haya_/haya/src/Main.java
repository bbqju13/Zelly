import java.util.Scanner;

import AccountAll.Account;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static AccountAll account = new AccountAll();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean isRunning=true;
		
		while(isRunning) {
			System.out.println("===================");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 전체 계좌 조회");
            System.out.println("5. 목표 금액 설정");
            System.out.println("0. 프로그램 종료");
            System.out.println("===================");

            int menu = scan.nextInt();
            
            switch (menu) {
            case 1:
            	account.createAccount();
                break;
            case 2:
            	account.deposit();
                break;
            case 3:
            	account.withdraw();
                break;
            case 4:
            	account.printAllAccounts();
                break;
            case 5:
            	account.flagMoney();
                break;
            case 0:
                System.out.println("[INFO] 프로그램을 종료합니다.");
                isRunning = false;
                break;
            default:
                System.out.println("[ERROR] 잘못된 입력입니다. 다시 입력해주세요.");
                break;
            }
		}
		
		 scan.close();
	}

}
