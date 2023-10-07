m = [0]*5
for p in range (5):
    m[p] = float(input("Informe um número:  "))
n1 = float(input("Informe um número que deseja verificar se tem na lista:  "))
contador = 0
for i in range (5):
    if n1 == m[i]:
        contador+=1
if contador == 0:
    print("Número não encontrado")
print(contador)