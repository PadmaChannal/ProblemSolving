
public class Rectangle extends Shape implements Printable{

	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private String name;
	private double area;
	private int numberOfSides;
	
	
	// Constructor
	Rectangle(String newName, int newnumberOfSides, double newSide1, double newSide2 , double newSide3, double newSide4){
		setName(newName);
		setWidth(newSide1);
		setHeight(newSide2);
		setLength(newSide3);
		setBreadth(newSide4);
		setNoOfSides(newnumberOfSides);
	}
		
	// Getters
	String getName() { return name; }
	int getNoOfSides() { return numberOfSides; }
	double getWidth() { return side1; }
	double getheight() { return side2; }
	double getLength() {return side3; }
	double getBreadth() {return side4; }
			
	// Setters
	void setName(String newName) { name = newName; }
	void setNoOfSides(int newnumberOfSides ) { numberOfSides = newnumberOfSides; }
	void setWidth(double newWidth) { side1 = newWidth; }
	void setHeight(double newHeight) { side2 = newHeight; }
	void setLength(double newLength) { side3 = newLength; }
	void setBreadth(double newBreadth) { side4 = newBreadth; }

	@Override
	 double area() {
		area = side1 * side2;
		System.out.println("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);
		return (area = side1 * side2);
		
	}
			
	@Override
	public String print() {
		return ("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);
	}
	
}
