package 과제2;

public interface Car {
	void poweron(); // 시동켜기
	void poweroff(); // 시동끄기
	void speedup();
	void speeddown();
	void wiperon(); // 와이퍼켜기
	void wiperoff(); // 와이퍼끄기
	

}
 	class SamSung{
 		protected String logo="SamSung";
 		
 	}
 		class SamSungCar extends SamSung implements Car{
 			private boolean poweron;
 			private boolean wiperon;
 			private int speed;
 			
 			public SamSungCar() {
 				poweron=true;
 				speed=0;
 				wiperon=true;
 			}

			@Override
			public void poweron() {
				// TODO Auto-generated method stub
				if(poweron) {
					System.out.println("시동이켜짐.");
					poweron=true;
				}else {
					System.out.println("이미 시동이켜져있음.");
				}
				
			}

			@Override
			public void poweroff() {
				// TODO Auto-generated method stub
				if(poweron) {
					System.out.println("시동이꺼짐");
					poweron=false;
					speed=0;
				}else {
					System.out.println("이미 시동이꺼져있음");
				}
				
			}

			@Override
			public void speedup() {
				// TODO Auto-generated method stub
				if(poweron) {
					speed+=10;
					System.out.println("속도올림: "+speed);
				}else {
					System.out.println("시동을먼저 켜주세요.");
				}
				
			}

			@Override
			public void speeddown() {
				// TODO Auto-generated method stub
				if(poweron) {
					if(speed>0) {
						speed-=10;
						System.out.println("속도내림: "+speed);
					}else{
						System.out.println("더이상줄일수없음.");
					}
				}
				
			}

			@Override
			public void wiperon() {
				// TODO Auto-generated method stub
				if(poweron) {
					if(wiperon) {
						System.out.println("와이퍼켜짐.");
						wiperon=true;
					}else {
						System.out.println("시동을먼저 켜주세요.");
					}
				}
				
			}

			@Override
			public void wiperoff() {
				// TODO Auto-generated method stub
				if(poweron) {
					if(wiperon) {
						System.out.println("와이퍼꺼짐");
						wiperon=false;
					}else {
						System.out.println("이미 와이퍼가 꺼짐.");
					}
				}
				
			}
 			
 			
 		}
 		
