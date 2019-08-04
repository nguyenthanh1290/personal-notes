def is_valid(isbn):
    """
    Check if the provided string is a valid ISBN-10.
    """

    isbn = isbn.replace('-', '')
    if len(isbn) is not 10:
        return False

    sum = 0
    for i, char in enumerate(reversed(isbn), 1):
        try:
            d = int(char)
        except ValueError:
            if i == 1 and char == 'X':
                d = 10
            else:
                return False
        sum += d * i

    return sum % 11 == 0
