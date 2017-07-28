import urllib.request
def read_file():
	f = open(r"D:\My-Udacity-Classroom\Programming-with-python\Lesson-5\movie_quotes.txt")
	contents = f.read()
	print(contents)
	check_profanity(contents)
	f.close()

def check_profanity(text):
	connection = urllib.request.urlopen("http://www.wydl.com/profanity?q="+text)
	response = connection.read()
	print(response)
	
	connection.close()
	if "true" in response:
		print("Profanity alert!!")
	elif "false" in response:
		print("This document has no curse words")
	else:
		print("Could not scan the document properly")
read_file()