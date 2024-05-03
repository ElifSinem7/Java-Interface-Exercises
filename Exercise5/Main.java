package Exercise5;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(18, 24);
		Circle circle = new Circle(8);
		Triangle triangle = new Triangle(12, 18, 12, 14, 16);
		
		rectangle.draw();
		System.out.println("Rectangle's area: " + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
		System.out.println("\n");
		circle.draw();
		System.out.println("Circle's area: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
		System.out.println("\n");
		triangle.draw();
		System.out.println("Triangle's area: "  +triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter());
	}

}
