package 굳2월13일;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent ez=new EzenStudent();
		System.out.println(ez);
		ez.setPoint("인천");
		ez.setName("홍길동");
		ez.setGroup("JAVA");
		ez.setPhone("010-1111-1111");
		System.out.println(ez);
		
		EzenStudent ez2=new EzenStudent("서울", "손주영", "html", "010-2222-2222");
		System.out.println(ez2);
		
		

	}

}

	class EzenStudent{
		private String point;
		private String name;
		private String group;
		private String phone;
	
	
	public EzenStudent() {}
	public EzenStudent(String point, String name, String group, String phone) {
		this.point=point;
		this.name=name;
		this.group=group;
		this.phone=phone;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "EzenStudent [point=" + point + ", name=" + name + ", group=" + group + ", phone=" + phone + "]";
	}
	
}