class Pessoa:
    #MÉTODO CONSTRUTOR
    def __init__(self,nome,peso,idade):
        self.nome = nome
        self.peso = peso
        self.idade = idade
        self.comendo = False
        self.falando = False
        self.dormindo = False

    def comer(self,comida):
        self.comida = comida
        if self.comendo == True:
            print(f"{self.nome} estava comendo")
        elif self.comendo and self.dormindo and self.falando == False:
            print(f"{self.nome} começou a comer {comida}")
            self.comendo = True

    def parouComer(self):
        if self.comendo == True:
            print(f"{self.nome} parou de comer {self.comida}")
            self.comendo = False
        else:
            print(f"{self.nome} não esta comendo")
            
    def falar(self):
        if self.falando == True:
            print("Já estava falando")
        elif self.falando and self.dormindo and self.comendo == False:
            print(f"{self.nome} começou a falar")
            self.falando = True

    def pararFalar(self):
        if self.falando == True:
            print(f"{self.nome} parou de falar")
            self.falando = False
        else:
            print(f"Não estava falando")
            

    def dormir(self):
        if self.dormindo == True:
            print("Está dormindo")
        elif self.dormindo and self.falando and self.comendo == False:
            print(f"{self.nome} foi dormir")
            self.dormindo == True

    def acordou(self):
        if self.dormindo == True:
            print("Acordou")
            self.dormindo = False
        else:
            print(f"{self.nome} estava acordado")
            





