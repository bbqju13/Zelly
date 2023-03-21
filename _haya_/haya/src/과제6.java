
public class 과제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hanimal=new Human();
		Animal banimal=new Bear();
		Animal danimal=new Dog();
		
		Animal[] animalList = new Animal[10];
		int cnt=0;
		animalList[cnt]=hanimal;
		cnt++;
		animalList[cnt]=banimal;
		cnt++;
		animalList[cnt]=danimal;
		cnt++;
		
		과제6 test=new 과제6();
		test.moveanimal(animalList, cnt);
		System.out.println("--DownCasting----");
		test.testDownCasting(animalList, cnt);

	}
	public void moveanimal(Animal[] animal, int cnt) {
		for(int i=0; i<cnt; i++) {
			animal[i].move();
			
		}
	}
	
	public void testDownCasting(Animal[] list, int cnt) {
		for(int i=0; i<cnt;i++) {
			Animal animal = list[i];
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.cry();
			}else if(animal instanceof Bear) {
				Bear bear = (Bear)animal;
				bear.cry();
			}else if(animal instanceof Dog) {
				Dog dog = (Dog)animal;
				dog.play();
			}else {
				System.out.println("error");
			}
		}
	}
		
	
}



 	class Animal{
 		public void move() {
 			System.out.println("동물들이 움직입니다.");
 		}
 		public void eat() {
 			System.out.println("동물들이 밥을 먹습니다.");
 		}
 	}
 	class Human extends Animal{
 		public void move() {
 			System.out.println("사람이 두발로 걷습니다.");
 		}
 		public void eat() {
 			System.out.println("사람이 밥을 먹습니다.");
 		}
 		public void cry() {
 			System.out.println("사람이 엉엉 웁니다.");
 		}
 	}
 	class Bear extends Animal{
 		public void move() {
 			System.out.println("곰이 네발로 걷습니다.");
 		}
 		public void eat() {
 			System.out.println("곰이 꿀을 먹습니다.");
 		}
 		public void cry() {
 			System.out.println("곰이 쿠와앙 포효합니다.");
 		}
 	}
 	class Dog extends Animal{
 		public void move() {
 			System.out.println("강아지가 뛰어다닙니다.");
 		}
 		public void eat() {
 			System.out.println("강아지가 사료를 먹습니다.");
 		}
 		public void play() {
 			System.out.println("강아지가 공놀이를 합니다.");
 		}
 	}
