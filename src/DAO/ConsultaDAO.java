package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consulta;

public class ConsultaDAO {//não se edita
    
    //INSERIR
    public static boolean inserirConsulta(Consulta c){
        
        try {
            String SQL = "INSERT INTO clinica_vet.consulta"
                    + " (horario, dia, mes, ano, cpf, valor, crmv, codconsulta, codpet )"
                    + " VALUES(?,?,?,?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, c.getHorario());
            
            //organizando data para o banco
            String [] data = c.getData().split("/"); //barra no java
            
            transacao.setString(2, data[0]);//dia
            transacao.setString(3, data[1]);//mes
            transacao.setString(4, data[2]);//ano
            
            transacao.setString(5, c.getTutor());
            transacao.setDouble(6, c.getValor());
            transacao.setInt(7, c.getVet());
            transacao.setInt(8, c.getCodconsulta());
            transacao.setInt(9, c.getPet());
            
            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaConsulta(Consulta c){
           
        try {
            String SQL = "DELETE FROM clinica_vet.consulta"
                    +" WHERE codconsulta=? and codpet=? and crmv=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);

            transacao.setInt(1, c.getCodconsulta());
            transacao.setInt(2, c.getPet());
            transacao.setInt(3, c.getVet());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    //LISTAR - específico
    public static Consulta listaConsulta(int codC){
        
        Consulta c = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = (Connection) b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.consulta"
                     + " WHERE codconsulta=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1,codC);
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                c = new Consulta();
                c.setCodconsulta(rs.getInt("codconsulta"));
                c.setData(rs.getString("dia") + "/" + rs.getString("mes") +  "/" + rs.getString("ano"));
                c.setHorario(rs.getString("horario"));
                c.setValor(rs.getDouble("valor"));
                c.setPet(rs.getInt("codpet"));
                c.setTutor(rs.getString("cpf"));
                c.setVet(rs.getInt("crmv"));
               
            }
            
            return c;
        
        }catch (SQLException ex) {
                Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //LISTAR
    public static Vector<Consulta> listaConsultas(int codpet){
        
        Vector<Consulta> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.consulta WHERE codpet=?";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        ps.setInt(1, codpet);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Consulta consultaAtual = new Consulta();
            consultaAtual.setCodconsulta(rs.getInt("codconsulta"));
            consultaAtual.setData(rs.getString("dia") + "/" + rs.getString("mes") +  "/" + rs.getString("ano"));
            consultaAtual.setHorario(rs.getString("horario"));
            consultaAtual.setPet(rs.getInt("codpet"));
            consultaAtual.setTutor(rs.getString("cpf"));
            consultaAtual.setValor(rs.getDouble("valor"));
            consultaAtual.setVet(rs.getInt("crmv"));
                
            retorna.add(consultaAtual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
    
}

