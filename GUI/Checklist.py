# Creating a Checklist to Make Life Easier

from tkinter import *
from tkinter import ttk
# import sv_ttk

# Create Title
root = Tk()
root.title("Checklist")
root.geometry("280x290")
root.config()

title = Label(root, text ='My Checklist', font=("Times New Roman", 26))
title.pack()

# Create Elements in List
elements = ["Element 1", "Element 2", "Element 3","Element 4", "Element 5", "Element 6"]
vars = []

for element in elements:
    var = BooleanVar()
    Checkbutton(root, text=element, variable=var, onvalue=True, offvalue=False, font=("Times New Roman", 14)).pack()
    vars.append(var)

# sv_ttk.set_theme("dark")

root.mainloop()
