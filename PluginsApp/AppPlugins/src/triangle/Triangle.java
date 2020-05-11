package triangle;

import java.util.Scanner;

import interfaces.IShape;
import shared.Point;
import shared.Observable;

public class Triangle extends Observable implements IShape{
	private int UpPointX;
	private int UpPointY;
	private int LeftDownX;
	private int LeftDownY;
	private int RightDownX;
	private int RightDownY;
	
	public Triangle(int upx, int upy, int ldx, int ldy, int rdx, int rdy) {
		this.UpPointX = upx;
		this.UpPointY = upy;
		this.LeftDownX = ldx;
		this.LeftDownY = ldy;
		this.RightDownX = rdx;
		this.RightDownY = rdy;
	}
	
	public Triangle() {
		this.UpPointX = 0;
		this.UpPointY = 0;
		this.LeftDownX = 0;
		this.LeftDownY = 0;
		this.RightDownX = 0;
		this.RightDownY = 0;
	}
	
	@Override
	public void draw(){
		System.out.println("Triangle: Up Point(x = " + UpPointX + "; y = " + UpPointY 
		+ ");" + " Left Down Point (x = " + LeftDownX + "; y = " + LeftDownY + ");"
		+ " Right Down Point (x = " + RightDownX + "; y = " + RightDownY + ")");
	}
	
	@Override 
	public String details(){
		return "Triangle: Up Point(x = " + UpPointX + "; y = " + UpPointY 
				+ ");" + " Left Down Point (x = " + LeftDownX + "; y = " + LeftDownY + ");"
				+ " Right Down Point (x = " + RightDownX + "; y = " + RightDownY + ")";
	}
	
	@Override
	public void read() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the up point: ");
		System.out.print("Enter X = ");
		int x1 = input.nextInt();
		System.out.print("Enter Y = ");
		int y1 = input.nextInt();
		System.out.println("Enter the coordinates of the left down point: ");
		System.out.print("Enter X = ");
		int x2 = input.nextInt();
		System.out.print("Enter Y = ");
		int y2 = input.nextInt();
		System.out.println("Enter the coordinates of the right down point: ");
		System.out.print("Enter X = ");
		int x3 = input.nextInt();
		System.out.print("Enter Y = ");
		int y3 = input.nextInt();
		this.UpPointX = x1;
		this.UpPointY = y1;
		this.LeftDownX = x2;
		this.LeftDownY = y2;
		this.RightDownX = x3;
		this.RightDownY = y3;
	}
	
	@Override
	public Point getBoundingRectangle() {
		int x = UpPointX, y=UpPointY;
		if(x<RightDownX)
			x=RightDownX;
		if(x<LeftDownX)
			x=LeftDownX;
		if(y<RightDownY)
			y=RightDownY;
		if(y<LeftDownY)
			y=LeftDownY;
		Point point = new Point(x,y);
		return point;
	}
}
