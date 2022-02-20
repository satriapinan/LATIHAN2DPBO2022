public class Memory extends Hardware{
	// Atribut
	private int frequency;			// Frequency
	private int memorySize;			// Memory Size
	private boolean supportsCuda;	// Cuda

	// Konstruktor
	public Memory() {
		frequency = 0;
		memorySize = 0;
		supportsCuda = true;
	}

	/* Set & Get */

	// Frequency
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getFrequency() {
		return this.frequency;
	}

	// Memory Size
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	public int getMemorySize() {
		return this.memorySize;
	}

	// Cuda
	public void setSupportsCuda(char supportsCuda) {
		this.supportsCuda = (supportsCuda == 'y') ? true : false;
	}
	public boolean getSupportsCuda() {
		return this.supportsCuda;
	}
}