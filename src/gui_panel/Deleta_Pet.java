package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Pet;

public class Deleta_Pet extends javax.swing.JPanel {

    private MenuPrincipal_Frame menu;
    
    public Deleta_Pet(MenuPrincipal_Frame menu) {
        initComponents();
        this.menu = menu;
    }
    
    public void deletaPet(){
        
        if(cpfTxt.getText().isEmpty() && codpetTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Espaços vazios", "ERRO", JOptionPane.WARNING_MESSAGE);
            
        }else{
        
            int cod = Integer.parseInt(codpetTxt.getText());
            String cpf = cpfTxt.getText();

            Pet p = controller.ControllerListas.retornaPetControl(cod, cpf);

            if(p == null){
                JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                        + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
            }else{
                boolean x = controller.ControllerDeleta.delelaPet(p);

                if(x == true){
                    JOptionPane.showMessageDialog(null, "Deletado com sucesso!", "OK", JOptionPane.OK_OPTION);
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível deletar", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        codpetTxt = new javax.swing.JTextField();
        deletaBnt = new javax.swing.JButton();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("DELETA - Pet");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText("Código Pet:");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 255));
        jLabel13.setText("CPF Tutor:");

        cpfTxt.setBackground(new java.awt.Color(204, 204, 204));
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });

        codpetTxt.setBackground(new java.awt.Color(204, 204, 204));
        codpetTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpetTxtActionPerformed(evt);
            }
        });

        deletaBnt.setText("Deletar");
        deletaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(cadC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codpetTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(cpfTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(deletaBnt)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cadC)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(codpetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(deletaBnt)
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed

    private void codpetTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpetTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpetTxtActionPerformed

    private void deletaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaBntActionPerformed

        deletaPet();
    }//GEN-LAST:event_deletaBntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JTextField codpetTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JButton deletaBnt;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    // End of variables declaration//GEN-END:variables
}
