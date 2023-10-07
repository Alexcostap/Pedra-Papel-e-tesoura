n = int(input("Informe um número: "))

a = [0]*n
b = [0]*n

for u in range (n):
    a[u] = float(input("Insira um número: "))
    b[u] = float(input("Insira um outro número: "))

soma = [0]*n
for t in range(n):
    soma[t] = a[t] + b[t]
print(soma)

