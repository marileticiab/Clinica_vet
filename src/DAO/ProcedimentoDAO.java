package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Procedimento;

public class ProcedimentoDAO {//não se edita
    
    //INSERIR
    public static boolean inserirProcedimento(Procedimento p){
        
        try {
            String SQL = "INSERT INTO clinica_vet.procedimento"
                    + " (tipo, descricao, valor, dia, mes, ano, horario, cpf, crmv, codproc, codpet)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, p.getTipo());
            transacao.setString(2, p.getDescrição()); 
            transacao.setDouble(3, p.getValor()); 
            
            String [] data = p.getData().split("///"); //barra no java
            transacao.setString(4, data[0]);
            transacao.setString(5, data[1]);
            transacao.setString(6, data[2]);
            
            transacao.setString(7, p.getHorario());
            transacao.setString(8, p.getTutor());
            transacao.setInt(9, p.getVet());
            transacao.setInt(10, p.getCodProc());
            transacao.setInt(11, p.getPet());
            
            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaProcedimento(Procedimento p){//somente vet 
        
        try {
            String SQL = "DELETE FROM clinica_vet.procedimento"
                    +"WHERE codproc=? AND crmv=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            transacao.setInt(1, p.getCodProc());
            transacao.setInt(2, p.getVet());
            
            transacao.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    //LISTAR - específico
    public static Procedimento listaProcedimento(int codP){
        
        Procedimento p = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.procedimento"
                     + " WHERE codproc=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1,codP);
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                p = new Procedimento();
                p.setCodProc(rs.getInt("cod"));
                p.setData(rs.getString("dia") + "/" + rs.getString("mes") +  "/" + rs.getString("ano"));
                p.setDescrição(rs.getString("descricao"));
                p.setHorario(rs.getString("horario"));
                p.setTipo(rs.getString("tipo"));
                p.setValor(rs.getDouble("valor"));
                p.setPet(rs.getInt("codpet"));
                p.setTutor(rs.getString("cpf"));
                p.setVet(rs.getInt("crmv"));
            }
            
            return p;
        
        }catch (SQLException ex) {
                Logger.getLogger(ProcedimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
    //LISTAR
    public static Vector<Procedimento> listaProcedimentos(int codpet){
        
        Vector<Procedimento> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.procedimento WHERE codpet=?";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        
        ps.setInt(1, codpet);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Procedimento procAtual = new Procedimento();
            procAtual.setCodProc(rs.getInt("cod"));
            procAtual.setData(rs.getString("dia") + "/" + rs.getString("mes") +  "/" + rs.getString("ano"));
            procAtual.setDescrição(rs.getString("descricao"));
            procAtual.setHorario(rs.getString("horario"));
            procAtual.setPet(rs.getInt("codpet"));
            procAtual.setTipo(rs.getString("tipo"));
            procAtual.setTutor(rs.getString("cpf"));
            procAtual.setValor(rs.getInt("crmv"));
            procAtual.setVet(rs.getInt("crmv"));
                
            retorna.add(procAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(ProcedimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  

}
