void printNumbers(int limit):
	for (int i = 1; i <= limit; i++):
		if (i == 1):
			printf("%d is the first number\n", i)
		else if (i == limit):
			printf("%d is the last number\n", i)
		else if (i % 2 == 0):
			printf("%d is even\n", i)
		else:
			printf("%d is odd\n", i)
	end

int main():
	int count = 5
	int i = 0

	while (i < count):
		printf("Iteration %d\n", i + 1)
		i++

	printNumbers(count)
	return 0
end

