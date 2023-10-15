import random
def escolhaPalavra():
    frutas = ["uva", "laranja","melancia","kiwi","manga"]
    palavra = random.choice(frutas)
    linha = "-" * len(palavra)
    letraConsta = []
    return palavra, linha, letraConsta

def jogoDaForca():
    palavra, linha, letraConsta = escolhaPalavra()   

    print("Jogo da Forca")
    print(linha)
    contadorErro = 0
    while True:
        resposta = input("Insira uma letra:  ")
        # Se a resposta(letra) inserida for correta (dentro da palavra), a lista 'letraConsta' será incrementada com a letra da resposta
        #E aparecerá uma mensagem "Letra consta"
        if resposta in palavra:
            letraConsta.append(resposta)
            print("Letra consta")
            # A variável linha recebe a letra correta da lista "letraConsta", onde a letra não existir dentro da palavra será exibido um hífen'-'
            linha = "".join([letra if letra in letraConsta else "-" for letra in palavra])
            print(linha)
        # Se a resposta(letra) não estiver dentro da palavra, a flag(contadorErro) será incrementada e o boneco vai surgindo  
        else:
            contadorErro +=1
            if contadorErro == 1:
                print(f"Erro {contadorErro}")
                print("   O   ")
            elif contadorErro == 2:
                print(f"Erro {contadorErro}")
                print("   O   \n"
                      "   |      ")
            elif contadorErro == 3:
                print(f"Erro {contadorErro}")
                print("   O   \n"
                      "  /|   ")
            elif contadorErro == 4:
                print(f"Erro {contadorErro}")
                print("     O   \n"
                      "    /|\   ")
            elif contadorErro == 5:
                print(f"Erro {contadorErro}")
                print("     O   \n"
                      "    /|\   \n"
                      "     |     \n"
                      "    /      ")
            # Quando os erros chegarem e 6, o boneco se forma e o jogo encerra
            elif contadorErro == 6:
                print(f"Erro {contadorErro}, você perdeu!!")
                print("     O   \n"
                      "    /|\   \n"
                      "     |     \n"
                      "    / \    ")
                break
        
        # Se as letras completarem a palavra o jogo encerra com vitória do usuário
        if linha == palavra:
            print("Você venceu!!!")
            break
