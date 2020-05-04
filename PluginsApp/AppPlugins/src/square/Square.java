package square;

import java.util.Scanner;

import interfaces.IShape;

public class Square implements IShape{
	private int LeftUpX;
	private int LeftUpY;
	private int RightDownX;
	private int RightDownY;
	
	public Square(int xlu, int ylu, int xrd, int yrd){
		this.LeftUpX = xlu;
		this.LeftUpY = ylu;
		this.RightDownX = xrd;
		this.RightDownY = yrd;
	}
	
	public Square(){
		this.LeftUpX = 0;
		this.LeftUpY = 0;
		this.RightDownX = 0;
		this.RightDownY = 0;
	}
	
	@Override
	public void draw(){
		System.out.println("Square: Left Up Point(x = " + LeftUpX + "; y = " + LeftUpY 
		+ "); Right Down Point (x = " + RightDownX + "; y = " + RightDownY + ")");
	}
	
	@Override 
	public String details(){
		return "Square: Left Up Point(x = " + LeftUpX + "; y = " + LeftUpY 
		+ "); Right Down Point (x = " + RightDownX + "; y = " + RightDownY + ")";
	}
	
	@Override
	public void read() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the left up point: ");
		System.out.print("Enter X = ");
		int x1 = input.nextInt();
		System.out.print("Enter Y = ");
		int y1 = input.nextInt();
		System.out.println("Enter the coordinates of the right down point: ");
		System.out.print("Enter X = ");
		int x2 = input.nextInt();
		System.out.print("Enter Y = ");
		int y2 = input.nextInt();
		this.LeftUpX = x1;
		this.LeftUpY = y1;
		this.RightDownX = x2;
		this.RightDownY = y2;
	}
}
