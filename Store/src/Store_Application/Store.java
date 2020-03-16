package Store_Application;

import java.util.Vector;

public class Store {

protected Vector<Stock> stock = new Vector<>();
protected String store_name;
protected String store_location;

public void AddNewProduct(String name, String id, int weight, int price, int nr_products)
{
	Stock new_stock = new Stock(name, id, weight, price, nr_products);
	stock.add(new_stock);
}

public boolean CheckStock(String name)
{
	for(Stock it:stock)
	{
		if(it.GetName()==name)
		{
			if(it.nr_products>0)
				return true;
		}
	}
	return false;
}

public void RemoveProduct(String name)
{
	for(Stock it:stock)
	{
		if(it.GetName()==name)
		{
			stock.remove(it);
		}
	}
}
}
