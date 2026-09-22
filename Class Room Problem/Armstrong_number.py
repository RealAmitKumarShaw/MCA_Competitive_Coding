n = int(input("Enter a number: "))

temp = n
digits = len(str(n))
sum = 0

while n > 0:
    rem = n % 10
    sum += rem ** digits
    n = n // 10

if sum == temp:
    print("The number is an Armstrong number")
else:
    print("The number is not an Armstrong number")