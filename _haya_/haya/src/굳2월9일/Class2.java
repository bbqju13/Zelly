package ��2��9��;

public class Class2 {

	public static void main(String[] args) {
		/* Card Ŭ���� : ��Ŀ���ӿ��� ����ϴ� ī�带 ��Ÿ���� Ŭ����
		 * ��� : ��Ʈ(��), Ŭ�ι�(��), �����̵�(��), ���̾�(��)
		 * ���� : 1~10 J(11) Q(12) K(13)
		 * 
		 * Ŭ������ ����
		 * - ������� : char shape, int num
		 * - �޼��� : print(1��)
		 * - getter/setter
		 * - ������ : ��Ʈ1 (1��)
		 * 
		 * ������ ���� ���
		 * public Ŭ������(){  //�Ű�������(�ʿ��ϸ� ����) �������� ����. 
		 * �ʱⰪ;
		 * }
		 * */
		Card c=new Card();
		c.print();
		System.out.println();
		c.setshape('��');
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
		shape='��';
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
		case '��':case '��': case '��': case '��':
		this.shape=shape;
		break;
		default:
		this.shape='��';
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
 	
