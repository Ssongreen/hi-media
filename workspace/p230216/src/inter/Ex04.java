package inter;

import javax.print.attribute.standard.PrinterName;

interface Vehicle{
	void printNumber();
}

class Car implements Vehicle{
	int carNumber;
	
	public Car() {
	}


	public Car(int carNumber) {
		this.carNumber = carNumber;
	}
		
	
	public void printNumber() {
		System.out.println("자동차 등록번호" + carNumber);
	}
	public void drive() {
		System.out.println("자동차가 고속도로로 주행해요 \n");
	}
}
class Yacht implements Vehicle{
	int yachtNumber;
	
	public Yacht() {
	}
	public Yacht(int yachtNumber) {
		this.yachtNumber = yachtNumber;
	}
	public void printNumber() {
		System.out.println("요트 등록번호" + yachtNumber);
		
	}
	public void sail() {
		System.out.println("요트가 한강 위에 있어요 \n");
	}
}


public class Ex04 {

	public static void main(String[] args) {
		Vehicle[] myVehicle = {8586,679111};
		myVehicle[0] =  new Car(8586);
		myVehicle[1] =  new Yacht(679111);
		
		for(int index = 0; index < myVehicle.length; index++) {
			myVehicle[index].printNumber();
			
			if(myVehicle[index] instanceof Car) {
				((Car)myVehicle[index]).drive();
				
			}else if (myVehicle[index] instanceof Yacht) {
				((Yacht)myVehicle[index]).sail();
			}
		}
		
		
		// 반복문 사용
		// drive method 와 sail method 호출
		// printNumber method 정의 후 호출
		/*
		 * <실행 결과>
		 * 자동차 등록번호 : 8586
		 * 자동차가 고속도로를 달립니다. \n
		 * 
		 * 요트 등록번호 : 679111
		 * 요트가 한강 위를 떠 다닙니다.\n
		 * 
		 * 
		 */
	}

}
