package controller;

import modelo.Cliente;
import modelo.Veterinario;

public class ControllerLogin {
    
    //LOGIN'S
    //existe ou não
    public static boolean retornaLoginCliente(String cpfEntrada){
        
        boolean validaC = DAO.ClienteDAO.acessaCliente(cpfEntrada);
        
        if(validaC == true){
            return validaC;
        }else{
            return false;
        }
        
    }
    //retorna Cliente
    public static Cliente retornaClienteControl(String cpfEntrada, String senha){
        
        Cliente c = DAO.ClienteDAO.retornaCliente(cpfEntrada, senha);
        
        if(c != null){
            return c;
        }else{
            return null;
        }
    }
    
    //existe ou não
    public static boolean retornaLoginVet(int crmv){
        
        boolean validaVet = DAO.VeterinarioDAO.acessaVet(crmv);
        
        if(validaVet == true){
            return validaVet;
        }else{
            return false;
        }
    }
    
    //retorna Veterinario
    public static Veterinario retornaVetControl(int crmv, String senha){
        
        Veterinario v = DAO.VeterinarioDAO.retornaVet(crmv, senha);
        
        if(v != null){
            return v;
        }else{
            return null;
        }
    }
    
    //vê se PET existe
    public static boolean retornaPet(int codPet){
        
        boolean validaVet = DAO.PetDAO.acessaPet(codPet);
        
        if(validaVet == true){
            return validaVet;
        }else{
            return false;
        }
    }
    
}
