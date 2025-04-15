package hw5;

public class MyRetangle {
	private double width;
	private double depth;
	
	public MyRetangle(double width ,double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return depth;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.depth =depth;
	}
	
	double getArea() {
		double area = depth * width;
//		System.out.println(depth);
//		System.out.println(width);
		return area;
	}
}
