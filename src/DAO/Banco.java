package DAO;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Banco {
    private static Connection con=null;
    
    public static Connection getConexao(){
        
        System.out.println("tentando conectar");
        if(con == null){
            
            try{
                System.out.println("conectano com o banco");
                con = (Connection) DriverManager.getConnection("jdbc:postgresql://200.18.128.54/aula", "aula", "aula");
            
            } catch (SQLException err){
                System.out.println("erro: "+err.getMessage());
                JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO" + err.getMessage(), "Status da conexão", JOptionPane.WARNING_MESSAGE);
            }
        }
        return con;
    }
}
