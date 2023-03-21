package 굳2월6일;

public class arrayex2 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr 를 생성후 출력.
		 * */
		int arr[]=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		//배열을 섞는코드 random을 활용하여
		//방법: 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환.
		int min=0;
		int max=arr.length;
		for(int i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*max)+min; // 0~10개
			//arr[0], arr[random] 번지 교환.
			int tmp=arr[i]; //0번지의 값 tmp 로 이동.
			arr[i]=arr[random];
			random=arr[i];
		}
		//섞은후
		System.out.println("--섞은후--");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("오름차순으로 정렬");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { //  (오름차순)< 표시만 바꿔주면 오름 내림 차순으로 할수있음. 
					int tem=arr[i]; //  (내림차순)>
					arr[i]=arr[j];
					arr[j]=arr[i];
					
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------------");
	}

}
