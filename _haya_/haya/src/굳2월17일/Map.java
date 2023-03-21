package 굳2월17일;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key/value 값으로 저장
		 *  key는 중복불가. value 는 중복가능
		 *  HashMap을 가장 많이 사용.
		 *  
		 *  HashMap<String, Integer>map=new HashMap<String, Integer>();
		 *  Map 은 값이2개여서 Iterator를 사용할수 없음.
		 *  Map => Set으로 변경 후 출력.
		 *  
		 *  list, set=> .add(); .get(index); // 추가 / 추출
		 *  map => .put(); // 추가
		 *  getkey();, getvalue(); // 추출
		 * */
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		map.put("햄버거", 8500);
		map.put("피자", 12500);
		map.put("과자", 8200);
		map.put("음료수", 8500);
		map.put("사탕", 500); // key 사탕이 중복되서 안나옴.
		map.put("사탕", 700);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key값만출력
		System.out.println(map.values()); //value값만출력
		System.out.println(map.get("햄버거")); // key값이 "햄버거"인 value값 출력
		System.out.println();
		System.out.println("======================");
		
		System.out.println("=Iterator출력=");
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		System.out.println("================");
		System.out.println("=향상된for문=");
		int sum=0;
		for(String tmp:map.keySet()) {
			sum+=map.get(tmp);
			System.out.println(tmp+" : "+map.get(tmp));
		}
		System.out.println("총금액"+sum);
		System.out.println("========================");
		
		
		
		

		
	}

}
