package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vacina;

public class VacinaDAO {
    
    public static boolean inserirVacina(Vacina v){
        
        try {
            String SQL = "INSERT INTO clinica_vet.vacinas"
                    + "(nome, descricao, data, datareforco, codvacina, codpet)"
                    + " VALUES(?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, v.getNomeVac());
            transacao.setString(2, v.getDescricaoVac());
            transacao.setString(3, v.getData());
            transacao.setString(4, v.getDataReforco());
            transacao.setInt(5, v.getCodVac());
            transacao.setInt(6, v.getCodPet());
            
            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaVacina(Vacina v){
          
        try {
            String SQL = "DELETE FROM clinica_vet.vacinas"
                    +"WHERE codvacina=? AND codpet=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1, v.getCodVac());
            transacao.setInt(2, v.getCodPet());
            
            transacao.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    //RETORNA
     public static Vacina retornaCliente(int codvac, int codpet) {
        
        Vacina v = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.vacinas"
                     + " WHERE codvacina=? AND codpet=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1,codvac);
            transacao.setInt(2, codpet);
            
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                v = new Vacina();
                v.setCodVac(rs.getInt("codvac"));
                v.setData(rs.getString("data"));
                v.setDataReforco(rs.getString("datareforco"));
                v.setDescricaoVac(rs.getString("descricao"));
                v.setNomeVac(rs.getString("nome"));
                v.setCodPet(rs.getInt("codpet"));
            }
            
            return v;
        
        }catch (SQLException ex) {
                Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     //LISTAR
    public static Vector<Vacina> listaVacina(int codpet){
        
        Vector<Vacina> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.vacinas WHERE codpet=?";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        
        ps.setInt(1, codpet);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Vacina vacinaAtual = new Vacina();
            vacinaAtual.setCodPet(rs.getInt("codpet"));
            vacinaAtual.setCodVac(rs.getInt("codvacina"));
            vacinaAtual.setData(rs.getString("data"));
            vacinaAtual.setDataReforco(rs.getString("datareforco"));
            vacinaAtual.setDescricaoVac(rs.getString("descricao"));
            vacinaAtual.setNomeVac(rs.getString("nome"));
                
            retorna.add(vacinaAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  

}
