public class Hardware extends Product{
	// Atribut
	private String brand;	// Brand
	private String model;	// Model

	// Konstruktor
	public Hardware() {
		brand = "";
		model = "";
	}

	/* Set & Get */

	// Brand
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}

	// Model
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
}