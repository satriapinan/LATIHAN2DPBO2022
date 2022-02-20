class Product:
	# Konstruktor
	def __init__(self):
		self.__idProduct = ""
		self.__price = 0

	# Set & Get

	# ID Product
	def setIDProduct(self, idProduct):
		self.__idProduct = idProduct

	def getIDProduct(self):
		return self.__idProduct

	# Price
	def setPrice(self, price):
		self.__price = price

	def getPrice(self):
		return self.__price