package haya;

import java.util.Scanner;

public class nn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		int count=0;
		int a=30;
		
		System.out.println("�ֻ����� �����ּ���.");
		System.out.println("------------------------------");
		
		for(int i=0; i<=30; i++) {
			int num=(int)(Math.random()*6)+1;
			sum=sum+num;
			count++;
			System.out.println(num+"ĭ ����,"+(a-sum)+"ĭ ���ҽ��ϴ�");
		
			
			System.out.println();
			if(sum>=30) {
				System.out.println("(����)���̵�Ƚ��:"+count);
				break;
				
				
			}
			System.out.println("------------------------------");
			
		}

	}

}
