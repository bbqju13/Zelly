package 굳2월15일;

public class 익명내부클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
			System.out.println(calc(4, 0, '$'));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료");

	}

	public static double calc(int num1, int num2, char op)throws RuntimeException{
		double res=0;
		if((op=='/'|| op=='%')&&num2==0 ) {
			throw new RuntimeException("num2는 0이될수없습니다.");
		}
		switch(op) {
		case '+':res = num1 + num2; break;
		case '-':res = num1 - num2; break;
		case '*':res = num1 * num2; break;
		case '/':res = num1 / num2; break;
		case '%':res = num1 % num2; break;
		default:
			throw new RuntimeException(op+"연산자가 아닙니다.");
		}
		return res;
	}
}

