package studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StudentManager implements Program {
	// 학생 리스트를 저정할 arraylist 선언
	private ArrayList<Student> stdlist = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);

	public void printStudent() {
		System.out.println("= 학생리스트 =");
		for (Student s : stdlist) {
			s.stdPrint();
			System.out.println("=========");
		}

	}

	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub

		System.out.println("학생 이름을 입력하세요.");
		System.out.println("이름 :");
		String stdName = scan.next();

		System.out.println("학번을 입력하세요.");
		System.out.println("학번 :");
		String stdNum = scan.next();

		System.out.println("전공을 입력하세요.");
		System.out.println("전공 :");
		String major = scan.next();

		Student s = new Student(stdName, stdNum, major);
		stdlist.add(s);

	}

	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생 검색 :");
		String searchname = scan.next();
		int index = -1;
		for (int i = 0; i < stdlist.size(); i++) {
			if (stdlist.get(i).getStdName().equals(searchname)) {
				printStudentOne(stdlist.get(i));
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("해당 학생 없음");
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println("수강신청 학생명 :");
		String name = scan.next();
		for (int i = 0; i < stdlist.size(); i++) {
			if (name.equals(stdlist.get(i).getStdName())) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("학생 정보 없음");
		} else {
			System.out.println("수강신청 과목번호 :");
			String sNum = scan.next();
			System.out.println("수강신청 과목명 :");
			String sName = scan.next();
			System.out.println("수강신청 학점 :");
			double sPoint = scan.nextDouble();

			Subject sb = new Subject(sNum, sName, sPoint);
			stdlist.get(index).insertSubject(sb);
		}

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println("수강철회 학생명 :");
		String name = scan.next();
		for (int i = 0; i < stdlist.size(); i++) {
			if (name.equals(stdlist.get(i).getStdName())) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("학생 정보 없음");
		}else {
			System.out.println("수강철회 :");
			String sName = scan.next();
			stdlist.get(index).deleteSubject(sName);
		}

	}

	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stdPrint();
		System.out.println("--수강정보--");
		s.subPrint();
	}

}
