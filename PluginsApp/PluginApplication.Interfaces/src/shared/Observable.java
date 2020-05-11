package shared;

import java.util.ArrayList;

import interfaces.IObservable;
import interfaces.IObserver;

public class Observable implements IObservable{
	protected ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
		notifyObservers(this);
	}
	
	
	protected void notifyObservers(Object x) {
		for(IObserver val : observers) {
			val.notification(x);
		}
	}
}
