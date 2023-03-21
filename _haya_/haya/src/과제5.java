import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class 과제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		//로또번호 생성
		HashSet<Integer>lottonum = new HashSet<Integer>();
		Random random=new Random();
		while(lottonum.size()<6) {
			int num= random.nextInt(45)+1;
			lottonum.add(num);
		}
		//사용자 입력 로또번호
		System.out.println("로또 번호를 입력하세요( 1~45 중 6개)");
		HashSet<Integer>mynum = new HashSet<Integer>();
		for(int i=0; i<6; i++) {
			int num = scan.nextInt();
			mynum.add(num);
		}
		//로또번호 비교
		int cnt=0;
		for(int num:mynum) {
			if(lottonum.contains(num)) {
				cnt++;
			}
		}
		
		boolean check = mynum.contains(lottonum.iterator().next());
		switch(cnt) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			if(check) {
				System.out.println("2등");
			}else {
				System.out.println("3등");
			}
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
			default:
				System.out.println("꽝");
				break;
		}
		//로또번호와 보너스 번호
		System.out.print("로또번호 : ");
		for(int num:lottonum) {
			System.out.print(num+" ");
		}
		System.out.print("보너스번호 : "+lottonum.iterator().next());

	}

}
