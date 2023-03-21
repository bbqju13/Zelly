package haya;

public class haya3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ***** 이거 5줄 만들기
		 * i=줄 / a=별 / b=공백
		 * */
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=5; a++) {
				System.out.print("★");
			}
		System.out.println();	
		}
		
		System.out.println("1.-------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("2.-------------------------------");
		// i=1 a=5
		// i=2 a=4
		// i=3 a=3
		// i=4 a=2
		for(int a=5; a>0; a--) {
			for(int i=1; i<=a; i++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("3.-------------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int b=1; b<=5-i; b++) {
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("4.-------------------------------");
		
		// i=1 b=0 a=5
		// i=2 b=1 a=4
		// i=3 b=2
		// i=4 b=3
		// i=5 b=4
		
		for(int i=0; i<5; i++) {
			for(int b=0; b<i; b++) {
				System.out.print(" ");
			}
			for(int a=5; a>i; a--) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("4-1.-------------------------------");
		for(int i=1; i<=5; i++) {
			for(int b=0; b<i; b++) {
				System.out.print(" ");
			}
			for(int a=5; a>=i; a--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	

}
