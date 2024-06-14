Python_dictionary =	{
  "apple": 120,
  "pomegranete":240 ,
  "grapes": 100
}
print(Python_dictionary)
fruits=input("enter fruits of your choice")
if (fruits in Python_dictionary ):

    print("the fruit is present and the price of it is")
    print(Python_dictionary.get(fruits))
else:
    print("The fruit is not present")


