text = "Hello World"
print(text[0])
print('World' in text)
print(len(text))
print(text.find('o'))
print(text == "Hello World")
other = "hello world"
print(text.lower() == other.lower())
words = ['Hello', 'World']
print(' '.join(words))
print(text.rfind('o'))
print(text[0:5])
print(text.lower())
print(text.upper())
messy = "   Hello World   "
print(messy.strip())
text = "Hello World"

# Indexing
print(text[0])  # Output: H  # First character

# Membership test
print('World' in text)  # Output: True  # Checks if 'World' is in text

# Length
print(len(text))  # Output: 11  # Number of characters

# find()
print(text.find('o'))  # Output: 4  # First occurrence of 'o'

# Equality
print(text == "Hello World")  # Output: True  # Exact match

# Case-insensitive equality
other = "hello world"
print(text.lower() == other.lower())  # Output: True  # Ignores case

# join()
words = ['Hello', 'World']
print(' '.join(words))  # Output: Hello World  # Joins list into string

# rfind()
print(text.rfind('o'))  # Output: 7  # Last occurrence of 'o'

# Slicing
print(text[0:5])  # Output: Hello  # First 5 characters

# lower()
print(text.lower())  # Output: hello world  # All lowercase

# upper()
print(text.upper())  # Output: HELLO WORLD  # All uppercase

# strip()
messy = "   Hello World   "
print(messy.strip())  # Output: Hello World  # Removes leading/trailing spaces