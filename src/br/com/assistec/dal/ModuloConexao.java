/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.assistec.dal;

import java.sql.*;

/**
 *
 * @author WELLINGTON LUIZ
 */
public class ModuloConexao {

    //método responsável por estabelecer a conexão com o banco.
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // A linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenar informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbAssistec";
        String user = "root";
        String password = "";
        // Estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve para esclarecer qual é o erro
            System.out.println("O ERRO É:"+ e ); 
           return null; 
        }
        
    }
}
