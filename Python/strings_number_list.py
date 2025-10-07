s="Hello, World!"
print("original string:", s)
print("Uppercase:", s.upper())
print("Replace 'World' with 'Python':", s.replace("World", "Python"))
print("Split by comma:", s.split(","))

a=10
b=3
print("\nNumbers: a =", a, ", b =", b)
print("Addition:", a + b)
print("Subtraction:", a - b)
print("Division:", a / b)
print("Integer Division:", a // b)
print("Power:", a ** b)

lst = [1, 2, 3, 4, 5]
print("\nOriginal list:", lst)
lst.append(6)
print("After appending 6:", lst)
lst.remove(3)
print("After removing 3:", lst)
print("List sliced [1:4]:", lst[1:4])
print("Sum of list elements:", sum(lst))

print("\n--- Deep Dive: List ---")
squared = [x**2 for x in lst]
print("list comprehension (squared):", squared)

unsorted =[3,1,4,5,2]
print("Unsorted list:", unsorted)
unsorted.sort()
print("Sorted list:", unsorted)
unsorted.reverse()
print("Reversed List:", unsorted)
print("Index of 4 in List:", unsorted)
print("Is 2 in lst?", 2 in lst)

