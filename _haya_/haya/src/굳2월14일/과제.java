package 굳2월14일;

import java.util.Scanner;

public class 과제 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성

		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성

		 * 이미지파일 형식은 (jpg, png, gif, jpeg)

		 * String[] fileName = {"java.txt","String.jpg","method.png",

		 * "String.pdf","java.pdf"}

		 * 

		 * --이미지 파일--

		 * String.jpg

		 * method.png

		 * */
		String[] fileName= {"글자.txt", "물고기.jpg", "돼지.png", "사람.jpeg", "코끼리.gif"};
		String[] img={"jpg", "png", "gif","jpeg", "txt"};
		 
		System.out.println("=이미지 파일 형식을 검색=");
		System.out.println("=jpg, png, gif, jpeg, txt=");
		for(int i=0; i<img.length; i++) {
			img[i]=scan.next();
		}
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].substring(i).equals("jpg")){
				System.out.println(fileName[i]);
			}else if(fileName[i].substring(i).equals("png")) {
				
			}
			
			else if(fileName[i].substring(i).equals("png")) {
				
			}
			else if(fileName[i].substring(i).equals("gif")) {
				
			}
			else 
				fileName[i].substring(i).equals("jpeg");
			
			System.out.println("다시검색해");
			
			
			
				
		
		
		
		
		
		scan.close();
		

	}

	}
}
