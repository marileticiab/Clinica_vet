package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Pet;
import modelo.Receita;

public class Regras_TabelaReceita extends AbstractTableModel{
    
    private Vector<Receita> receitas;
    private String cabecalho[] = {"Código", "Nome", "PET", "Tutor", "Veterinário", "Descrição"};
    private Pet p;
    
     public Regras_TabelaReceita(Pet pet){
        this.p = pet;
        //this.receitas = p.getReceitasPet();//vetor de receitas do pet
        carregaReceita();
    }
     
    private void carregaReceita(){
        //acessando todos os clientes
        this.receitas = Controller_Tabela.buscaMinhaReceita(p.getCodPet());
    }
     //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.receitas.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Receita r = this.receitas.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return r.getCodReceita();
            case 1: return r.getNomeIC();
            case 2: return r.getPet();
            case 3: return r.getTutor();
            case 4: return r.getVet();
            case 5: return r.getDescriçãoIC();
                
            default: return null;
        }
    }
    
    //nome de cada coluna da tabela (Cabeçalho)
    @Override
    public String getColumnName(int indiceColuna) {
        return cabecalho[indiceColuna];
    }
    
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 0: return Integer.class;
            case 2: return Integer.class;
            case 4: return Integer.class;
            default: return String.class;
        }
    }
}

