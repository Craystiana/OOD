package compositeShapes;

public class Point implements Shape{
	private int x;
	private int y;
	
	public  Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	@Override
	public void draw(){
		System.out.println("Point: x="+x+" y="+y);
	}
	
	@Override 
	public String details(){
		return "Point: x="+x+" y="+y;
	}
}
