package pluginsapplication;

import java.util.ArrayList;
import interfaces.IShape;
import pluginsapplication.ShapeList;

public class ApplicationMenu {
	private PluginManager pluginMan;
	private Menu mainMenu = null;
	private ShapeList shapeList = new ShapeList();

	public ApplicationMenu(PluginManager pluginMan) {
		this.pluginMan = pluginMan;
	}

	public void load() {
		pluginMan.loadPlugins("/plugins");
		ArrayList<IMenuItem> menuItems = new ArrayList();

		int shortCut = 1;
		var plugins = pluginMan.getPlugins();

		for (int i = 0; i < plugins.size(); i++) {
			var currentPlugin = plugins.get(i);
			MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters) -> {
				IShape shape = currentPlugin.getShape();
				shape.read();
				shapeList.addShape(shape);
				//shapeList.notification(shape);
				shape.registerObserver(shapeList);
			});
			menuItems.add(currentItem);
		}
		mainMenu = new Menu("Main Menu", -1, menuItems);
	}

	public void execute() {
		mainMenu.execute();
	}
	
	public ShapeList getShapeList()
	{
		return shapeList;
	}
}
