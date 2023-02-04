package gui_panel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import modelo.Cliente;
import modelo.Veterinario;
import gui_panel.MenuPrincipal_Frame;

public class Menu_Panel extends javax.swing.JPanel {

    private MenuPrincipal_Frame menuPai;
    private Cliente c;
    private Veterinario v;
    
    public Menu_Panel() {
        initComponents();
    }

    public Menu_Panel(MenuPrincipal_Frame menuP) {
        initComponents();
        this.menuPai = menuP;
    }
    
    //vem do login
    public Menu_Panel(MenuPrincipal_Frame menuframe, Cliente cliente) {
        initComponents();
        this.menuPai = menuframe;
        this.c = cliente;
        menuPai.configuraCliente(c);//habilita os botoes do menu
    }
    //vem do login
    public Menu_Panel(MenuPrincipal_Frame menuframe, Veterinario vet) {
       initComponents();
       this.menuPai = menuframe;
       this.v = vet;
       menuPai.configuraVet(v);//habilita os botoes do menu
    }
    
    //imagem de fundo
    @Override
    protected void paintComponent(Graphics g) {
        
       super.paintComponent(g);
        
        try {  
            //carregando a imagem de fundo
            Image imagemFundo = ImageIO.read(
                    new File(getClass().
                            getResource("/imagens/menu.jpg").
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
