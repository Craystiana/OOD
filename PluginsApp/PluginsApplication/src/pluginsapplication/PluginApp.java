package pluginsapplication;

import java.util.ArrayList;

public class PluginApp {

	 public static void main(String[] args)
	   {
		    System.out.println(" ==== Drawing Shapes ====");
			Menu mainMenu = initializeMainMenu();
			mainMenu.execute();
	   }

	private static Menu initializeMainMenu() {
		ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>(); 
		PluginManager pluginMan = new PluginManager();
       
	    ApplicationMenu menu = new ApplicationMenu(pluginMan);
	    menu.load();

		mainMenuItems.add(new Menu("Add", 1, menu.getMenu()));
		mainMenuItems.add(new Menu("Remove", 2, menu.getMenu()));
		mainMenuItems.add(new Menu("Modify", 3, menu.getMenu()));
		mainMenuItems.add(new MenuItem("View", 4, (parameters) -> {
			menu.getShapeList().draw();
		}));
		return new Menu("Main Menu", 0, mainMenuItems);
	 }
}
