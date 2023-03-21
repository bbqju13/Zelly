package 과제;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("과제 1번");
		 String ans="a:b:c:d";
		 String ans2=" ";
		 for(int i=0; i<ans.length(); i++) {
			 if(ans.charAt(i) == ':') {
				 ans2+="#";
			 }else {
				 ans2+=ans.charAt(i);
			 }
		 }

		 System.out.println(ans2);
		 
		 System.out.println("================================");
		 System.out.println("과제 2번");
		 
		 String id="881120-1068234";
		 String birth="";
		 String gen="";
		 for(int i=0; i<id.length(); i++) {
			 if(i<6) {
				 birth+=id.charAt(i);
			 }else if(i==6){
				 if(id.charAt(i)=='1') {
					 gen="남";
				 }
				 break;
			 }
		 }
		 System.out.println("생년월일: "+birth);
		 System.out.println("성별: "+gen);
		 
		 System.out.println("==================================");
		 System.out.println("과제 3번");
		 System.out.println("100을 입력해주세요");
		 Scanner scan=new Scanner(System.in);
		 int num =scan.nextInt();
		 System.out.println("1~"+num+"까지 3의배수 출력");
		 for(int i=1; i<=num; i++) {
			 if(i%3==0) {
				 System.out.print(i+" ");
			 }
		 }
		 System.out.println();
		 System.out.println("=================================");
		 System.out.println("과제 4번");
		 
		 System.out.println("월을 입력해 주세요.(1~12)");
		 int month=scan.nextInt();
		 switch(month) {
		 case 3: case 4: case 5:
			 System.out.println(month+"월은 봄");
			 break;
		 case 6: case 7: case 8:
			 System.out.println(month+"월은 여름");
			 break;
		 case 9: case 10: case 11:
			 System.out.println(month+"월은 가을");
			 break;
		 case 12: case 1: case 2:
			 System.out.println(month+"월은 겨울");
			 break;
			 default:
				 System.out.println("잘못된 입력입니다.");
		 }
		 
		 System.out.println("==============================");
		 System.out.println("과제 5번");
		 
		 for(int i=1; i<=5; i++) {
			 for(int a=1; a<=i; a++) {
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		 
	}

}
