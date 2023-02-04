package gui_tabelas;

import controller.Controller_Tabela;
import gui_panel.MenuPrincipal_Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Veterinario;
import regras_table.Regras_TabelaPet;

public class Table_Pet extends javax.swing.JPanel {

    private Regras_TabelaPet regras;
    private controller.Controller_Tabela controller;
    
    private MenuPrincipal_Frame menu;
    private Cliente c;
    private Veterinario v;
    
    public Table_Pet(MenuPrincipal_Frame menu, Cliente c) {
        initComponents();
        
        this.menu = menu;
        this.c = c;
        
        controller = new Controller_Tabela();
        meuInitComponentsCli();
    }
    
    public Table_Pet(MenuPrincipal_Frame menu, Veterinario v) {
        initComponents();
        
        this.menu = menu;
        this.v = v;
        
        controller = new Controller_Tabela();
        meuInitComponentsVet();
    }
    
    private void meuInitComponentsCli(){
        
        if(c == null){
             JOptionPane.showMessageDialog(null, "Você não possui nenhum pet", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            this.regras = new Regras_TabelaPet(c);
            petTable.setModel(regras); 
        }
    }
        
    private void meuInitComponentsVet(){
        this.regras = new Regras_TabelaPet(v);
        petTable.setModel(regras);
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
        petTable = new javax.swing.JTable();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("CLINICA VET - PETS");

        petTable.setBackground(new java.awt.Color(204, 204, 204));
        petTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(petTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(cadC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cadC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable petTable;
    // End of variables declaration//GEN-END:variables
}
