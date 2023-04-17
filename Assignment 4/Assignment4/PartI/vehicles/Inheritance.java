package vehicles;

import java.util.ArrayList;
import java.util.Arrays;

public class Inheritance {
	
	public static String[] removeDuplicates(String a[], int n){
        if (n == 0 || n == 1) {
            return a;
        }
        
        String[] temp = new String[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i].equals(a[i + 1]) == false) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
        String[] retArr = new String[j];
        
        for(int i = 0; i < j; i++) {
        	retArr[i] = temp[i];
        }
 
        return retArr;
	}

	public static void main(String[] args) {
		
		//TESTS FOR PART 1
		
		/*
		Vehicle vtest = new Vehicle(4,"purple",2,"accelerating");
		Vehicle vtest2 = new Vehicle(4,"green",2,"accelerating");
		Vehicle vtest3 = new Vehicle();
		Vehicle vtest4 = new Vehicle();
		
		Car carTest = new Car("green", 2.0, 4);
		Car carTest2 = new Car("orange", 25.0, 4);
		Car carTest3 = new Car(4);
		Car carTest4 = new Car(4);
		Car carTest5 = new Car();
		Car carTest6 = new Car();
		
		String[] motorAccs = {"grip warmers", "usb charger", "usb chargers"};
		String[] motorAccs2 = {"usb chargers", "usb charger", "GRIP WARMERs"};
		Motorcycle motorTest = new Motorcycle("purple", motorAccs);
		Motorcycle motorTest2 = new Motorcycle("orange", motorAccs2);
		Motorcycle motorTest3 = new Motorcycle(motorAccs);
		Motorcycle motorTest4 = new Motorcycle(motorAccs2);
		Motorcycle motorTest5 = new Motorcycle();
		Motorcycle motorTest6 = new Motorcycle();
		
		Bicycle bikeTest = new Bicycle(2, "magenta", 0, false);
		Bicycle bikeTest2 = new Bicycle(2, "orange", 0, true);
		Bicycle bikeTest3 = new Bicycle(true);
		Bicycle bikeTest4 = new Bicycle(true);
		Bicycle bikeTest5 = new Bicycle();
		Bicycle bikeTest6 = new Bicycle();
		
		CargoCycle cargoBikeTest = new CargoCycle(4, "purple", 3, false);
		CargoCycle cargoBikeTest2 = new CargoCycle(3, "orange", 12, true);
		CargoCycle cargoBikeTest3 = new CargoCycle(false);
		CargoCycle cargoBikeTest4 = new CargoCycle(false);
		CargoCycle cargoBikeTest5 = new CargoCycle();
		CargoCycle cargoBikeTest6 = new CargoCycle();
		
		
		//Vehicle Tests
		
		System.out.println("Vehicle Checks:");
		System.out.println(vtest.getId());
		System.out.println(vtest.getColor());
		System.out.println(vtest.getNumWheels());
		System.out.println(vtest.getCargoSpace());
		System.out.println(vtest.getMotion());
		vtest.setColor("green");
		System.out.println(vtest.getColor());
		vtest.setCargoSpace(25);
		System.out.println(vtest.getCargoSpace());
		
		System.out.println(vtest3.getId());
		System.out.println(vtest3.getColor());
		System.out.println(vtest3.getNumWheels());
		System.out.println(vtest3.getCargoSpace());
		System.out.println(vtest3.getMotion());
		
		System.out.println(vtest.toString());
		System.out.println(vtest2.toString());
		System.out.println(vtest3.toString());
		System.out.println(vtest4.toString());
		
		System.out.println(vtest.equals(vtest2));
		System.out.println(vtest3.equals(vtest4));
		System.out.println();
		*/
		
		//Car Tests 
		/*
		System.out.println("Car Checks:");
		System.out.println(carTest.getId());
		System.out.println(carTest.getColor());
		System.out.println(carTest.getNumWheels());
		System.out.println(carTest.getNumDoors());
		System.out.println(carTest.getCargoSpace());
		System.out.println(carTest.getMotion());
		carTest.setColor("orange");
		System.out.println(carTest.getColor());
		carTest.setNumDoors(2);
		System.out.println(carTest.getNumDoors());
		carTest.setNumDoors(4);
		System.out.println(carTest.getNumDoors());
		//carTest.setNumDoors(3);
		//System.out.println(carTest.getNumDoors());
		carTest.setCargoSpace(25);
		System.out.println(carTest.getCargoSpace());
		//carTest.setCargoSpace(0);
		//System.out.println(carTest.getCargoSpace());
		//carTest.setCargoSpace(-1);
		//System.out.println(carTest.getCargoSpace());
		System.out.println();
		
		System.out.println(carTest3.getId());
		System.out.println(carTest3.getColor());
		System.out.println(carTest3.getNumWheels());
		System.out.println(carTest3.getNumDoors());
		System.out.println(carTest3.getCargoSpace());
		System.out.println(carTest3.getMotion());
		System.out.println();
		
		System.out.println(carTest5.getId());
		System.out.println(carTest5.getColor());
		System.out.println(carTest5.getNumWheels());
		System.out.println(carTest5.getNumDoors());
		System.out.println(carTest5.getCargoSpace());
		System.out.println(carTest5.getMotion());
		System.out.println();
		
		System.out.println(carTest.toString());
		System.out.println(carTest2.toString());
		System.out.println(carTest3.toString());
		System.out.println(carTest4.toString());
		System.out.println(carTest5.toString());
		System.out.println(carTest6.toString());
		System.out.println();
		
		System.out.println(carTest.PressGasPedal());
		System.out.println(carTest3.PressGasPedal());
		System.out.println(carTest4.PressGasPedal());
		
		System.out.println(carTest.equals(carTest2));
		System.out.println(carTest3.equals(carTest4));
		System.out.println(carTest5.equals(carTest6));
		System.out.println();		
		
		
		
		System.out.println("Motorcycle Checks:");
		System.out.println(motorTest.getId());
		System.out.println(motorTest.getColor());
		System.out.println(motorTest.getNumWheels());
		System.out.println(motorTest.getCargoSpace());
		System.out.println(motorTest.getMotion());
		System.out.println(motorTest.getAccessories());
		motorTest.setColor("orange");
		System.out.println(motorTest.getColor());
		motorTest.setAccessories(motorAccs2);
		System.out.println(motorTest.getAccessories());
		System.out.println();
		
		System.out.println(motorTest3.getId());
		System.out.println(motorTest3.getColor());
		System.out.println(motorTest3.getNumWheels());
		System.out.println(motorTest3.getAccessories());
		System.out.println(motorTest3.getCargoSpace());
		System.out.println(motorTest3.getMotion());
		System.out.println();
		
		System.out.println(motorTest5.getId());
		System.out.println(motorTest5.getColor());
		System.out.println(motorTest5.getNumWheels());
		System.out.println(motorTest5.getAccessories());
		System.out.println(motorTest5.getCargoSpace());
		System.out.println(motorTest5.getMotion());
		System.out.println();
		
		System.out.println(motorTest.toString());
		System.out.println(motorTest2.toString());
		System.out.println(motorTest3.toString());
		System.out.println(motorTest4.toString());
		System.out.println(motorTest5.toString());
		System.out.println(motorTest6.toString());
		System.out.println();
		
		System.out.println(motorTest.TwistThrottle());
		System.out.println(motorTest3.TwistThrottle());
		System.out.println(motorTest5.TwistThrottle());
		System.out.println();
		
		System.out.println(motorTest.equals(motorTest2));
		System.out.println(motorTest3.equals(motorTest4));
		System.out.println(motorTest5.equals(motorTest6));
		System.out.println();	
		
		
		//motorTest.setCargoSpace(0);
		
		System.out.println("Bicycle Checks:");
		System.out.println(bikeTest.getId());
		System.out.println(bikeTest.getColor());
		System.out.println(bikeTest.getNumWheels());
		System.out.println(bikeTest.getCargoSpace());
		System.out.println(bikeTest.getMotion());
		System.out.println(bikeTest.getIsElectric());
		bikeTest.setCargoSpace(0);
		bikeTest.setColor("orange");
		System.out.println(bikeTest.getColor());
		bikeTest.setIsElectric(true);
		System.out.println(bikeTest.getIsElectric());
		System.out.println();
		
		System.out.println(bikeTest3.getId());
		System.out.println(bikeTest3.getColor());
		System.out.println(bikeTest3.getNumWheels());
		System.out.println(bikeTest3.getIsElectric());
		System.out.println(bikeTest3.getCargoSpace());
		System.out.println(bikeTest3.getMotion());
		System.out.println();
		
		System.out.println(bikeTest5.getId());
		System.out.println(bikeTest5.getColor());
		System.out.println(bikeTest5.getNumWheels());
		System.out.println(bikeTest5.getIsElectric());
		System.out.println(bikeTest5.getCargoSpace());
		System.out.println(bikeTest5.getMotion());
		System.out.println();
		
		System.out.println(bikeTest.toString());
		System.out.println(bikeTest2.toString());
		System.out.println(bikeTest3.toString());
		System.out.println(bikeTest4.toString());
		System.out.println(bikeTest5.toString());
		System.out.println(bikeTest6.toString());
		System.out.println();
		
		System.out.println(bikeTest.Pedal());
		System.out.println(bikeTest3.Pedal());
		System.out.println(bikeTest5.Pedal());
		System.out.println();
		
		System.out.println(bikeTest.equals(bikeTest2));
		System.out.println(bikeTest3.equals(bikeTest4));
		System.out.println(bikeTest5.equals(bikeTest6));
		System.out.println();	
		
		
		//bikeTest.setNumWheels(4);
		
		System.out.println("CargoCycle Checks:");
		System.out.println(cargoBikeTest.getId());
		System.out.println(cargoBikeTest.getColor());
		System.out.println(cargoBikeTest.getNumWheels());
		System.out.println(cargoBikeTest.getCargoSpace());
		System.out.println(cargoBikeTest.getMotion());
		System.out.println(cargoBikeTest.getIsElectric());
		//cargoBikeTest.setCargoSpace(0);
		//System.out.println(cargoBikeTest.getCargoSpace());
		cargoBikeTest.setCargoSpace(12);
		System.out.println(cargoBikeTest.getCargoSpace());
		cargoBikeTest.setNumWheels(3);
		System.out.println(cargoBikeTest.getNumWheels());
		//cargoBikeTest.setNumWheels(5);
		//System.out.println(cargoBikeTest.getNumWheels());
		cargoBikeTest.setColor("orange");
		System.out.println(cargoBikeTest.getColor());
		cargoBikeTest.setIsElectric(true);
		System.out.println(cargoBikeTest.getIsElectric());
		System.out.println();
		
		System.out.println(cargoBikeTest3.getId());
		System.out.println(cargoBikeTest3.getColor());
		System.out.println(cargoBikeTest3.getNumWheels());
		System.out.println(cargoBikeTest3.getIsElectric());
		System.out.println(cargoBikeTest3.getCargoSpace());
		System.out.println(cargoBikeTest3.getMotion());
		System.out.println();
		
		System.out.println(cargoBikeTest5.getId());
		System.out.println(cargoBikeTest5.getColor());
		System.out.println(cargoBikeTest5.getNumWheels());
		System.out.println(cargoBikeTest5.getIsElectric());
		System.out.println(cargoBikeTest5.getCargoSpace());
		System.out.println(cargoBikeTest5.getMotion());
		System.out.println();
		
		System.out.println(cargoBikeTest.toString());
		System.out.println(cargoBikeTest2.toString());
		System.out.println(cargoBikeTest3.toString());
		System.out.println(cargoBikeTest4.toString());
		System.out.println(cargoBikeTest5.toString());
		System.out.println(cargoBikeTest6.toString());
		System.out.println();
		
		System.out.println(cargoBikeTest.Pedal());
		System.out.println(cargoBikeTest3.Pedal());
		System.out.println(cargoBikeTest5.Pedal());
		System.out.println();
		
		System.out.println(cargoBikeTest.equals(cargoBikeTest2));
		System.out.println(cargoBikeTest3.equals(cargoBikeTest4));
		System.out.println(cargoBikeTest5.equals(cargoBikeTest6));
		System.out.println();	
		*/
		
	}

}
