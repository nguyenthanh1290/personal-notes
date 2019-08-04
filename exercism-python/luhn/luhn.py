import re


class Luhn(object):
    """
    The Luhn algorithm is a simple checksum formula used to validate
    a variety of identification numbers, such as credit card numbers
    and Canadian Social Insurance Numbers.
    """
    SPACE = ' '

    def __init__(self, card_num):
        self.card_num = card_num

    def is_valid(self):
        """
        Determine whether or not the number is valid per the Luhn formula.
        """

        card_num = self.card_num.replace(self.SPACE, '')
        match = re.search(r'^\d{2,}$', card_num)
        if not match:
            return False
        digits = [int(n) for n in match.group()]

        sum = 0
        alternate = False
        for d in reversed(digits):
            if alternate:
                d = d * 2
                if d > 9:
                    d -= 9
            sum += d
            alternate = not alternate

        return sum % 10 == 0
