n = int(input("Enter a number: "))

temp = n
total = 0

while n > 0:
    rem = n % 10

    fact = 1
    for i in range(1, rem + 1):
        fact *= i

    total += fact
    n = n // 10

if total == temp:
    print("The number is a Strong number")
else:
    print("The number is not a Strong number")