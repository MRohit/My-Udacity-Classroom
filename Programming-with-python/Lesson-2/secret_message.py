import os
from string import digits

def secretMessage():
	files_list=os.listdir(r"C:\Users\Milind\Downloads\alphabet")
	print(files_list)
	cur_dir=os.getcwd()
	os.chdir(r"C:\Users\Milind\Downloads\alphabet")
	
	for file_name in files_list:
		remove_digits=str.maketrans('','',digits)
		#remove_digits=str.maketrans('', '', digits)
		os.rename(file_name,file_name.translate(remove_digits))

secretMessage()