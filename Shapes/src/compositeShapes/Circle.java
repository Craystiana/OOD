package compositeShapes;

public class Circle implements Shape{
	private Point origin;
	private int radius;
	
	public Circle(int x, int y, int radius){
		this.origin = new Point(x,y);
		this.radius=radius;
	}
	
	@Override
	public void draw(){
		System.out.println("Circle: Origin(x=" + origin.getX() + "; y=" + origin.getY() + "); Radius= " + radius);
	}
	
	@Override 
	public String details(){
		return "Circle: Origin(x=" + origin.getX() + "; y=" + origin.getY() + "); Radius= " + radius;
	}
}
