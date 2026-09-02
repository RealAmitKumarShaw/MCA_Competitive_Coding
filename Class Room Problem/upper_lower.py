class upper_Lower:
    def change(self, s):
        result = s[0].upper() + s[1:-1] + s[-1].upper()
        print(result)

obj = upper_Lower()
s = input("Enter the String: ")
obj.change(s)
