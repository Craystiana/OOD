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
	  
		mainMenuItems.add(new MenuItem("Add", 1, (parameters) ->  {
		    menu.execute();
		}));
		mainMenuItems.add(new MenuItem("Remove", 2, null));
		mainMenuItems.add(new MenuItem("Modify", 3, null));
		mainMenuItems.add(new MenuItem("View", 4, (parameters) -> {
			menu.getShapeList().draw();
		}));
		return new Menu("Main Menu", 0, mainMenuItems);
	 }
}
