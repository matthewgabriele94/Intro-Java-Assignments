import java.util.Scanner;

public class CopyShift {

	public static void copyShift(int[] sourceArray, int[] destArray, int shift) {
		for(int i = 0; i < sourceArray.length; i++) {
			int newPlace = (i + shift) % 50;
			destArray[newPlace] = sourceArray[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] sourceArray = new int[50];
		int[] destArray = new int[50];
		
		/* initialize the source Array */
		for (int i = 0;i < sourceArray.length; i++) {
			sourceArray[i] = (int)(Math.random()*100);
		}
		
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter number of spaces for sourceArray contents to be shifted: ");
		int shiftValue = input.nextInt();
		if(shiftValue >= 0) {
			copyShift(sourceArray, destArray, shiftValue);
		}
		else {
			System.out.println("Please enter nonnegative shift value.");
		}
		/* destArray should have the contents of sourceArray
		 * but in shifted over "shiftValue" values
		 * if sourceArray has the contents [1,5,6,7,9] and we want to shift it 
		 * 3 spaces over, destArray should have the contents [6,7,9,1,5].
		 * 
		 * It should work for arbitrarily large values of shift
		 */
		if(shiftValue >= 0) {
			for(int j = 0; j < sourceArray.length; j++) {
				System.out.print(sourceArray[j] + "\t");
			}
			System.out.print("\n");
			for(int k = 0; k < destArray.length; k++) {
				System.out.print(destArray[k] + "\t");
			}
		}
	}
}
