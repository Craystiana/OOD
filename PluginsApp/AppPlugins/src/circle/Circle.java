package circle;
import java.util.Scanner;

import interfaces.IShape;
import shared.Observable;
import shared.Point;

public class Circle extends Observable implements IShape{
	private int originx;
	private int originy;
	private int radius;
	
	public Circle(int x, int y, int radius){
		this.originx = x;
		this.originy = y;
		this.radius=radius;
	}
	
	public Circle(){
		this.originx = 0;
		this.originy = 0;
		this.radius = 0;
	}
	
	@Override
	public void draw(){
		System.out.println("Circle: Origin(x=" + originx + "; y=" + originy + "); Radius= " + radius);
	}
	
	@Override 
	public String details(){
		return "Circle: Origin(x=" + originx + "; y=" + originy + "); Radius= " + radius;
	}
	
	@Override
	public void read() {
		Scanner input = new Scanner(System.in);
		int x, y, radius;
		System.out.println("Enter the coordinates of the origin and the radius: ");
		System.out.print("Enter X = ");
		x = input.nextInt();
		System.out.print("Enter Y = ");
		y = input.nextInt();
		System.out.print("Enter radius = ");
		radius = input.nextInt();
		this.originx = x;
		this.originy = y;
		this.radius = radius;
	}

	@Override
	public Point getBoundingRectangle() {
		Point point = new Point(originx + radius, originy + radius);
		return point;
	}
}
