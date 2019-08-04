class Clock(object):
    """
    A clock implementation that handles times without dates.
    """

    TOTAL_MINUTE_OF_A_DAY = 24 * 60

    def __init__(self, hour, minute):
        self.minutes = (minute + 60 * hour) % self.TOTAL_MINUTE_OF_A_DAY

    def __repr__(self):
        return '{:02d}:{:02d}'.format(self.minutes // 60, self.minutes % 60)

    def __eq__(self, other):
        """
        Two clocks that represent the same time should be equal to each other.
        """
        return self.minutes == other.minutes

    def __add__(self, minutes):
        """
        Add minutes to the current time.
        """
        self.minutes = (self.minutes + minutes) % self.TOTAL_MINUTE_OF_A_DAY
        return self

    def __sub__(self, minutes):
        """
        Subtract minutes to the current time.
        """

        self.minutes = (self.minutes - minutes) % self.TOTAL_MINUTE_OF_A_DAY
        return self
