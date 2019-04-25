package br.ucsal.eventos.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadTables {

	public void creatScherma(Connection c) throws SQLException {
		
		
		Statement stmt = c.createStatement();
		stmt.execute("CREATE TABLE EVENTOS ( ID INTEGER IDENTITY PRIMARY KEY, NOME VARCHAR(255),"
			    	+" DESCRICAO VARCHAR(255), DATA DATE, HORA TIME,  CATEGORIA_ID INTEGER);");
		stmt.execute("CREATE TABLE CATEGORIAS ( ID INTEGER IDENTITY PRIMARY KEY,  NOME VARCHAR(255));");
		stmt.execute("ALTER TABLE EVENTOS ADD FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIAS(ID);");

		//INSCRICAO
		stmt.execute("CREATE TABLE INSCRICOES ( ID INTEGER IDENTITY PRIMARY KEY, NOME VARCHAR(255),"
				+ " CPF  VARCHAR(255), EMAIL VARCHAR(255), EVENTO_ID INTEGER);");
		stmt.execute("ALTER TABLE INSCRICOES ADD FOREIGN KEY (EVENTO_ID) REFERENCES EVENTOS(ID);");
		
		
		stmt.executeQuery("INSERT INTO CATEGORIAS ( NOME ) VALUES ( 'Tech' );");
		stmt.executeQuery("INSERT INTO CATEGORIAS ( NOME ) VALUES ( 'Natural' );");
		stmt.executeQuery("INSERT INTO EVENTOS (NOME, DESCRICAO, DATA, HORA, CATEGORIA_ID ) VALUES ( 'EVENTO 1' , 'DESCRICAO EVENTO 1' , DATE '2019-04-05', TIME '10:00:00', 0 );");
		stmt.executeQuery("INSERT INTO EVENTOS (NOME, DESCRICAO, DATA, HORA, CATEGORIA_ID ) VALUES ( 'EVENTO 2' , 'DESCRICAO EVENTO 2' , DATE '2019-05-10', TIME '12:00:00', 1 );");
		stmt.executeQuery("INSERT INTO EVENTOS (NOME, DESCRICAO, DATA, HORA, CATEGORIA_ID ) VALUES ( 'EVENTO 3' , 'DESCRICAO EVENTO 3' , DATE '2019-06-15', TIME '13:00:00', 1 );");
		stmt.executeQuery("INSERT INTO EVENTOS (NOME, DESCRICAO, DATA, HORA, CATEGORIA_ID ) VALUES ( 'EVENTO 4' , 'DESCRICAO EVENTO 4' , DATE '2019-08-20', TIME '15:00:00', 0 );");
		stmt.executeQuery("INSERT INTO EVENTOS (NOME, DESCRICAO, DATA, HORA, CATEGORIA_ID ) VALUES ( 'EVENTO 5' , 'DESCRICAO EVENTO 5' , DATE '2019-09-25', TIME '20:00:00', 0 );");

		stmt.close();

		System.out.println("Banco de Dados Carregado");
     
	}
}