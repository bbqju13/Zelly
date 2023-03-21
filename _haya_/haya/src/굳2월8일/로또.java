package ��2��8��;

public class �ζ� {

	public static void main(String[] args) {
		/* �ζǹ�ȣ�� ���� (1~45���� �������� ��ȣ�� ����)

		 * �ζǹ�ȣ = ����ڹ�ȣ 6�ڸ� (1~45) : �ڵ���ȣ

		 * ��÷��ȣ = ��÷��ȣ 6�ڸ�+1�ڸ�(���ʽ���ȣ) (1~45)

		 * 

		 * ����ڹ�ȣ, ��÷��ȣ�� �������� �߻�����

		 * �ζ��� ����� Ȯ��

		 * */
		// �迭�� main ���� ����.
		
		int lotto[]=new int[7];
		int user[]=new int[6];
		ranarry(lotto);
		ranarry(user);
		System.out.println("��÷��ȣ");
		print(lotto);
		System.out.println("����ȣ");
		print(user);
		
		int rank=rank(lotto, user);
		if(rank==-1) {
			System.out.println("��");
		}else {
			System.out.println(rank+"��÷");
		}
		
	}
	/* 1. ��ȣ �������� ���� ���.

	 * 1~45������ ������ȣ ������ ����

	 * ����Ÿ�� : int

	 * �Ű����� : ���� 

	 * �޼���� : random

	 * */
	public static int random() {
		return (int)(Math.random()*45)+1;
	}
	/* 2. ���� ��ȣ�� �迭�� �����ϴ� ���.

	 * ����Ÿ�� : void

	 * �Ű����� : int arr[] (lotto ot user)

	 * �޼���� : ranarry

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
	/* 3. ���� �迭�� �ֿܼ� ����ϴ� ���.

	 * ����Ÿ�� : void

	 * �Ű����� : int arr[]

	 * �޼���� : print

	 * */
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/* 4. �������� �����ʰ� üũ

	 * ����Ÿ�� : boolean

	 * �Ű����� : int arr[], random

	 * �޼���� : isCon

	 * */
	public static boolean isCon(int arr[], int random) {
		for(int tmp:arr) {
			if(tmp==random) {
				return true;
			}
		}
		return false;
	}
	/* 5. ��� üũ�ϴ� ���.

	 * ����Ÿ�� : int ��� ����

	 * �Ű����� :

	 * �޼���� : Rank

	 * 

	 * --��÷����

	 * 6����ġ : 1��

	 * 5����ġ + ���ʽ� : 2��

	 * 5����ġ : 3��

	 * 4����ġ : 4��

	 * 3����ġ : 5��

	 * ������ ��~

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
