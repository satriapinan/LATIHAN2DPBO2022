<?php

class Memory extends Hardware{
	// Atribut Private
	private $frequency;
	private $memorySize;
	private $supportsCuda;

	// Konstruktor
	function __construct() {
		$frequency = 0;
		$memorySize = 0;
		$supportsCuda = "";
	}

	// Set & Get

	// Frequency
	function setFrequency($frequency) {
		$this->frequency = $frequency;
	}
	function getFrequency() {
		return $this->frequency;
	}

	// Memory Size
	function setMemorySize($memorySize) {
		$this->memorySize = $memorySize;
	}
	function getMemorySize() {
		return $this->memorySize;
	}

	// Cuda
	function setSupportsCuda($supportsCuda) {
		$this->supportsCuda = ($supportsCuda == 'y') ? "YES" : "NO";
	}
	function getSupportsCuda() {
		return $this->supportsCuda;
	}
}

?>