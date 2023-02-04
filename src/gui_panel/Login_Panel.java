package gui_panel;

import controller.ControllerLogin;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Veterinario;

public class Login_Panel extends javax.swing.JPanel {

    //private Frame_Principal framePai;
    private MenuPrincipal_Frame framePai;
    //private MenuPrincipal_Frame menuframe;
    private ControllerLogin control;
    private ButtonGroup bg = new ButtonGroup();//grupo com dois radio bottons
    
    //construtor de login
    public Login_Panel(MenuPrincipal_Frame principalF) {
        initComponents();
        this.framePai = principalF;
        //add no grupo de botoes, dois radio bottons - > somente um é selecionado
        this.bg.add(clienteRd);
        this.bg.add(vetRd);
    
    }

    //imagem de fundo
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        try {  
            //carregando a imagem de fundo
            Image imagemFundo = ImageIO.read(
                    new File(getClass().
                            getResource("/imagens/login.jpg").
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

        jLabel2 = new javax.swing.JLabel();
        clienteRd = new javax.swing.JRadioButton();
        cpfTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senhaPassword = new javax.swing.JPasswordField();
        okBnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        redirecionaVet = new javax.swing.JButton();
        vetRd = new javax.swing.JRadioButton();

        jLabel2.setText("CPF / CRMV");

        clienteRd.setText("Cliente");
        clienteRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteRdActionPerformed(evt);
            }
        });

        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("SENHA");

        senhaPassword.setText("jPasswordField1");
        senhaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordActionPerformed(evt);
            }
        });

        okBnt.setText("OK");
        okBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBntActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Veterinário e não possui cadastro?");

        redirecionaVet.setText("Clique aqui");
        redirecionaVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirecionaVetActionPerformed(evt);
            }
        });

        vetRd.setText("Veterinário");
        vetRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetRdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(redirecionaVet, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(okBnt)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfTxt)
                            .addComponent(senhaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteRd)
                            .addComponent(vetRd))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(clienteRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vetRd)
                .addGap(24, 24, 24)
                .addComponent(okBnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(redirecionaVet, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        //verificar se há o cpf no banco de dados
    }//GEN-LAST:event_cpfTxtActionPerformed

    private void senhaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordActionPerformed
        //verificar se asenha está correta de acordo com o cpf
    }//GEN-LAST:event_senhaPasswordActionPerformed

    private void okBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBntActionPerformed
        //acessa o cpf
        String cpfEntrada = cpfTxt.getText();
        //acessa a senha 
        String senhaEntrada = new String(senhaPassword.getPassword());
        
        //variaveis de auxilio na comparação
        boolean veterinario = false;
        boolean cliente = false;
        
        if(vetRd.isSelected()){
            int crmv = Integer.parseInt(cpfTxt.getText());
            veterinario = ControllerLogin.retornaLoginVet(crmv);
            
                if(veterinario == true){
                    //acessa veterinario
                    Veterinario vetOk = ControllerLogin.retornaVetControl(crmv, senhaEntrada);

                    if(vetOk != null){
                        //mudar de painel - indo para menu
                        //framePai.trocaPanel(new MenuPrincipal_Frame(framePai, vetOk));********************
                        //framePai.trocaPanel(new C_Cliente_Panel(framePai, vetOk));//teste
                        //framePai.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//fecahndo frameprincipal
                        //menuframe = new MenuPrincipal_Frame(vetOk);
                        //menuframe.trocaPanel2(new Menu_Panel(menuframe, vetOk));
                        //framePai.trocaFrame(new MenuPrincipal_Frame(vetOk));
                        framePai.trocaPanel2(new Menu_Panel(framePai, vetOk));
                    }

                }else{
                //não possui cadastro ou há algo de incorreto
                JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                        + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
            
        }else if(clienteRd.isSelected()){
            cliente = ControllerLogin.retornaLoginCliente(cpfEntrada);
            
            //verifica se existem ou não
            if(cliente == true ){
                //acessa cliente 
                    Cliente clienteOk = ControllerLogin.retornaClienteControl(cpfEntrada, senhaEntrada);

                    if(clienteOk != null){
                         //mudar de painel - indo para menu
                        //framePai.trocaPanel(new MenuPrincipal_Frame(framePai, clienteOk));*******************
                       // framePai.trocaPanel(new C_Cliente_Panel(framePai, clienteOk));//teste
                       //framePai.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//fecahndo frameprincipal
                       //menuframe = new MenuPrincipal_Frame(clienteOk);
                       //menuframe.trocaPanel2(new Menu_Panel(menuframe, clienteOk));
                       //framePai.trocaFrame(new MenuPrincipal_Frame(clienteOk));
                       framePai.trocaPanel2(new Menu_Panel(framePai, clienteOk));
                    }
            }else{
                //não possui cadastro ou há algo de incorreto
                JOptionPane.showMessageDialog(null, "Não possui cadastro ou há algo de"
                        + " incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_okBntActionPerformed

    private void redirecionaVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirecionaVetActionPerformed
        //sem cadastro é encaminhado para realizálo
        framePai.trocaPanel2(new Cadastro_Vet(framePai));
    }//GEN-LAST:event_redirecionaVetActionPerformed

    private void clienteRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteRdActionPerformed

    private void vetRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vetRdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton clienteRd;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okBnt;
    private javax.swing.JButton redirecionaVet;
    private javax.swing.JPasswordField senhaPassword;
    private javax.swing.JRadioButton vetRd;
    // End of variables declaration//GEN-END:variables
}
