#Será criada a variavel composta 'nomeUser' e 'senhaUser' para receber 5 valores 'string' que serão solicitados dentro de uma estrutura 'for'.
nomeUser = [" "] * 5
senhaUser = [" "] * 5
for t in range(5):
    nomeUser[t] = input("Informe o seu primeiro nome: ")
    senhaUser[t] = input("Informe sua senha: ")
# o 'for' a seguir irá exibir o nome, senha e posição respectivamente em seus array.
for y in range(5):
    print(f"Nome do usuário: {nomeUser[y]}, na posição {y}")
    print(f"Senha do usuário: {senhaUser[y]}, na posição {y}")
    print("=-="*15)