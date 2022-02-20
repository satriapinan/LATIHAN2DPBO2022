from Memory import Memory

# Tampilan awal
print("===== Selamat Datang di Program Pendataan Memory =====\n")

# Input banyak memory
jumlahMemory = int(input("Masukan Banyak Memory : "))
print()

# Alokasi dan sekaligus instansiasi untuk banyak memory
memory = [Memory() for i in range(jumlahMemory)]

# Perulangan input data untuk setiap memory (sebanyak jumlah memory)
for i in range(jumlahMemory):
	# Input data sekaligus setter

	print("=========== Masukan Data Memory", i+1, "===========")

	memory[i].setBrand(input("Brand              : "))
	memory[i].setIDProduct(input("ID Product         : "))
	memory[i].setModel(input("Model              : "))
	memory[i].setFrequency(int(input("Frequency(MHz)     : ")))
	memory[i].setMemorySize(int(input("Memory Size(GB)    : ")))
	memory[i].setSupportsCuda(input("Supports Cuda(y/n) : "))
	memory[i].setPrice(int(input("Price(Rp)          : ")))

# Perulangan sampai user input "EXIT"
find = ""
while (find != "EXIT"):
	# Inisialisasi nilai
	i = 0
	found = 0

	# Input memory berdasarkan brand yang ingin dicari
	find = input("\nMasukan Brand yang ingin dicari ('EXIT' untuk keluar): ")

	# Jika input bukan EXIT
	if find != "EXIT":
		# Searching memory yang dicari
		while (i != jumlahMemory):
			# Jika ditemukan 
			if find == memory[i].getBrand():
				print("\n=========== Data Memory", memory[i].getBrand(), "==========")

				print("Brand           :", memory[i].getBrand())
				print("ID Product      :", memory[i].getIDProduct())
				print("Model           :", memory[i].getModel())
				print("Frequency(MHz)  :", memory[i].getFrequency())
				print("Memory Size(GB) :", memory[i].getMemorySize())
				print("Supports Cuda   :", memory[i].getSupportsCuda())
				print("Price           :", memory[i].getPrice())

				found += 1

			i += 1

		# Jika tidak ditemukan
		if found == 0:
			print("Memory", find, ": NOT FOUND!")

# Tampilan akhir
print("\n=========== Terimakasih! ==========")