package ��2��8��;

import java.util.Random;
import java.util.Scanner;

public class �߱����� {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * ��ǻ�Ͱ� 3�ڸ��� ���ڸ� ����
		 * ������ 3�ڸ��� ���ڸ� ���ߴ� ����
		 * �ڸ��� ���ڰ� �Է��ϸ� strike
		 * ���ڸ� ��ġ�ϸ� ball, �ƹ��͵� �ȸ����� out
		 * 
		 * 3 5 7
		 * 3 5 6
		 * 2s
		 * 
		 * 3 5 7
		 * 3 7 5
		 * 1s 2d
		 * 
		 * --�߱����� ����
		 * ��ǻ�Ͱ� ���ڸ� ���߽��ϴ�.
		 * ���ڸ� �Է��� �ּ���.(1~9 3�ڸ�)
		 * 3 5 6
		 * 2s
		 * 3s �� ������ ����(����Ƚ�� ���)
		 * 
		 */
		int com[]=new int[3];
		int user[]=new int[3];
		System.out.println("���ͼ���");
		print(com);
		System.out.println();
	} 
	// ��ǻ�� 3�ڸ� ���ڴ� ����.
	public static int rancom() {
		return (int)(Math.random()*9)+1;
	}
	//�迭�� ����
	public static void ranarry(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	//�ߺ� Ȯ��
	public static boolean isCon(int arr[], int random) {
		for(int tmp:arr) {
			if(tmp==random) {
				return true;
			}
		}
		return false;
	}
	public static void print(int arr[]) {
		for(int tmp:arr) {
			System.out.print(" "+tmp);
		}
	}
	
}