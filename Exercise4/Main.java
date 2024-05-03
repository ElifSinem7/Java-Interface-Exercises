package Exercise4;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(14, 23);
		
		System.out.println("Rectangle's width: " + rectangle.getWidth() + "\nHeight: " + rectangle.getHeight());
		
		rectangle.resizeWidth(100);
		rectangle.resizeHeight(120);
		
		System.out.println("Rectangle's new width: " + rectangle.getWidth() + "\nNew height: " + rectangle.getHeight());
	}

}
