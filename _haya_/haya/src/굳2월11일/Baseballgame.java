package 굳2월11일;

import java.util.Scanner;

public class Baseballgame {
	public static void main(String[] args) {
		/* 야구게임 메서드로 변경...
		 * 랜덤번호 생성
		 * 배열에 추가 (중복메서드)
		 * 출력메서드
		 * 스트라이크 메서드
		 * 볼 메서드
		 * */
		int com[]=new int[3];
		int user[]=new int[3];
		int max=9, min=1;
		int b=0, s=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		randomarray(com, max, min);
		System.out.println("==야구게임시작==");
		System.out.println("컴터가 숫자를 정했습니다.");
		while(s!=3) {
			System.out.println("1~9까지 숫자 3개 입력.");
			for(int i=0; i<user.length; i++) {
				user[i]=scan.nextInt();
			}
			count++;
		
		s=strike(com, user);
		b=ball(com, user);
		if(s!=0) {
			System.out.print(s+"S");
		}
		if(b!=0) {
			System.out.print(b+"B");
		}
		System.out.println();
		System.out.println("게임횟수:"+count);
		if(s==0&&b==0) {
			System.out.println("OUT");
			System.out.println();
		}
		}
		System.out.println("게임종료");
		System.out.println();
		
		scan.close();
		}
	
	//랜덤번호 생성.
	public static int random(int max, int min) {
		if(max<min) {
			int tmp=max;
			max=min;
			min=tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
		//매개변수 > 개수, 시작값 (int)(Math.random()*(개수)+시작값)
	}
	//중복확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	//배열 생성메서드 (중복제거)
	public static boolean randomarray(int arr[], int max, int min) {
		if(arr==null) {
			return false;
		}
		if((max-min+1)<arr.length) { //랜덤수의 개수가 배열의 length보다 작다면 X
			return false;
		}
		int i=0;
		while(i<arr.length) {
			int r=random(max,min);
			if(!isContain(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
		return true;
	}
	//배열 출력 메서드
	public void printarray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//스트라이크 메서드
	//기능 com[], user[] 위치와 값이 같으면 카운트 반환기능
	public static int strike(int com[], int user[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i]==user[i]) {
				cnt++; 
			}
		}
		return cnt;
	}
	// 볼 메서드
	public static int ball(int com[], int user[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(isContain(user, com[i])) {
				cnt++; // 자리상관없이 일치하면 count 증가
			}
		}
		return cnt-strike(com, user); // strike 개수만큼 차감.
	}

}
