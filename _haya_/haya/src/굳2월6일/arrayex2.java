package ��2��6��;

public class arrayex2 {

	public static void main(String[] args) {
		/* 1~10���� ����ִ� �迭 arr �� ������ ���.
		 * */
		int arr[]=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		//�迭�� �����ڵ� random�� Ȱ���Ͽ�
		//���: ������ ����(0~arr.length)�� �����ؼ� �ٸ� ������ ��ȯ.
		int min=0;
		int max=arr.length;
		for(int i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*max)+min; // 0~10��
			//arr[0], arr[random] ���� ��ȯ.
			int tmp=arr[i]; //0������ �� tmp �� �̵�.
			arr[i]=arr[random];
			random=arr[i];
		}
		//������
		System.out.println("--������--");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("������������ ����");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { //  (��������)< ǥ�ø� �ٲ��ָ� ���� ���� �������� �Ҽ�����. 
					int tem=arr[i]; //  (��������)>
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
