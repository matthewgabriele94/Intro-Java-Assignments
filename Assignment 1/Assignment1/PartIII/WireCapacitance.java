class WireCapacitance {

	
	public static void main(String[] arguments) {
		double absolutePermittivity = 8.85E-12;
		double initialDistance = .01;
		double finalDistance = .005;
		double wireLength = 0.5;
		double wireRadius = .002053;
		double initialCapacitance = (Math.PI * absolutePermittivity * wireLength) / 
				Math.log((initialDistance / (2 * wireRadius)) 
						+ Math.sqrt((Math.pow(initialDistance, 2) / (4 * Math.pow(wireRadius, 2))) - 1));
		double finalCapacitance = (Math.PI * absolutePermittivity * wireLength) / 
				Math.log((finalDistance / (2 * wireRadius)) 
						+ Math.sqrt((Math.pow(finalDistance, 2) / (4 * Math.pow(wireRadius, 2))) - 1));
		double capacitanceDifference = finalCapacitance - initialCapacitance;
		 System.out.println("The wires' change in capacity when moved from a distance of "
		 		+  + initialDistance +
		" m to " + finalDistance + "m is " + capacitanceDifference + " farads");
	}
}