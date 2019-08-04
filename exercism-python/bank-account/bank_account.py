import threading


class BankAccount(object):
    """
    Simulate a bank account supporting opening/closing,
    withdrawals, and deposits of money.

    Concurrent transactions are supported.
    """

    def __init__(self):
        self.balance = 0
        self.closed = True
        self._lock = threading.Lock()

    def get_balance(self):
        with self._lock:
            if self.closed:
                raise ValueError('Account is closed')

            return self.balance

    def open(self):
        with self._lock:
            if not self.closed:
                raise ValueError('Account is already opened')

            self.closed = False

    def deposit(self, amount):
        with self._lock:
            if self.closed:
                raise ValueError('Account is closed')
            elif amount < 0:
                raise ValueError('Negative amount is not accepted')

            self.balance += amount

    def withdraw(self, amount):
        with self._lock:
            if self.closed:
                raise ValueError('Account is closed')
            elif amount < 0:
                raise ValueError('Negative amount is not accepted')
            elif self.balance - amount < 0:
                raise ValueError(
                    'The amount to withdraw is greater than your current balance')

            self.balance -= amount

    def close(self):
        with self._lock:
            if self.closed:
                raise ValueError('Account is already closed')

            self.balance = 0
            self.closed = True
