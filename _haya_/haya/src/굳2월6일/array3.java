package 굳2월6일;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력.
		 * 각 자리수 합계 출력.
		 * */
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("5개 숫자를 입력하세요.");
		
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=scan.nextInt();
				System.out.print(arr[i]+" ");
			}
			System.out.print(">"); 
			//오름 차순
			
			for(int i=arr.length; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.print(">");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+"+");
			}
			System.out.println(arr[arr.length]-1);
	

		

	//	System.out.println("5개 숫자를 입력해주세요.");
//
	//	for(int i=0; i<arr.length; i++) {
//
	//		arr[i]=scan.nextInt();
		//}
		//for(int i=0; i<arr.length; i++) {
		//	System.out.print(arr[i]);
		//}
		//System.out.print(" => ");
		//for(int i=arr.length-1; i>=0; i--) {
			//System.out.print(arr[i]);
		//}
		//System.out.print(" => ");
		//for(int i=0; i<arr.length-1; i++) {
			//System.out.print(arr[i]+"+");
		//}
		//System.out.println(arr[arr.length-1]);


		scan.close();
	}

}
