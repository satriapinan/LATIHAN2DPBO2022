class Memory: public Hardware {
	private:
		// Atribut
		int frequency;
		int memorySize;
		bool supportsCuda;

	public:
		// Kosntruktor
		Memory() {
			frequency = 0;
			memorySize = 0;
			supportsCuda = true;
		}

		// Set & Get

		// Frequency
		void setFrequency(int frequency) {
			this->frequency = frequency;
		}
		int getFrequency() {
			return frequency;
		}

		// Memory Size
		void setMemorySize(int memorySize) {
			this->memorySize = memorySize;
		}
		int getMemorySize() {
			return memorySize;
		}

		// Cuda
		void setSupportsCuda(char supportsCuda) {
			this->supportsCuda = (supportsCuda == 'y') ? true : false;
		}
		int getSupportsCuda() {
			return supportsCuda;
		}

		// Destruktor
		~Memory(){}
};