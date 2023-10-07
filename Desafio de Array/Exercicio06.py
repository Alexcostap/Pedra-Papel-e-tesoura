#Será criada a variavel composta 'q' para receber 5 valores 'float' que serão solicitados dentro de uma estrutura 'for'.
q = [" "] * 5
for o in range (5):
    q[o] = float(input("Insira um número: "))
# A estrutura 'for' a seguir apresentará a variavel 'q' de forma inversa.
for z in range (4, -1, -1):
    print(q[z], end=" ")