
public class SquarePyramid {
	
	private static int nextId = 1;
	private int id;
	private double side;
	private double height;
	
	public SquarePyramid() {
		this.id = SquarePyramid.nextId;
		SquarePyramid.nextId++;
	}
	
	public SquarePyramid(double side, double height) throws IllegalArgumentException {
		this();
		this.side = side;
		this.height = height;
		if(side < 0) {
			throw new IllegalArgumentException("Side must be nonnegative.");
		}
		if(height < 0) {
			throw new IllegalArgumentException("Height must be nonnegative.");
		}
		
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return (1/(double)3) * Math.pow(this.side, 2) * this.height;
	}
	
	public double getSurfaceArea() {
		return Math.pow(this.side, 2) + 
				(2 * this.side) * Math.sqrt((Math.pow(this.side, 2) / 4) + Math.pow(this.height,2));
	}
	
	public int getID() {
		return this.id;
	}
	
	public static void main(String[] args) {
		
		//Commented out below is code used to test that I have coded up everything in the UML correctly
		
		/*
		//Test Pyramid 1
		
		System.out.println("NextId value: " + nextId);
        
        SquarePyramid testPyramid1 = new SquarePyramid(2, 4);
        
        int testPyramid1ID = testPyramid1.getID();
        System.out.println("TestPyramid1 ID value: " + testPyramid1ID);
        System.out.println("NextId value: " + nextId);
        
        double testPyramid1Height1 = testPyramid1.getHeight();
        double testPyramid1Side1 = testPyramid1.getSide();
        System.out.println("TestPyramid1 height: " + testPyramid1Height1);
        System.out.println("TestPyramid1 side: " + testPyramid1Side1);
        
        testPyramid1.setHeight(3);
        testPyramid1.setSide(3);
        double testPyramid1Height2 = testPyramid1.getHeight();
        double testPyramid1Side2 = testPyramid1.getSide();
        System.out.println("TestPyramid1 new height: " + testPyramid1Height2);
        System.out.println("TestPyramid1 new side: " + testPyramid1Side2);
        
        double testPyramid1Volume = testPyramid1.getVolume();
        double testPyramid1SA = testPyramid1.getSurfaceArea();

        System.out.println("TestPyramid1 volume: " + testPyramid1Volume);
        System.out.println("TestPyramid1 surface area: " + testPyramid1SA);
        
        //Test Pyramid 2
        
        SquarePyramid testPyramid2 = new SquarePyramid();
        int testPyramid2ID = testPyramid2.getID();
        System.out.println();
        System.out.println("TestPyramid2 ID value: " + testPyramid2ID);
        System.out.println("NextId value: " + nextId);
        
        double testPyramid2Height1 = testPyramid2.getHeight();
        double testPyramid2Side1 = testPyramid2.getSide();
        System.out.println("TestPyramid2 height: " + testPyramid2Height1);
        System.out.println("TestPyramid2 side: " + testPyramid2Side1);
        
        double testPyramid2Volume = testPyramid2.getVolume();
        double testPyramid2SA = testPyramid2.getSurfaceArea();
        
        System.out.println("TestPyramid2 volume: " + testPyramid2Volume);
        System.out.println("TestPyramid2 surface area: " + testPyramid2SA);
        
        testPyramid2.setHeight(4);
        testPyramid2.setSide(2);
        double testPyramid2Height2 = testPyramid2.getHeight();
        double testPyramid2Side2 = testPyramid2.getSide();
        System.out.println("TestPyramid2 new height: " + testPyramid2Height2);
        System.out.println("TestPyramid2 new side: " + testPyramid2Side2);
        
        double testPyramid2Volume2 = testPyramid2.getVolume();
        double testPyramid2SA2 = testPyramid2.getSurfaceArea();

        System.out.println("TestPyramid2 new volume: " + testPyramid2Volume2);
        System.out.println("TestPyramid2 new surface area: " + testPyramid2SA2);
        */
}
	
}
