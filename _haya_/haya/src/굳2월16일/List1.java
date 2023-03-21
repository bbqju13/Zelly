package 굳2월16일;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * */
		Foodmanager fm=new Foodmanager();
		ArrayList<Integer>order=new ArrayList<Integer>();
		// 1번메뉴 2개 / 3번메뉴 3개
		fm.add();
		int a=-1;
		
		do {
			fm.Printmenu();
			a=scan.nextInt();
			if(a==6) {
				System.out.println("프로그램종료");
				break;
			}
			if(a!=0) {
				if(a<6) {
					System.out.println("수량: ");
					int count=scan.nextInt();
					fm.sale(a, count);
					order.add(a);
					order.add(count);
					System.out.println("주문종료 = 0번");
				}else {
					System.out.println("잘못된메뉴");
				}
			}
		}while(a!=0);
		
			System.out.println("=주문확인=");
			for(int i=0; i<order.size(); i=i+2) {
				System.out.println(fm.getMenu().get(order.get(i)-1));
				System.out.println(order.get(i+1)+"개");
			}
			System.out.println();
			System.out.println("총 결제금액: "+fm.getTotal()+"원 입니다.");
		

	}

}
	 class Foodmanager{
		 private ArrayList<String>menu=new ArrayList<String>(); //메뉴
		 private ArrayList<Integer>price=new ArrayList<Integer>(); //가격
		 private int sum;
		 private int total;
		 
		 void Printmenu() {
			 System.out.println("=메뉴판=");
			 System.out.println("1번:초밥: 12000원");
			 System.out.println("2번:햄버거: 8000원");
			 System.out.println("3번:만두: 2500원");
			 System.out.println("4번:떡볶이: 3500원");
			 System.out.println("5번:라면: 2000원");
			 System.out.println("메뉴선택");
		 }
		 void add() {
			 menu.add("초밥");
			 menu.add("햄버거");
			 menu.add("만두");
			 menu.add("떡볶이");
			 menu.add("라면");
			 
			 price.add(12000);
			 price.add(8000);
			 price.add(2500);
			 price.add(3500);
			 price.add(2000);
		 }
		 
		 public void sale(int menu11, int count) {
			 sum=price.get(menu11-1)*count; //price.get(menu1-1) 메뉴에대한 가격
			 total+=sum;
			 System.out.println("===");
			 System.out.println("주문메뉴: "+menu.get(menu11-1)+" ");
			 System.out.println(count+"개 주문");
			 System.out.println("결제금액: "+sum);
		 }
		public ArrayList<String> getMenu() {
			return menu;
		}
		public void setMenu(ArrayList<String> menu) {
			this.menu = menu;
		}
		public ArrayList<Integer> getPrice() {
			return price;
		}
		public void setPrice(ArrayList<Integer> price) {
			this.price = price;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		 
	 }
