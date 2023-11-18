from conexao_BD import *
cursor = conexao.cursor()

# INSERIR
def inserirAluno(nome,cpf,telefone,email,endereco):
      inserir = f"INSERT INTO alunos (nome,cpf,telefone,email,endereco) VALUES ('{nome}','{cpf}','{telefone}','{email}','{endereco}');"
      cursor.execute(inserir)
      conexao.commit()
def inserirModalidade(nome):
      inserir = f"INSERT INTO modalidades (nome) VALUES ('{nome}');"
      cursor.execute(inserir)
      conexao.commit()
def inserirFunc(nome,CPF,Departamento,Salario,filhos):
      inserir = f"INSERT INTO func (nome,CPF,Departamento,Salario,filhos) VALUES ('{nome}','{CPF}',{Departamento},{Salario},{filhos});"
      cursor.execute(inserir)
      conexao.commit()
def inserirPersonal(cpf,cref,nome,telefone,email):
      inserir = f"INSERT INTO func (cpf,cref,nome,telefone,email) VALUES ('{cpf}','{cref}','{nome}','{telefone}','{email}');"
      cursor.execute(inserir)
      conexao.commit()

# LER
def lerAluno():
      ler = f"select * from alunos;"
      cursor.execute(ler)
      resultado = cursor.fetchall()# Ler o banco de dados
      for x in resultado:
        print(x)
      conexao.commit()
def lerModalidade():
      ler = f"select * from modalidades;"
      cursor.execute(ler)
      resultado = cursor.fetchall()  # Ler o banco de dados
      for x in resultado:
            print(x)
      conexao.commit()
def lerFunc():
      ler = f"select * from func;"
      cursor.execute(ler)
      resultado = cursor.fetchall()  # Ler o banco de dados
      for x in resultado:
            print(x)
      conexao.commit()
def lerPersonal():
      ler = f"select * from personal;"
      cursor.execute(ler)
      resultado = cursor.fetchall()  # Ler o banco de dados
      for x in resultado:
            print(x)
      conexao.commit()

#ALTERAR
def alterarAluno(nome,matricula):
      alterar = f"update alunos set nome = '{nome}' where matricula = {matricula}"
      cursor.execute(alterar)
      conexao.commit()
def alterarModalidade(nome,id):
      alterar = f"update modalidades set nome = '{nome}' where id_modalidade = {id}"
      cursor.execute(alterar)
      conexao.commit()
def alterarFuncionario(nome,id):
      alterar = f"update func set nome = '{nome}' where id_funcionario = {id}"
      cursor.execute(alterar)
      conexao.commit()
def alterarPersonal(nome,cpf):
      alterar = f"update personal set nome = '{nome}' where cpf = {cpf}"
      cursor.execute(alterar)
      conexao.commit()

# DELETAR
def deletarAluno(id):
      deletar = f"DELETE FROM alunos where matricula = {id}"
      cursor.execute(deletar)
      conexao.commit()
def deletarModalidade(id):
      deletar = f"DELETE FROM modalidades where id_modalidade = {id}"
      cursor.execute(deletar)
      conexao.commit()
def deletarFuncionario(id):
      deletar = f"DELETE FROM func where id_funcionario = {id}"
      cursor.execute(deletar)
      conexao.commit()
def deletarPersonal(id):
      deletar = f"DELETE FROM personal where cpf = {id}"
      cursor.execute(deletar)
      conexao.commit()
