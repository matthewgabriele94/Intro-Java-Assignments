package vehicles;

public class CargoCycle extends Bicycle {
	
	public CargoCycle() {
		super(2, "black", 1, false);
	}
	
	public CargoCycle(boolean isElectric) {
		super(2, "black", 1, isElectric);
	}
	
	public CargoCycle(int numWheels, String color, double cargoSpace, boolean isElectric) {
		super(numWheels, color, cargoSpace, isElectric);
	}
	
	public String toString() {
		return "CargoCycle[" + super.toString() + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof CargoCycle) {
			CargoCycle cc = (CargoCycle)o;
			if(this.getNumWheels() == cc.getNumWheels() 
					&& this.getColor() == cc.getColor() 
					&& this.getCargoSpace() == cc.getCargoSpace()
					&& this.getMotion() == cc.getMotion()
					&& this.getIsElectric() == cc.getIsElectric()) {
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
