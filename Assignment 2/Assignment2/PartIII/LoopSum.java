
public class LoopSum {

	public static double factorial(double n) {
		if (n == 0)
		return 1;
		   
		return n*factorial(n-1);
	}
	
	public static double estimateExponential(int z, double k) {
		
		double sumComponent = Math.pow(z, k) / factorial(k); 
		
		return sumComponent;
	}
	
	public static void main(String[] args) {
		for(int j = 0; j < 16; j++) {
			
			double k = 0, sum = 0;
			double sumEDiff = 10;
			System.out.println("e^" + j + " is " + Math.pow(Math.E, j));
			while(sumEDiff > 0.001) {
				double sumComponent = estimateExponential(j, k);
				sum += sumComponent;
				sumEDiff = Math.abs(Math.pow(Math.E, j) - sum);
				k++;
			}
			if(k == 1){
				System.out.println("result for " + (int)k + " iteration: " + sum);
				System.out.println("it requires " + (int)k + " iteration to estimate e^" + j + " within 0.001");
			}
			else {
				System.out.println("result for " + (int)k + " iterations: " + sum);
				System.out.println("it requires " + (int)k + " iterations to estimate e^" + j + " within 0.001");
			}
			System.out.print("\n");
		}
	}
	
}
