package br.com.edamatec.dao;


import br.com.edamatec.connection.ConnectionEda;
import java.sql.*;
import java.sql.PreparedStatement;
import br.com.edamatec.modelo.Cliente;

public class ClienteDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public ClienteDAO(){
        this.connection = new ConnectionEda().getConnection();        
    }
    public void inserir(Cliente cliente){
        String sql = "INSERT INTO edaclientes(edamatecnome,edamateccpf,edamatecemail,edamatectelefone)VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException c) {
            throw new RuntimeException(c);
        }
        
    
    }
    
}

