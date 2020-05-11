package rectangle;

import java.util.Scanner;

import interfaces.IShape;
import shared.Point;
import shared.Observable;

public class Rectangle extends Observable implements IShape{
	private int LeftUpX;
	private int LeftUpY;
	private int width;
	private int height;
	
	public Rectangle(int lux, int luy, int width, int height){
		this.LeftUpX = lux;
		this.LeftUpY = luy;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		this.LeftUpX = 0;
		this.LeftUpY = 0;
		this.width = 0;
		this.height = 0;
	}
	
	@Override
	public void draw(){
		System.out.println("Rectangle: Left Up Point(x = " + LeftUpX + "; y = " + LeftUpY 
		+ "); Width = " + width + "; Height = " + height);
	}
	
	@Override
	public String details() {
		return "Rectangle: Left Up Point(x = " + LeftUpX + "; y = " + LeftUpY 
				+ "); Width = " + width + "; Height = " + height;
	}
	
	@Override
	public void read() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the left up point: ");
		System.out.print("Enter X = ");
		int x1 = input.nextInt();
		System.out.print("Enter Y = ");
		int y1 = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		this.LeftUpX = x1;
		this.LeftUpY = y1;
		this.width = width;
		this.height = height;
	}

	@Override
	public shared.Point getBoundingRectangle() {
		Point point = new Point(LeftUpX + width, LeftUpY + height);
		return point;
	}
}
