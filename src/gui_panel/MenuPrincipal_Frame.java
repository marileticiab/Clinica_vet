package gui_panel;

/*NECESSÁRIO: configurar data e hora */

import gui_tabelas.Table_Cliente;
import gui_tabelas.Table_Consulta;
import gui_tabelas.Table_Pet;
import gui_tabelas.Table_Proc;
import gui_tabelas.Table_Receita;
import gui_tabelas.Table_Vacina;
import gui_tabelas.Table_Vet;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Pet;
import modelo.Procedimento;
import modelo.Receita;
import modelo.Veterinario;

public class MenuPrincipal_Frame extends javax.swing.JFrame {

    private Cliente c;
    private Veterinario v;

    private Container conteudoFrame;
    
    //CONTRUTOR DE INÍCIO DE TODO PROJETO
    public MenuPrincipal_Frame(){
        initComponents();
        this.setLayout(new BorderLayout());
        
        conteudoFrame = this.getContentPane();
        //mudando de paineis
        trocaPanel2(new Inicio_Panel(this));
    }
    
     public void trocaPanel2(JPanel newPanel){
        //remove painel existente
        conteudoFrame.removeAll();
        
        conteudoFrame.add(newPanel);
        //torna visível
        validate();
        setVisible(true);
        conteudoFrame.repaint();
    }
     
    //Ativivando utilidades para o veterinario
    public void configuraVet(Veterinario vet){
        this.v = vet;
        
        clienteRdC.setEnabled(true);
        petRdC.setEnabled(true);
        vacinaRdC.setEnabled(true);
        receitaRdC.setEnabled(true);
        
        consultaRdA.setEnabled(true);
        procRdA.setEnabled(true);
        
        clienteRsLE.setEnabled(true);
        petRdLE.setEnabled(true);
        vetRdLE.setEnabled(true);
        vacinaRdLE.setEnabled(true);
        consultaRdLE.setEnabled(true);
        procRdLE.setEnabled(true);
        receitaRdLE.setEnabled(true);
        
        clienteRdDel.setEnabled(true);
        petRdDel.setEnabled(true);
        procRdDel.setEnabled(true);
        consultaRdDel.setEnabled(true);
        vetRdDel.setEnabled(true);
        vacinaRdDel.setEnabled(true);
        receitaRdDel.setEnabled(true);
    }
    
