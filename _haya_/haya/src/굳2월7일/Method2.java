package ��2��7��;

public class Method2 {

	public static void main(String[] args) {
		/* ����Ÿ���� ������� �ݵ�� <return>�� �����ؾ���.
		 * void > ����Ÿ���� �ƴѰ��
		 * 
		 * */
		//5+5�� ���� ���Ͽ���.
		//7+7�� ���� ���Ͽ���.
		//500+235�� ���� ���Ͽ���.
		int hap=sum(5, 5);
		System.out.println("5+5="+hap);
		System.out.println("=======================");
		int hap2=sum2(7, 7);
		System.out.println("7+7="+hap2);
		System.out.println("=======================");
		int hap3=sum3(500, 235);
		System.out.println("500+235="+hap3);
		}
	public static int sum(int num1, int num2) {
		return num1+num2;
		
	}
	public static int sum2(int num1, int num2) {
		return num1+num2;
	}
	public static int sum3(int num1, int num2) {
		return num1+num2;
	}
	
	
	
}
