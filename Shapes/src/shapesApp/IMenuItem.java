package shapesApp;

public interface IMenuItem {
	String getText();
	int getShortCut();

	void render();
	void execute();
}
