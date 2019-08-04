import re


class Phone(object):
    """
    Clean up user-entered phone numbers based on the NANP format.
    """

    _pattern = re.compile(r'''
            ^
            \+?1?               # optional literal `+` and country code
            (?:[-. ]+)?         # optional separators
            \(?([2-9]\d{2})\)?  # the area code, with or without surrounding parens
            (?:[-. ]+)?         # optional separators
            ([2-9]\d{2})        # the exchange code
            (?:[-. ]+)?         # optional separators
            (\d{4})             # the subscriber number
            $
        ''', re.VERBOSE)

    def __init__(self, phone_number):
        try:
            self.area_code, self.exchange, self.subscriber = \
                self._pattern.search(phone_number.strip()).group(1, 2, 3)
            
            self.number = self.area_code + self.exchange + self.subscriber
        except AttributeError:
            raise ValueError('Invalid phone number')

    def pretty(self):
        return f'({self.area_code}) {self.exchange}-{self.subscriber}'
