<?php

class Hardware extends Product{
	// Atribut Private
	private $brand;
	private $model;

	// Konstruktor
	function __construct() {
		$brand = "";
		$model = "";
	}

	// Set & Get

	// Brand
	function setBrand($brand) {
		$this->brand = $brand;
	}
	function getBrand() {
		return $this->brand;
	}

	// Model
	function setModel($model) {
		$this->model = $model;
	}
	function getModel() {
		return $this->model;
	}
}

?>