package controller;

import modelo.Cliente;
import modelo.Consulta;
import modelo.Pet;
import modelo.Procedimento;
import modelo.Receita;
import modelo.Vacina;
import modelo.Veterinario;

public class ControllerDeleta {
    
    //CLIENTE
    public static boolean deletaCliente(Cliente cliente){
        
        boolean resultado = DAO.ClienteDAO.deletaCliente(cliente);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //CONSULTA
    public static boolean deletaConsulta(Consulta c){
        
        boolean resultado = DAO.ConsultaDAO.deletaConsulta(c);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //PET
    public static boolean delelaPet(Pet p){
        
        boolean resultado = DAO.PetDAO.deletaPet(p);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //PROCEDIMENTO
    public static boolean deletaProc(Procedimento p){
        
        boolean resultado = DAO.ProcedimentoDAO.deletaProcedimento(p);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //RECEITA
    public static boolean deletaReceita(Receita r){
        
        boolean resultado = DAO.RecitaDAO.deletaIndicacaoMedica(r);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //VACINA
    public static boolean deletaVacina(Vacina v){
        
        boolean resultado = DAO.VacinaDAO.deletaVacina(v);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //VET
    public static boolean deletaVet(Veterinario v){
        
        boolean resultado = DAO.VeterinarioDAO.deletaVet(v);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
}
