package controller;

import modelo.Cliente;
import modelo.Pet;
import modelo.Receita;
import modelo.Vacina;
import modelo.Veterinario;

public class ControllerCadastros {
    //transição entre interface e banco de dados
    
    //PET
    public static boolean cadastrarPet(Pet pet){
        
        boolean resultado = DAO.PetDAO.inserirPet(pet);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //VET
    public static boolean cadastraVet(Veterinario vet){
        
        boolean resultado = DAO.VeterinarioDAO.inserirVet(vet);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
   
    //CLIENTE
    public static boolean cadastraCliente(Cliente cliente){
        
        boolean resultado = DAO.ClienteDAO.inserirCliente(cliente);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //RECEITA
    public static boolean cadastroReceita(Receita r){
        
        boolean resultado = DAO.RecitaDAO.inserirIndicacaoMedica(r);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
    
    //VACINA
    public static boolean cadastroVacina(Vacina v){
        
        boolean resultado = DAO.VacinaDAO.inserirVacina(v);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
   
}
