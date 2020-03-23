package Store_Application;
public class Product {
	
private String name;
private String id;
private int weight;
private int price;

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

public String GetId()
{
	return id;
}

public int GetWeight()
{
	return weight;
}

public int GetPrice()
{
	return price;
}
}
