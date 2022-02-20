import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Untuk input
		Scanner sc = new Scanner(System.in);
		
		// Tampilan awal
		System.out.println("===== Selamat Datang di Program Pendataan Memory =====\n");

		// Input banyak memory
		System.out.print("Masukan Banyak Memory : ");
		
		int jumlahMemory = 0;
		try {
			jumlahMemory = sc.nextInt();
		} catch(Exception e) {}
		System.out.println();

		// array Memory sebanyak jumlah memory
		Memory memory[] = new Memory[jumlahMemory];

		// Variabel temoraray untuk setiap atribut
		// Product
		String idProduct = "";
		int price = 0;
		// Hardware
		String brand = "";
		String model = "";
		// Memory
		int frequency = 0;
		int memorySize = 0;
		char supportsCuda = '0';

		// Perulangan input data untuk setiap memory (sebanyak jumlah memory)
		for(int i = 0; i < jumlahMemory; i++) {
			// Input data sekaligus setter

			System.out.println("=========== Masukan Data Memory " + (i+1) + " =========");
			memory[i] = new Memory();
			
			System.out.print("Brand              : ");
			try {
				brand = sc.next();
			} catch(Exception e) {}
			memory[i].setBrand(brand);

			System.out.print("ID Product         : ");
			try {
				idProduct = sc.next();
			} catch(Exception e) {}
			memory[i].setIDProduct(idProduct);

			System.out.print("Model              : ");
			try {
				model = sc.next();
			} catch(Exception e) {}
			memory[i].setModel(model);
			
			System.out.print("Frequency(MHz)     : ");
			try {
				frequency = sc.nextInt();
			} catch(Exception e) {}
			memory[i].setFrequency(frequency);

			System.out.print("Memory Size(GB)    : ");
			try {
				memorySize = sc.nextInt();
			} catch(Exception e) {}
			memory[i].setMemorySize(memorySize);

			System.out.print("Supports Cuda(y/n) : ");
			try {
				supportsCuda = sc.next().charAt(0);
			} catch(Exception e) {}
			memory[i].setSupportsCuda(supportsCuda);
			
			System.out.print("Price(Rp)          : ");
			try {
				price = sc.nextInt();
			} catch(Exception e) {}
			memory[i].setPrice(price);
		}

		// Output sesuai User

		String find = "";
		int i, found;

		// Perulangan sampai user input "EXIT"
		while(find.equals("EXIT") != true) {
			// Inisialisasi nilai
			i = 0;
			found = 0;

			// Input memory berdasarkan brand yang ingin dicari
			System.out.print("\nMasukan Brand yang ingin dicari ('EXIT' untuk keluar): ");
			try {
				find = sc.next();
			} catch(Exception e) {}

			// Jika input bukan EXIT
			if(find.equals("EXIT") != true) {
				// Searching memory yang dicari
				while(i != jumlahMemory) {
					// Jika ditemukan
					if(find.equals(memory[i].getBrand()) == true) {
						System.out.println("\n=========== Data Memory " + memory[i].getBrand() + " ==========");
				
						System.out.println("Brand           : " + memory[i].getBrand());
						System.out.println("ID Product      : " + memory[i].getIDProduct());
						System.out.println("Model           : " + memory[i].getModel());
						System.out.println("Frequency(MHz)  : " + memory[i].getFrequency());
						System.out.println("Memory Size(GB) : " + memory[i].getMemorySize());
						System.out.println("Supports Cuda   : " + memory[i].getSupportsCuda());
						System.out.println("Price           : " + memory[i].getPrice());

						found++;
					}

					i++;
				}
				// Jika tidak ditemukan
				if(found == 0) {
					System.out.println("Memory " + find + ": NOT FOUND");
				}
			}
		}

		// Tampilan akhir
		System.out.println("\n=========== Terimakasih! ==========");
	}
}