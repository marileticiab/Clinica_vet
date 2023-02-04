package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;
import modelo.Veterinario;

public class Regras_TabelaCliente extends AbstractTableModel{
    
    private Vector<Cliente> clientes;
    private controller.Controller_Tabela control;
    private String cabecalho[] = {"Nome","CPF", "E-mail", "Telefone", "Rua", "Nº", "Bairro", "Cidade", "Senha"};
    private Cliente cliente;
    private Veterinario vet;
  
    public Regras_TabelaCliente(Cliente c){
        this.control = new Controller_Tabela();
        this.cliente = c;
        carregaMeuCliente();
    }
    
     public Regras_TabelaCliente(Veterinario v){
        this.control = new Controller_Tabela();
        this.vet = v;
        carregaClientes();
    }
    
    private void carregaClientes(){
        //acessando todos os clientes
        this.clientes = Controller_Tabela.buscaClientes();
    }
    
    private void carregaMeuCliente(){
        this.clientes = Controller_Tabela.buscaMeuCliente(cliente.getCpfCliente(), cliente.getSenhaC());
    }
    
    //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.clientes.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 8;
    }

    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Cliente c = this.clientes.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return c.getNomeCliente();
            case 1: return c.getCpfCliente();
            case 2: return c.getEmail();
            case 3: return c.getTelefoneCliente();
            case 4: return c.getRua();
            case 5: return c.getNumero();
            case 6: return c.getBairro();
            case 7: return c.getCidade();
            case 8: return "*******";
                
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
       
        if(cliente == null){
            switch(indiceColuna){
            case 8: return false;
            default: return true;
            }
        }else{
            return true;
        }
       
    }
    
    //modificar os dados do modelo da tabela
    @Override
    public void setValueAt(Object novoValor, 
            int indiceLinha, int indiceColuna) {
        
        Cliente clienteMod = this.clientes.get(indiceLinha);
        //somente o proprio cliente pode se modificar
        if(cliente == null){
            switch(indiceColuna){
                case 0: 
                    clienteMod.setNomeCliente((String)novoValor); break;
                case 1: 
                    clienteMod.setCpfCliente((String)novoValor); break;
                case 2:
                    clienteMod.setEmail((String)novoValor);break;
                case 3: 
                    clienteMod.setTelefoneCliente((String)novoValor);break;
                case 4: 
                    clienteMod.setRua((String)novoValor); break;
                case 5:
                    clienteMod.setNumero((int)novoValor);break;
                case 6:
                    clienteMod.setBairro((String)novoValor);break;
                case 7:
                    clienteMod.setCidade((String)novoValor);break;

            }
        }else{
            switch(indiceColuna){
                case 0: 
                    clienteMod.setNomeCliente((String)novoValor); break;
                case 1: 
                    clienteMod.setCpfCliente((String)novoValor); break;
                case 2:
                    clienteMod.setEmail((String)novoValor);break;
                case 3: 
                    clienteMod.setTelefoneCliente((String)novoValor);break;
                case 4: 
                    clienteMod.setRua((String)novoValor); break;
                case 5:
                    clienteMod.setNumero((int)novoValor);break;
                case 6:
                    clienteMod.setBairro((String)novoValor);break;
                case 7:
                    clienteMod.setCidade((String)novoValor);break;
                case 8://POSSIBILITA MODIFICAR A SENHA
                    clienteMod.setSenhaC((String)novoValor);break;
            }
        }
        
        //modificando no bd...
        Controller_Tabela.modificaCliente(clienteMod);
    }
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 5: return Integer.class;
            default: return String.class;
        }
    }
   
}
