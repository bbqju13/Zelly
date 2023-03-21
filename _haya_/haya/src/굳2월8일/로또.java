package 굳2월8일;

public class 로또 {

	public static void main(String[] args) {
		/* 로또번호를 생성 (1~45까지 랜덤으로 번호를 생성)

		 * 로또번호 = 사용자번호 6자리 (1~45) : 자동번호

		 * 당첨번호 = 당첨번호 6자리+1자리(보너스번호) (1~45)

		 * 

		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜

		 * 로또의 등수를 확인

		 * */
		// 배열은 main 에서 생성.
		
		int lotto[]=new int[7];
		int user[]=new int[6];
		ranarry(lotto);
		ranarry(user);
		System.out.println("당첨번호");
		print(lotto);
		System.out.println("내번호");
		print(user);
		
		int rank=rank(lotto, user);
		if(rank==-1) {
			System.out.println("꽝");
		}else {
			System.out.println(rank+"당첨");
		}
		
	}
	/* 1. 번호 랜덤으로 생성 기능.

	 * 1~45범위의 랜덤번호 생성후 리턴

	 * 리턴타입 : int

	 * 매개변수 : 없음 

	 * 메서드명 : random

	 * */
	public static int random() {
		return (int)(Math.random()*45)+1;
	}
	/* 2. 랜덤 번호를 배열에 저장하는 기능.

	 * 리턴타입 : void

	 * 매개변수 : int arr[] (lotto ot user)

	 * 메서드명 : ranarry

	 * */
	public static void ranarry(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int r=random();
			if(!isCon(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
	}
	/* 3. 정수 배열을 콘솔에 출력하는 기능.

	 * 리턴타입 : void

	 * 매개변수 : int arr[]

	 * 메서드명 : print

	 * */
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/* 4. 같은값이 들어가지않게 체크

	 * 리턴타입 : boolean

	 * 매개변수 : int arr[], random

	 * 메서드명 : isCon

	 * */
	public static boolean isCon(int arr[], int random) {
		for(int tmp:arr) {
			if(tmp==random) {
				return true;
			}
		}
		return false;
	}
	/* 5. 등수 체크하는 기능.

	 * 리턴타입 : int 등수 리턴

	 * 매개변수 :

	 * 메서드명 : Rank

	 * 

	 * --당첨기준

	 * 6개일치 : 1등

	 * 5개일치 + 보너스 : 2등

	 * 5개일치 : 3등

	 * 4개일치 : 4등

	 * 3개일치 : 5등

	 * 나머지 꽝~

	 * */
	public static int rank(int lotto[], int user[]) {
		if(lotto.length<=user.length) {
			return -1;
		}
		int cnt = 0;
		for(int i=0; i<user.length; i++ ) {
			if(isCon(user, lotto[i])) {
				cnt++;
			}
		}
		switch(cnt) {

		case 6: return 1;

		case 5:

			if(isCon(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
		case 4: return 4;

		case 3: return 5;

		    default: return -1;
	}
}
}
