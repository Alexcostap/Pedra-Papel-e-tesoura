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
            self.comendo = False
        else:
            print(f"{self.nome} não esta comendo")


    def falar(self):
        if self.falando == True:
            print("Já estava falando")
        else:
            print(f"{self.nome} falando")
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
        else:
            print(f"{self.nome} foi dormir")

    def acordou(self):
        if self.dormindo == True:
            print("Acordou")
            self.dormindo = False
        else:
            print(f"{self.nome} estava acordado")


class Animal():
    def __init__(self,nome,cor):
        self.nome = nome
        self.cor = cor

    def comer(self):
        print(f"O {self.nome} foi comer")

    def emitirSom(self):
        print(f"O {self.nome} emitindo som")
class Gato(Animal):
    def __init__(self,nome, cor):
        super().__init__(nome, cor)

    def emitirSom(self):
        print(f"O {self.nome} miando")

class Cachorro(Animal):
    def __init__(self,nome, cor):
        super().__init__(nome, cor)

    def emitirSom(self):
        print(f"O {self.nome} está latindo")

class Gado(Animal):
    def __init__(self,nome, cor):
        super().__init__(nome, cor)

    def emitirSom(self):
        print(f"O {self.nome} está mugindo")
class Bode(Animal):
    def __init__(self,nome, cor):
        super().__init__(nome, cor)

    def emitirSom(self):
        print(f"O {self.nome} está berrando")






