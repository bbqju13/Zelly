package product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProductManager pm = new ProductManager();

		while (true) {
			System.out.println("> 추가 메뉴");
			System.out.println("1. 제품 추가");
			System.out.println("2. 제품 리스트 보기");
			System.out.println("3. 제품 주문");
			System.out.println("4. 주문 내역 보기");
			System.out.println("5. 프로그램 종료");
			System.out.print("\n메뉴 등록 (y/n): ");
			String register = scan.nextLine();
			if (register.equalsIgnoreCase("n")) {
				break;
			}

			switch (scan.nextInt()) {
			case 1:
				scan.nextLine();
				System.out.println("메뉴");
				String menu = scan.nextLine();
				System.out.println("가격");
				int price = scan.nextInt();
				pm.addProduct(menu, price);
				break;
			case 2:
				pm.printProductList();
				break;
			case 3:
				scan.nextLine();
				System.out.println("상품명: ");
				String menu1 = scan.next();
				System.out.println("수량: ");
				int count = scan.nextInt();
				pm.orderProduct(menu1, count);
				break;
			case 4:
				pm.printOrderList();
				break;
			case 5:
				scan.nextLine();
				System.out.println("파일명: ");
				String fileName = scan.nextLine();
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
					for (Product product : pm.getOrderList()) {
						writer.write(product.getMenu() + "," + product.getPrice() + "\n");
					}
					writer.close();
					System.out.println("주문 내역이 파일에 저장되었습니다.");
				} catch (IOException e) {
					System.out.println("파일에 쓰는 중 오류가 발생했습니다.");
				}
				break;
			case 6:
				return;
			default:
				System.out.println("=오류=");
			}
		}
	}
}
