package br.com.edamatec.connection;


import br.com.edamatec.connection.ConnectionEda;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionEda().getConnection();        
        connection.close();
    }
}
