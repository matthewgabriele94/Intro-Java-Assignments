package vehicles;

public class Car extends Vehicle {
	
	private int numDoors;
	
	public Car() {
		super(4,"black",1,"accelerating");
		this.numDoors = 2;
	}
	
	public Car(int numDoors) throws IllegalArgumentException {
		super(4,"black",1,"accelerating");
		if(numDoors != 2 && numDoors != 4) {
			throw new IllegalArgumentException("Cars can have either 2 or 4 doors.");
		}
		else {
			this.numDoors = numDoors;
		}
	}
	
	public Car(String color, double cargoSpace, int numDoors) throws IllegalArgumentException {
		super(4, color, cargoSpace, "accelerating");
		if(cargoSpace <= 0) {
			throw new IllegalArgumentException("Cars must have cargo space.");
		}
		if(numDoors != 2 && numDoors != 4) {
			throw new IllegalArgumentException("Cars can have either 2 or 4 doors.");
		}
		else {
			this.numDoors = numDoors;
		}		
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public void setNumDoors(int numDoors) throws IllegalArgumentException{
		if(numDoors == 2 || numDoors == 4) {
			this.numDoors = numDoors;
		}
		else {
			throw new IllegalArgumentException("Cars can have either 2 or 4 doors.");
		}
	}
	
	
	public String toString() {
		return "Car[" + super.toString() + ", number of doors = " + this.numDoors + "]";
	}
	
	public String PressGasPedal() {
		return this.getMotion();
	}
	/*
	public boolean equals2(Object o) {
		if(o instanceof Car) {
			Car cr = (Car)o;
			Vehicle vh = (Vehicle)o;
			Vehicle vh2 = (Vehicle)this;
			//boolean vhEquals = vh2.equals(o);
			System.out.println(this.numWheels);
			System.out.println(this.getNumWheels());
			System.out.println(this.color);
			System.out.println(this.getColor());
			System.out.println(this.cargoSpace);
			System.out.println(this.getCargoSpace());
			System.out.println(this.numDoors);
			System.out.println(this.getNumDoors());
			//if(vhEquals == true) {
			if(this.numWheels == cr.numWheels && this.color == cr.color && this.cargoSpace == cr.cargoSpace
					&& this.motion == cr.motion
					&& this.numDoors == cr.numDoors) {
					return true;
			}
		}
		return false;
	}
	*/
	public boolean equals(Object o) {
		if(o instanceof Car) {
			Car cr = (Car)o;
			if(this.getNumWheels() == cr.getNumWheels() 
					&& this.getColor() == cr.getColor() 
					&& this.getCargoSpace() == cr.getCargoSpace()
					&& this.getMotion() == cr.getMotion()
					&& this.numDoors == cr.numDoors) {
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
