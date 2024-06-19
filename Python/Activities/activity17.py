import pandas

data_dic={
    "Usernames": ("admin", "Charles", "Deku"),
  "Passwords": ("password", "Charl13", "AllMight")
}
Table = pandas.DataFrame(data_dic)
print(Table)
Table.to_csv("employee.csv",index=False)