package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import modelo.Cliente;
import modelo.Veterinario;

public class Inicio_Panel extends javax.swing.JPanel {

    //Frame_Principal framePai;
    //vet para teste
    Veterinario vet = new Veterinario();
    Cliente c = new Cliente(); //teste
    
    private MenuPrincipal_Frame framePai;
    
    public Inicio_Panel(MenuPrincipal_Frame principal) {
        initComponents();
        this.framePai = principal;
    }

    //imagem de fundo
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        try {  
            //carregando a imagem de fundo
            Image imagemFundo = ImageIO.read(
                    new File(getClass().
                            getResource("/imagens/imagem_inicial.jpg").
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

        iniciarBnt = new javax.swing.JButton();

        iniciarBnt.setText("Iniciar");
        iniciarBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(iniciarBnt)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(iniciarBnt)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBntActionPerformed
        framePai.trocaPanel2(new Login_Panel(framePai)); //ORIGINAL
        //framePai.trocaPanel2(new Menu_Panel(framePai, vet));//TESTE
        
    }//GEN-LAST:event_iniciarBntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarBnt;
    // End of variables declaration//GEN-END:variables
}
