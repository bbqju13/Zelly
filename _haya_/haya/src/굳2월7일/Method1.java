package 굳2월7일;

public class Method1 {

	public static void main(String[] args) {
		/* 메서드: 기능/ 함수 p.230
		 * 접근제한자: 접근할수있는 주체의 제한범위
		 * 리턴타입: 메서드의 실행 결과로 받을수있는 정보의값(자료형)
		 * 매개변수: 메서드를 실행하기위해서 필요로 하는값
		 * 메서드명: 메서드 이름: <소문자>로시작
		 * 접근제한자_리턴타입_메서드명(매개변수){
		 * 기능구현;
		 * }
		 * */
		//int num=10;
		//int num2=20;
		int hap=sum(500, 200);
		System.out.println(hap);
	}
	public static int sum(int num, int num2) {
		//int sum=num+num2;
		return num+num2;
	}
}
