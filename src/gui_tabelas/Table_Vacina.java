package gui_tabelas;

import controller.Controller_Tabela;
import gui_panel.MenuPrincipal_Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import modelo.Pet;
import regras_table.Regras_TabelaVacina;

public class Table_Vacina extends javax.swing.JPanel {

    private Regras_TabelaVacina regras;
    private controller.Controller_Tabela controller;
    
    private MenuPrincipal_Frame menu;
    private Pet p;
    
    public Table_Vacina(MenuPrincipal_Frame menu, Pet pet) {
        initComponents();
        this.p = pet;
        this.menu = menu;
        
        controller = new Controller_Tabela();
        
        meuInitComponents();
    }

    private void meuInitComponents(){
        this.regras = new Regras_TabelaVacina(p);
       
        vacinaTable.setModel(regras);
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
        vacinaTable = new javax.swing.JTable();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("PET - Cartão de Vacina");

        vacinaTable.setBackground(new java.awt.Color(204, 204, 204));
        vacinaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(vacinaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(cadC)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cadC)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable vacinaTable;
    // End of variables declaration//GEN-END:variables
}
