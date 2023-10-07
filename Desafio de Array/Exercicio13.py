numeros = [0] * 5
for y in range (5):
    numeros[y] = int(input("Informe um número:  "))

pares = 0
for r in range (5):
    if numeros[r] %2 == 0:
        pares+=1
soma = 0
for o in range(5):
    soma += numeros[o]
media = soma/5
maiorMedia = 0
for k in range(5):
    if numeros[k] >= media:
        maiorMedia += 1 

maior = max(numeros)
menor = min(numeros)
print(f"Essa é a quantidade de números pares: ",pares)

print(f"Maior número da lista {maior}")
print(f"Menor número da lista {menor}")
print(f"Quantidade de número(s) da lista acima da média {maiorMedia}")




    

