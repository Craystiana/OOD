package rhombus;

import interfaces.IPluginsAppPlugin;
import interfaces.IShape;
import rhombus.Rhombus;

public class RhombusPlugin implements IPluginsAppPlugin{
	@Override
    public String getUniqueNameText() {
        return "RhombusPlugin";
    }

    @Override
    public String getDisplayText() {
        return "Rhombus";
    }

    @Override
    public IShape getShape() {
        return new Rhombus();
    }
}