    //Ativivando utilidades para o cliente
    public void configuraCliente(Cliente cliente){
        this.c = cliente;
        
        petRdC.setEnabled(true);
        vacinaRdC.setEnabled(true);
        
        consultaRdA.setEnabled(true);
        
        clienteRsLE.setEnabled(true);
        petRdLE.setEnabled(true);
        vetRdLE.setEnabled(true);
        vacinaRdLE.setEnabled(true);
        consultaRdLE.setEnabled(true);
        procRdLE.setEnabled(true);
        receitaRdLE.setEnabled(true);
        
        clienteRdDel.setEnabled(true);
        petRdDel.setEnabled(true);
        procRdDel.setEnabled(true);
        consultaRdDel.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        clienteRdC = new javax.swing.JRadioButtonMenuItem();
        petRdC = new javax.swing.JRadioButtonMenuItem();
        vacinaRdC = new javax.swing.JRadioButtonMenuItem();
        receitaRdC = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        consultaRdA = new javax.swing.JRadioButtonMenuItem();
        procRdA = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        clienteRsLE = new javax.swing.JRadioButtonMenuItem();
        petRdLE = new javax.swing.JRadioButtonMenuItem();
        vetRdLE = new javax.swing.JRadioButtonMenuItem();
        vacinaRdLE = new javax.swing.JRadioButtonMenuItem();
        consultaRdLE = new javax.swing.JRadioButtonMenuItem();
        procRdLE = new javax.swing.JRadioButtonMenuItem();
        receitaRdLE = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        clienteRdDel = new javax.swing.JRadioButtonMenuItem();
        petRdDel = new javax.swing.JRadioButtonMenuItem();
        vetRdDel = new javax.swing.JRadioButtonMenuItem();
        vacinaRdDel = new javax.swing.JRadioButtonMenuItem();
        consultaRdDel = new javax.swing.JRadioButtonMenuItem();
        procRdDel = new javax.swing.JRadioButtonMenuItem();
        receitaRdDel = new javax.swing.JRadioButtonMenuItem();
        sairMenu = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 153));
        jMenuBar1.setAlignmentX(2.0F);

        jMenu1.setBackground(new java.awt.Color(255, 255, 204));
        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("Cadastros |");
        jMenu1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        clienteRdC.setSelected(true);
        clienteRdC.setText("Cliente");
        clienteRdC.setEnabled(false);
        clienteRdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteRdCActionPerformed(evt);
            }
        });
        jMenu1.add(clienteRdC);

        petRdC.setSelected(true);
        petRdC.setText("Pet");
        petRdC.setEnabled(false);
        petRdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petRdCActionPerformed(evt);
            }
        });
        jMenu1.add(petRdC);

        vacinaRdC.setSelected(true);
        vacinaRdC.setText("Cartão de Vacina");
        vacinaRdC.setEnabled(false);
        vacinaRdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaRdCActionPerformed(evt);
            }
        });
        jMenu1.add(vacinaRdC);

        receitaRdC.setSelected(true);
        receitaRdC.setText("Receita Veterinária");
        receitaRdC.setEnabled(false);
        receitaRdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitaRdCActionPerformed(evt);
            }
        });
        jMenu1.add(receitaRdC);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 153, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu2.setText("Agendamentos |");
        jMenu2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        consultaRdA.setSelected(true);
        consultaRdA.setText("Consulta");
        consultaRdA.setEnabled(false);
        consultaRdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRdAActionPerformed(evt);
            }
        });
        jMenu2.add(consultaRdA);

        procRdA.setSelected(true);
        procRdA.setText("Procedimento");
        procRdA.setEnabled(false);
        procRdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procRdAActionPerformed(evt);
            }
        });
        jMenu2.add(procRdA);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(255, 255, 204));
        jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu4.setText("Listar & Editar |");
        jMenu4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        clienteRsLE.setSelected(true);
        clienteRsLE.setText("Cliente");
        clienteRsLE.setEnabled(false);
        clienteRsLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteRsLEActionPerformed(evt);
            }
        });
        jMenu4.add(clienteRsLE);

        petRdLE.setSelected(true);
        petRdLE.setText("Pet");
        petRdLE.setEnabled(false);
        petRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(petRdLE);

        vetRdLE.setSelected(true);
        vetRdLE.setText("Veterinário");
        vetRdLE.setEnabled(false);
        vetRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(vetRdLE);

        vacinaRdLE.setSelected(true);
        vacinaRdLE.setText("Cartão de Vacina");
        vacinaRdLE.setEnabled(false);
        vacinaRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(vacinaRdLE);

        consultaRdLE.setSelected(true);
        consultaRdLE.setText("Consulta");
        consultaRdLE.setEnabled(false);
        consultaRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(consultaRdLE);

        procRdLE.setSelected(true);
        procRdLE.setText("Procedimento");
        procRdLE.setEnabled(false);
        procRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(procRdLE);

        receitaRdLE.setSelected(true);
        receitaRdLE.setText("Receitas Veterinárias");
        receitaRdLE.setEnabled(false);
        receitaRdLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitaRdLEActionPerformed(evt);
            }
        });
        jMenu4.add(receitaRdLE);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 153, 255));
        jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu5.setText("Deletar |");
        jMenu5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        clienteRdDel.setSelected(true);
        clienteRdDel.setText("Cliente");
        clienteRdDel.setEnabled(false);
        clienteRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(clienteRdDel);

        petRdDel.setSelected(true);
        petRdDel.setText("Pet");
        petRdDel.setEnabled(false);
        petRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(petRdDel);

        vetRdDel.setSelected(true);
        vetRdDel.setText("Veterinário");
        vetRdDel.setEnabled(false);
        vetRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(vetRdDel);

        vacinaRdDel.setSelected(true);
        vacinaRdDel.setText("Cartão de Vacina");
        vacinaRdDel.setEnabled(false);
        vacinaRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(vacinaRdDel);

        consultaRdDel.setSelected(true);
        consultaRdDel.setText("Consulta");
        consultaRdDel.setEnabled(false);
        consultaRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(consultaRdDel);

        procRdDel.setSelected(true);
        procRdDel.setText("Procedimento");
        procRdDel.setEnabled(false);
        procRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(procRdDel);

        receitaRdDel.setSelected(true);
        receitaRdDel.setText("Receitas Veterinárias");
        receitaRdDel.setEnabled(false);
        receitaRdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitaRdDelActionPerformed(evt);
            }
        });
        jMenu5.add(receitaRdDel);

        jMenuBar1.add(jMenu5);

        sairMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sairMenu.setText("SAIR");
        sairMenu.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Sair");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        sairMenu.add(jRadioButtonMenuItem1);

        jMenuBar1.add(sairMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteRdCActionPerformed
       //indo para cadas. cliente
       
       if(v != null){
           //framePai.trocaPanel(new Cadastro_Cliente(framePai, v));
           trocaPanel2(new Cadastro_Cliente(this, v));
        }
    }//GEN-LAST:event_clienteRdCActionPerformed

    private void petRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petRdCActionPerformed
        //indo para cadas. pet
        if(c != null){
           trocaPanel2(new Cadastro_Pet(this, c));
        }else if(v != null){
           trocaPanel2(new Cadastro_Pet(this, v));
        }
    }//GEN-LAST:event_petRdCActionPerformed

    private void vacinaRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaRdCActionPerformed
        //indo para cadas. vacina
        if(c != null){
            trocaPanel2(new Cadastro_Vacina(this, c));
        }else if(v != null){
            trocaPanel2(new Cadastro_Vacina(this, v));
        }
    }//GEN-LAST:event_vacinaRdCActionPerformed

    private void receitaRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitaRdCActionPerformed
        //indo para cadas. receita
       if(v != null){
            trocaPanel2(new Cadastro_Receita(this, v));
        }
        
    }//GEN-LAST:event_receitaRdCActionPerformed

    private void procRdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procRdAActionPerformed
       //indo para cadas. procedimento
       if(v != null){
            trocaPanel2(new AgendaProcedimento_Panel(this, v));
        }
        
    }//GEN-LAST:event_procRdAActionPerformed

    private void petRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petRdLEActionPerformed
       
        if(c != null){
            trocaPanel2(new Table_Pet(this, c));
        }else if(v != null){
            trocaPanel2(new Table_Pet(this, v));
        }
        
    }//GEN-LAST:event_petRdLEActionPerformed

    private void petRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petRdDelActionPerformed
        
        if(c != null || v != null){
            trocaPanel2(new Deleta_Pet(this));
        }
    }//GEN-LAST:event_petRdDelActionPerformed

    private void consultaRdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRdAActionPerformed
        //indo para cadas. vacina
        if(c != null){
            trocaPanel2(new AgendaConsulta_Panel(this, c));
        }else if(v != null){
            trocaPanel2(new AgendaConsulta_Panel(this, v));
        }
    }//GEN-LAST:event_consultaRdAActionPerformed

    private void clienteRsLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteRsLEActionPerformed
        
        if(c != null){
            trocaPanel2(new Table_Cliente(this, c));
        }else if(v != null){
            trocaPanel2(new Table_Cliente(this, v));
        }
        
    }//GEN-LAST:event_clienteRsLEActionPerformed

    private void clienteRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteRdDelActionPerformed
        
        if(c != null || v != null){
            trocaPanel2(new Deleta_Cliente(this));
        }
        
    }//GEN-LAST:event_clienteRdDelActionPerformed

    private void vetRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetRdLEActionPerformed

        if(c != null){
            trocaPanel2(new Table_Vet(this, c));
        }else if(v != null){
            trocaPanel2(new Table_Vet(this, v));
        }
        
    }//GEN-LAST:event_vetRdLEActionPerformed

    private void vacinaRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaRdDelActionPerformed
        if(v != null){
            trocaPanel2(new Deleta_Vacina(this, v));
        }
    }//GEN-LAST:event_vacinaRdDelActionPerformed

    private void procRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procRdDelActionPerformed
       if(c != null || v != null){
            trocaPanel2(new Deleta_Procedimento(this));
       }
    }//GEN-LAST:event_procRdDelActionPerformed

    private void consultaRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRdDelActionPerformed
        if(c != null || v != null){
            trocaPanel2(new Deleta_Consulta(this));
        }
    }//GEN-LAST:event_consultaRdDelActionPerformed

    private void receitaRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitaRdDelActionPerformed
        if(v != null){
            trocaPanel2(new Deleta_Receita(this, v));
        }
    }//GEN-LAST:event_receitaRdDelActionPerformed

    private void vetRdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetRdDelActionPerformed
        if(v != null){
            trocaPanel2(new Delete_Vet(this, v));
        }
    }//GEN-LAST:event_vetRdDelActionPerformed

    private void vacinaRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaRdLEActionPerformed
         if(c != null || v != null){
             
             String mensagem = JOptionPane.showInputDialog(null, "Informe qual é o CÓDIGO do pet:",
                     "Antes...", JOptionPane.OK_OPTION);
             
             int cod = Integer.parseInt(mensagem);
             boolean y = controller.ControllerLogin.retornaPet(cod);
             
             if(y == true){
                String mensagem2 = JOptionPane.showInputDialog(null, "Informe agora o CPF do tutor:",
                        "Antes...", JOptionPane.OK_OPTION);
             
                boolean x = controller.ControllerLogin.retornaLoginCliente(mensagem2);
             
                if(x == true){
                    Pet pet = controller.ControllerListas.retornaPetControl(cod, mensagem2);
                    trocaPanel2(new Table_Vacina(this, pet));
                }else{
                    JOptionPane.showMessageDialog(null, "Não encontramos tutor.", "OPS...", JOptionPane.ERROR_MESSAGE);
                }
             }else{
                 JOptionPane.showMessageDialog(null, "Não encontramos seu pet.", "OPS...", JOptionPane.ERROR_MESSAGE);
             }
       }
    }//GEN-LAST:event_vacinaRdLEActionPerformed

    private void consultaRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRdLEActionPerformed
       if(c != null || v != null){
             
             String mensagem = JOptionPane.showInputDialog(null, "Informe qual é o CÓDIGO da consulta:",
                     "Antes...", JOptionPane.OK_OPTION);
             
             int cod = Integer.parseInt(mensagem);
             
             Consulta con = controller.ControllerListas.retornaConsultaControl(cod);
             
             if(con != null){
                 
                String mensagem2 = JOptionPane.showInputDialog(null, "Informe agora o CPF do tutor:",
                        "Antes...", JOptionPane.OK_OPTION);

                boolean x  = controller.ControllerLogin.retornaLoginCliente(mensagem2);
             
                if(x == true){
                    Pet pet = controller.ControllerListas.retornaPetControl(con.getPet(), mensagem2);
                    trocaPanel2(new Table_Consulta(this, pet));
                    
                }else{
                 JOptionPane.showMessageDialog(null, "Não encontramos seu CPF.", "OPS...", JOptionPane.ERROR_MESSAGE);
                }
                
             }else{
                 JOptionPane.showMessageDialog(null, "Não encontramos sua consulta.", "OPS...", JOptionPane.ERROR_MESSAGE);
             }
       }
    }//GEN-LAST:event_consultaRdLEActionPerformed

    private void procRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procRdLEActionPerformed
       if(c != null || v != null){
             
             String mensagem = JOptionPane.showInputDialog(null, "Informe qual é o CÓDIGO do procedimento:",
                     "Antes...", JOptionPane.OK_OPTION);
             
             int cod = Integer.parseInt(mensagem);
             Procedimento proc = controller.ControllerListas.retornaProcedimentoControl(cod);
             
             if(proc != null){
              
                String mensagem2 = JOptionPane.showInputDialog(null, "Informe agora o CPF do tutor:",
                        "Antes...", JOptionPane.OK_OPTION);

                boolean x  = controller.ControllerLogin.retornaLoginCliente(mensagem2);
             
                if(x == true){
                    Pet pet = controller.ControllerListas.retornaPetControl(proc.getPet(), mensagem2);
                    trocaPanel2(new Table_Proc(this, pet));
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Não encontramos seu cpf.", "OPS...", JOptionPane.ERROR_MESSAGE);
                }
             }else{
                 JOptionPane.showMessageDialog(null, "Não encontramos seu procedimento.", "OPS...", JOptionPane.ERROR_MESSAGE);
             }
       }
        
    }//GEN-LAST:event_procRdLEActionPerformed

    private void receitaRdLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitaRdLEActionPerformed
       if(c != null || v != null){
             
             String mensagem = JOptionPane.showInputDialog(null, "Informe qual é o CÓDIGO da receita:",
                     "Antes...", JOptionPane.OK_OPTION);
             
             int cod = Integer.parseInt(mensagem);
             
             String mensagem2 = JOptionPane.showInputDialog(null, "Informe agora o CRMV do veterinário:",
                     "Antes...", JOptionPane.OK_OPTION);
             
             int crmv = Integer.parseInt(mensagem2);
             
             Receita receita = controller.ControllerListas.retornaReceitaControl(crmv, cod);
             
             if(receita != null){
                String mensagem3 = JOptionPane.showInputDialog(null, "Informe agora o CPF do tutor:",
                        "Antes...", JOptionPane.OK_OPTION);

                boolean x  = controller.ControllerLogin.retornaLoginCliente(mensagem3);

                if(x == true){
                    Pet pet = controller.ControllerListas.retornaPetControl(receita.getPet(),mensagem3);
                    trocaPanel2(new Table_Receita(this, pet));
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Não encontramos seu cpf.", "OPS...", JOptionPane.ERROR_MESSAGE);
                }
             }else{
                JOptionPane.showMessageDialog(null, "Não encontramos sua receita.", "OPS...", JOptionPane.ERROR_MESSAGE);
             }
       }
    }//GEN-LAST:event_receitaRdLEActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
       
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?",
                "Sair", JOptionPane.OK_CANCEL_OPTION);
        
	if (op == JOptionPane.OK_OPTION){
		System.exit(0);
        }
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem clienteRdC;
    private javax.swing.JRadioButtonMenuItem clienteRdDel;
    private javax.swing.JRadioButtonMenuItem clienteRsLE;
    private javax.swing.JRadioButtonMenuItem consultaRdA;
    private javax.swing.JRadioButtonMenuItem consultaRdDel;
    private javax.swing.JRadioButtonMenuItem consultaRdLE;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JRadioButtonMenuItem petRdC;
    private javax.swing.JRadioButtonMenuItem petRdDel;
    private javax.swing.JRadioButtonMenuItem petRdLE;
    private javax.swing.JRadioButtonMenuItem procRdA;
    private javax.swing.JRadioButtonMenuItem procRdDel;
    private javax.swing.JRadioButtonMenuItem procRdLE;
    private javax.swing.JRadioButtonMenuItem receitaRdC;
    private javax.swing.JRadioButtonMenuItem receitaRdDel;
    private javax.swing.JRadioButtonMenuItem receitaRdLE;
    private javax.swing.JMenu sairMenu;
    private javax.swing.JRadioButtonMenuItem vacinaRdC;
    private javax.swing.JRadioButtonMenuItem vacinaRdDel;
    private javax.swing.JRadioButtonMenuItem vacinaRdLE;
    private javax.swing.JRadioButtonMenuItem vetRdDel;
    private javax.swing.JRadioButtonMenuItem vetRdLE;
    // End of variables declaration//GEN-END:variables

}
