package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Pet;
import modelo.Veterinario;

public class AgendaConsulta_Panel extends javax.swing.JPanel {

    private MenuPrincipal_Frame framemenu;
    private Cliente c;
    private Veterinario v;
    private Pet petCadastrado;
    
    public AgendaConsulta_Panel() {
        initComponents();
    }

    public AgendaConsulta_Panel(MenuPrincipal_Frame framePai, Cliente c) {
        initComponents();
        this.framemenu = framePai;
        this.c = c;
    }

    public AgendaConsulta_Panel(MenuPrincipal_Frame framePai, Veterinario v) {
        initComponents();
        this.framemenu = framePai;
        this.v = v;
    }
    
    private void agendaConsulta(){
    
        //verificar se todos os campos estão preenchidos
        if(!dataTxt.getText().isBlank() && !horaTxt.getText().isBlank() && 
                !valorTxt.getText().isBlank() && !clienteTxt.getText().isBlank() 
                && !petTxt.getText().isBlank() && !vetTxt.getText().isBlank()){
            
            //criando codigo da consulta
             Random g = new Random();
             int codigo = g.nextInt(10000);//bound e index
            
            //definndo como int, por causa da inserção no banco
            double valor = Double.parseDouble(valorTxt.getText());
            
            int crmvVet = Integer.parseInt(vetTxt.getText());
            int codpet = Integer.parseInt(petTxt.getText());
            
            //achando cliente, vet e pet, respectivamente
            boolean c = controller.ControllerLogin.retornaLoginCliente(clienteTxt.getText());
            boolean v = controller.ControllerLogin.retornaLoginVet(crmvVet);
            boolean p = controller.ControllerLogin.retornaPet(codpet);
            
            if(c == true && v == true && p == true){
                
                petCadastrado = controller.ControllerListas.retornaPetControl(codpet, clienteTxt.getText());
               
                //criando nova consulta
                Consulta novaC = new Consulta(codigo, horaTxt.getText(), clienteTxt.getText(), 
                        dataTxt.getText(), crmvVet, codpet, valor);

                //insert no banco de dados
                controller.ControllerAgendamento.agendaConsulta(novaC);
                
                 petCadastrado.getConsultasPet().add(novaC);
                 JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso", "OK", JOptionPane.INFORMATION_MESSAGE);
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

        Cad1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        petTxt = new javax.swing.JTextField();
        valorTxt = new javax.swing.JTextField();
        vetTxt = new javax.swing.JTextField();
        clienteTxt = new javax.swing.JTextField();
        dataTxt = new javax.swing.JTextField();
        horaTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        Cad1.setBackground(new java.awt.Color(204, 255, 255));
        Cad1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Cad1.setText("Agendar Consulta");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 255));
        jLabel5.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("Horário:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 255));
        jLabel4.setText("Valor:");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 255));
        jLabel10.setText("Cliente(CPF):");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("Pet(Código):");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 255));
        jLabel8.setText("Veterinário(CRMV):");

        petTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        valorTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        vetTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        clienteTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        dataTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        dataTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTxtActionPerformed(evt);
            }
        });

        horaTxt.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(Cad1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jButton1)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Cad1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(horaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(petTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(vetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        agendaConsulta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTxtActionPerformed
        
        
    }//GEN-LAST:event_dataTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cad1;
    private javax.swing.JTextField clienteTxt;
    private javax.swing.JTextField dataTxt;
    private javax.swing.JTextField horaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField petTxt;
    private javax.swing.JTextField valorTxt;
    private javax.swing.JTextField vetTxt;
    // End of variables declaration//GEN-END:variables
}
