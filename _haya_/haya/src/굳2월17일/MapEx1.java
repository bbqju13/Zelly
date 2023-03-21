package 굳2월17일;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		/* map에 상품과 가격을 입력받고, 출력
		 * 총 지불가격 출력
		 * 입력 =>메서드, 출력=>메서드 로 구현
		 * */
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		MapEx1 ex= new MapEx1();
		ex.make(map);
		ex.print(map);
		
		
	}
	public void make(HashMap<String, Integer>map) {
		int size=3;
		while(map.size()<size) {
		System.out.println("상품명:");
		String product=scan.next();
		System.out.println("가격:");
		int price=scan.nextInt();
		
		map.put(product, price);
		}
	}
	
	public void print(HashMap<String, Integer>map) {
		Iterator<String>it=map.keySet().iterator();
		int sum=0;
		while(it.hasNext()) {
			String key=it.next();
			Integer value=map.get(key);
			sum+=value;
		}
		System.out.println("총금액: "+sum);
	}

}
