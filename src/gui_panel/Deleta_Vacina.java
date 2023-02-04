package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Pet;
import modelo.Vacina;
import modelo.Veterinario;

public class Deleta_Vacina extends javax.swing.JPanel {

    private Pet petCadastrado;
    private MenuPrincipal_Frame menu;
    private Veterinario v;
    
    public Deleta_Vacina(MenuPrincipal_Frame menu, Veterinario v) {
        initComponents();
        this.menu = menu;
        this.v = v;
    }

    public void deletaVacina(){
        
        if(codTxt.getText().isEmpty() && codpetTxt.getText().isEmpty() && cpfTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Espaços vazios", "ERRO", JOptionPane.WARNING_MESSAGE);
            
        }else{
        
            int codpet = Integer.parseInt(codpetTxt.getText());
            int cod = Integer.parseInt(codTxt.getText());
            
            petCadastrado = controller.ControllerListas.retornaPetControl(codpet, cpfTxt.getText());

            if(petCadastrado == null){
                JOptionPane.showMessageDialog(null, "CPF ou Código Pet errados", "ERRO", JOptionPane.WARNING_MESSAGE);
                
            }else{
                Vacina v = controller.ControllerListas.retornaVacinaControl(cod, codpet);

                if(v == null){
                    JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                            + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }else{
                    boolean x = controller.ControllerDeleta.deletaVacina(v);

                    if(x == true){
                        petCadastrado.getCartaoVacina().remove(v);
                        JOptionPane.showMessageDialog(null, "Deletado com sucesso!", "OK", JOptionPane.OK_OPTION);
                    }else{
                        JOptionPane.showMessageDialog(null, "Não foi possível deletar", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
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
        codpetTxt = new javax.swing.JTextField();
        codTxt = new javax.swing.JTextField();
        deletaBnt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("DELETA - Vacina");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText("Código:");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 255));
        jLabel13.setText("Código Pet:");

        codpetTxt.setBackground(new java.awt.Color(204, 204, 204));
        codpetTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpetTxtActionPerformed(evt);
            }
        });

        codTxt.setBackground(new java.awt.Color(204, 204, 204));
        codTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codTxtActionPerformed(evt);
            }
        });

        deletaBnt.setText("Deletar");
        deletaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaBntActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 255));
        jLabel14.setText("CPF Tutor:");

        cpfTxt.setBackground(new java.awt.Color(204, 204, 204));
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(cadC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(28, 28, 28)
                                .addComponent(cpfTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(codpetTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(60, 60, 60)
                                .addComponent(codTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))))
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(deletaBnt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cadC)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(codTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(codpetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(deletaBnt)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codpetTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpetTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpetTxtActionPerformed

    private void codTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTxtActionPerformed

    private void deletaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaBntActionPerformed

        deletaVacina();
    }//GEN-LAST:event_deletaBntActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JTextField codTxt;
    private javax.swing.JTextField codpetTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JButton deletaBnt;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}
