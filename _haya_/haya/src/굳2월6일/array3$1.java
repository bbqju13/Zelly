package 굳2월6일;

import java.util.Scanner;

public class array3$1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("5가지 숫자를 입력해 주세요.");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();	
		System.out.print(arr[i]+" ");
		}
		System.out.print(" > ");
		
		sc.close();
	}

}
