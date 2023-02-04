package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;


public class ClienteDAO{
    
    //INSERIR
    public static boolean inserirCliente(Cliente c){
        
        try {
            String SQL = "INSERT INTO clinica_vet.cliente"
                    + " (nome, cpf, telefone, rua, bairro, numero, cidade, senha, email)"
                    + " VALUES(?,?,?,?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, c.getNomeCliente());
            transacao.setString(2, c.getCpfCliente());
            transacao.setString(3, c.getTelefoneCliente());
            transacao.setString(4, c.getRua());
            transacao.setString(5, c.getBairro());
            transacao.setInt(6, c.getNumero());
            transacao.setString(7, c.getCidade());
            transacao.setString(8, c.getSenhaC());
            transacao.setString(9, c.getEmail());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //LISTAR
    public static Vector<Cliente> listaCliente(){
        
        Vector<Cliente> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.cliente";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Cliente clienteAtual = new Cliente();
            clienteAtual.setNomeCliente(rs.getString("nome"));
            clienteAtual.setCpfCliente(rs.getString("cpf"));
            clienteAtual.setTelefoneCliente(rs.getString("telefone"));
            clienteAtual.setRua(rs.getString("rua"));
            clienteAtual.setBairro(rs.getString("bairro"));
            clienteAtual.setNumero(rs.getInt("numero"));
            clienteAtual.setCidade(rs.getString("cidade"));
            clienteAtual.setSenhaC(rs.getString("senha"));
            clienteAtual.setEmail(rs.getString("email"));
                
            retorna.add(clienteAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
    
    //DELETAR
    public static boolean deletaCliente(Cliente c){
        
        try {
            String SQL = "DELETE FROM clinica_vet.cliente"
                    + " WHERE cpf=? and senha=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, c.getCpfCliente());
            transacao.setString(2, c.getSenhaC());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //EDITAR
    public static boolean atualizaCliente(Cliente c){
        
        try {
          
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "UPDATE clinica_vet.cliente"
                     + " SET nome=?, cpf=?, telefone=?, rua=?, bairro=?, numero=?, cidade=?, senha=?, email=?"
                    + "  WHERE cpf=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, c.getNomeCliente());
            transacao.setString(2, c.getCpfCliente());
            transacao.setString(3, c.getTelefoneCliente());
            transacao.setString(4, c.getRua());
            transacao.setString(5, c.getBairro());
            transacao.setInt(6, c.getNumero());
            transacao.setString(7, c.getCidade());
            transacao.setString(8, c.getSenhaC());
            transacao.setString(9, c.getEmail());
            
            transacao.setString(10, c.getCpfCliente());//CPF 
            
            transacao.execute();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //LOGIN - ACESSA
    public static boolean acessaCliente(String cpfEntrada) {
      
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            
                String SQL = "SELECT * FROM clinica_vet.cliente"
                     + " WHERE cpf=?";
                 
                PreparedStatement transacao = conexao.prepareStatement(SQL);
            
                transacao.setString(1,cpfEntrada);
                transacao.execute();
                //ResultSet rs = transacao.executeQuery();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    //LOGIN - RETORNA
    public static Cliente retornaCliente(String cpfEntrada, String senha) {
        
        Cliente c = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.cliente"
                     + " WHERE cpf=? AND senha=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1,cpfEntrada);
            transacao.setString(2, senha);
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                c = new Cliente();
                c.setNomeCliente(rs.getString("nome"));
                c.setCpfCliente(rs.getString("cpf"));
                c.setTelefoneCliente(rs.getString("telefone"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setNumero(rs.getInt("numero"));
                c.setCidade(rs.getString("cidade"));
                c.setEmail(rs.getString("email"));
                c.setSenhaC(rs.getString("senha"));
            }
            
            return c;
        
        }catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
