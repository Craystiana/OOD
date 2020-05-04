package rhombus;

import java.util.Scanner;

import interfaces.IShape;

public class Rhombus implements IShape{
	private int UpPointX;
	private int UpPointY;
	private int VerticalDiagonal;
	private int HorizontalDiagonal;
	
	public Rhombus(int ux, int uy, int vd, int hd) {
		this.UpPointX = ux;
		this.UpPointY = uy;
		this.VerticalDiagonal = vd;
		this.HorizontalDiagonal = hd;
	}
	
	public Rhombus() {
		this.UpPointX = 0;
		this.UpPointY = 0;
		this.VerticalDiagonal = 0;
		this.HorizontalDiagonal = 0;
	}
	
	@Override
	public void draw(){
		System.out.println("Rhombus: Up Point(x = " + UpPointX + "; y = " + UpPointY 
		+ "); Vertical Diagonal = " + VerticalDiagonal + "; Horizontal Diagonal = " + HorizontalDiagonal);
	}
	
	@Override 
	public String details(){
		return "Rhombus: Up Point(x = " + UpPointX + "; y = " + UpPointY 
				+ "); Vertical Diagonal = " + VerticalDiagonal + "; Horizontal Diagonal = " + HorizontalDiagonal;
	}
	
	@Override
	public void read() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the up point: ");
		System.out.print("Enter X = ");
		int x1 = input.nextInt();
		System.out.print("Enter Y = ");
		int y1 = input.nextInt();
		System.out.print("Enter the lenght of the vertical diagonal: ");
		int vd = input.nextInt();
		System.out.print("Enter the lenght of the horizontal diagonal: ");
		int hd = input.nextInt();
		this.UpPointX = x1;
		this.UpPointY = y1;
		this.VerticalDiagonal = vd;
		this.HorizontalDiagonal = hd;
	}
}
