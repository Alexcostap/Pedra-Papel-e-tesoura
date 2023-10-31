from biblioteca import*

conta = Banco(input("Informe seu nome: "), input("Insira o número da conta que deseja: "))
vezesDeposito = 0

while True:
    opcao = input("1 - Para ativar a conta\n"
                  "2 - Para depositar\n"
                  "3 - Para sacar\n"
                  "4 - Para verificar Saldo\n"
                  "5 - Para cancelar a conta\n"
                  "6 - Para nenhuma das opções\n"
                  "")
    if opcao == "1":
        conta.AtivarConta()

    elif opcao == "2":
        deposito = float(input("Informe o valor que deseja depositar: "))
        conta.Depositar(deposito)
        vezesDeposito +=1

    elif opcao == "3":
        saque = float(input("Informe o valor que deseja sacar: "))
        conta.Sacar(saque)

    elif opcao == "4":
        conta.VerificarSaldo()

    elif opcao == "5":
        conta.CancelarConta()

    elif opcao == "6":
        break
    if vezesDeposito >= 2:
        conta.AtivarLimite()
print("Sessão encerrada!!")