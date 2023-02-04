package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Consulta;
import modelo.Pet;

public class Deleta_Consulta extends javax.swing.JPanel {

    private Pet petCadastrado;
    private MenuPrincipal_Frame menu;
    
    public Deleta_Consulta(MenuPrincipal_Frame menu) {
        initComponents();
        this.menu = menu;
    }

    public void deletaConsulta(){
        
        if(codTxt.getText().isEmpty() && codpetTxt.getText().isEmpty() && 
                crmvTxt.getText().isEmpty() && cpfTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Espaços vazios", "ERRO", JOptionPane.WARNING_MESSAGE);
            
        }else{
        
            int codConsulta = Integer.parseInt(codTxt.getText());
            int crmv = Integer.parseInt(crmvTxt.getText());
            int pet = Integer.parseInt(codpetTxt.getText());

            petCadastrado = controller.ControllerListas.retornaPetControl(pet, cpfTxt.getText());
            
            if(petCadastrado == null){
                JOptionPane.showMessageDialog(null, "CPF ou Código Pet errados", "ERRO", JOptionPane.WARNING_MESSAGE);
                
            }else{
            
                Consulta c = controller.ControllerListas.retornaConsultaControl(codConsulta);

                if(c == null){
                    JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                            + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }else{
                    boolean x = controller.ControllerDeleta.deletaConsulta(c);

                    if(x == true){
                        petCadastrado.getConsultasPet().remove(c);
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
        jLabel11 = new javax.swing.JLabel();
        codTxt = new javax.swing.JTextField();
        deletaBnt = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codpetTxt = new javax.swing.JTextField();
        crmvTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("DELETA - Consulta");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 255));
        jLabel11.setText("Código Pet:");

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

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText("Código:");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 255));
        jLabel13.setText("CRMV:");

        codpetTxt.setBackground(new java.awt.Color(204, 204, 204));
        codpetTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpetTxtActionPerformed(evt);
            }
        });

        crmvTxt.setBackground(new java.awt.Color(204, 204, 204));
        crmvTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmvTxtActionPerformed(evt);
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
                        .addGap(262, 262, 262)
                        .addComponent(cadC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(codpetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deletaBnt)
                                        .addComponent(crmvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cadC)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(codpetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(crmvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(deletaBnt)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTxtActionPerformed

    private void deletaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaBntActionPerformed

        deletaConsulta();
    }//GEN-LAST:event_deletaBntActionPerformed

    private void codpetTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpetTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpetTxtActionPerformed

    private void crmvTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmvTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmvTxtActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JTextField codTxt;
    private javax.swing.JTextField codpetTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JTextField crmvTxt;
    private javax.swing.JButton deletaBnt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}
