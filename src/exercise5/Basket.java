package exercise5;

public class Basket {

	// ..
	float getTotalPrice(Item i) {
		float price = i.getPrice() + i.getTax();
		if (i.isOnSale())
			price = price - i.getSaleDiscount() * price;
		return price;
	}
}
