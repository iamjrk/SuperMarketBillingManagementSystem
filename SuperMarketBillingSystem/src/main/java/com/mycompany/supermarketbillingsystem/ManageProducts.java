/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sting
 */
public class ManageProducts extends javax.swing.JFrame {

    /**
     * Creates new form ManageProducts
     */
    public ManageProducts() {
        initComponents();
        selectProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProductID = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        ProductQuantity = new javax.swing.JTextField();
        ProductCategory = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        ProductPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SellerLabel = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        LogoutLabel = new javax.swing.JLabel();
        ChangeLoginInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(5, 56, 56));
        jPanel2.setForeground(new java.awt.Color(60, 63, 65));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Products");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product ID");

        ProductID.setBackground(new java.awt.Color(255, 255, 255));
        ProductID.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        ProductName.setBackground(new java.awt.Color(255, 255, 255));
        ProductName.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        ProductQuantity.setBackground(new java.awt.Color(255, 255, 255));
        ProductQuantity.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        ProductCategory.setBackground(new java.awt.Color(0, 255, 51));
        ProductCategory.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        ProductCategory.setForeground(new java.awt.Color(0, 0, 0));
        ProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Fruits", "Vegetables", "IceCream", "Snacks" }));

        AddButton.setBackground(new java.awt.Color(0, 102, 102));
        AddButton.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        DeleteButton.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(0, 102, 102));
        EditButton.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        EditButton.setText("EDIT");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 102, 102));
        ClearButton.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product List");

        ProductTable.setBackground(new java.awt.Color(0, 153, 153));
        ProductTable.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(0, 0, 0));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price", "Category"
            }
        ));
        ProductTable.setCellSelectionEnabled(true);
        ProductTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionForeground(new java.awt.Color(60, 63, 65));
        ProductTable.getTableHeader().setReorderingAllowed(false);
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        ProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        ProductPrice.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        SellerLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 28)); // NOI18N
        SellerLabel.setForeground(new java.awt.Color(51, 51, 51));
        SellerLabel.setText("Seller");
        SellerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerLabelMouseClicked(evt);
            }
        });

        CategoryLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 28)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(51, 51, 51));
        CategoryLabel.setText("Category");
        CategoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryLabelMouseClicked(evt);
            }
        });

        LogoutLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 28)); // NOI18N
        LogoutLabel.setForeground(new java.awt.Color(51, 51, 51));
        LogoutLabel.setText("Logout");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });

        ChangeLoginInfo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 28)); // NOI18N
        ChangeLoginInfo.setForeground(new java.awt.Color(51, 51, 51));
        ChangeLoginInfo.setText("Change Login Info");
        ChangeLoginInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeLoginInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutLabel)
                    .addComponent(SellerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangeLoginInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(SellerLabel)
                .addGap(43, 43, 43)
                .addComponent(CategoryLabel)
                .addGap(70, 70, 70)
                .addComponent(ChangeLoginInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutLabel)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(360, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(EditButton)
                    .addComponent(DeleteButton)
                    .addComponent(ClearButton))
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        if(ProductID.getText().isEmpty()|| ProductName.getText().isEmpty()|| ProductQuantity.getText().isEmpty()|| ProductPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try {
                Connection con = null;
                PreparedStatement pre = null; //to run a query
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","29July@1999");
                pre = con.prepareStatement("INSERT INTO producttable VALUES(?,?,?,?,?)");
                pre.setInt(1,Integer.valueOf(ProductID.getText()));
                pre.setString(2, (ProductName.getText()));
                pre.setString(3, (ProductQuantity.getText()));
                pre.setString(4, (ProductPrice.getText()));
                pre.setString(5, (ProductCategory.getSelectedItem().toString()));
                int row = pre.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
            selectProduct();
            
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        // TODO add your handling code here:
        ProductID.setText("");
        ProductName.setText("");
        ProductQuantity.setText("");
        ProductPrice.setText("");
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
        if(ProductID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the ProductID to be Deleted");
        }
        else
        {
            try {
                Connection con = null;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","29July@1999");
                String PID = ProductID.getText();
                String Query = "Delete from managementsystem.producttable where ProductID ="+PID;
                Statement pre = con.createStatement();
                pre.executeUpdate(Query);
                selectProduct();
                JOptionPane.showMessageDialog(this,"Product Deleted Successfully");
            } catch (SQLException ex) {
                Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        // TODO add your handling code here:
        if(ProductID.getText().isEmpty()|| ProductName.getText().isEmpty() || ProductQuantity.getText().isEmpty() || ProductPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try {
                Connection con = null;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","29July@1999");
                String Query ="Update managementsystem.producttable set ProductName='"+ProductName.getText()+"'"+",ProductQuantity='"+ProductQuantity.getText()+"'"+",ProductPrice='"+ProductPrice.getText()+"'"+",ProductCategory='"+ProductCategory.getSelectedItem().toString()+"'"+" where ProductID="+ProductID.getText();
                Statement pre = con.createStatement();
                pre.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
                selectProduct();
            }catch (SQLException ex) {
                Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        // TODO add your handling code here:
        //get the info from the table
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int myIndex = ProductTable.getSelectedRow(); // index gives info about that row
        //for row it is 1 based indexing, for column it is 0 based indexing
        ProductID.setText(model.getValueAt(myIndex, 0).toString());
        ProductName.setText(model.getValueAt(myIndex, 1).toString());
        ProductQuantity.setText(model.getValueAt(myIndex, 2).toString());
        ProductPrice.setText(model.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void SellerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerLabelMouseClicked
        // TODO add your handling code here:
        ManageSeller sellerPage = new ManageSeller();
        sellerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellerLabelMouseClicked

    private void CategoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryLabelMouseClicked
        // TODO add your handling code here:
        CategoryList categoryPage = new CategoryList();
        categoryPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryLabelMouseClicked

    private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabelMouseClicked
        // TODO add your handling code here:
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutLabelMouseClicked

    private void ChangeLoginInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeLoginInfoMouseClicked
        // TODO add your handling code here:
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeLoginInfoMouseClicked

    private void selectProduct()
    {
        try {
            Connection con; //Connection requirement
            PreparedStatement pre;
            int cc ; //column count
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","29July@1999");
            java.sql.Statement s= con.createStatement();
            pre = con.prepareStatement("select * from producttable");
            ResultSet rs = pre.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            cc =RSMD.getColumnCount();
            DefaultTableModel DFT =(DefaultTableModel) ProductTable.getModel();
            DFT.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i=1;i<=cc;i++)
                {
                    v2.add(rs.getString("ProductID"));
                    v2.add(rs.getString("ProductName"));
                    v2.add(rs.getString("ProductQuantity"));
                    v2.add(rs.getString("ProductPrice"));
                    v2.add(rs.getString("ProductCategory"));
                }
                DFT.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel ChangeLoginInfo;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JComboBox<String> ProductCategory;
    private javax.swing.JTextField ProductID;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField ProductPrice;
    private javax.swing.JTextField ProductQuantity;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel SellerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}