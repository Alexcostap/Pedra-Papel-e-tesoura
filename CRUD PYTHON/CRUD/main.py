from conexao_BD import *
from biblioteca import *
cursor = conexao.cursor()

while True:
    print("=-="*10,"MENU","=-="*10,"\n")
    tabelaEscolhida = int(input("Informe a tabela que você deseja: \n"
                            "1 - Alunos\n"
                            "2 - Modalidades\n"
                            "3 - Funcionarios\n"
                            "4 - Personal\n"
                            "5 - Para Sair do Menu\n"
                            "Escolha:  "))
    if tabelaEscolhida == 5:
        break
    elif tabelaEscolhida <=0 or tabelaEscolhida >=6:
        print("Opção Inválida!")

    while True:
        print("=-=" * 10, "MENU", "=-=" * 10,"\n")

        acao = int(input("1 - Para Inserir\n"
                         "2 - Para Ler\n"
                         "3 - Para Alterar\n"
                         "4 - Para Deletar\n"
                         "5 - Para retornar ao menu anterior\n"
                         "Escolha:  "))
        if acao == 5:
            break
        elif acao <1 or acao >=6:
            print("Opção inválida!")
        # 1 = Inserir
        elif acao == 1:
            # 1 = Alunos
            if tabelaEscolhida == 1:
                nome = input("Informe o nome: ")
                cpf = int(input("Informe o CPF: "))
                telefone = int(input("Informe o telefone: "))
                email = input("Informe o email: ")
                endereco = input("Informe o endereço: ")
                inserirAluno(nome,cpf,telefone,email,endereco)
            # 2 = Modalidades
            elif tabelaEscolhida == 2:
                nome = input("Insira o nome da modalidade: ")
                inserirModalidade(nome)
            # 3 = Funcionarios
            elif tabelaEscolhida == 3:
                nome = input("Infome o nome: ")
                cpf = input("Informe o CPF: ")
                departamento = int(input("Informe o departamento: "))
                salario = float(input("Informe o salário: "))
                filhos = int(input("Informe a quantidade de filhos: "))
                inserirFunc(nome,cpf,departamento,salario,filhos)
            # 4 = Personal
            elif tabelaEscolhida == 4:
                cpf = input("Informe o CPF: ")
                cref = input("Informe o CREF: ")
                nome = input("Informe o nome: ")
                telefone = ("Informe o telefone: ")
                email = input("Informe o E-mail: ")
                inserirPersonal(cpf,cref,nome,telefone,email)
        # 2 = Ler
        elif acao == 2:
            # 1 = Alunos
            if tabelaEscolhida == 1:
                lerAluno()
            # 2 = Modalidades
            elif tabelaEscolhida == 2:
                lerModalidade()
            # 3 = Funcionarios
            elif tabelaEscolhida == 3:
                lerFunc()
            # 4 = Personal
            elif tabelaEscolhida == 4:
                lerPersonal()
        # 3 = Alterar
        elif acao == 3:
            # 1 = Alunos
            if tabelaEscolhida == 1:
                nome = input("Informe o nome que deseja inserir: ")
                matricula = int(input("Informe a matricula onde deseja inserir o nome: "))
                alterarAluno(nome,matricula)
            # 2 = Modalidades
            elif tabelaEscolhida == 2:
                nome = input("Informe o nome que deseja inserir: ")
                id = int(input("Informe a matricula onde deseja inserir o nome: "))
                alterarModalidade(nome,id)
            # 3 = Funcionarios
            elif tabelaEscolhida == 3:
                nome = input("Informe o nome que deseja inserir: ")
                id = int(input("Informe a matricula onde deseja inserir o nome: "))
                alterarModalidade(nome,id)
            # 4 = Personal
            elif tabelaEscolhida == 4:
                nome = input("Informe o nome que deseja inserir: ")
                cpf = int(input("Informe a CPF onde deseja inserir o nome: "))
                alterarModalidade(nome,cpf)
        # 4 = Deletar
        elif acao == 4:
            # 1 = Alunos
            if tabelaEscolhida == 1:
                id = int(input("Informe a matricula do aluno: "))
                deletarAluno(id)
            # 2 = Modalidades
            elif tabelaEscolhida == 2:
                id = int(input("Informe a identificação da modalidade: "))
                deletarModalidade(id)
            # 3 = Funcionarios
            elif tabelaEscolhida == 3:
                id = int(input("Informe a matricula do funcionario: "))
                deletarFuncionario(id)
            # 4 = Personal
            elif tabelaEscolhida == 4:
                id = int(input("Informe o CPF do personal: "))
                deletarPersonal(id)
print("BYE!!!")
cursor.close()
conexao.close()