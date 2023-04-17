package arraylists;

import java.util.ArrayList;

import vehicles.*;

public class MidtermQ9 {
	
	public static void checkThis(ArrayList<Vehicle> ve) {
		for(Vehicle v : ve) {
			v.setWheels(3);
		}
	}
	
	public static void checkThis2(ArrayList<? extends Vehicle> ve) {
		for(Vehicle v : ve) {
			v.setWheels(3);
		}
	}
	
	public static void main(String[] args) {
		// this ArrayList MUST be parameterized
		ArrayList<Vehicle> vehiclesArrayList = new ArrayList<>();
			
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		String[] accessories =  {"grip warmers", "usb charger"};
		
		Motorcycle m = new Motorcycle( accessories, "red");
		
		Car blueCar = new Car(4, "blue", 20);
		Car blueCar2 = new Car(4, "blue", 20);
		Bicycle b = new Bicycle(false, "black");
		CargoCycle c = new CargoCycle(3, 10);
		CargoCycle c1 = new CargoCycle(3, 10);
		Car grayCar = new Car(2, "gray", 10);
		Car whiteCar = new Car(4, "white", 25);
		vehiclesArrayList.add(m);
		vehiclesArrayList.add(blueCar);
		vehiclesArrayList.add(blueCar2);
		vehiclesArrayList.add(b);
		vehiclesArrayList.add(c);
		vehiclesArrayList.add(c1);
		vehiclesArrayList.add(grayCar);
		vehiclesArrayList.add(whiteCar);
		double totalCargoSpace = 0;
		for (Vehicle v: vehiclesArrayList) {
			totalCargoSpace += v.getCargoSpace();
		}
		System.out.println("length of vehicles array list is " + vehiclesArrayList.size());
		double averageCargoSpace = totalCargoSpace/vehiclesArrayList.size();
		System.out.println("average cargo space is " + averageCargoSpace);
		
		checkThis(vehiclesArrayList);
		
		for(Vehicle v : vehiclesArrayList) {
			System.out.println(v.toString());
		}
		
		ArrayList<Car> carsArrayList = new ArrayList<>();
		carsArrayList.add(blueCar);
		carsArrayList.add(blueCar2);
		carsArrayList.add(grayCar);
		carsArrayList.add(whiteCar);
		
		checkThis2(carsArrayList);
		
		System.out.println();
		for(Vehicle v : carsArrayList) {
			System.out.println(v.toString());
		}
		
	}

}
