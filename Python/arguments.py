import sys
print("script name: ", sys.argv[0])
if len(sys.argv) > 1:
    print("arguments passed:", sys.argv[1:])
else:
    print("No arguments passed.")
