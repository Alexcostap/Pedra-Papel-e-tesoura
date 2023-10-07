#Será criada a variavel composta 'a' para receber 10 valores 'float' que serão solicitados dentro de uma estrutura 'for'.
a = [" "]*10
for r in range (10):
    a[r] = float(input("Insira um número: "))
print(a)
# 'x' será uma variavel que multiplicará cada valor de 'a'.
x = float(input("Insira um número que será o multiplicador dos números anteriores"))
# A variavel composta 'm' será criada para armazerar os valores de 'a' multiplicados por 'x'.
m = [" "] * 10
for o in range(10):
    m[o] = x * a[o]
print(m)