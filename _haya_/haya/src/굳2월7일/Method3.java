package 굳2월7일;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성.
		 * 두 수를 입력 받아서(Scanner)연산. 연산자( + - * / )를 입력 받아 메서드를 활용하여 연산.
		 * 
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.println("=계산기=");
		System.out.println("=연산자를 입력해주세요.");
		String op=scan.next();
		System.out.println("=첫번째숫자=");
		int num1=scan.nextInt();
		System.out.println("=두번째숫자=");
		int num2=scan.nextInt();
		
		switch(op) {
		case "+":
			add(op+num1+num2, num2, num2);
			break;
		case "-":
			minus(num1, num2, op);
			break;
		case "*":
			gob(num1, num2, op);
			break;
		case "/":
			div(num1, num2, op);
			break;
		case "%":
			double[]arr=nam(num1, num2, op);
			System.out.println("/의 결과:"+arr[0]);
			System.out.println("/의 나머지:"+arr[1]);
			default:
				System.out.println("다시입력해주세요");
				System.out.println("종료");
				
		}
		scan.close();

	}
	public static void add(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	public static int minus(int num1, int num2, String op) {
		return num1-num2;
	}
	public static int gob(int num1, int num2, String op) {
		return num1*num2;
	}
	public static double div(int num1, int num2, String op) {
		return num1/num2;
	}
	public static double[] nam(int num1, int num2, String op){
		double[]nam=new double[2];
		nam[0]=(double)num1/num2;
		nam[1]=num1%num2;
		return nam;
	}
}
