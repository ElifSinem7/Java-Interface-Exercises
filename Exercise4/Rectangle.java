package Exercise4;

public class Rectangle implements Resizable{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void resizeWidth(int width) {
		this.width = width;
	}
	public void resizeHeight(int height) {
		this.height = height;
	}

}
