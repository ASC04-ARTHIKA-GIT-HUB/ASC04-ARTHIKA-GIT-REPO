def add_to_cart(cart, item, quantity):
    if item in cart:
        cart[item] += quantity
    else:
        cart[item] = quantity
    return cart

def print_cart(cart):
    if not cart:
        print("Your cart is empty.")
    else:
        print("Your cart contains:")
        for item, quantity in cart.items():
            print(f"- {item}: {quantity}")

def apply_discount(cart, discount_func):

    cart={}
    add_to_cart(cart, "apple", 3)
    add_to_cart(cart, "banana", 2)
    add_to_cart(cart, "orange", 5)
    add_to_cart(cart, "unknown_item", 1)

    print_cart(cart)

    
    