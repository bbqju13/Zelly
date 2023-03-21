package 굳3월20일;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,9,4,3,6,4,8,2};
		Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().forEach(System.out::println);
		
		// 짝수배열
		int res[] = Arrays.stream(arr).filter(n->n%2==0).distinct().sorted().toArray();
		System.out.println("------------------");
		for(int tmp : res) {
			System.out.print(tmp+" ");
		}
		int sum = Arrays.stream(arr).reduce(1, (a,b)->a*b);
		System.out.println();
		System.out.println(sum);

	}

}
