#Será criada a variavel composta 'nomeUser' e 'senhaUser' para receber 5 valores 'string' que serão solicitados dentro de uma estrutura 'for'.
nomeUser = [" "] * 5
senhaUser = [" "] * 5
for t in range(5):
    nomeUser[t] = input("Informe o seu primeiro nome: ")
    senhaUser[t] = input("Informe sua senha: ")
print("+"*25)
# As variaveis 'login' e 'senha' serão criadas para receber informações do usuário
login = input("Informe seu Login: ")
senha = input("Informe sua senha: ")
# o 'for' a seguir irá verificar se o 'login' e 'senha' constam respectivamente em seus arrays.
for y in range(5):
    if login == nomeUser[y] and senha == senhaUser[y]:
        print(f"Login efetuado com sucesso, {nomeUser[y]}")
        break
else:
    print("Login ou senha inválidas")