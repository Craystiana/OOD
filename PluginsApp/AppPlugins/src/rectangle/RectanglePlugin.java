package rectangle;

import interfaces.IPluginsAppPlugin;
import interfaces.IShape;
import rectangle.Rectangle;;

public class RectanglePlugin implements IPluginsAppPlugin{
	@Override
    public String getUniqueNameText() {
        return "RectanglePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Rectangle";
    }

    @Override
    public IShape getShape() {
        return new Rectangle();
    }
}
