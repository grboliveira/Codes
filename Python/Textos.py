nome = str(input('Digite o seu nome: ')).strip()
print('Seu nome tem ao todo {} letras'.format(len(nome) - nome.count(' ')))