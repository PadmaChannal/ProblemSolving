
public abstract class Shape {
	private String name;
	private int numberOfSides;
	private double width;
	private double length;
	private double height;
	private double breadth;
	
	
	// Getters
	String getName() { return name; }
	int getNoOfSides() { return numberOfSides; }
	double getWidth() { return width; }
	double getLength() { return length; }
	double getheight() { return height; }
	double getBreadth() { return breadth; }
	
	// Setters
	void setName(String newName) { name = newName; }
	void setNoOfSides(int newnumberOfSides ) { numberOfSides = newnumberOfSides; }
	void setWidth(double newWidth) { width = newWidth; }
	void setLength(double newLength) { length = newLength; }
	void setHeight(double newHeight) { height = newHeight; }
	void setBreadth(double newBreadth) { height = newBreadth; }
	
	abstract double area();
	abstract String print();

}
