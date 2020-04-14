package shapesApp;

import java.util.ArrayList;
import java.util.Scanner;

import compositeShapes.Circle;
import compositeShapes.Shape;
import compositeShapes.ShapeList;
import compositeShapes.Square;

public class Main {
	public static void main(String[] args) {

		System.out.println(" ==== Drawing Shapes ====");
		Menu mainMenu = initializeMainMenu();
		mainMenu.execute();
	}

	public static Shape readCircle(){ // read the elements of a circle
		Scanner input = new Scanner(System.in);
		int x, y, radius;
		System.out.println("Enter the coordinates of the origin and the radius: ");
		System.out.print("Enter X = ");
		x = input.nextInt();
		System.out.print("Enter Y = ");
		y = input.nextInt();
		System.out.print("Enter radius = ");
		radius = input.nextInt();
		return new Circle(x, y, radius);
	}

	public static Shape readSquare() { // read the elements of a square
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the left up point: ");
		System.out.print("Enter X =");
		int x1 = input.nextInt();
		System.out.print("Enter Y = ");
		int y1 = input.nextInt();
		System.out.println("Enter the coordinates of the right down point: ");
		System.out.print("Enter X = ");
		int x2 = input.nextInt();
		System.out.print("Enter Y = ");
		int y2 = input.nextInt();
		return new Square(x1, y1, x2, y2);
	}

	private static Menu initializeMainMenu() {
		ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>(); 
		ArrayList<IMenuItem> addMenuItems = new ArrayList<IMenuItem>(); //list of items in the add option
		ArrayList<IMenuItem> removeMenuItems = new ArrayList<IMenuItem>(); //list of items in the remove option
		ArrayList<IMenuItem> modifyMenuItems = new ArrayList<IMenuItem>(); //list of items in the modify option
		ShapeList shapeList = new ShapeList();

		addMenuItems.add(new MenuItem("Circle", 1, (parameters) -> {
			shapeList.addShape(readCircle()); //read a circle and add it to the list
		}));
		addMenuItems.add(new MenuItem("Square", 2, (parameters) -> {
			shapeList.addShape(readSquare()); //read a square and add it to the list
		}));

		removeMenuItems.add(new MenuItem("Circle", 1, (parameters) -> {
			int iterator = shapeList.removeShape(readCircle()); //remove the circle from the list
			if(iterator==-1)
				System.out.println("The input shape is not in the list of shapes!");
		}));
		removeMenuItems.add(new MenuItem("Square", 2, (parameters) -> {
			int iterator = shapeList.removeShape(readSquare()); //remove the square from the list
			if(iterator==-1)
				System.out.println("The input shape is not in the list of shapes!");
		}));

		modifyMenuItems.add(new MenuItem("Circle", 1, (parameters) -> {
			int iterator = shapeList.removeShape(readCircle());
			if (iterator == -1)
				System.out.println("The input shape is not in the list of shapes!");
			else
				shapeList.addAtPosition(iterator, readCircle()); 
		}));
		modifyMenuItems.add(new MenuItem("Square", 2, (parameters) -> {
			int iterator = shapeList.removeShape(readSquare());
			if (iterator == -1)
				System.out.println("The input shape is not in the list of shapes!");
			else
				shapeList.addAtPosition(iterator, readSquare());
		}));

		mainMenuItems.add(new Menu("Add", 1, addMenuItems));
		mainMenuItems.add(new Menu("Remove", 2, removeMenuItems));
		mainMenuItems.add(new Menu("Modify", 3, modifyMenuItems));
		mainMenuItems.add(new MenuItem("View", 4, (parameters) -> {
			shapeList.draw();
		}));
		return new Menu("Main Menu", 0, mainMenuItems);

	}
}
