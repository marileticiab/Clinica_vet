package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Pet;
import modelo.Receita;
import modelo.Veterinario;

public class Cadastro_Receita extends javax.swing.JPanel {

    private MenuPrincipal_Frame framemenu;
    private Veterinario vet;
    private Pet petCadastrado;
    
    public Cadastro_Receita(MenuPrincipal_Frame framePai, Veterinario vet) {
        initComponents();
        this.framemenu = framePai;
        this.vet = vet;
    }
    
    public void cadastraReceita(){
        //verificar se todos os campos estão preenchidos
        if(!nomeRTxt.getText().isBlank() && !desRTxt.getText().isBlank() && 
                !clienteTxt.getText().isBlank() && !petTxt.getText().isBlank() 
                && !vetTxt.getText().isBlank()){
            
            //criando codigo da consulta
             Random g = new Random();
             int codigo = g.nextInt(10000);//bound e index
            
            int crmvVet = Integer.parseInt(vetTxt.getText());
            int codpet = Integer.parseInt(petTxt.getText());
            
            //achando cliente, vet e pet, respectivamente
            boolean c = controller.ControllerLogin.retornaLoginCliente(clienteTxt.getText());
            boolean v = controller.ControllerLogin.retornaLoginVet(crmvVet);
            boolean p = controller.ControllerLogin.retornaPet(codpet);
            
            if(c == true && v == true && p == true){
                
                petCadastrado = controller.ControllerListas.retornaPetControl(codpet, clienteTxt.getText());
               
                //criando nova consulta
                Receita novaR = new Receita(nomeRTxt.getText(), desRTxt.getText(), 
                        codpet, crmvVet, clienteTxt.getText(), codigo);

                //insert no banco de dados
                controller.ControllerCadastros.cadastroReceita(novaR);
                
                 petCadastrado.getReceitasPet().add(novaR);
                 JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso.", "OK!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Pet, Vet ou Cliente não existem", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            //campo não preenchido
            JOptionPane.showMessageDialog(null, "Algum campo não está preenchido", "ERRO", JOptionPane.ERROR_MESSAGE);
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

        Cad = new javax.swing.JLabel();
        nomeRTxt = new javax.swing.JTextField();
        desRTxt = new javax.swing.JTextField();
        petTxt = new javax.swing.JTextField();
        clienteTxt = new javax.swing.JTextField();
        vetTxt = new javax.swing.JTextField();
        cadastraBnt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        Cad.setBackground(new java.awt.Color(204, 255, 255));
        Cad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Cad.setText("Receita Veterinária");

        nomeRTxt.setBackground(new java.awt.Color(204, 204, 204));

        desRTxt.setBackground(new java.awt.Color(204, 204, 204));

        petTxt.setBackground(new java.awt.Color(204, 204, 204));
        petTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petTxtActionPerformed(evt);
            }
        });

        clienteTxt.setBackground(new java.awt.Color(204, 204, 204));

        vetTxt.setBackground(new java.awt.Color(204, 204, 204));

        cadastraBnt.setBackground(new java.awt.Color(153, 0, 204));
        cadastraBnt.setText("Cadastrar");
        cadastraBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraBntActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 204));
        jLabel4.setText("Descrição:");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 204));
        jLabel1.setText("Pet: ");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 204));
        jLabel5.setText("Cliente:");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 255));
        jLabel6.setText("Veterinário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(vetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(83, 83, 83)
                                .addComponent(nomeRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastraBnt)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cad)
                        .addGap(279, 279, 279))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Cad)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(desRTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(petTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(vetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(cadastraBnt)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraBntActionPerformed
        cadastraReceita();
    }//GEN-LAST:event_cadastraBntActionPerformed

    private void petTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cad;
    private javax.swing.JButton cadastraBnt;
    private javax.swing.JTextField clienteTxt;
    private javax.swing.JTextField desRTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeRTxt;
    private javax.swing.JTextField petTxt;
    private javax.swing.JTextField vetTxt;
    // End of variables declaration//GEN-END:variables
}
