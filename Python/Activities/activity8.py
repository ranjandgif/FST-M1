numbers = list(input("Enter a sequence of comma separated values: ").split(","))
print(numbers)
if numbers[0] == numbers[-1]: 
 print("true")
else:
    print("false")