package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;
import modelo.Veterinario;

public class Regras_TabelaVet extends AbstractTableModel{
    
    private Vector<Veterinario> vets;
    private controller.Controller_Tabela control;
    private String cabecalho[] = {"Nome", "CRMV", "E-mail", "Telefone", "Formação", "Senha"};
    private Cliente cliente;
    private Veterinario vet;
    
    public Regras_TabelaVet(Cliente c){
        this.control = new Controller_Tabela();
        this.cliente = c;
        carregaVet();
    }
    
     public Regras_TabelaVet(Veterinario v){
        this.control = new Controller_Tabela();
        this.vet = v;
        carregaVet();
    }
    
     public void carregaVet(){
         this.vets = Controller_Tabela.buscaVet();
     }
     
     //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.vets.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 6;
    }

   //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Veterinario v = this.vets.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return v.getNomeVet();
            case 1: return v.getCrmv();
            case 2: return v.getEmail();
            case 3: return v.getTelefoneVet();
            case 4: return v.getFormacao();
            case 5: return "*******";
                
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
       
        if(cliente != null){
            return false;
        }else{
            return true;
        }
    }
    
    //modificar os dados do modelo da tabela
    @Override
    public void setValueAt(Object novoValor, 
            int indiceLinha, int indiceColuna) {
        
        for(int i = 0; i < vets.size(); i++){
            if(vets.get(i).getCrmv() == vet.getCrmv()){
                
                Veterinario vetMod = this.vets.get(i);
                switch(indiceColuna){
                    case 0: 
                        vetMod.setNomeVet((String)novoValor); break;
                    case 1: 
                        vetMod.setCrmv((int)novoValor);break;
                    case 2:
                        vetMod.setEmail((String)novoValor);break;
                    case 3: 
                        vetMod.setTelefoneVet((String)novoValor);break;
                    case 4: 
                        vetMod.setFormacao((String)novoValor);break;
                    case 5:
                        vetMod.setSenhaVet((String)novoValor);break;
                }
                
                 Controller_Tabela.modificaVet(vetMod);
            }
        }
    }
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 1: return Integer.class;
            case 3: return Integer.class;
            default: return String.class;
        }
    }
}
