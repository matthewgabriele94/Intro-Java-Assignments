
public class WireCapacitance {

	public static double calculateWireCapacitance(double initialDistance, double finalDistance, double wireLength, double wireRadius) {
		double absolutePermittivity = 8.85E-12;
		double initialCapacitance = (Math.PI * absolutePermittivity * wireLength) / 
				Math.log((initialDistance / (2 * wireRadius)) 
						+ Math.sqrt((Math.pow(initialDistance, 2) / (4 * Math.pow(wireRadius, 2))) - 1));
		double finalCapacitance = (Math.PI * absolutePermittivity * wireLength) / 
				Math.log((finalDistance / (2 * wireRadius)) 
						+ Math.sqrt((Math.pow(finalDistance, 2) / (4 * Math.pow(wireRadius, 2))) - 1));
		
		double capacitanceDifference = finalCapacitance - initialCapacitance;;
		
		return capacitanceDifference;
	}
	
	public static void main(String[] args) {
		
		double initialDistance = .01;
		double finalDistance = .005;
		double wireLength = 0.5;
		double wireRadius = .002053;
		
		double capacitanceDifference = calculateWireCapacitance(initialDistance, finalDistance, wireLength, wireRadius);
		
		System.out.println("The wires' change in capacity when moved from a distance of "
		 		+  + initialDistance +
		" m to " + finalDistance + "m is " + capacitanceDifference + " farads");
		
	}
}
