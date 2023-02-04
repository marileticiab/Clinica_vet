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
import modelo.Vacina;
import modelo.Veterinario;

public class Cadastro_Vacina extends javax.swing.JPanel {

    private Pet petCadastrado;
    private Cliente c;
    private Veterinario v;
    private MenuPrincipal_Frame framemenu;
     
    public Cadastro_Vacina(MenuPrincipal_Frame framePai) {
        initComponents();
         this.framemenu = framePai;
    }
    
    public Cadastro_Vacina(MenuPrincipal_Frame framePai, Veterinario vet) {
        initComponents();
         this.framemenu = framePai;
         this.v = vet;
    }
    
    public Cadastro_Vacina(MenuPrincipal_Frame framePai, Cliente cli) {
        initComponents();
         this.framemenu = framePai;
         this.c = cli;
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

        jPasswordField1 = new javax.swing.JPasswordField();
        Cad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nomeVacTxt = new javax.swing.JTextField();
        desTxt = new javax.swing.JTextField();
        dataTxt = new javax.swing.JTextField();
        reforcoTxt = new javax.swing.JTextField();
        codPetTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpfTutor = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        Cad.setBackground(new java.awt.Color(204, 255, 255));
        Cad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Cad.setText("Cartão de Vacina do Pet");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 255));
        jLabel8.setText("Descrição:");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Reforço: ");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("Código Pet:");

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nomeVacTxt.setBackground(new java.awt.Color(204, 204, 204));

        desTxt.setBackground(new java.awt.Color(204, 204, 204));

        dataTxt.setBackground(new java.awt.Color(204, 204, 204));

        reforcoTxt.setBackground(new java.awt.Color(204, 204, 204));

        codPetTxt.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 255));
        jLabel5.setText("CPF Tutor:");

        cpfTutor.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeVacTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(desTxt)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codPetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(89, 89, 89)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(reforcoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(Cad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jButton1)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeVacTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(desTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reforcoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(codPetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //verificar se todos os campos estão preenchidos
        if(!nomeVacTxt.getText().isBlank() && !dataTxt.getText().isBlank() && !desTxt.getText().isBlank()
                && !reforcoTxt.getText().isBlank() && !codPetTxt.getText().isBlank()){
           
            Random g = new Random();
            int codVac = g.nextInt(10000);
            
            int codpet = Integer.parseInt(codPetTxt.getText());
            
            //achando cliente, vet e pet, respectivamente
            boolean c = controller.ControllerLogin.retornaLoginCliente(cpfTutor.getText());
            boolean p = controller.ControllerLogin.retornaPet(codpet);
            
            if(c == true && p == true){
                
                petCadastrado = controller.ControllerListas.retornaPetControl(codpet, cpfTutor.getText());
            
                Vacina novaV = new Vacina(nomeVacTxt.getText(), codVac, desTxt.getText(), 
                    dataTxt.getText(), reforcoTxt.getText(), codpet);
            
                //insert no banco de dados
                controller.ControllerCadastros.cadastroVacina(novaV);

                //add vacina ao cartao
                petCadastrado.getCartaoVacina().add(novaV);
                JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso.", "OK!", JOptionPane.INFORMATION_MESSAGE);
            
            }else{
                JOptionPane.showMessageDialog(null, "Pet ou Cliente não existem", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            //campo não preenchido
            JOptionPane.showMessageDialog(null, "Algum campo não está preenchido", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    
    
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cad;
    private javax.swing.JTextField codPetTxt;
    private javax.swing.JTextField cpfTutor;
    private javax.swing.JTextField dataTxt;
    private javax.swing.JTextField desTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField nomeVacTxt;
    private javax.swing.JTextField reforcoTxt;
    // End of variables declaration//GEN-END:variables
}
