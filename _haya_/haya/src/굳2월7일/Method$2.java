package ��2��7��;

public class Method$2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hap=sum(5, 5);
		System.out.println("5+5="+hap);
		System.out.println("========");
		System.out.print("hap����:");
		sumprint(5, 5);
		System.out.println("==========");
		int n=ml(5, 5);
		System.out.println("hap�ǰ�:"+n);
	}
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static void sumprint(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public static int ml(int num1, int num2) {
		return num1*num2;
	}
}
