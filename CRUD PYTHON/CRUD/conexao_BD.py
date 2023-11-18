import mysql.connector
#Conexão com o Banco de Dados
conexao = mysql.connector.connect(
    host = 'localhost',
    user = 'root',
    password = '123456',
    database = 'academia_turma_d',
)

