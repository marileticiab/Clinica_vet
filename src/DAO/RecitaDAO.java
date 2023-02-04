package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Receita;

public class RecitaDAO {
    
    //INSERIR
    public static boolean inserirIndicacaoMedica(Receita i){//add codigo
        
        try {
            String SQL = "INSERT INTO clinica_vet.indicacaoclinica"
                    + " (nome, descricao, cpf, crmv, codreceita, codpet)"
                    + " VALUES(?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, i.getNomeIC());
            transacao.setString(2, i.getDescriçãoIC());
            transacao.setString(3, i.getTutor());
            transacao.setInt(4, i.getVet()); 
            transacao.setInt(5, i.getCodReceita());
            transacao.setInt(6, i.getPet()); 
            
            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RecitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaIndicacaoMedica(Receita i){//somente vet
        
        try {
            String SQL = "DELETE FROM clinica_vet.indicacaoclinica"
                    +" WHERE nome=? and codpet=? and crmv=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            transacao.setString(1, i.getNomeIC());
            transacao.setInt(2, i.getPet());
            transacao.setInt(3, i.getVet());
            
            transacao.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(RecitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    //RETORNAR
     public static Receita retornaReceita(int crmv, int codpet) {
        
        Receita r = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.indicacaoclinica"
                     + " WHERE crmv=? AND codpet=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1,crmv);
            transacao.setInt(2, codpet);
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                r = new Receita();
                r.setDescriçãoIC(rs.getString("descricao"));
                r.setNomeIC(rs.getString("nome"));
                r.setPet(rs.getInt("codpet"));
                r.setTutor(rs.getString("cpf"));
                r.setVet(rs.getInt("crmv"));
                r.setCodReceita(rs.getInt("codreceita"));
            }
            
            return r;
        
        }catch (SQLException ex) {
                Logger.getLogger(RecitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     //LISTAR
    public static Vector<Receita> listaReceita(int codpet){
        
        Vector<Receita> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.indicacaoclinica WHERE codpet=?";
        PreparedStatement ps = conexao.prepareStatement(SQL);
         ps.setInt(1, codpet);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Receita receitaAtual = new Receita();
            receitaAtual.setDescriçãoIC(rs.getString("descricao"));
            receitaAtual.setNomeIC(rs.getString("nome"));
            receitaAtual.setPet(rs.getInt("codpet"));
            receitaAtual.setTutor(rs.getString("cpf"));
            receitaAtual.setVet(rs.getInt("crmv"));
            receitaAtual.setCodReceita(rs.getInt("codreceita"));
                
            retorna.add(receitaAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(RecitaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
    
}
