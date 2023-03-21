package 굳2월13일;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.setColor("RED");
		c.setDoor(2);
		c.setPower(true);
		c.setAirback(true);
		c.print();
		System.out.println(c);
		System.out.println("=====");
		Car c2=new Car("BLACK", 4, true);
		c2.setPower(true);
		c2.print();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
	}

}
	class Car{ //멤버변수: color, door, airback, power, speed
		
		private String color;
		private int speed;
		private int door;
		private boolean airback;
		private boolean power;
		
		//생성자 : 빈생성자, color, (color, door), (color, door, airback), 전체 생성자
		public Car() {}
		public Car(String color) {
			this.color=color;
		}
		public Car(String color, int door) {
			this.color=color;
			this.door=door;
		}
		public Car(String color, int door, boolean airback) {
			this.color=color;
			this.door=door;
			this.airback=airback;
		}
		//생성자 자동생성
		public Car(String color, int door, boolean airback, int speed, boolean power) {
			this.color=color;
			this.door=door;
			this.airback=airback;
			this.speed=speed;
			this.power=power;
		}
		
		//method : print, powerOn, powerOff, speedUp, speedDown
		public void print() {
			//멤버변수는 내클래스에서 모든 메서드에서 공유되는 변수
			//멤벼변수를 매개변수로 받을 필요가 없음.
			System.out.println("MY CAR");
			System.out.println(color);
			System.out.println("문짝:"+door);
			System.out.println(power);
			System.out.println(airback);
			
		}
		public void powerOn() {
			System.out.println("시동ON");
			power=true;
		}
		public void powerOff() {
			System.out.println("시동OFF");
			power=false;
		}
		public void speedUp() {
			if(power) {
				speed=speed+10;
				System.out.println("속도:"+speed);
			}else {
				System.out.println("시동OFF");
				System.out.println("시동을 걸어주세요.");
			}
		}
		public void speedDown() {
			if(speed<=0) {
				speed=0;
			}else {
				speed=speed-10;
			}
			System.out.println("속도"+speed);
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getDoor() {
			return door;
		}
		public void setDoor(int door) {
			this.door = door;
		}
		public boolean isAirback() {
			return airback;
		}
		public void setAirback(boolean airback) {
			this.airback = airback;
		}
		public boolean isPower() {
			return power;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		
	}
