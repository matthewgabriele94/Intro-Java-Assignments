package vehicles;

import java.util.Arrays;

public class Motorcycle extends Vehicle {
	
	private String[] accessories = {"NONE"};
	
	public Motorcycle() {
		super(2, "black", 0, "accelerating");
	}
	
	public Motorcycle(String[] accessories){
		super(2, "black", 0, "accelerating");
		String[] accessoriesUpper = new String[accessories.length];;
		for(int i = 0; i < accessories.length; i ++) {
			accessoriesUpper[i] = accessories[i].toUpperCase();
		}
		this.accessories = accessoriesUpper;
	}
	
	
	public Motorcycle(String color, String[] accessories) 
			throws IllegalArgumentException {
		super(2, color, 0, "accelerating");
		String[] accessoriesUpper = new String[accessories.length];
		for(int i = 0; i < accessories.length; i ++) {
			accessoriesUpper[i] = accessories[i].toUpperCase();
		}
		this.accessories = accessoriesUpper;

	}
	
	public void setAccessories(String[] accessories) {
		String[] accessoriesUpper = new String[accessories.length];
		for(int i = 0; i < accessories.length; i ++) {
			accessoriesUpper[i] = accessories[i].toUpperCase();
		}
		this.accessories = accessoriesUpper;
	}
	
	public String getAccessories() {
		String accList = "";
		for(int i = 0; i < this.accessories.length; i++) {
			accList += this.accessories[i];
			if(i != (this.accessories.length - 1)) {
				accList += ", ";
			}
		}
		return accList;
	}
	
	public String toString() {
		String accList = "";
		for(int i = 0; i < this.accessories.length; i++) {
			accList += this.accessories[i];
			if(i != (this.accessories.length - 1)) {
				accList += ", ";
			}
		}
		return "Motorcycle[" + super.toString() + ", accessories = " + accList + "]";
	}
	
	public String TwistThrottle() {
		return this.getMotion();
	}
	
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

	public boolean equals(Object o) {
		if(o instanceof Motorcycle) {
			Motorcycle mt = (Motorcycle)o;
			if(this.getNumWheels() == mt.getNumWheels() 
					&& this.getColor() == mt.getColor() 
					&& this.getCargoSpace() == mt.getCargoSpace()
					&& this.getMotion() == mt.getMotion()) {
				Arrays.sort(this.accessories);
				Arrays.sort(mt.accessories);
				String[] tempThisAcc = removeDuplicates(this.accessories, this.accessories.length);
				String[] tempMtAcc = removeDuplicates(mt.accessories, mt.accessories.length);
				if(tempThisAcc.length == tempMtAcc.length) {
					boolean accessoriesComp = true;
					for(int i = 0; i < tempThisAcc.length; i++) {
						if(tempThisAcc[i].equals(tempMtAcc[i]) == false) {
							accessoriesComp = false;
						}
					}
					if(accessoriesComp == true) {
						return true;
					}
				}
				
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
