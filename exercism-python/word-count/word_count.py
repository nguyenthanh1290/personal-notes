import re

UNDERSCORE = '_'
SPACE = ' '
REGEXR_WORD = r'\b[\w\']+\b'


def count_words(sentence):
    """
    Count the occurrences of each word in the given phrase.
    """
    normalized_sentence = sentence.replace(UNDERSCORE, SPACE).lower()
    words = re.findall(REGEXR_WORD, normalized_sentence)

    dict = {}
    for w in words:
        if w in dict:
            dict[w] += 1
        else:
            dict[w] = 1

    return dict
