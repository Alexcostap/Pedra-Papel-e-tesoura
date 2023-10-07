maoUser = int(input("Insira \n"
                 "1 - Pedra\n"
                 "2 - Papel\n"
                 "3 - Tesoura \n"))

maoComputador = int(input("Insira um número de 1 - 3: \n"))

if maoComputador == 1:
    if maoUser == 1:
        print("Empate")
    elif maoUser == 2:
        print("Usuario Venceu")
    elif maoUser == 3:
        print("Maquina Venceu") 
elif maoComputador == 2:
    if maoUser == 1:
        print("Maquina Venceu")
    elif maoUser == 2:
        print("Empate")
    elif maoUser == 3:
        print("Usuario Venceu")
elif maoComputador == 3:
    if maoUser == 1:
        print("Usuario Venceu")
    elif maoUser == 2:
        print("Maquina venceu")
    elif maoUser == 3:
        print("Empate")