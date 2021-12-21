package br.com.edamatec.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEda {
    public Connection getConnection(){
        java.sql.Connection conexao = null;         
        String driver = "com.mysql.jdbc.Driver";        
        String url="jdbc:mysql://localhost:3306/edamatecteste";
        String user = "root";
        String password = "@Viking569038";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Êxito ao se conectar com banco! ");
            return conexao;
        } catch (Exception e) {
            System.out.println("Falha ao se comunicar com o banco de dados do MySQL!" );
            e.printStackTrace();
            return null;
        }
    }
}
