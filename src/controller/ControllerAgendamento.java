package controller;

import modelo.Consulta;
import modelo.Procedimento;

public class ControllerAgendamento {
    
    
    //CONSULTA
    public static boolean agendaConsulta(Consulta c){
        
        boolean resultado = DAO.ConsultaDAO.inserirConsulta(c);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
     
    //PROCEDIMENTO
    public static boolean agendaProcedimento(Procedimento p){
        
        boolean resultado = DAO.ProcedimentoDAO.inserirProcedimento(p);
        
        if(resultado == true){
            return resultado;
        }else{
            return false;
        }
    }
}
