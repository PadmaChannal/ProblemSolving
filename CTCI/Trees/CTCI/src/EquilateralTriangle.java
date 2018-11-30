
public class EquilateralTriangle extends Triangle implements Printable {

	private double width;
	private double length;
	private double height;
	private String name;
	private double area;
	private int numberOfSides;
	
	EquilateralTriangle(String newName, int newnumberOfSides, double newWidth, double newLength, double newHeight) {
		super(newName, newnumberOfSides, newWidth, newLength, newHeight);
		// TODO Auto-generated constructor stub
	}
	
	// Getters
			String getName() { return name; }
			int getNoOfSides() { return numberOfSides; }
			double getWidth() { return width; }
			double getLength() { return length; }
			double getheight() { return height; }
			
		// Setters
			void setName(String newName) { name = newName; }
			void setNoOfSides(int newnumberOfSides ) { numberOfSides = newnumberOfSides; }
			void setWidth(double newWidth) { width = newWidth; }
			void setLength(double newLength) { length = newLength; }
			void setHeight(double newHeight) { height = newHeight; }


		@Override
		double area() {
			area = (Math.sqrt(3)/2) * width;
			System.out.println("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);
			return(area = 0.5 * width * height);
		}


		@Override
		public String print() {
			return ("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);
		}
		
		public static void main (String[] args) {
			EquilateralTriangle a = new EquilateralTriangle("Equilateral Triangle",3,5,5,5);
			a.area();
			
			
		}
	
	

}
