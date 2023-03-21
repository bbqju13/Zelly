package 굳2월8일;

import java.util.Random;
import java.util.Scanner;

public class 야구게임 {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 3자리의 숫자를 생성
		 * 유저가 3자리의 숫자를 맞추는 개념
		 * 자리와 숫자가 입력하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * 
		 * 3 5 7
		 * 3 5 6
		 * 2s
		 * 
		 * 3 5 7
		 * 3 7 5
		 * 1s 2d
		 * 
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해 주세요.(1~9 3자리)
		 * 3 5 6
		 * 2s
		 * 3s 다 맞으면 종료(게임횟수 출력)
		 * 
		 */
		int com[]=new int[3];
		int user[]=new int[3];
		System.out.println("컴터숫자");
		print(com);
		System.out.println();
	} 
	// 컴퓨터 3자리 숫자는 랜덤.
	public static int rancom() {
		return (int)(Math.random()*9)+1;
	}
	//배열에 저장
	public static void ranarry(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	//중복 확인
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