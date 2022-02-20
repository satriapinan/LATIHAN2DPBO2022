from Product import Product

class Hardware(Product):
	# Konstruktor
	def __init__(self):
		self.__brand = ""
		self.__model = ""

	# Set & Get

	# Brand
	def setBrand(self, brand):
		self.__brand = brand

	def getBrand(self):
		return self.__brand

	# Model
	def setModel(self, model):
		self.__model = model

	def getModel(self):
		return self.__model