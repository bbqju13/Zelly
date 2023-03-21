package 굳2월6일;

public class a {

	public static void main(String[] args) {
		/*  5개 값을 가지는 배열을 생성후
		 * 1~50사이의 랜덤값을 저장후 출력.
		 * */
		
		//1. 배열의 index 탐색.
		int arr[]=new int[6];
		//for 배열의 index 탐색.
		for(int i=0; i<arr.length; i++) {
			//랜덤 값 배열에 저장.
			arr[i]=(int)(Math.random()*45+1);
			//랜덤값 출력.
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("오름차순 정리");
		for(int i=0; i<arr.length; i++) { //0 1 2 3
			for(int o=0; o<arr.length; o++) {
				if(arr[i]>arr[o]) {
				int tmp=arr[i]; //오름차순.
				//교환.
				arr[i]=arr[o];
				arr[o]=tmp;
				}
		}
	}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("향상된 for문");
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
}
}
