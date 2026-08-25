class find_letters:
    def count(self, n):
        vowel = 0
        conconent = 0
        space = 0
        for i in n:
            if i.lower() in 'aeiou':
                vowel+=1
            elif i == " ":
                space+=1
            elif i.isalpha():
                conconent+=1
        print("Vowles:", vowel)
        print("Consonants:", conconent)
        print("Spaces:", space)

obj = find_letters()
n = input("Enter the String: ")
obj.count(n)