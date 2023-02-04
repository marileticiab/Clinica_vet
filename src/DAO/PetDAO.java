package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pet;

public class PetDAO {
    
    //INSERIR
    public static boolean inserirPet(Pet p){//ADD ANO
        
        try {
            String SQL = "INSERT INTO clinica_vet.pet"
                    + " (nome, genero, cor, raca, cpf, ano, codpet)"
                    + " VALUES(?,?,?,?,?,?,?);";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, p.getNomePet());
            transacao.setString(2, p.getGenero());
            transacao.setString(3, p.getCor()); 
            transacao.setString(4, p.getRacaPet());
            transacao.setString(5, p.getCpfTutor());
            transacao.setInt(6, p.getAno());
            transacao.setInt(7, p.getCodPet());

            transacao.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //DELETAR
    public static boolean deletaPet(Pet p){
         
        try {
            String SQL = "DELETE FROM clinica_vet.pet"
                    +" WHERE codpèt=? and cpf=?;";
            
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1, p.getCodPet());
            transacao.setString(2, p.getCpfTutor());
            
            transacao.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    //EDITAR
    public static boolean editaPet(Pet p){
        
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "UPDATE clinica_vet.pet"
                     + " SET nome=?, genero=?, cor=?, raca=?, cpf=?, ano=?"
                    + "  WHERE codpet=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setString(1, p.getNomePet());
            transacao.setString(2, p.getGenero());
            transacao.setString(3, p.getCor());
            transacao.setString(4, p.getRacaPet());
            transacao.setString(5, p.getCpfTutor());
            transacao.setInt(6, p.getAno());
            
            transacao.setInt(7, p.getCodPet());//codpet 
            
            transacao.execute();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    //RETORNA
    public static Pet retornaPet(int codigoPet, String cpf) {
        
        Pet p = null;
                
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.pet"
                     + " WHERE codpet=? AND cpf=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);

            transacao.setInt(1,codigoPet);
            transacao.setString(2, cpf);
            
            ResultSet rs = transacao.executeQuery();

            if(rs.next()){
                p = new Pet();
                p.setAno(rs.getInt("ano"));
                p.setCodPet(rs.getInt("codpet"));
                p.setCor(rs.getString("cor"));
                p.setGenero(rs.getString("genero"));
                p.setNomePet(rs.getString("nome"));
                p.setRacaPet(rs.getString("raca"));
                p.setCpfTutor(rs.getString("cpf"));
            }
        
        return p;
        
        }catch (SQLException ex) {
                Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //ACESSA
    public static boolean acessaPet(int codPet) {
      
        try {
          
            Banco b = new Banco();
            Connection conexao = b.getConexao();
            String SQL = "SELECT * FROM clinica_vet.pet"
                     + " WHERE codpet=?;";

            PreparedStatement transacao = conexao.prepareStatement(SQL);
            
            transacao.setInt(1,codPet);
            
            transacao.execute();

            return true;
        
        }catch (SQLException ex) {
                Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    //LISTAR
    public static Vector<Pet> listaPet(){
        
        Vector<Pet> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.pet";
        PreparedStatement ps = conexao.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
           
            Pet petatual = new Pet();
            petatual.setAno(rs.getInt("ano"));
            petatual.setCodPet(rs.getInt("codpet"));
            petatual.setCor(rs.getString("cor"));
            petatual.setCpfTutor(rs.getString("cpf"));
            petatual.setGenero(rs.getString("genero"));
            petatual.setNomePet(rs.getString("nome"));
            petatual.setRacaPet(rs.getString("raca"));
                
            retorna.add(petatual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
    
    //LISTA - especifico
    public static Vector<Pet> listaPetCliente(String cpf){
        
        Vector<Pet> retorna = null;
        
        try {
             
        retorna = new Vector<>();
        Banco b = new Banco();
        Connection conexao = b.getConexao();
        String SQL = "SELECT * FROM clinica_vet.pet WHERE cpf=?";
        PreparedStatement transacao = conexao.prepareStatement(SQL);
        transacao.setString(1, cpf);
        
        ResultSet rs = transacao.executeQuery();
        
        while(rs.next()){
           
            Pet petatual = new Pet();
            petatual.setAno(rs.getInt("ano"));
            petatual.setCodPet(rs.getInt("codpet"));
            petatual.setCor(rs.getString("cor"));
            petatual.setCpfTutor(rs.getString("cpf"));
            petatual.setGenero(rs.getString("genero"));
            petatual.setNomePet(rs.getString("nome"));
            petatual.setRacaPet(rs.getString("raca"));
                
            retorna.add(petatual);
        } 
        
        }catch (SQLException ex) {
                Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return retorna;
    }  
}

