package compositeShapes;

import java.util.ArrayList;

public class ShapeList implements Shape {
	private ArrayList<Shape> shapesList = new ArrayList<Shape>();

	@Override
	public void draw() {
		for (Shape shape : shapesList)	{
			shape.draw();
		}
	}

	@Override
	public String details() {
		return null;
	}

	public void addShape(Shape shape) {
		shapesList.add(shape);
	}

	public void addAtPosition(int index, Shape shape) {
		shapesList.add(index, shape);
	}

	public int removeShape(Shape shape) {
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
