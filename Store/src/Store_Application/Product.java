package Store_Application;
public class Product {
	
protected String name;
protected String id;
protected int weight;
protected int price;

Product(String name, String id, int weight, int price)
{
	this.name=name;
	this.id=id;
	this.weight = weight;
	this.price=price;
}

public void UpdateProduct(String feature, String update)
{
	if(feature=="name")
		name=update;
	else if(feature=="id")
		id=update;
	else if(feature=="quantity")
		weight=Integer.parseInt(update);
	else if(feature=="price")
		price=Integer.parseInt(update);
}

public String GetName()
{
	return name;
}

}
