package pluginsapplication;

import java.util.ArrayList;

import interfaces.IShape;

public class ShapeList implements IShape{
	private ArrayList<IShape> shapesList = new ArrayList<IShape>();

	@Override
	public void draw() {
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

}
