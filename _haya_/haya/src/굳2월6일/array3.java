package ��2��6��;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		/* 5�ڸ� ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڸ� �Ųٷ� ���.
		 * �� �ڸ��� �հ� ���.
		 * */
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("5�� ���ڸ� �Է��ϼ���.");
		
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=scan.nextInt();
				System.out.print(arr[i]+" ");
			}
			System.out.print(">"); 
			//���� ����
			
			for(int i=arr.length; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.print(">");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+"+");
			}
			System.out.println(arr[arr.length]-1);
	

		

	//	System.out.println("5�� ���ڸ� �Է����ּ���.");
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
