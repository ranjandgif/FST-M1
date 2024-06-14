Tuple_numbers = (1,22,45,90,100,333,32)
print(Tuple_numbers)
numbers=input("enter any input from the storgae :")
for numbers in Tuple_numbers:
    if(numbers % 5==0):
        print (numbers)
    else:
        print("number is not divisible by 5")
