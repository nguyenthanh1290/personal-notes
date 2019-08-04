import re

REGEXR = r'\b[a-zA-Z]'

SINGLE_QUOTE = r"'"
UNDERSCORE = r'_'
HYPHEN = r'-'
SPACE = r' '


def abbreviate(words):
    """
    Convert a phrase to its acronym.
    """
    normalized_words = words.replace(SINGLE_QUOTE, '').replace(
        UNDERSCORE, '').replace(HYPHEN, SPACE)
    acr = re.findall(REGEXR, normalized_words)

    return "".join(acr).upper()
