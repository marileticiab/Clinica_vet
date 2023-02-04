package controller;

import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Pet;
import modelo.Procedimento;
import modelo.Receita;
import modelo.Vacina;
import modelo.Veterinario;

public class Controller_Tabela {
    
    //TABLE CLIENTE
    public static Vector<Cliente> buscaClientes(){
        
        Vector<Cliente> c = DAO.ClienteDAO.listaCliente();
        
        return c;
    }
    
    public static void modificaCliente(Cliente c){
        
        if(c != null){
            
            boolean x = DAO.ClienteDAO.atualizaCliente(c);
            if(x == true){
                JOptionPane.showConfirmDialog(null, "Editado com succeso!", "OK", JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showConfirmDialog(null, "Falha ao editar!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static Vector<Cliente> buscaMeuCliente(String cpf, String senha){
        
        Vector<Cliente> c = new Vector<>();
        Cliente cliente = DAO.ClienteDAO.retornaCliente(cpf, senha);
        c.add(cliente);
            
        return c;
    }
    
    public static void deletaCliente(Cliente c){
        
        if(c != null){
            DAO.ClienteDAO.deletaCliente(c);
        }
    }
    
    //TABLE PET
    public static Vector<Pet> buscaPets(){
        
        Vector<Pet> p = DAO.PetDAO.listaPet();
        
        return p;
    }
    
    public static Vector<Pet> buscaMeuPet(String cpf){
        Vector<Pet> p = DAO.PetDAO.listaPetCliente(cpf);
        
        return p;
    }
    
    public static void modificaPet(Pet p){
        
        if(p != null){
            boolean x = DAO.PetDAO.editaPet(p);
            if(x == true){
                JOptionPane.showConfirmDialog(null, "Editado com succeso!", "OK", JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showConfirmDialog(null, "Falha ao editar!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    //TABLE VET
    public static Vector<Veterinario> buscaVet(){
        
        Vector<Veterinario> v = DAO.VeterinarioDAO.listaVet();
        
        return v;
    }
    
    public static void modificaVet(Veterinario v){
        
        if(v != null){
            
            boolean x = DAO.VeterinarioDAO.atualizaVet(v);
            if(x == true){
                JOptionPane.showConfirmDialog(null, "Editado com succeso!", "OK", JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showConfirmDialog(null, "Falha ao editar!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static Vector<Vacina> buscaMinhaVacina(int codpet){
        
        Vector<Vacina> v = DAO.VacinaDAO.listaVacina(codpet);
        
        return v;
    }
    
    public static Vector<Procedimento> buscaMeuProc(int codpet){
        Vector<Procedimento> p = DAO.ProcedimentoDAO.listaProcedimentos(codpet);
        
        return p;
    }
    
    public static Vector<Consulta> buscaMinhaConsulta(int codpet){
         Vector<Consulta> c = DAO.ConsultaDAO.listaConsultas(codpet);
        
        return c;
    }
    
    public static Vector<Receita> buscaMinhaReceita(int codpet){
         Vector<Receita> c = DAO.RecitaDAO.listaReceita(codpet);
        
        return c;
    }
}
