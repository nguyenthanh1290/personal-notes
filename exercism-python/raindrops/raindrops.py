drops = ((3,'Pling'), (5,'Plang'), (7,'Plong'))

def raindrops(number):
    """
    Converts a number to a string according to the raindrop sounds.
    """

    speak = ''.join([s for n, s in drops if number%n == 0])
    return speak if speak else str(number)
