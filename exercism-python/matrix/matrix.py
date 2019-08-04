class Matrix(object):
    def __init__(self, matrix_string):
        self._matrix = [[int(val) for val in row.split()] for row in matrix_string.split('\n')]

    def row(self, index):
        return self._matrix[index-1]

    def column(self, index):
        return list(list(zip(*self._matrix))[index-1])