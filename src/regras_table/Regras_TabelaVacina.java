package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Pet;
import modelo.Vacina;

public class Regras_TabelaVacina extends AbstractTableModel{
    
    private Vector<Vacina> vacinas;
    private controller.Controller_Tabela control;
    private String cabecalho[] = {"Nome","Código", "Código PET", "Data", "Data Reforço", "Descrição"};
    private Pet p;
    
    public Regras_TabelaVacina(Pet pet){
        this.control = new Controller_Tabela();
        this.p = pet;
        //this.vacinas = p.getCartaoVacina();//vetor de vacinas do pet
        carregaVacinas();
    }
    
    private void carregaVacinas(){
        //acessando todos os clientes
        this.vacinas = Controller_Tabela.buscaMinhaVacina(p.getCodPet());
    }
    
    //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.vacinas.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Vacina v = this.vacinas.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return v.getNomeVac();
            case 1: return v.getCodVac();
            case 2: return v.getCodPet();
            case 3: return v.getData();
            case 4: return v.getDataReforco();
            case 5: return v.getDescricaoVac();
                
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
            case 1: return Integer.class;
            case 2: return Integer.class;
            default: return String.class;
        }
    }
}
