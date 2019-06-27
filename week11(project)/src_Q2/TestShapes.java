public class TestShapes 
{
	public static void main(String arg[])
	{
		// EquilateralTriangle
	
		System.out.println("=== Equilateral Triangle === ");
		EquilateralTriangle e1 = new EquilateralTriangle();
		
		// Square
		System.out.println("=== Square === ");
		Square e2 = new Square();
		
		// EquilateralTriangular Prism
		System.out.println("=== Equilateral Triangular Prism ===  ");
		EquilateralTriangularPrism e3 = new EquilateralTriangularPrism();
	    
		// Square Prism
		System.out.println("=== Square Prism ===   ");
		SquarePrism e4 = new SquarePrism();
		
		// EquilateralTriangular Pyramid
		System.out.println("=== Equilateral Triangular Pyramid ===  ");
		EquilateralTriangularPyramid e5 = new EquilateralTriangularPyramid();
		
		// Square Pyramid
		System.out.println("=== Square Pyramid ===   ");
		SquarePyramid e6 = new SquarePyramid();
		
		//PRINT
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(e6.toString());
	}
}
