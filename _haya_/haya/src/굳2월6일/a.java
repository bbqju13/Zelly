package ��2��6��;

public class a {

	public static void main(String[] args) {
		/*  5�� ���� ������ �迭�� ������
		 * 1~50������ �������� ������ ���.
		 * */
		
		//1. �迭�� index Ž��.
		int arr[]=new int[6];
		//for �迭�� index Ž��.
		for(int i=0; i<arr.length; i++) {
			//���� �� �迭�� ����.
			arr[i]=(int)(Math.random()*45+1);
			//������ ���.
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("�������� ����");
		for(int i=0; i<arr.length; i++) { //0 1 2 3
			for(int o=0; o<arr.length; o++) {
				if(arr[i]>arr[o]) {
				int tmp=arr[i]; //��������.
				//��ȯ.
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
		System.out.println("���� for��");
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
}
}
