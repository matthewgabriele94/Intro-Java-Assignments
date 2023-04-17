package vehicles;

public class Vehicle {
	
	private int numWheels;
	private String color;
	private double cargoSpace;
	private static int nextId = 1;
	private int id;
	private String motion;
	
	public Vehicle() {
		this.id = Vehicle.nextId;
		Vehicle.nextId++;
	}

	public Vehicle(int numWheels, String color, double cargoSpace, String motion) {
		this();
		this.numWheels = numWheels;
		this.color = color;
		this.cargoSpace = cargoSpace;
		this.motion = motion;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCargoSpace() {
		return this.cargoSpace;
	}
	
	public void setNumWheels(int numWheels) throws IllegalArgumentException{
		if(this instanceof CargoCycle) {
			if(numWheels == 2 || numWheels == 3 || numWheels == 4) {
				this.numWheels = numWheels;
			}
			else {
				throw new IllegalArgumentException("CargoCycles must have 2-4 wheels.");
			}
		}
		else {
			throw new IllegalArgumentException("Cannot set the number of wheels for this vehicle.");
		}
	}
	
	public void setCargoSpace(double cargoSpace) throws IllegalArgumentException{
		if(this instanceof Car || this instanceof CargoCycle) {
			if(cargoSpace > 0) {
				this.cargoSpace = cargoSpace;
			}
			else {
				throw new IllegalArgumentException("This vehicle must have cargo space.");
			}
		}
		else if(this instanceof Bicycle || this instanceof Motorcycle) {
			if(cargoSpace == 0) {
				this.cargoSpace = cargoSpace;
			}
			else {
				throw new IllegalArgumentException("This vehicle must have zero cargo space.");
			}
		}
		else {
			this.cargoSpace = cargoSpace;
		}
		
	}
	
	public String getMotion() {
		return this.motion;
	}

	public int getId() {
		return this.id;
	}
	
	public String toString() {
		return "Vehicle[ID = " + this.id + ", number of wheels = " + this.numWheels + ", color = " 
				+ this.color + ", cargo space = " + this.cargoSpace + " cubic feet" + ", motion type = " + this.motion + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Vehicle) {
			Vehicle vh = (Vehicle)o;
			if(this.numWheels == vh.numWheels && this.color == vh.color && this.cargoSpace == vh.cargoSpace
					&& this.motion == vh.motion) {
					return true;
				}
		}
		return false;
	}

	
	public static void main(String[] args) {
		

	}

}
