package gui_tabelas;

import controller.Controller_Tabela;
import gui_panel.MenuPrincipal_Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import regras_table.Regras_TabelaCliente;
import modelo.Cliente;
import modelo.Veterinario;

public class Table_Cliente extends javax.swing.JPanel {

    private Regras_TabelaCliente regras;
    private controller.Controller_Tabela controller;
    
    private MenuPrincipal_Frame menu;
    private Cliente c;
    private Veterinario v;
    
    public Table_Cliente(MenuPrincipal_Frame menu, Cliente c) {
        initComponents();
        
        this.menu = menu;
        this.c = c;
        
        controller = new Controller_Tabela();
        meuInitComponentsCli();
    }
    
    public Table_Cliente(MenuPrincipal_Frame menu, Veterinario v) {
        initComponents();
        
        this.menu = menu;
        this.v = v;
        
        controller = new Controller_Tabela();
        
        meuInitComponentsVet();
    }

    private void meuInitComponentsCli(){
        this.regras = new Regras_TabelaCliente(c);
        clienteTable.setModel(regras);  
    }
        
    private void meuInitComponentsVet(){
        this.regras = new Regras_TabelaCliente(v);
        clienteTable.setModel(regras);
    }
    
    //imagem de fundo
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        try {  
            //carregando a imagem de fundo
            Image imagemFundo = ImageIO.read(
                    new File(getClass().
                            getResource("/imagens/cadastros.jpg").
                            getFile()));
            
            //"pintando" a imagem no painel
            g.drawImage(imagemFundo, 0, 0, this);
            
            
        } catch (IOException ex) {
            System.err.println("o arquivo esta corrompido");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("CLINICA VET - CLIENTES");

        clienteTable.setBackground(new java.awt.Color(204, 204, 204));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(clienteTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadC)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(cadC)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JTable clienteTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
