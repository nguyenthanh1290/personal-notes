def two_fer_1(name):
    if not name:
      name = 'you'
    
    return 'One for {}, one for me.'.format(name)

def two_fer(name='you'):
    return f'One for {name}, one for me.'