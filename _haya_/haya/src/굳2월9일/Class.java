package 굳2월9일;

public class Class {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn, powerOff, speedUp +10, speedDown -10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 * */
		Car c=new Car("검정");
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		
		c.setColor("하늘색");
		System.out.println(c.getColor());
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
	}

}
 class Car{
	 private String color;
	 private boolean power;
	 private int speed;
	 public Car(String color) {
		 this.color=color;
	 }

	 public void powerOn() {
		 System.out.println("시동 ON");
		 power=true;
		 
		 }
	 public void powerOff() {
		 System.out.println("시동 OFF");
		 power=false;
	 }
	 public void speedUp() {
		 if(power) {
			 speed=speed+10;
			 System.out.println("속도:"+speed);
		 }else {
			 System.out.println("시동이꺼졌습니다.");
			 System.out.println("시동을 다시 켜주세요.");			 
		 }
	 }
	 public void speedDown() {
		 if(speed<=0) {
			 speed=0;
		 }else {
			 speed=speed-10;
		 }
		 System.out.println("속도:"+((speed<=0)?0:speed));
	 }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = "검정";
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	 
 }
 
