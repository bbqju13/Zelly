package 굳2월9일;

public class Class2 {

	public static void main(String[] args) {
		/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
		 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
		 * 숫자 : 1~10 J(11) Q(12) K(13)
		 * 
		 * 클래스의 구성
		 * - 멤버변수 : char shape, int num
		 * - 메서드 : print(1♥)
		 * - getter/setter
		 * - 생성자 : 하트1 (1♥)
		 * 
		 * 생성자 선언 방법
		 * public 클래스명(){  //매개변수는(필요하면 생성) 없을수도 있음. 
		 * 초기값;
		 * }
		 * */
		Card c=new Card();
		c.print();
		System.out.println();
		c.setshape('♣');
		c.setnum(5);
		c.print();
		System.out.println();
		c.setshape('*');
		c.setnum(99);
		c.print();
		
	}

}
 class Card{
	private char shape;
	private int num;
	public Card() {
		shape='♥';
		num=1;
	}
	public void print() {
	switch(num) {
	case 11: System.out.println("J");
		break;
	case 12: System.out.println("Q");
		break;
	case 13: System.out.println("K");
		break;
	default:
		System.out.print(num);
		}
	System.out.println(shape);
	}
	public char getshape() {
		return shape;
	}
	public void setshape(char shape) {
		switch(shape) {
		case '♥':case '♣': case '♠': case '◆':
		this.shape=shape;
		break;
		default:
		this.shape='♥';
		}
	}
	public int getnum() {
		return num;
	}
	public void setnum(int num) {
		if(num<1||num>13) {
			this.num=1;
		}else {
			this.num=num;
		}
	}
 }
 	
