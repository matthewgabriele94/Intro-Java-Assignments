package arraylists;

import java.util.ArrayList;

import vehicles.*;

public class VehicleArraylist {
	
	//Part B - Function
	public static double avgCargoSpace(ArrayList<Vehicle> inArray) {
		double sum = 0, count = 0;
		for(Vehicle m : inArray) {
			if(m instanceof Car) {
				sum+= m.getCargoSpace();
				count++;
			}
		}
		return sum / count;
	}
	
	//Part C - Function
	public static void printMatchingObjects(ArrayList<Vehicle> inArray, Car inCar) {
		for(int i = 0; i < inArray.size(); i++) {
			if(inArray.get(i) instanceof Car) {
				Car cr  = (Car)inArray.get(i);
				if(cr.equals(inCar) && cr.getId() == inCar.getId()) {
					System.out.println("Same object as blueCar: \n" + cr.toString());
					System.out.println();
					inArray.remove(i);
					i--;
				}
				else if(cr.equals(inCar)) {
					System.out.println("Other object matching blueCar: \n" + cr.toString());
					System.out.println();
					inArray.remove(i);
					i--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// this ArrayList MUST be parameterized
		
		ArrayList<Vehicle> vehiclesArrayList = new ArrayList<>();
		
		//Part A
		String[] motorArr1 = {"grip warmers","usb charger"};
		
		
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		Car blueCar = new Car("blue", 20, 4);
		vehiclesArrayList.add(new Motorcycle("red", motorArr1));
		vehiclesArrayList.add(blueCar);
		vehiclesArrayList.add(new Car("blue", 20, 4));
		vehiclesArrayList.add(new Bicycle(2, "black", 0, false));
		vehiclesArrayList.add(new CargoCycle(3, "green", 10, false));
		vehiclesArrayList.add(new CargoCycle(3, "green", 10, false));
		vehiclesArrayList.add(new Car("gray", 10, 2));
		vehiclesArrayList.add(new Car("white", 25, 4));
		
		//Part B
		double avgCargoSpaceTest = avgCargoSpace(vehiclesArrayList);
		System.out.println("Part B:");
		System.out.println("Average Car object cargo space: " + avgCargoSpaceTest);
		System.out.println();
	
        //Part C
		System.out.println("Part C:");
		printMatchingObjects(vehiclesArrayList, blueCar);
		
		
		//Part D
		System.out.println("Part D:");
		System.out.println("Remaining objects in vehiclesArrayList:");
		
		for(int i = 0; i < vehiclesArrayList.size(); i++) {
			System.out.println(vehiclesArrayList.get(i).toString());
		}
	}

}
