DNA_TO_RNA = str.maketrans('GCTA', 'CGAU')

def to_rna(dna_strand):
    """
    Given a DNA strand, return its RNA complement (per RNA transcription).
    """

    return dna_strand.translate(DNA_TO_RNA)