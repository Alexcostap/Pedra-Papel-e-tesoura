import time 
class Banco:
    def __init__(self, cliente_nome,numero):
        self.numero = numero
        self.saldo=0
        self.cliente_nome = cliente_nome
        self.tipo="Conta Corrente"
        self.status=False
        self.limite= 0

    def Depositar(self,deposito):
        
        if self.status == True:
            self.saldo = deposito + self.saldo
            dataHora = time.localtime()
            print(f"Depósito de R${deposito} ás {dataHora.tm_hour}:{dataHora.tm_min} de {dataHora.tm_mday}/{dataHora.tm_mon}/{dataHora.tm_year}")
        else:
            print("Sua conta ainda está inativa!")

    def Sacar(self,valorSacar):
        if self.status == True:
            if self.saldo-valorSacar >= self.limite:
                dataHora = time.localtime()
                self.saldo = self.saldo-valorSacar
                print(f"Saque de R${valorSacar} ás {dataHora.tm_hour}:{dataHora.tm_min} de {dataHora.tm_mday}/{dataHora.tm_mon}/{dataHora.tm_year}")

            else:
                print("Valor do saque é superior ao limite da conta!!")
        else:
            print("Sua conta ainda está inativa!")

    def AtivarConta(self):
        if self.status == True:
            print("Sua conta já está em atividade")
        else:
            print(f"Conta ativada com SUCESSO!!!\n"
                  f"Nome: {self.cliente_nome}\n"
                  f"Conta: {self.numero}")
            self.status=True

    def CancelarConta(self):
        if self.saldo != 0:
            if self.saldo > 0:
                print("Sua conta ainda tem saldo. Faça o saque completo para poder encerrar a conta")
            elif self.saldo < 0:
                print("Sua conta ainda tem saldo pendente. Faça o deposito de valor pendente para poder encerrar a conta")
        else:
            self.status = False
            print("Conta cancelada com sucesso!")

    def VerificarSaldo(self):
        if self.status == True:
            print(f"Saldo atual da conta é: R${self.saldo}")
        else:
            print("Sua conta ainda está inativa!")
    def AtivarLimite(self):
        self.limite = -1000