package Exercise5;

public class Circle implements Drawable{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Drawing a circle...");
		
	}
	@Override
	public double getArea() {
		return Math.PI * radius *radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
