package ��2��6��;

import java.util.Scanner;

public class array3$1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("5���� ���ڸ� �Է��� �ּ���.");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();	
		System.out.print(arr[i]+" ");
		}
		System.out.print(" > ");
		
		sc.close();
	}

}
