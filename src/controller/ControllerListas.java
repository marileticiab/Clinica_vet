package controller;

import modelo.Consulta;
import modelo.Pet;
import modelo.Procedimento;
import modelo.Receita;
import modelo.Vacina;

public class ControllerListas {
    
    //PET
    public static Pet retornaPetControl(int codigoPet, String cpf){
        
        Pet p = DAO.PetDAO.retornaPet(codigoPet, cpf);
        
        if(p != null){
            return p;
        }else{
            return null;
        }
    }
    
    //CONSULTA
    public static Consulta retornaConsultaControl(int codC){
        
        Consulta c = DAO.ConsultaDAO.listaConsulta(codC);
        
        if(c != null){
            return c;
        }else{
            return null;
        }
    }
    
    //PROCEDIMENTO
    public static Procedimento retornaProcedimentoControl(int codP){
        
        Procedimento p = DAO.ProcedimentoDAO.listaProcedimento(codP);
        
        if(p != null){
            return p;
        }else{
            return null;
        }
    }
    
    //RECEITA
    public static Receita retornaReceitaControl(int crmv, int codpet){
        
        Receita r = DAO.RecitaDAO.retornaReceita(crmv, codpet);
        
        if(r != null){
            return r;
        }else{
            return null;
        }
    }
    
    //VACINA
    public static Vacina retornaVacinaControl(int codvac, int codpet){
        
        Vacina v = DAO.VacinaDAO.retornaCliente(codvac, codpet);
        
        if(v != null){
            return v;
        }else{
            return null;
        }
    }
      
}
