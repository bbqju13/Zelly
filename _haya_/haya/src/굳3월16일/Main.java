package 굳3월16일;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		WordBook wb = new WordBook();

		System.out.println("= 단 어 장 =");
		while (true) {
			System.out.println("1> 단어 추가");
			System.out.println("2> 단어 출력");
			System.out.println("3> 단어 검색");
			System.out.println("4> 단어 수정");
			System.out.println("5> 단어 삭제");
			System.out.println("6> 종료");
			System.out.println("메뉴를 선택해주세요.");

			int menu = scan.nextInt();
			scan.nextLine();

			switch (menu) {
			case 1:
				System.out.print("추가할 단어 입력 : ");
				String newWord = scan.nextLine();
				System.out.print("단어 뜻 입력 : ");
				String mean = scan.nextLine();
				wb.addWord(newWord, mean);
				break;

			case 2:
				wb.printWord();
				break;

			case 3:
				System.out.print("검색할 단어 입력 : ");
				String searchWord = scan.nextLine();
				wb.searchWord(searchWord);
				break;

			case 4:
				System.out.print("수정할 단어 입력 : ");
				String modifyWord = scan.nextLine();
				System.out.print("새로운 단어 입력 : ");
				String newMean = scan.nextLine();
				wb.fixWord(modifyWord, newMean);
				break;

			case 5:
				System.out.print("삭제할 단어 입력 : ");
				String deleteWord = scan.nextLine();
				wb.deleteWord(deleteWord);
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}

}
