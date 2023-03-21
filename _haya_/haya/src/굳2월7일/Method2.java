package 굳2월7일;

public class Method2 {

	public static void main(String[] args) {
		/* 리턴타입이 있을경우 반드시 <return>을 포함해야함.
		 * void > 리턴타입이 아닌경우
		 * 
		 * */
		//5+5의 값을 구하여라.
		//7+7의 값을 구하여라.
		//500+235의 값을 구하여라.
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
