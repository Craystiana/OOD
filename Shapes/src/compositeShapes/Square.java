package compositeShapes;

public class Square implements Shape{
	private Point pointLeftUp;
	private Point pointRightDown;
	
	public Square(int xlu, int ylu, int xrd, int yrd){
		this.pointLeftUp = new Point(xlu, ylu);
		this.pointRightDown = new Point(xrd, yrd);
	}
	
	@Override
	public void draw(){
		System.out.println("Square: Left Up Point(x = " + pointLeftUp.getX() + "; y = " + pointLeftUp.getY() 
		+ "); Right Down Point (x = " + pointRightDown.getX() + "; y = " + pointRightDown.getY() + ")");
	}
	
	@Override 
	public String details(){
		return "Square: Left Up Point(x = " + pointLeftUp.getX() + "; y = " + pointLeftUp.getY() 
		+ "); Right Down Point (x = " + pointRightDown.getX() + "; y = " + pointRightDown.getY() + ")";
	}
}
