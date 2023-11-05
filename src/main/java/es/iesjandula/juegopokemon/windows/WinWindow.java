/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.iesjandula.juegopokemon.windows;

import es.iesjandula.juegopokemon.classes.Pokemon;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author casaj
 */
public class WinWindow extends javax.swing.JFrame {

    /**
     * Creates new form WinWindow
     */
    private final ImageIcon imagenBotonJugar = new ImageIcon("src/main/resources/imagenesWidgets/botonJugar.png");
    private final ImageIcon imagenBotonSalir = new ImageIcon("src/main/resources/imagenesWidgets/botonSalir.png");
    private List <Pokemon> ganadores;
    public WinWindow() 
    {
        initComponents();
    }
    public WinWindow(List<Pokemon>ganadores,String jugador)
    {
        initComponents();
        this.ganadores = ganadores;
        this.ganador.setText("Ha ganado el "+jugador);
        this.botonJugar.setIcon(imagenBotonJugar);
        this.botonSalir.setIcon(imagenBotonSalir);
        this.setGanadores();
    }
    
    private void setGanadores()
    {
        
        switch(this.ganadores.size())
        {
            case 1:
            {
                this.carta1.setIcon(new ImageIcon(this.ganadores.get(0).getImageUrl()));
                this.vidaRestante1.setText("Vida Restante: "+this.ganadores.get(0).getHp());
                this.carta2.setText("");
                this.vidaRestante2.setText("");
                this.carta3.setText("");
                this.vidaRestante3.setText("");
                this.carta4.setText("");
                this.vidaRestante4.setText("");
                this.carta5.setText("");
                this.vidaRestante5.setText("");
                break;
            }
            case 2:
            {
                this.carta1.setIcon(new ImageIcon(this.ganadores.get(0).getImageUrl()));
                this.carta2.setIcon(new ImageIcon(this.ganadores.get(1).getImageUrl()));
                this.vidaRestante1.setText("Vida Restante: "+this.ganadores.get(0).getHp());
                this.vidaRestante2.setText("Vida Restante: "+this.ganadores.get(1).getHp());
                this.carta3.setText("");
                this.vidaRestante3.setText("");
                this.carta4.setText("");
                this.vidaRestante4.setText("");
                this.carta5.setText("");
                this.vidaRestante5.setText("");
                break;
            }
            case 3:
            {
                this.carta1.setIcon(new ImageIcon(this.ganadores.get(0).getImageUrl()));
                this.carta2.setIcon(new ImageIcon(this.ganadores.get(1).getImageUrl()));
                this.carta3.setIcon(new ImageIcon(this.ganadores.get(2).getImageUrl()));
                this.vidaRestante1.setText("Vida Restante: "+this.ganadores.get(0).getHp());
                this.vidaRestante2.setText("Vida Restante: "+this.ganadores.get(1).getHp());
                this.vidaRestante3.setText("Vida Restante: "+this.ganadores.get(2).getHp());
                this.carta4.setText("");
                this.vidaRestante4.setText("");
                this.carta5.setText("");
                this.vidaRestante5.setText("");
                break;
            }
            case 4:
            {
                this.carta1.setIcon(new ImageIcon(this.ganadores.get(0).getImageUrl()));
                this.carta2.setIcon(new ImageIcon(this.ganadores.get(1).getImageUrl()));
                this.carta3.setIcon(new ImageIcon(this.ganadores.get(2).getImageUrl()));
                this.carta4.setIcon(new ImageIcon(this.ganadores.get(3).getImageUrl()));
                this.vidaRestante1.setText("Vida Restante: "+this.ganadores.get(0).getHp());
                this.vidaRestante2.setText("Vida Restante: "+this.ganadores.get(1).getHp());
                this.vidaRestante3.setText("Vida Restante: "+this.ganadores.get(2).getHp());
                this.vidaRestante4.setText("Vida Restante: "+this.ganadores.get(3).getHp());
                this.carta5.setText("");
                this.vidaRestante5.setText("");
                break;
            }
            case 5:
            {
                this.carta1.setIcon(new ImageIcon(this.ganadores.get(0).getImageUrl()));
                this.carta2.setIcon(new ImageIcon(this.ganadores.get(1).getImageUrl()));
                this.carta3.setIcon(new ImageIcon(this.ganadores.get(2).getImageUrl()));
                this.carta4.setIcon(new ImageIcon(this.ganadores.get(3).getImageUrl()));
                this.carta5.setIcon(new ImageIcon(this.ganadores.get(4).getImageUrl()));
                this.vidaRestante1.setText("Vida Restante: "+this.ganadores.get(0).getHp());
                this.vidaRestante2.setText("Vida Restante: "+this.ganadores.get(1).getHp());
                this.vidaRestante3.setText("Vida Restante: "+this.ganadores.get(2).getHp());
                this.vidaRestante4.setText("Vida Restante: "+this.ganadores.get(3).getHp());
                this.vidaRestante5.setText("Vida Restante: "+this.ganadores.get(4).getHp());
                break;
            }
                
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ganador = new javax.swing.JLabel();
        carta1 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        vidaRestante1 = new javax.swing.JLabel();
        vidaRestante2 = new javax.swing.JLabel();
        vidaRestante3 = new javax.swing.JLabel();
        vidaRestante4 = new javax.swing.JLabel();
        vidaRestante5 = new javax.swing.JLabel();
        botonJugar = new javax.swing.JLabel();
        botonSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ganador.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        ganador.setForeground(new java.awt.Color(0, 102, 51));
        ganador.setText("jLabel1");

        carta1.setText("jLabel2");

        carta2.setText("jLabel2");

        carta3.setText("jLabel2");

        carta4.setText("jLabel2");

        carta5.setText("jLabel2");

        vidaRestante1.setText("jLabel1");

        vidaRestante2.setText("jLabel1");

        vidaRestante3.setText("jLabel1");

        vidaRestante4.setText("jLabel1");

        vidaRestante5.setText("jLabel1");

        botonJugar.setText("jLabel1");
        botonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonJugarMouseClicked(evt);
            }
        });

        botonSalir.setText("jLabel1");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Pokemons restantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vidaRestante1)
                            .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(343, 386, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vidaRestante2)
                                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vidaRestante4))
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vidaRestante5)
                            .addComponent(vidaRestante3))
                        .addGap(18, 18, 18)
                        .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ganador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ganador)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vidaRestante4)
                            .addComponent(vidaRestante5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vidaRestante3)
                            .addComponent(vidaRestante2)
                            .addComponent(vidaRestante1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugarMouseClicked
        SelectionWindow selection = new SelectionWindow();
        selection.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonJugarMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonSalirMouseClicked

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
            java.util.logging.Logger.getLogger(WinWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonJugar;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel vidaRestante1;
    private javax.swing.JLabel vidaRestante2;
    private javax.swing.JLabel vidaRestante3;
    private javax.swing.JLabel vidaRestante4;
    private javax.swing.JLabel vidaRestante5;
    // End of variables declaration//GEN-END:variables
}
