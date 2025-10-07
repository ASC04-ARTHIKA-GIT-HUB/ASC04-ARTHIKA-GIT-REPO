store_name = "shopEase"
# f --> is used to format the string with variable
welcome_message = f"Welcome to {store_name} - Your Online Marketplace!"
print(welcome_message)

#Let's use diff variable 
item_count = 150
item_price = 29.99
is_available = True
item_description = "A versatile gadget for everyday use."
item_tags = ["gadget", "electronics", "utility"]
item_details = {"brand": "TechCrop", "warranty": "2 years"}
item_id = None

print(f"Item Count: {item_count}")
print(f"Item price: ${item_price}")
print(f"Is Available: {is_available}")
print(f"Item Description: {item_description}")
print(f"Item Tags: {item_tags}")
print(f"Item Details: {item_details}")
print(f"Item ID: {item_id}")

# Demonstrating type conversion
total_cost = item_count * item_price
total_cost_str = str(total_cost)
print(f"Total cost for {item_count} item(s): ${total_cost_str}")

