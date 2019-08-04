def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b):
        raise ValueError("same length strands are required.")

    # diff = 0
    # for i in range(len(strand_a)):
    #     if strand_a[i] != strand_b[i]:
    #         diff += 1
    
    # return diff

    return sum(a != b for a, b in zip(strand_a, strand_b))