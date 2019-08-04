def transform(legacy_data):
    """
    Transform scrabble scores from a legacy system.
    """
    # data = {}
    # for k in legacy_data.keys():
    #     for ch in legacy_data[k]:
    #         data[ch.lower()] = k

    # return data

    return {ch.lower(): k for k in legacy_data.keys() for ch in legacy_data[k]}