n = int(input("Enter a number: "))
temp = n
sum = 0
while n > 0:
    rem = n % 10
    sum = (sum * 10) + rem
    n = n // 10

if(sum == temp):
    print(f"The number is a pallindrom number{temp}")
else:
    print(f" {temp}Not a pallindrom number")