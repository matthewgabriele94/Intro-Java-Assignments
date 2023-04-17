import java.util.Scanner;

public class BoxingWeightClass {

	public static String findWeightClass(float weight) {
		// this is really only valid for weights greater than 0.
		String weightClass;
		if(weight <= 0) {
			weightClass = "Invalid weight";
		}
		else {
			if(weight <= 108) {
				weightClass = "light flyweight";
			}
			else if(weight <= 115) {
				weightClass = "flyweight";
			}
			else if(weight <= 123) {
				weightClass = "bantamweight";
			}
			else if(weight <= 132) {
				weightClass = "lightweight";
			}
			else if(weight <= 141) {
				weightClass = "light welterweight";
			}
			else if(weight <= 152) {
				weightClass = "welterweight";
			}
			else if(weight <= 165) {
				weightClass = "middleweight";
			}
			else if(weight <= 178) {
				weightClass = "Light heavyweight";
			}
			else if(weight <= 201) {
				weightClass = "Heavyweight";
			}
			else {
				weightClass = "Super heavyweight";
			}
		}
			
		return weightClass;
	}
	
	public static void main(String[] args) {
		
		/* you probably want to use user input for the
		 * income using Scanner because you will have to convert
		 * a command line argument to an float, and we haven't
		 * gotten to string parsing yet
		 * 
		 * But you can also just set the "weight" variable
		 * to whatever you want in the code, and that's fine too
		 */
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter boxer's weight: ");
		float weight = input.nextFloat();
		String weightClass = findWeightClass(weight);

		// if the digits are greater than zero print this out:
		if(weightClass != "Invalid weight") {
			System.out.println("The weight class for the weight " + weight + " is " 
					+ weightClass);
		}
		else {
			System.out.println("Please enter a positive weight");
		}
		
	}
}
