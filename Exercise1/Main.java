package Exercise1;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(13, 19);
		Circle circle= new Circle(7);
		Triangle triangle = new Triangle(12, 21);
		
		System.out.println("Area of rectangle: " + rectangle.getArea() + "\nArea of circle: " + circle.getArea() + "\nArea of triangle: " + triangle.getArea());
	}

}
