package interfaces;

import shared.Point;

public interface IShape extends IObservable{
	    void draw();
	    void read();
	    String details();
	    Point getBoundingRectangle();
}
