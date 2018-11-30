import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ShapeDriver {
	
	static ArrayList<Shape> collectionOfShapes = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		
		
		//Create a Shape of type Triangle and add that to collectionOfShapes
		Shape triangle = new Triangle("Triangle",3,4,5,6);
		
		// Create a Shape of type Rectangle and add that to collectionOfShapes
		Shape rectangle = new Rectangle("Rectangle",4,4,5,4,5);
		
		// Create a Shape of type Equilateral Triangle and add that to collectionOfShapes
		Shape equilateral_triangle  = new EquilateralTriangle("Equilateral Triangle",3,4,4,4);
		
		// Create a Shape of type Isosceles Triangle and add that to collectionOfShapes
		Shape isosceles_triangle  = new EquilateralTriangle("Isosceles Triangle",3,7,7,5);
		
		//Create a Shape of type Square and add that to collectionOfShapes
		Shape squre = new Square("Square",4,6,6,6,6);
		
		//Create a Shape of type Parallelogram and add that to collectionOfShapes
		Shape paralelogramr = new Parallelogram("Parallelogram",4,6,8,6,8);
		
		//Create a Shape of type Rhombus and add that to collectionOfShapes
		Shape rombus = new Parallelogram("Rhombus",4,6,6,6,6);
		
		
		
		
		// Add all of them to Arraylist and print the parameters
		
		// TRIANGLE
		collectionOfShapes.add(triangle);
		collectionOfShapes.get(0).area();
		collectionOfShapes.get(0).print();
	
		
		System.out.println("\n");
		
		// RECTANGLE
		collectionOfShapes.add(rectangle);
		collectionOfShapes.get(1).area();
		collectionOfShapes.get(1).print();
		
		System.out.println("\n");
		
		// Equilateral Triangle
		collectionOfShapes.add(equilateral_triangle);
		collectionOfShapes.get(2).area();
		collectionOfShapes.get(2).print();
		
		System.out.println("\n");
		
		// Isosceles Triangle
		collectionOfShapes.add(isosceles_triangle);
		collectionOfShapes.get(3).area();
		collectionOfShapes.get(3).print();
		
		System.out.println("\n");
		
		// Square
		collectionOfShapes.add(squre);
		collectionOfShapes.get(4).area();
		collectionOfShapes.get(4).print();
		
		System.out.println("\n");
		
		// Parallelogram
		collectionOfShapes.add(paralelogramr);
		collectionOfShapes.get(5).area();
		collectionOfShapes.get(5).print();
		
		System.out.println("\n");
		
		// Rhombus
		collectionOfShapes.add(rombus);
		collectionOfShapes.get(6).area();
		collectionOfShapes.get(6).print();

		
	}
	

}
