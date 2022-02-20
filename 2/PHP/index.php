<?php

include "Product.php";
include "Hardware.php";
include "Memory.php";

echo "<h3>===== Selamat Datang di Program Pendataan Memory =====</h3>";

// Inisialisasi dan instansiasi
$memory = [];
for($i = 0; $i < 4; $i++) { 
	$memory[$i] = new Memory();
}

// Setter (input data)

// Memory 1
$memory[0]->setBrand("Adata");
$memory[0]->setIDProduct("Spectrix");
$memory[0]->setModel("D80");
$memory[0]->setFrequency(1433);
$memory[0]->setMemorySize(16);
$memory[0]->setSupportsCuda('n');
$memory[0]->setPrice(1520000);

// Memory 2
$memory[1]->setBrand("Corsair");
$memory[1]->setIDProduct("DOMINATOR");
$memory[1]->setModel("Platinum");
$memory[1]->setFrequency(3200);
$memory[1]->setMemorySize(16);
$memory[1]->setSupportsCuda('y');
$memory[1]->setPrice(2389000);

// Memory 3
$memory[2]->setBrand("Kingston");
$memory[2]->setIDProduct("HyperX");
$memory[2]->setModel("Fury");
$memory[2]->setFrequency(2666);
$memory[2]->setMemorySize(16);
$memory[2]->setSupportsCuda('n');
$memory[2]->setPrice(1522500);

// Memory 4
$memory[3]->setBrand("Corsair");
$memory[3]->setIDProduct("Vengeance");
$memory[3]->setModel("LPX");
$memory[3]->setFrequency(2666);
$memory[3]->setMemorySize(16);
$memory[3]->setSupportsCuda('y');
$memory[3]->setPrice(1299000);

// Getter Output
for($i = 0; $i < 4; $i++) { 
	echo "<b>=========== Data Memory ". ($i+1). " ==========</b><br>";

	echo "Brand           : ". $memory[$i]->getBrand(). "<br>";
	echo "ID Product      : ". $memory[$i]->getIDProduct(). "<br>";
	echo "Model           : ". $memory[$i]->getModel(). "<br>";
	echo "Frequency(MHz)  : ". $memory[$i]->getFrequency(). "<br>";
	echo "Memory Size(GB) : ". $memory[$i]->getMemorySize(). "<br>";
	echo "Support Cuda    : ". $memory[$i]->getSupportsCuda(). "<br>";
	echo "Price           : ". $memory[$i]->getPrice(). "<br>";
}

echo "<h4>===== Terimakasih! =====</h4>";

?>