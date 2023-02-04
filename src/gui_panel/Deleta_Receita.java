package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Pet;
import modelo.Receita;
import modelo.Veterinario;
public class Deleta_Receita extends javax.swing.JPanel {

    private Pet petCadastrado;
    private MenuPrincipal_Frame menu;
    private Veterinario v;
    
    public Deleta_Receita(MenuPrincipal_Frame menu, Veterinario v) {
        initComponents();
        this.menu = menu;
        this.v = v;
    }

    public void deletaReceita(){
        
        if(codpetTxt.getText().isEmpty() && crmcTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Espaços vazios", "ERRO", JOptionPane.WARNING_MESSAGE);
            
        }else{
        
            int codpet = Integer.parseInt(codpetTxt.getText());
            int crmv = Integer.parseInt(crmcTxt.getText());
            
            petCadastrado = controller.ControllerListas.retornaPetControl(codpet, cpfTxt.getText());

            if(petCadastrado == null){
                JOptionPane.showMessageDialog(null, "CPF ou Código Pet errados", "ERRO", JOptionPane.WARNING_MESSAGE);
                
            }else{
                Receita r = controller.ControllerListas.retornaReceitaControl(crmv, codpet);

                if(r == null){
                    JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                            + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
                }else{
                    boolean x = controller.ControllerDeleta.deletaReceita(r);

                    if(x == true){
                        petCadastrado.getReceitasPet().remove(r);
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
        codpetTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        crmcTxt = new javax.swing.JTextField();
        deletaBnt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();

        cadC.setBackground(new java.awt.Color(204, 255, 255));
        cadC.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        cadC.setText("DELETA - Receita");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 255));
        jLabel12.setText("Código Pet:");

        codpetTxt.setBackground(new java.awt.Color(204, 204, 204));
        codpetTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpetTxtActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 255));
        jLabel13.setText("CRMV:");

        crmcTxt.setBackground(new java.awt.Color(204, 204, 204));
        crmcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmcTxtActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadC)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(crmcTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(codpetTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(deletaBnt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(cadC)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(codpetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(crmcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deletaBnt)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codpetTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpetTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpetTxtActionPerformed

    private void crmcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmcTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmcTxtActionPerformed

    private void deletaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaBntActionPerformed

        deletaReceita();
    }//GEN-LAST:event_deletaBntActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadC;
    private javax.swing.JTextField codpetTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JTextField crmcTxt;
    private javax.swing.JButton deletaBnt;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}
