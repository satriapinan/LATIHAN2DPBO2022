from Hardware import Hardware

class Memory(Hardware):
	# Konstruktor
	def __init__(self):
		self.__frequency = 0
		self.__memorySize = 0
		self.__supportsCuda = True

	# Set & Get

	# Frequency
	def setFrequency(self, frequency):
		self.__frequency = frequency

	def getFrequency(self):
		return self.__frequency

	# Memory Size
	def setMemorySize(self, memorySize):
		self.__memorySize = memorySize

	def getMemorySize(self):
		return self.__memorySize

	# Supports Cuda
	def setSupportsCuda(self, supportsCuda):
		self.__supportsCuda = True if (supportsCuda == 'y') else False

	def getSupportsCuda(self):
		return self.__supportsCuda