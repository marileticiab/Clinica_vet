package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Pet;
import modelo.Veterinario;

public class Cadastro_Pet extends javax.swing.JPanel {

    private MenuPrincipal_Frame framemenu;
    private Cliente tutorPet;
    private Veterinario v;
    
    public Cadastro_Pet(MenuPrincipal_Frame framePai) {
        initComponents();
        this.framemenu = framePai;
    }

    public Cadastro_Pet(MenuPrincipal_Frame framePai, Veterinario vet) {
        initComponents();
        this.framemenu = framePai;
        this.v = vet;
    }
    
    public Cadastro_Pet(MenuPrincipal_Frame framePai, Cliente c) {
        initComponents();
        this.framemenu = framePai;
        this.tutorPet = c;
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
        procuraTutorBnt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tutorTxt = new javax.swing.JTextField();
        nomePTxt = new javax.swing.JTextField();
        racaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        generoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        corTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nascTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        senhaPass = new javax.swing.JPasswordField();

        Cad.setBackground(new java.awt.Color(204, 255, 255));
        Cad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Cad.setText("Cadastro do Pet");

        procuraTutorBnt.setForeground(new java.awt.Color(153, 0, 204));
        procuraTutorBnt.setText("Procurar Tutor");
        procuraTutorBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraTutorBntActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 204));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 255));
        jLabel8.setText("Tutor:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Nome:");

        tutorTxt.setBackground(new java.awt.Color(204, 204, 204));
        tutorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorTxtActionPerformed(evt);
            }
        });

        nomePTxt.setBackground(new java.awt.Color(204, 204, 204));

        racaTxt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Raça:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("Gênero:");

        generoTxt.setBackground(new java.awt.Color(204, 204, 204));
        generoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Cor:");

        corTxt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 255));
        jLabel6.setText("Nascimento:");

        nascTxt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 255));
        jLabel9.setText("Senha:");

        senhaPass.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cad)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(racaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nascTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tutorTxt)
                            .addComponent(senhaPass))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(procuraTutorBnt)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Cad)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tutorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(senhaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(procuraTutorBnt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomePTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(racaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(generoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(corTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nascTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //verificar se todos os campos estão preenchidos
        if(!nomePTxt.getText().isBlank() && !racaTxt.getText().isBlank() && !generoTxt.getText().isBlank() && 
                !corTxt.getText().isBlank() && !nascTxt.getText().isBlank() && tutorPet != null){
            
            //definndo como int, por causa da inserção no banco
            int anoN = Integer.parseInt(nascTxt.getText());
           
            //criando codigo do pet
             Random g = new Random();
             int codigo = g.nextInt(10000);//bound e index
            
            Pet novoPet = new Pet(nomePTxt.getText(), racaTxt.getText(), anoN, generoTxt.getName(), 
                    corTxt.getText(), codigo, tutorPet.getCpfCliente());
            
            //insert no banco de dados
            controller.ControllerCadastros.cadastrarPet(novoPet);
            tutorPet.getAnimaisCliente().add(novoPet);
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso.", "OK!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            //campo não preenchido
            JOptionPane.showMessageDialog(null, "Algum campo não está preenchido", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void procuraTutorBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraTutorBntActionPerformed
        
        String cpftutor = tutorTxt.getText();
        String senha = new String (senhaPass.getPassword());
        
        boolean x = controller.ControllerLogin.retornaLoginCliente(cpftutor);
        
        Cliente tutor = controller.ControllerLogin.retornaClienteControl(cpftutor, senha);
        
        if(x == false){
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            if(tutor != null){
                JOptionPane.showMessageDialog(null, "Cliente encontrado", "OK", JOptionPane.INFORMATION_MESSAGE);
                this.tutorPet = tutor; 
            }
        }
        
    }//GEN-LAST:event_procuraTutorBntActionPerformed

    private void tutorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cad;
    private javax.swing.JTextField corTxt;
    private javax.swing.JTextField generoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nascTxt;
    private javax.swing.JTextField nomePTxt;
    private javax.swing.JButton procuraTutorBnt;
    private javax.swing.JTextField racaTxt;
    private javax.swing.JPasswordField senhaPass;
    private javax.swing.JTextField tutorTxt;
    // End of variables declaration//GEN-END:variables
}
