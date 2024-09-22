package uam.azc.adsi.cinetubi.view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.ArrayList;
import uam.azc.adsi.cinetubi.controller.DulceriaController;
import uam.azc.adsi.cinetubi.dao.CinetubiDAO;
import uam.azc.adsi.cinetubi.model.Asiento;

/**
 *
 * @author aldai
 * @author José Vicente López López 2212002118
 */
public class Menu extends javax.swing.JFrame {

  private DulceriaController dulceriaController;

  /**
   * Creates new form MenuView
   *
   * @param dulceriaController
   */
  public Menu(DulceriaController dulceriaController) {
    initComponents();
    this.dulceriaController = dulceriaController;
    ArrayList<Asiento> asientos=CinetubiDAO.obtenerAsientos(1);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JLayeredPane();
        pnlAux = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCinetubi = new javax.swing.JLabel();
        TaquillaButton = new javax.swing.JButton();
        DulceriaButton = new javax.swing.JButton();
        FuncionButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setToolTipText("");
        pnlFondo.setOpaque(true);
        pnlFondo.setPreferredSize(new java.awt.Dimension(700, 400));

        pnlAux.setBackground(new java.awt.Color(0, 102, 102));
        pnlAux.setPreferredSize(new java.awt.Dimension(300, 400));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("copyright © company name All rights reserved");

        txtCinetubi.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        txtCinetubi.setForeground(new java.awt.Color(255, 255, 255));
        txtCinetubi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCinetubi.setText("CINETUBBI");

        javax.swing.GroupLayout pnlAuxLayout = new javax.swing.GroupLayout(pnlAux);
        pnlAux.setLayout(pnlAuxLayout);
        pnlAuxLayout.setHorizontalGroup(
            pnlAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlAuxLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtCinetubi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAuxLayout.setVerticalGroup(
            pnlAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAuxLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(txtCinetubi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        TaquillaButton.setBackground(new java.awt.Color(0, 102, 102));
        TaquillaButton.setForeground(new java.awt.Color(255, 255, 255));
        TaquillaButton.setText("Taquilla");
        TaquillaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaquillaButtonActionPerformed(evt);
            }
        });

        DulceriaButton.setBackground(new java.awt.Color(0, 102, 102));
        DulceriaButton.setForeground(new java.awt.Color(255, 255, 255));
        DulceriaButton.setText("Dulceria");
        DulceriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DulceriaButtonActionPerformed(evt);
            }
        });

        FuncionButton.setBackground(new java.awt.Color(0, 102, 102));
        FuncionButton.setForeground(new java.awt.Color(255, 255, 255));
        FuncionButton.setText("Programar Funcion");

        SalirButton.setBackground(new java.awt.Color(0, 102, 102));
        SalirButton.setForeground(new java.awt.Color(255, 255, 255));
        SalirButton.setText("Cerrar Seción");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        pnlFondo.setLayer(pnlAux, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFondo.setLayer(TaquillaButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFondo.setLayer(DulceriaButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFondo.setLayer(FuncionButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFondo.setLayer(SalirButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DulceriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaquillaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuncionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlAux, 341, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TaquillaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DulceriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FuncionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, 341, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void DulceriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DulceriaButtonActionPerformed
    // TODO add your handling code here:
    VentaDulceriaView dulceriaView = new VentaDulceriaView(dulceriaController);
    dulceriaController.setVentaDulceriaView(dulceriaView);
    dulceriaView.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_DulceriaButtonActionPerformed

  private void TaquillaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaquillaButtonActionPerformed
    Taquilla taquilla=new Taquilla();
    taquilla.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_TaquillaButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_SalirButtonActionPerformed

//  /**
//   * @param args the command line arguments
//   */
//  public static void main(String args[]) {
//    /* Set the Nimbus look and feel */
//    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//     */
//    try {
//      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//        if ("Nimbus".equals(info.getName())) {
//          javax.swing.UIManager.setLookAndFeel(info.getClassName());
//          break;
//        }
//      }
//    } catch (ClassNotFoundException ex) {
//      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (InstantiationException ex) {
//      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (IllegalAccessException ex) {
//      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    //</editor-fold>
//
//    /* Create and display the form */
//    java.awt.EventQueue.invokeLater(new Runnable() {
//      public void run() {
//        new Menu().setVisible(true);
//      }
//    });
//  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DulceriaButton;
    private javax.swing.JButton FuncionButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JButton TaquillaButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlAux;
    private javax.swing.JLayeredPane pnlFondo;
    private javax.swing.JLabel txtCinetubi;
    // End of variables declaration//GEN-END:variables
}