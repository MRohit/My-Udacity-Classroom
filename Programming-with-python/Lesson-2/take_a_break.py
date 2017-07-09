import webbrowser
import time

#time.sleep(10)
total_breaks=3
break_count=0

print("This program started on "+time.ctime())

while(break_count < total_breaks):
	time.sleep(10)
	webbrowser.open("https://www.google.co.in")
	break_count=break_count+1