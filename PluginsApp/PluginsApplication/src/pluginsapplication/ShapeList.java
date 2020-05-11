package pluginsapplication;

import java.util.ArrayList;

import interfaces.IObserver;
import interfaces.IShape;
import shared.Observable;
import shared.Point;

public class ShapeList implements IShape, IObserver{
	private ArrayList<IShape> shapesList = new ArrayList<IShape>();
	private int width = 100;
	private int lenght = 100;

	@Override
	public void draw() {
		System.out.println("Board: Width = " + width + " Lenght = " + lenght);
		for (IShape shape : shapesList)	{
			shape.draw();
		}
	}

	@Override
	public String details() {
		return null;
	}

	public void addShape(IShape shape) {
		shapesList.add(shape);
	}

	public void addAtPosition(int index, IShape shape) {
		shapesList.add(index, shape);
	}

	@Override
	public void read() {}
	
	public int removeShape(IShape shape) {
		int i = -1;
		boolean find = false;
		if (!shapesList.isEmpty())
			for (i = 0; i < shapesList.size(); i++) {
				if (shape.details().equals(shapesList.get(i).details())) {
					shapesList.get(i).draw();
					shapesList.remove(i);
					find = true;
					break;
				}
			}
		if(find)
			return i;
		else
			return -1;
	}

	@Override
	public void notification(Object x) {
		// TODO Auto-generated method stub
		Point Rectangle = ((IShape) x).getBoundingRectangle();
		if(Rectangle.X1()>width)
			width = Rectangle.X1();
		if(Rectangle.Y1() > lenght)
			lenght = Rectangle.Y1();
	}

	@Override
	public Point getBoundingRectangle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerObserver(IObserver observer) {
		// TODO Auto-generated method stub
		
	}
}
