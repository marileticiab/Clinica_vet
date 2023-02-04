package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Veterinario;

public class VeterinarioDAO {
    
    //INSERIR
    public static boolean inserirVet(Veterinario v){
        
        try {
            
            String SQL = "INSERT INTO clinica_vet.veterinario"
                    + "(nome, telefone, formacao, email, senha, crmv)"
                    + " VALUES(?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            transacao.setString(1, v.getNomeVet());
            transacao.setString(2, v.getTelefoneVet());
            transacao.setString(3, v.getFormacao());
            transacao.setString(4, v.getEmail());
            transacao.setString(5, v.getSenhaVet());
            transacao.setInt(6, v.getCrmv());
            
            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaVet(Veterinario v){
        
        try {
            String SQL = "DELETE FROM clinica_vet.veterinario"
                    +" WHERE crmv=? AND senha=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            transacao.setInt(1, v.getCrmv());
            transacao.setString(2, v.getSenhaVet());
            
            transacao.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
        }
    
    //ATUALIZA
    public static boolean atualizaVet(Veterinario v){
        
        try {
          
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "UPDATE clinica_vet.veterinario"
                     + " SET nome=?, telefone=?, formacao=?, email=?, senha=?, crmv=?"
                    + "  WHERE crmv=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, v.getNomeVet());
            transacao.setString(2, v.getTelefoneVet());
            transacao.setString(3, v.getFormacao());
            transacao.setString(4, v.getEmail());
            transacao.setString(5, v.getSenhaVet());
            transacao.setInt(6, v.getCrmv());
            
            transacao.setInt(7, v.getCrmv());//crmv 
            
            transacao.execute();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //LOGIN - ACESSO
    public static boolean acessaVet(int crmv) {
        
        try {
            
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.veterinario"
                     + " WHERE crmv=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);

            transacao.setInt(1,crmv);

            transacao.execute();
            //ResultSet rs = (ResultSet)transacao.executeQuery();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         
    }

    //LOGIN - RETONA
    public static Veterinario retornaVet(int crmv, String senha) {
         Veterinario v = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.veterinario"
                     + " WHERE crmv=? AND senha=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);

            transacao.setInt(1,crmv);
            transacao.setString(2, senha);
            
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                v = new Veterinario();
                v.setNomeVet(rs.getString("nome"));
                v.setCrmv(rs.getInt("crmv"));
                v.setEmail(rs.getString("email"));
                v.setFormacao(rs.getString("formacao"));
                v.setSenhaVet(rs.getString("senha"));
                v.setTelefoneVet(rs.getString("telefone"));
            }
        
        return v;
        
        }catch (SQLException ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //LISTAR
    public static Vector<Veterinario> listaVet(){
        
        Vector<Veterinario> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.veterinario";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Veterinario vetAtual = new Veterinario();
            vetAtual.setCrmv(rs.getInt("crmv"));
            vetAtual.setEmail(rs.getString("email"));
            vetAtual.setFormacao(rs.getString("formacao"));
            vetAtual.setNomeVet(rs.getString("nome"));
            vetAtual.setSenhaVet(rs.getString("senha"));
            vetAtual.setTelefoneVet(rs.getString("telefone"));
                
            retorna.add(vetAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
}
