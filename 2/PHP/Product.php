<?php

class Product{
	// Atribut Private
	private $idProduct;
	private $price;

	// Konstruktor
	function __construct() {
		$idProduct = "";
		$price = 0;
	}

	// Set & Get

	// ID Product
	function setIDProduct($idProduct) {
		$this->idProduct = $idProduct;
	}
	function getIDProduct() {
		return $this->idProduct;
	}

	// Price
	function setPrice($price) {
		$this->price = $price;
	}
	function getPrice() {
		return $this->price;
	}
}

?>