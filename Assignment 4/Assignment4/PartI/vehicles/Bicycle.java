package vehicles;

public class Bicycle extends Vehicle {

	private boolean isElectric = false;
	
	public Bicycle() {
		super(2, "black", 0, "pedaling");
		this.isElectric = false;
	}
	
	public Bicycle(boolean isElectric) {
		super(2, "black", 0, "pedaling");
		this.isElectric = isElectric;
	}
	
	public Bicycle(int numWheels, String color, double cargoSpace, boolean isElectric) throws IllegalArgumentException {
		super(numWheels, color, cargoSpace, "pedaling");
		if(this instanceof CargoCycle) {
			if(cargoSpace <= 0) {
				throw new IllegalArgumentException("CargoCycles must have cargo space.");
			}
			if(numWheels != 2 && numWheels != 3 && numWheels != 4) {
				throw new IllegalArgumentException("CargoCycles must have 2-4 wheels.");
			}
		}
		else {
			if(numWheels != 2) {
				throw new IllegalArgumentException("Bicycles must have 2 wheels.");
			}
			if(cargoSpace != 0) {
				throw new IllegalArgumentException("Bicycles must have zero cargo space.");
			}
		}
		this.isElectric = isElectric;
		
	}
	
	public void setIsElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	public boolean getIsElectric() {
		return this.isElectric;
	}
	
	public String toString() {
		return "Bicycle[" + super.toString() + ", electric = " + this.isElectric + "]";
	}
	
	public String Pedal() {
		return this.getMotion();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Bicycle) {
			Bicycle bk = (Bicycle)o;
			if(this.getNumWheels() == bk.getNumWheels() 
					&& this.getColor() == bk.getColor() 
					&& this.getCargoSpace() == bk.getCargoSpace()
					&& this.getMotion() == bk.getMotion()
					&& this.isElectric == bk.isElectric) {
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
