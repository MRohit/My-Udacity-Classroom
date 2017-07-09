import os
from string import digits
def rename_files():
	lst_files=os.listdir(r"D:\My Udacity Classroom\Programming-with-python\Lesson-2\prank")
	print(lst_files)
	cur_dir=os.getcwd()
	print(cur_dir)
	os.chdir(r"D:\My Udacity Classroom\Programming-with-python\Lesson-2\prank")
	for file_name in lst_files:
		remove_digits=str.maketrans('', '', digits)
		print("Old name ",file_name)
		print("New name: ",file_name.translate(remove_digits))
		os.rename(file_name,file_name.translate(remove_digits))
	os.chdir(cur_dir)
rename_files()