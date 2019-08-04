from datetime import datetime
from datetime import timedelta

"""
A gigasecond is 10^9 (1,000,000,000) seconds.
"""
GIGASECOND = timedelta(seconds=1e9)

def add(moment: datetime) -> datetime:
    """
    Calculate the moment when someone has lived for 10^9 seconds.
    """
    return moment + GIGASECOND
