class Product {
	private: 
		// Atribut
		string idProduct;	// ID Product
		int price;			// Harga

	public:
		// Konstruktor
		Product() {
			idProduct = "";
			price = 0;
		}

		/* Set & Get */

		// ID Product
		void setIDProduct(string idProduct) {
			this->idProduct = idProduct;
		}
		string getIDProduct() {
			return idProduct;
		}

		// Price
		void setPrice(int price) {
			this->price = price;
		}
		int getPrice() {
			return price;
		}

		// Destruktor
		~Product(){}
};