package ��2��7��;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		/* �޼��带 Ȱ���Ͽ� ���⸦ �ۼ�.
		 * �� ���� �Է� �޾Ƽ�(Scanner)����. ������( + - * / )�� �Է� �޾� �޼��带 Ȱ���Ͽ� ����.
		 * 
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.println("=����=");
		System.out.println("=�����ڸ� �Է����ּ���.");
		String op=scan.next();
		System.out.println("=ù��°����=");
		int num1=scan.nextInt();
		System.out.println("=�ι�°����=");
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
			System.out.println("/�� ���:"+arr[0]);
			System.out.println("/�� ������:"+arr[1]);
			default:
				System.out.println("�ٽ��Է����ּ���");
				System.out.println("����");
				
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
