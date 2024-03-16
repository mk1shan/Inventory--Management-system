
import com.mysql.cj.protocol.Resultset;
import dao.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mudipa
 */
public class ManageProduct extends javax.swing.JFrame {

    private int productpk = 0;
    private int totalQuantity = 0;

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        setLocationRelativeTo(null);;
    }

    private void getAllCategory() {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from category");
            comboboxcategory.removeAllItems();
            while (rs.next()) {
                comboboxcategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    
        
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("")) {

            return false;
        } else if (formType.equals("new") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("") && !txtquantity.getText().equals("")) {
            return false;
        } else {
            return true;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduct = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblquantity = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboboxcategory = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Manage  Product ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 31, 319, -1));

        tableproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "price", "Descriptiom", "Category Id", "Category Name"
            }
        ));
        tableproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableproduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, 380));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 145, 37, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 173, 213, -1));

        lblquantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblquantity.setText("Quantity");
        getContentPane().add(lblquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 213, 71, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 281, 37, -1));

        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 241, 213, -1));
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 383, 213, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 355, 71, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 309, 213, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 423, 71, -1));

        comboboxcategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboboxcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboboxcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 451, 214, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 514, -1, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 514, 61, -1));

        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 514, 61, -1));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 514, 61, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All_page_Background.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        getAllCategory();
        DefaultTableModel model = (DefaultTableModel) tableproduct.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product inner join category on product.category_fk=category.category_pk ");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("quantity"), rs.getString("price"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        btnupdate.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        String name = txtName.getText();
        String quantity = txtquantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboboxcategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into product(name,quantity,price,description,category_fk) values(?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, quantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "product added succesfully");
                setVisible(false);
                new ManageProduct().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

   String name = txtName.getText();
        String quantity = txtquantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboboxcategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                if(!quantity.equals("")){
                totalQuantity = totalQuantity+Integer.parseInt(quantity);
                
                }
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
                ps.setString(1, name);
                ps.setInt(2, totalQuantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                 ps.setInt(6, productpk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "product updated succesfully");
                setVisible(false);
                new ManageProduct().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed

        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        setVisible(false);
        new ManageProduct().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

    private void tableproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductMouseClicked

        int index = tableproduct.getSelectedRow();
        TableModel model = tableproduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        productpk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);

        String quantity = model.getValueAt(index, 2).toString();
        totalQuantity = 0;
        lblquantity.setText("Add Quantity ");
        totalQuantity = Integer.parseInt(quantity);

        String price = model.getValueAt(index, 3).toString();
        txtPrice.setText(price);

        String description = model.getValueAt(index, 4).toString();
        txtDescription.setText(description);

        comboboxcategory.removeAllItems();
        String categoryId = model.getValueAt(index, 5).toString();
        String categoryName = model.getValueAt(index, 5).toString();
        comboboxcategory.addItem(categoryId + "-" + categoryName);

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from category");
           
            while (rs.next()) {
                if(Integer.parseInt(categoryId) !=rs.getInt(1))
                comboboxcategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          btnsave.setEnabled(false);
       btnupdate.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_tableproductMouseClicked

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboboxcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JTable tableproduct;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
