package ��2��9��;

public class Class {

	public static void main(String[] args) {
		/* �ڵ��� Ŭ���� ����
		 * ������� : color, power, speed
		 * �޼��� : powerOn, powerOff, speedUp +10, speedDown -10
		 * ������� : private
		 * ��������� Ȯ��/���� => getter/setter �ʿ�
		 * */
		Car c=new Car("����");
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		
		c.setColor("�ϴû�");
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
		 System.out.println("�õ� ON");
		 power=true;
		 
		 }
	 public void powerOff() {
		 System.out.println("�õ� OFF");
		 power=false;
	 }
	 public void speedUp() {
		 if(power) {
			 speed=speed+10;
			 System.out.println("�ӵ�:"+speed);
		 }else {
			 System.out.println("�õ��̲������ϴ�.");
			 System.out.println("�õ��� �ٽ� ���ּ���.");			 
		 }
	 }
	 public void speedDown() {
		 if(speed<=0) {
			 speed=0;
		 }else {
			 speed=speed-10;
		 }
		 System.out.println("�ӵ�:"+((speed<=0)?0:speed));
	 }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = "����";
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
 
