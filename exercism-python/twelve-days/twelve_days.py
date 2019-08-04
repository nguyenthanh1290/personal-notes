CARDINAL = ("first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth")
PRESENTS = ("a Partridge in a Pear Tree.",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, ")


def verse(day):
    verse = f"On the {CARDINAL[day-1]} day of Christmas my true love gave to me: "
    for j in range(day-1, -1, -1):
        if day != 1 and j == 0:
          verse += "and "
        verse += PRESENTS[j]
    return verse


def recite(start_verse, end_verse):
    """
    Output the lyrics to 'The Twelve Days of Christmas'.
    """
    song = []
    for day in range(start_verse, end_verse+1):
      song.append(verse(day))

    return song
