
import pandas as pp
from pandas import ExcelWriter
data_dic = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
Table = pp.DataFrame(data_dic)
print(Table)
Table.to_excel("employee_details.xlsx",index=False)

""" writer = pp.ExcelWriter("employee_details.xlsx")
Table.to_excel(writer,"sheet1",index=False)
writer.save()"""