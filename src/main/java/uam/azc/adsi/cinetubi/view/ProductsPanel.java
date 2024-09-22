/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uam.azc.adsi.cinetubi.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import uam.azc.adsi.cinetubi.controller.DulceriaController;

/**
 *
 * @author aldai
 */
public class ProductsPanel extends javax.swing.JPanel {

  private DulceriaController dulceriaController;

  /**
   * Creates new form SnacksPanel
   */
  public ProductsPanel() {
    initComponents();
  }

  public JPanel getProductsGridPanel() {
    return productsGridPanel;
  }

  public void setProductsGridPanel(JPanel productsGridPanel) {
    this.productsGridPanel = productsGridPanel;
  }

  public JScrollPane getProductsScrollerPane() {
    return productsScrollerPane;
  }

  public void setProductsScrollerPane(JScrollPane productsScrollerPane) {
    this.productsScrollerPane = productsScrollerPane;
  }

  public JLabel getTitleLabel() {
    return titleLabel;
  }

  public void setTitleLabel(JLabel titleLabel) {
    this.titleLabel = titleLabel;
  }

  public JPanel getTitlePanel() {
    return titlePanel;
  }

  public void setTitlePanel(JPanel titlePanel) {
    this.titlePanel = titlePanel;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    titlePanel = new javax.swing.JPanel();
    titleLabel = new javax.swing.JLabel();
    productsScrollerPane = new javax.swing.JScrollPane();
    productsGridPanel = new javax.swing.JPanel();

    titlePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    titlePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    titleLabel.setBackground(new java.awt.Color(204, 255, 204));
    titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    titleLabel.setText("   Productos");
    titleLabel.setOpaque(true);

    javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
    titlePanel.setLayout(titlePanelLayout);
    titlePanelLayout.setHorizontalGroup(
      titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 434, Short.MAX_VALUE)
      .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
    );
    titlePanelLayout.setVerticalGroup(
      titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 25, Short.MAX_VALUE)
      .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    productsGridPanel.setLayout(new java.awt.GridLayout(4, 3, 15, 15));
    productsScrollerPane.setViewportView(productsGridPanel);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(productsScrollerPane))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(productsScrollerPane, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel productsGridPanel;
  private javax.swing.JScrollPane productsScrollerPane;
  private javax.swing.JLabel titleLabel;
  private javax.swing.JPanel titlePanel;
  // End of variables declaration//GEN-END:variables

}
