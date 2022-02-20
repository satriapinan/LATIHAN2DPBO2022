#include <string>
#include <iostream>

using namespace std;

#include "Product.cpp"
#include "Hardware.cpp"
#include "Memory.cpp"

int main() {
	// Tmapilan awal
	cout << "===== Selamat Datang di Program Pendataan Memory =====\n" << endl;

	// Input banyak memory
	int jumlahMemory = 0;
	cout << "Masukan Banyak Memory : ";
	cin >> jumlahMemory;

	// Array memory sebanyak jumlah memory
	Memory memory[jumlahMemory];

	// Variabel temoraray untuk setiap atribut
	// Product
	string idProduct = "";
	int price = 0;
	// Hardware
	string brand = "";
	string model = "";
	// Memory
	int frequency = 0;
	int memorySize = 0;
	char supportsCuda = '0';
	
	// Perulangan input data untuk setiap memory (sebanyak jumlah memory)
	for(int i = 0; i < jumlahMemory; i++) {
		// Input data sekaligus setter

		cout << "=========== Masukan Data Memory " << i+1 << " ===========" << endl;	

		cout << "Brand              : ";
		cin >> brand;
		memory[i].setBrand(brand);

		cout << "ID Product         : ";
		cin >> idProduct;
		memory[i].setIDProduct(idProduct);

		cout << "Model              : ";
		cin >> model;
		memory[i].setModel(model);

		cout << "Frequency(MHz)     : ";
		cin >> frequency;
		memory[i].setFrequency(frequency);

		cout << "Memory Size(GB)    : ";
		cin >> memorySize;
		memory[i].setMemorySize(memorySize);

		cout << "Supports Cuda(y/n) : ";
		cin >> supportsCuda;
		memory[i].setSupportsCuda(supportsCuda);

		cout << "Price(Rp)          : ";
		cin >> price;
		memory[i].setPrice(price);
	}

	// Output sesuai user
	string find = "";
	int i, found;

	// Perulangan sampai user input "EXIT"
	while(find.compare("EXIT") != 0) {
		// inisialisasi nilai
		i = 0;
		found = 0;

		// Input memory berdasarkan brand yang ingin dicari
		cout << "\nMasukan Brand yang ingin dicari ('EXIT' untuk keluar): ";
		cin >> find;

		// Jika input bukan EXIT
		if(find.compare("EXIT") != 0) {
			// Searching memory yang dicari
			while(i != jumlahMemory) {
				// jika ditemukan
				if(find.compare(memory[i].getBrand()) == 0) {
					cout << "\n=========== Data Memory " << memory[i].getBrand() << " ==========" << endl;
				
					cout << "Brand           : " << memory[i].getBrand() << endl;
					cout << "ID Product      : " << memory[i].getIDProduct() << endl;
					cout << "Model           : " << memory[i].getModel() << endl;
					cout << "Frequency(MHz)  : " << memory[i].getFrequency() << endl;
					cout << "Memory Size(GB) : " << memory[i].getMemorySize() << endl;
					cout << "Support Cuda    : " << memory[i].getSupportsCuda() << endl;
					cout << "Price           : " << memory[i].getPrice() << endl;
				
					found++;
				}

				i++;
			}
			// Jika tidak ditemukan
			if(found == 0) {
				cout << "Memory " << find << ": NOT FOUND" << endl;
			}
		}
	}

	// Tampilan akhir
	cout << "\n=========== Terimakasih! ==========" << endl;

	return 0;
}