package Store_Application;

public class Stock  { 

private Product product;
private int nr_products;

Stock(String name, String id, int weight, int price, int nr_products)
{
	product = new Product(name, id, weight, price);
	this.nr_products=nr_products;
}

public void UpdateStock(String feature, String update)
{
	if(feature=="name" || feature=="id" || feature=="weight" || feature=="price")
		product.UpdateProduct(feature, update);
	else
		nr_products=Integer.parseInt(update);
}

public void RemoveFromStock(int nr_products_removed)
{
	if(nr_products_removed<=nr_products)
		nr_products-=nr_products_removed;
	else
		System.out.println("That stock does not have that many products!");
}

public void AddToStock(int nr_products_added)
{
	nr_products+=nr_products_added;
}

public boolean available(int quantity)
{
	if(nr_products>=quantity)
		return true;
	else return false;
}

public String GetName()
{
	return  product.GetName();
}

public int GetNrProducts()
{
	return nr_products;
}
}
