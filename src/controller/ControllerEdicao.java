package controller;

import modelo.Cliente;
import modelo.Pet;
import modelo.Veterinario;

public class ControllerEdicao {
    
    //CLIENTE
    public static boolean editaCliente(Cliente cliente){
        
        boolean resultado = DAO.ClienteDAO.atualizaCliente(cliente);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //VET
    public static boolean editaVet(Veterinario vet){
        
        boolean resultado = DAO.VeterinarioDAO.atualizaVet(vet);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //PETs
    public static boolean editaPet(Pet pet){
        
        boolean resultado = DAO.PetDAO.editaPet(pet);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
}
