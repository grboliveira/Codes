# keras.io/activations/
import numpy as np 

# Transfer functions
def stepFunction(soma): # Apenas para problemas linearmente separáveis
    if(soma >= 1):
        return 1
    return 0

def sigmoidFunction(soma): # Para problemas de classificação binária
    return 1 / (1 + np.exp(-soma))

def tanhFunction(soma): # Tangente hiperbólica para classificação
    return (np.exp(soma) - np.exp(-soma)) / (np.exp(soma) + (np.exp(-soma)))

def reluFunction(soma): # Rectified linear units para redes neurais convolucionais
    if(soma >= 0):
        return soma
    return 0

def linearFunction(soma): # Utilizada para regressão
    return soma

def softmaxFunction(x): # Retorna probabilidades para problemas de classificação com mais de duas classes
    ex = np.exp(x)
    return ex / ex.sum()

# Testes
soma = (5 * 0.2) + (2 * 0.5) + (1 * 0.1)

teste1 = stepFunction(soma) 
teste2 = sigmoidFunction(soma)
teste3 = tanhFunction(soma)
teste4 = reluFunction(soma)
teste5 = linearFunction(soma)
valores = [5.0, 2.0, 1.3]

print('Soma: ', soma)
print('Step Function: ', teste1)
print('Sigmoid Function: ', teste2)
print('Tanh Function: ', teste3)
print('Relu Function: ', teste4)
print('Linear Function: ', teste5)
print(softmaxFunction(valores))