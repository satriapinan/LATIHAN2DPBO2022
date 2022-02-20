class Hardware: public Product {
	private:
		// Atribut
		string brand;	// Brand
		string model;	// Model

	public:
		// Konstruktor
		Hardware() {
			brand = "";
			model = "";
		}

		/* Set & Get */

		// Brand
		void setBrand(string brand) {
			this->brand = brand;
		}
		string getBrand() {
			return brand;
		}

		// Model
		void setModel(string model) {
			this->model = model;
		}
		string getModel() {
			return model;
		}

		// Destruktor
		~Hardware(){}
};