def multiplication_table_for(num):
    print("Using for loop:")
    for i in range(1, 11):
        print(f"{num} x {i} = {num * i}")

def multiplication_table_while(num):
    print("\nUsing while loop:")
    i = 1
    while i <= 10:
        print(f"{num} x {i} = {num * i}")
        i += 1

def multiplication_table_do_while(num):
    print("\nUsing simulated do-while loop:")
    i = 1
    while True:
        print(f"{num} x {i} = {num * i}")
        i += 1
        if i > 10:
            break

# Example usage
number = 2
multiplication_table_for(number)
multiplication_table_while(number)
multiplication_table_do_while(number)