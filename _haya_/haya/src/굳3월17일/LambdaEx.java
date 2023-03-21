package 굳3월17일;

import java.util.ArrayList;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = add(3,5);
		System.out.println(res);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(16);
		num.add(61);
		num.add(41);
		num.add(31);
		System.out.println("for를 이용한 출력");
		for(Integer i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Lambda 형태로 출력
		System.out.println("Lambda를 이용한 출력");
		num.forEach((n)->
		System.out.print(n+" ")
				);
		
		//메서드를 직접 참조
		System.out.println("메서드를 직접 참조");
		num.forEach(System.out::println);
		System.out.println("-numlist 총 개수-");
		System.out.println(num.stream().count());
	}
	public static int add(int x, int y) {
		return x+y;
	}

}
