package Store_Application;

import java.util.Vector;

public class Store {

private Vector<Stock> stock = new Vector<>();
private String store_name;

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
			if(it.GetNrProducts()>0)
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

public String GetStoreName()
{
	return store_name;
}
}
