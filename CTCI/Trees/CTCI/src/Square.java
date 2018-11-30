
public class Square extends Rectangle implements Printable {

		Square(String newName, int newnumberOfSides, double newSide1, double newSide2, double newSide3, double newSide4) {
			super(newName, newnumberOfSides, newSide1, newSide2, newSide3, newSide4);
		}

		private double width;
		private double height;
		private String name;
		private double area;
		private int numberOfSides;
		
	
	
	// Getters
		String getName() { return name; }
		int getNoOfSides() { return numberOfSides; }
		double getWidth() { return width; }
		double getheight() { return height; }
		double getArea() {return area; }
				
	// Setters
		void setName(String newName) { name = newName; }
		void setNoOfSides(int newnumberOfSides ) { numberOfSides = newnumberOfSides; }
		void setWidth(double newWidth) { width = newWidth; }
		void setHeight(double newHeight) { height = newHeight; }

		@Override
		double area() {
			area = width * height;
			System.out.println("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);
			return(area);
			
			
		}
				
		@Override
		public String print() {
			return ("Shape is " + name + "\nNo of sides : "+ numberOfSides + "\nArea is " + area);	
		}
		
}
