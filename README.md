# LATIHAN2DPBO2022

## Identitas
1. Nama : Satria Pinandita Abyatarsyah
2. NIM : 2000514
3. Prodi : Ilmu Komputer

## Janji
Saya Satria Pinandita Abyatarsyah mengerjakan evaluasi Latihan 2 Tugas Praktikum dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Analisis Desain
### Product
Sebuah kelas "Product" dengan atribut:
1. ID Product
2. Price
### Hardware
Sebuah kelas "Hardware" yang merupakan inheritance dari kelas "Product" dengan atribut:
1. Brand
2. Model
### Memory
Sebuah kelas "Memory" yang merupakan inheritance dari kelas "Hardware" dengan atribut:
1. Frequency
2. Memory Size
3. Supports Cuda
Dengan demikian desain kelas dari program ini adalah Multilevels Inheritance dengan skema sebagai berikut: Product <-- Hardware <-- Memory.
Lalu di dalam class dibuat lah "Setter" dan "Getter". Dalam main/index terdapat input user untuk "Jumlah Tim" dan "Jumlah Pemain". Lalu input data Tim dilakukan sebanyak "Jumlah Tim" dan untuk data "Nama Pemain" diinput sebanyak "Jumlah Pemain". Lalu dipanggil Setter untuk setiap data yang sudah diinput. Untuk output digunakan Getter
