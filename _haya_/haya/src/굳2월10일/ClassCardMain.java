package 굳2월10일;

public class ClassCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c=new Card();
		CardPack cp=new CardPack();
		
		c.print();
		cp.shuffle();
		System.out.println();
		System.out.println("====================");
		cp.init();
		c.print();
		}
	}

