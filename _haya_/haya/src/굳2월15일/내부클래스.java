package 굳2월15일;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스: 클래스 내부에 선언한 클래스
		 * - 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고, 다른외부에서 내부클래스를 사용할일이 없을경우
		 * - <중첩클래스> 라고도함
		 * - 인스턴스 내부클래스, 정적(static)클래스, 지역(local)내부클래스,
		 * - 익명(anonymous)내부클래스 => 익명클래스를 사용하기 위해 내부클래스를 사용.
		 * 
		 * - 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 <private>으로 선언하는 것을 권장.
		 * - 내부클래스 생성시기: 외부클래스가 생성된 후 생성됨. (static은 다름)
		 * - private이 아닌 내부클래스는 다른 외부클래스에서 생성 할수있음.
		 * */
		
		Outclass ot=new Outclass();
		System.out.println("외부클래스를 이용하여 내부클래스의 메서드를 호출");
		ot.usingclass();
		
		System.out.println();
		
		Outclass.Inclass inclass= ot.new Inclass();
		inclass.inclassprint();
		
		System.out.println();
		
		System.out.println("static 내부클래스의 static메서드 호출");
		Outclass.Instaticclass.stest();
		
		System.out.println();
		
		System.out.println("static내부클래스의 일반 메서드 호춣");
		Outclass.Instaticclass sinclass=new Outclass.Instaticclass();
		sinclass.intest();

	}
}
class Outclass{
	private int num=20;
	private static int snum=30;
	private Inclass in;
	
	public Outclass() {
		in=new Inclass();
	}
	class Inclass{
		int innum=70;
		
		void inclassprint() {
			System.out.println("Outclass num"+num+" (외부클래스의 인스턴스 변수)");
			System.out.println("Outclass snum"+snum+" (외부클래스의 static 변수)");
			System.out.println("Inclass innum"+innum+" (내부클래스의 인스턴스 변수)");
		}
	} // Inclass 끝
	public void usingclass() {
		in.inclassprint();
	}
	
	static class Instaticclass{
		int innum=150;
		static int sinnum=450;
		
		void intest() {
			System.out.println("Outclass snum"+snum+  " (외부클래스의 static 변수)");
			System.out.println("Inclass sinnum"+sinnum+  " (내부클래스의 static 변수)");
			System.out.println("Inclass innum"+innum+  " (내부클래스의 인스턴스 변수)");
			
		}
		
		static void stest() {
			System.out.println("Outclass snum"+snum+" (외부클래스의 static 변수)");
			System.out.println("Inclass sinnum"+sinnum+" (내부클래스의 static 변수)");
		}
	}// Outclass 끝 
	}

	
	
	