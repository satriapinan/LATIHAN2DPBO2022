public class Product {
	// Atribut
	private String idProduct;	// ID Product
	private int price;			// Harga

	// Konstruktor
	public Product() {
		idProduct = "";
		price = 0;
	}

	/* Set & Get */

	// ID Product
	public void setIDProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getIDProduct() {
		return this.idProduct;
	}

	// Price
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}