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
        else:
            print(f"{self.nome} está comendo {comida}")
            self.comendo = True

    def parouComer(self):
        if self.comendo == True:
            print(f"{self.nome} parou de comer {self.comida}")
        else:
            print(f"{self.nome} não esta comendo")
            self.comendo = False

    def falar(self):
        if self.falando == True:
            print("Já estava falando")
        else:
            print(f"{self.nome} falando")
            self.falando = True

    def pararFalar(self):
        if self.falando == True:
            print(f"{self.nome} parou de falar")
        else:
            print(f"Não estava falando")
            self.falando = False

    def dormir(self):
        if self.dormindo == True:
            print("Está dormindo")
        else:
            print(f"{self.nome} foi dormir")

    def acordou(self):
        if self.dormindo == True:
            print("Acordou")
        else:
            print(f"{self.nome} estava acordado")
            self.dormindo = False





