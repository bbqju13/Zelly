package 굳2월10일;

public class CardPack {
	private Card[]pack=new Card[52];
	private int cnt=52;


public void shuffle() {
	int min = 0;
	int max = pack.length-1;
	for(int i=0; i<pack.length; i++) {
		int index = (int)(Math.random()*(max-min+1))+min;
		Card tmp = pack[i];
		pack[i] = pack[index];
		pack[index] = tmp;
	}
}
public Card Pick() {
	if(cnt==0) {
		return null;
	}
	cnt--;
	return pack[cnt];
}
public void init() {
	cnt=52;
}
public void CardPack() {
	char shape='♥';
	for(int i=1; i<=4; i++) {
		switch(shape) {
		case 1: shape='♥';
		break;
		case 2: shape='◆';
		break;
		case 3: shape='♠';
		break;
		case 4: shape='♣';
		break;
	}
}
	for(int j=1; j<=13; j++) {
		Card c=new Card();
		c.setShape(shape);
		c.setNum(j);
		pack[cnt]=c;
		cnt++;
	}
}

}
