package 굳2월11일;

public class MethodOverloading {

	public static void main(String[] args) {
		/* 메서드오버로딩
		 * -동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1.매개변수의 개수가 다르면 가능.
		 * 2.매개변수의 종류(자료형)가 다르면 가능.
		 * 리턴타입은 상관없음. 매개변수 이름도 상관없음.
		 * */

	}
	/* 더하기 하는 메서드 생성
	 * int num1, int num2를 매개변수로 받아 더한 연산결과를 리턴.
	 * 메서드명:sum
	 * */
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	/* 더하기 하는 메서드 생성
	 * 매개변수 double 자료형 으로
	 * 메서드명 sum
	 * */
	public static double sum(double num1, double num2) {
		return num1+num2;
	}
	/* 가변길이 메서드
	 * 1+2, 1+2+3, 26+45+86+94...
	 * 피연산자의 값이 일정하지 않을경우 매개변수의 개수와 상관없이 매개값을 줄때 사용
	 * */
	
	// 가변길이 메서드
	public static int sum(int ... num) {
		int sum=0;
		//가변길이 num은 배열처럼 사용
		for(int i=0; i<=num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}

}
