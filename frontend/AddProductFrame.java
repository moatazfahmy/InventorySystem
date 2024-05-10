/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.EmployeeRole;
import backend.Product;
import java.awt.event.ActionEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddProductFrame extends javax.swing.JFrame implements Node {

    private Node parent;
    private EmployeeRole employee;

    /**
     * Creates new form AddProductFrame
     */
    public AddProductFrame(EmployeeRole employee) {
        this.employee = employee;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProductIdField1 = new javax.swing.JTextField();
        jProductNameField1 = new javax.swing.JTextField();
        jManufacturerNameField1 = new javax.swing.JTextField();
        jSupplierNameField1 = new javax.swing.JTextField();
        jQuantityField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPriceField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Product");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product ID");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Name");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 204, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manufacturer Name");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 204, 0));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Supplier Name");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 204, 0));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quantity");
        jLabel5.setOpaque(true);

        jProductIdField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jProductIdField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductIdField1ActionPerformed(evt);
            }
        });

        jProductNameField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jProductNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductNameField1ActionPerformed(evt);
            }
        });

        jManufacturerNameField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jManufacturerNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManufacturerNameField1ActionPerformed(evt);
            }
        });

        jSupplierNameField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jSupplierNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSupplierNameField1ActionPerformed(evt);
            }
        });

        jQuantityField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jQuantityField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantityField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 204, 0));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Price");
        jLabel6.setOpaque(true);

        jPriceField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPriceField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPriceField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jQuantityField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSupplierNameField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jManufacturerNameField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProductNameField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProductIdField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPriceField1))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jProductIdField1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jProductNameField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jManufacturerNameField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jSupplierNameField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQuantityField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPriceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProductIdField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductIdField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductIdField1ActionPerformed

    private void jProductNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductNameField1ActionPerformed

    private void jManufacturerNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManufacturerNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jManufacturerNameField1ActionPerformed

    private void jSupplierNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSupplierNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSupplierNameField1ActionPerformed

    private void jQuantityField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantityField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jQuantityField1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        ((JFrame) this.getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = new JFrame();
        String productId = jProductIdField1.getText();
        String productName = jProductNameField1.getText();
        String manufacturerName = jManufacturerNameField1.getText();
        String supplierName = jSupplierNameField1.getText();
        int quantity;
        float price;
        if (productId.isEmpty() || productName.isEmpty() || manufacturerName.isEmpty() || supplierName.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Some fields are empty");
        }else{
        try {
            quantity = Integer.parseInt(jQuantityField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "You should enter a numeric value in the field whose name is \"Quantity\"");
            return;
        }
        try {
            price = Float.parseFloat(jPriceField1.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "You should enter a numeric value in the field whose name is \"Price\"");
            return;
        }

        Product[] products = employee.getListOfProducts();
        boolean found = false;
        for (Product product : products) {
            if (product.getProductID().equals(productId)) {
                found = true;
            }
        }

        
        if (found) {

            JOptionPane.showMessageDialog(frame, "The product with id = " + productId + " already exists!");

        } else {

            employee.addProduct(productId, productName, manufacturerName, supplierName, quantity, price);
            jProductIdField1.setText("");
            jProductNameField1.setText("");
            jManufacturerNameField1.setText("");
            jSupplierNameField1.setText("");
            jQuantityField1.setText("");
            jPriceField1.setText("");

            JOptionPane.showMessageDialog(frame, "The product with id = " + productId + " has been successfully added.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
}
    private void jPriceField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPriceField1KeyPressed
        if(evt.getKeyCode()==VK_ENTER){
           ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "SimulateButtonClick");
           jButton1ActionPerformed(event);
        }
    }//GEN-LAST:event_jPriceField1KeyPressed

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
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jManufacturerNameField1;
    private javax.swing.JTextField jPriceField1;
    private javax.swing.JTextField jProductIdField1;
    private javax.swing.JTextField jProductNameField1;
    private javax.swing.JTextField jQuantityField1;
    private javax.swing.JTextField jSupplierNameField1;
    // End of variables declaration//GEN-END:variables
    @Override
    public Node getParentNode() {
        return this.parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

}
