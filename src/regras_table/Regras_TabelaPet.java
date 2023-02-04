package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;
import modelo.Pet;
import modelo.Veterinario;

public class Regras_TabelaPet extends AbstractTableModel{
    
    private Vector<Pet> pets;
    private controller.Controller_Tabela control;
    private String cabecalho[] = {"Nome","Gênero", "Cor", "Raça", "Ano", "Tutor CPF", "Código"};
    private Veterinario v;
    private Cliente c;
    
    public Regras_TabelaPet(Veterinario v){
        this.control = new Controller_Tabela();
        this.v = v;
        carregaPets();//todos os pets
    }
    
    public Regras_TabelaPet(Cliente c){
        this.control = new Controller_Tabela();
        this.c = c;
        //this.pets = c.getAnimaisCliente();
        carregaMeuPet();//somente os do cliente
    }
    
    private void carregaPets(){
        //acessando todos os clientes
        this.pets = Controller_Tabela.buscaPets();
    }
    
    private void carregaMeuPet(){
        this.pets = Controller_Tabela.buscaMeuPet(c.getCpfCliente());
    }
    
    //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        //return this.pets.size();
        return pets.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        Pet p = this.pets.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return p.getNomePet();
            case 1: return p.getGenero();
            case 2: return p.getCor();
            case 3: return p.getRacaPet();
            case 4: return p.getAno();
            case 5: return p.getCpfTutor();
            case 6: return p.getCodPet();
           
            default: return null;
        }
    }
    
    //nome de cada coluna da tabela (Cabeçalho)
    @Override
    public String getColumnName(int indiceColuna) {
        return cabecalho[indiceColuna];
    }
    
    //Definindo quais células podem ser modificadas (editadas)
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna) {
       //todas as celulas PODEM ser modificadas
       return true;
    }
    
    //modificar os dados do modelo da tabela
    @Override
    public void setValueAt(Object novoValor, 
            int indiceLinha, int indiceColuna) {
        
        Pet petMod = this.pets.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: 
                petMod.setNomePet((String)novoValor); break;
            case 1: 
                petMod.setGenero((String)novoValor); break;
            case 2:
                petMod.setCor((String)novoValor);break;
            case 3: 
                petMod.setRacaPet((String)novoValor);break;
            case 4: 
                petMod.setAno((int)novoValor);break;
            case 5:
                petMod.setCpfTutor((String)novoValor);break;
            case 6:
                petMod.setCodPet((int)novoValor);break;
        }
        
        //invoco a atualizacao do obj na base de dados
        Controller_Tabela.modificaPet(petMod);
    }
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 4: return Integer.class;
            case 6: return Integer.class;
            default: return String.class;
        }
    }
}
