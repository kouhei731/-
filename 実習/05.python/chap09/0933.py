def list_str(*args) -> str:

    return str(list(args))

print('list_str(1, 2, 3) = {}'.format(list_str(1, 2, 3)))
print('list_str(5, 7.77, 5) = {}'.format(list_str(5, 7.77, 5)))
print('list_str(3.5, 4.7, 8.2) = {}'.format(list_str(3.5, 4.7, 8.2)))