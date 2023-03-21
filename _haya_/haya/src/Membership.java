import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Membership {
	   
	   Scanner scan = new Scanner(System.in);
	   HashMap<String, String> memberMap = new HashMap<>();
	   public static LocalDateTime today= LocalDateTime.now(); // 로그인 날짜.시간 입력
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	   
	   public static boolean  id = false;
	   public final static String brand = "JavaBank";
	   
	   
	      public boolean oxox() { // 로그인 완료시 true 리턴
	         id = true;
	         return id;
	      }
	      
	       public void InfoSelec() {
	   
	      existingId();
	      
	      int selecNum;
	         
	         while(id == false) { // 로그인될때까지
	            System.out.println("\n[INFO] 안녕하세요. "+ brand+ " 입니다.\n"
	                    + " APP 이용시 회원가입이 필요합니다.\n"
	                  +"☞        종료를 원하시면 [0번]\n"
	                  +"☞  회원가입을 진행하시려면 [1번]\n"
	                  +"기존 회원 로그인을 하시려면 [2번]\n");
	                   
	            System.out.println("> 입력 : ");
	            selecNum =  scan.nextInt();
	            
	               switch(selecNum) {
	               case 0: exit(); return; // 어플종료
	               case 1: memberJoin(); 
	                     login(); oxox(); break;
	               case 2: login(); oxox(); break;
	               default: System.out.println("[ERROR] 잘못 입력하셨습니다. 다시 입력해 주세요.\n"); break;
	               }
	         }        
	   }

	   public HashMap<String,String> existingId() { // 기존 회원 id pw put
	      
	      memberMap.put("a", "1");
	      memberMap.put("b", "2");
	      memberMap.put("c", "3");
	      memberMap.put("b", "4");
	      memberMap.put("e", "5");
	      
	      return memberMap;
	   }
	   
	   public void print() {
	      
	   }
	   public int bankInfo () { // 첫 입력유도 인포메이션 (로그인 or 회원가입) 
	         
	         int answer;
	         
	         while(true) {
	            System.out.println("[INFO] 안녕하세요. "+ brand+ " 입니다.\n"
	                  +" APP 이용시 회원가입이 필요합니다. 종료를 원하시면 [0번]\n"
	                  +"☞  회원가입을 진행하시려면 [1번]\n"
	                  +"기존 회원 로그인을 하시려면 [2번]\n");
	                   
	            System.out.println("> 입력 : ");
	            answer =  scan.nextInt();
	            
	            if(answer<=2) {
	               break;
	            } else {
	               System.out.println("[ERROR] 잘못 입력하셨습니다.\n"
	                     +" 다시 입력해 주세요\n");
	               }
	            }     return answer; // 정수 0,1,2 중 리턴
	        }
	   
	   public void exit() {
		      
		      System.out.println(" App이 종료되었습니다.\n"
		                  +" 저희 "+ brand+ "를 이용해 주셔서 감사합니다.\n"); 
		      }
		   
		   public void exit2() {
		 
		         System.out.println(brand+" App이 종료되었습니다.\n"
		               +"( "+dtf.format(today)+" )"+" 로그아웃\n"
		               +" 저희 "+ brand+ " 를 이용해 주셔서 감사합니다.\n");   
		   }

		   public void memberJoin( ) { // 회원가입
			      
			      while(true) {
			      System.out.println("[INFO] 회원가입을 위한 ID와 PW을 입력해 주세요");
			      System.out.println("> ID를 입력해 주세요 (대소문자 구분)");
			      String id = scan.next();
			      System.out.println("> 비밀번호를 입력해 주세요 (대소문자 구분)");
			      String pw = scan.next();
			      
			      if(memberMap.containsKey(id)) {
			         System.out.println("[ERROR] 이미 존재하는 ID입니다.\n"
			               +"다시 입력해주세요\n ");
			      } else {
			         memberMap.put(id, pw);
			         System.out.println(" 안녕하세요. "+ id+ " 님\n"
			               +" 회원가입이 완료되었습니다.\n"
			               +" 이제 "+ brand + " App을 이용하실 수 있습니다.\n"
			               +"[INFO] 로그인을 해주세요.\n ");
			               break;
			         }
			      }
			   }


		   public void login() { // 로그인 메서드
			      
			      
			   
			      while(true) {
			         System.out.println("> ID 입력 (대소문자 구분) :");
			         String id = scan.next();
			         System.out.println("> PW 입력 :");
			         String pw = scan.next();
			      
			         if(!memberMap.containsKey(id)) {
			            System.out.println("[ERROR] 입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.");
			            continue;
			         } else {
			            if(!(memberMap.get(id)).equals(pw)) {
			            System.out.println("[ERROR] PW 불일치. 다시 입력해 주세요");
			            } else {
			               System.out.println("\n[INFO] 안녕하세요. "+ id + " 님\n"
			               +"("+dtf.format(today)+") 로그인 완료\n"
			               +"저희 "+ brand+ "를 이용해 주셔서 감사합니다.\n");
			               break;
			         }
			      }   
			   }
			}

			}
 class AccountAll {
    Scanner scan = new Scanner(System.in);
    private Account[] accountArray = new Account[100];
    private int count = 0;
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    private int sum = 0;

    public boolean isRegistered() {
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }
	   
	   public void ChooseThing() { // 로그인 후 메뉴 선택 print
	        
           System.out.println("------------------MENU-------------------");
         System.out.println("[1] 계좌생성 [2] 계좌잔고조회 [3] 입금 [4] 출금 \n"
               +"[5] 입출금내역 [6] 플래그머니 [7] 종료");
         System.out.println("-----------------------------------------");  
      }
	   
	   public void createAccount() {
	        System.out.println("[INFO] 계좌를 생성합니다.");
	        System.out.println("> 이름을 입력해 주세요.");
	        String user = scan.nextLine();
	        System.out.println("> 최초 입금액을 입력해 주세요.");
	        int balance = scan.nextInt();
	        scan.nextLine(); // 개행문자 제거
	        String aNum = String.format("%03d", ++count);
	        accountArray[count - 1] = new Account(aNum, user, balance);
	        map.put("입금", balance);
	        sum += balance;
	    }
	     
	   private void accountList() { // 계좌 
		      
		      if(!isRegistered()) {
		         System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
		               +"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		         return; }
		      for(int i=0; i< accountArray.length; i++) {
		         if(accountArray[i] != null) { // Account객체배열이 null이 아니라면
		            System.out.println("["+(i+1)+" 번] 계좌번호 : "+accountArray[i].getaNum()+"\n"
		                  +"> 소유주 : "+accountArray[i].getUser()+"\n"
		            +"> 해당 계좌잔고 : "+ accountArray[i].getBalance()+ "원\n");
		            sum += accountArray[i].getBalance();
		         }
		      } 
		   }
	   
	   public void withdrawMoney() {
		   if (!isRegistered()) {
		   System.out.println("[ERROR] 등록된 계좌가 없습니다.\n" + "[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		   return;
		   }

	        System.out.println("[INFO] 입금할 계좌번호를 입력해 주세요.");
	        String aNum = scan.nextLine();

	        Account account = findAccount(aNum);
	        if (account == null) {
	            System.out.println("[ERROR] 계좌번호가 잘못되었습니다.");
	            return;
	        }

	        System.out.println("[INFO] 입금할 금액을 입력해 주세요.");
	        int amount = scan.nextInt();
	        scan.nextLine(); // 개행문자 제거

	        account.deposit(amount);
	        map.put("입금", map.get("입금") + amount);
	        sum += amount;

	        System.out.println("> 입금이 완료되었습니다.");
	        System.out.println("> 현재 잔액: "+ account.getBalance()+"원");
	   }
	   
	   public void withdraw() { // 출금
		   String aNum;
		   int amount;
		   Account account = null;
		   
		   if(!isRegistered()) {
		      System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
		            +"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		      return;
		   }
		   System.out.println("[INFO] 출금 계좌를 입력해 주세요.");
		   aNum = scan.next();
		   account = findAccount(aNum);
		   if(account == null) {
		      System.out.println("[ERROR] 등록되지 않은 계좌입니다.\n"
		            +"[INFO] 계좌번호를 확인해 주세요.\n");
		      return;
		   }
		   System.out.println("[INFO] 출금 금액을 입력해 주세요.");
		   amount = scan.nextInt();
		   try {
		      account.withdraw(amount);
		      System.out.println("> 출금이 완료되었습니다.");
		      System.out.println("> 현재 잔액: "+ account.getBalance()+"원");
		   } catch (Exception e) {
		      System.out.println(e.getMessage());
		   }
		}
	   
	   public void allList() {
		      for(String tmp : map.keySet()) {
		         System.out.println("> 거래구분 : "+ tmp);
		         System.out.println("  금액 :"+ map.get(tmp));
		      }
		      
		   }
	   
	   
	   public Account findAccount (String aNum) { // 계좌번호를 입력받아, 계좌 찾는 메서드
		      Account account = null;
		      for(int i=0; i<accountArray.length; i++) {
		         if(accountArray[i] != null) 
		            if(accountArray[i].getaNum().equals(aNum)) {
		               account= accountArray[i];
		         }
		      } return account; 
		   }
		
	   
	   
	   public void flagMoney() {
		    int goal = 0;

		    if (!isRegistered()) {
		        System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
		                + "[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		        return;
		    }

		    System.out.println("[INFO] 목표 금액을 입력해 주세요.");
		    goal = scan.nextInt();
		    if (goal == 0) {
		        System.out.println("[ERROR] 목표 금액이 설정되어 있지 않습니다.");
		        return;
		    } else {
		        System.out.println("> 총 자산: " + sum + "원");
		        System.out.println("> 목표 금액: " + goal + "원");
		    }

		    if (sum >= goal) {
		        System.out.println("> 목표 금액을 달성하였습니다!");
		    } else {
		        System.out.println("  목표 금액까지 " + (goal - sum) + "원 남았습니다.");
		    }
		}
	   
	   public class Account {
		   
		   private String aNum;
		   private String user;
		   private int balance;
		   private double goal;
		   
		   public Account(String aNum, String user, int balance) { // 생성자
		      this.aNum = aNum;
		      this.user = user;
		      this.balance = balance;
		      System.out.println(user + " 님의 계좌 개설이 완료되었습니다.");
		      System.out.println("> 계좌번호 : " + aNum);
		      System.out.println("> 잔고 : " + balance);
		   }
		   
		   public String getaNum() {
		      return aNum;
		   }

		   public void setaNum(String aNum) {
		      this.aNum = aNum;
		   }

		   public String getUser() {
		      return user;
		   }

		   public void setUser(String user) {
		      this.user = user;
		   }

		   public int getBalance() {
		      return balance;
		   }

		   public void setBalance(int balance) {
		      this.balance = balance;
		   }
		   
		   public void deposit(int amount) { // 입금
		      this.balance += amount;
		   }
		   
		   public int withdraw(int amount) throws Exception { // 출금
		      if (this.balance < amount) {
		         throw new Exception("[ERROR] 잔액이 부족합니다");
		      } else {
		         this.balance -= amount;
		         return balance;
		      }
		   }
		}
}

