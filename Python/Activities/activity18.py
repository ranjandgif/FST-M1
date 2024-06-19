import pandas

reading =pandas.read_csv("employee.csv")


print(reading ["Usernames"])

print(reading ["Usernames"][0])
print(reading ["Passwords"][1])

print(reading.sort_values('Usernames',ascending=True))
print(reading.sort_values('Passwords', ascending=False))