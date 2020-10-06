# Python3 code to check if 
# given number is Emirp or not. 

# Returns true if n is prime. 
# Else false. 
def isPrime( n ): 
	
	# Corner case 
	if n <= 1: 
		return False
	
	# Check from 2 to n-1 
	for i in range(2, n): 
		if n % i == 0: 
			return False
	
	return True

# Function will check whether 
# number is Emirp or not 
def isEmirp( n): 
	
	# Check if n is prime 
	n = int(n) 
	if isPrime(n) == False: 
		return False
		
		# Find reverse of n 
	rev = 0
	while n != 0: 
		d = n % 10
		rev = rev * 10 + d 
		n = int(n / 10) 
		
		
	# If both Original and Reverse 
	# are Prime, then it is an 
	# Emirp number 
	return isPrime(rev) 

# Driver Function 
n = 13 # Input number 
if isEmirp(n): 
	print("Yes") 
else: 
	print("No") 