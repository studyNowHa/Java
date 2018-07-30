/*
 * To change this license header, choose License Headers in Project Properties.
//gabriel esteve aqui
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sysbeta.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osvandre
 */
public class ProductTable extends javax.swing.JFrame {

    private static final int NOME_PROD_IMDICE_COL = 0;
    private static final int CAT_PROD_IMDICE_COL = 1;
    private static final int PRECO_PROD_IMDICE_COL = 2;
    
    private String ultimoCaminhoFotoSel;
    
    /**
     * Creates new form ProductTable
     */
    public ProductTable() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        lProductName = new javax.swing.JLabel();
        lCategory = new javax.swing.JLabel();
        lPrice = new javax.swing.JLabel();
        tfProductName = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox();
        bAdd = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        lPhotoImg = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProduct.setBackground(new java.awt.Color(255, 255, 204));
        tblProduct.setForeground(new java.awt.Color(255, 0, 0));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Produto", "Categoria", "Preço", "Caminho Foto"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        lProductName.setText("Nome Produto");

        lCategory.setText("Categoria");

        lPrice.setText("Preço");

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eletrônicos", "Arte", "Eletricidade", "Comidas" }));

        bAdd.setText("Adicionar");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bUpdate.setText("Atualizar");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Excluir");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAdd)
                        .addGap(18, 18, 18)
                        .addComponent(bUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lProductName)
                            .addComponent(lPrice)
                            .addComponent(lCategory))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfProductName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPrice)
                                    .addComponent(cbCategory, 0, 143, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lPhotoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPhoto)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lProductName)
                                    .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lCategory)
                                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lPrice)
                                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lPhotoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAdd)
                            .addComponent(bDelete)
                            .addComponent(bUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPhoto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO zé mané, concerte isso aqui!!!!
        boolean fieldsOk = false;
        String errorMessage = "";
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        //Valida o campo Product Name
        if(tfProductName.getText().trim().equals("")) {
            errorMessage = "O nome do produto não pode ser nulo. Por favor informe!";
        } else {
            //Nome prod ok
            //Valida o campo Price
            if(tfPrice.getText().trim().equals("")) {
                errorMessage = "O preço do produto não pode ser nulo. Por favor informe!";  
            } else {
                //Preço Ok
                fieldsOk = true;
            }
        }
        if (fieldsOk) {
           Object[] campos = new Object[]{
                tfProductName.getText(),
                cbCategory.getSelectedItem().toString(),
                tfPrice.getText()
           };
           model.addRow(campos); 
        } else {
            lMessage.setText(errorMessage);
        }
        
        clearForm();
        
        
    }//GEN-LAST:event_bAddActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        if (tblProduct.getSelectedRow()==-1) {
            if (tblProduct.getRowCount()==0) {
               lMessage.setText("Não há produtos na tabela! #####kkkkkkkkkkkkkkkkkkkk");
            } else {
               lMessage.setText("Por favor selecione um produto! kkkkkkkkkkkkkkk");
            }
        } else {
            model.setValueAt(tfProductName.getText(), tblProduct.getSelectedRow(), ProductTable.NOME_PROD_IMDICE_COL);
            model.setValueAt(cbCategory.getSelectedItem().toString(), tblProduct.getSelectedRow(), ProductTable.CAT_PROD_IMDICE_COL);
            model.setValueAt(tfPrice.getText(), tblProduct.getSelectedRow(), ProductTable.PRECO_PROD_IMDICE_COL);
        }
        clearForm();      
    }//GEN-LAST:event_bUpdateActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        String productName = model.getValueAt(tblProduct.getSelectedRow(), ProductTable.NOME_PROD_IMDICE_COL).toString();
        String productCat = model.getValueAt(tblProduct.getSelectedRow(), ProductTable.CAT_PROD_IMDICE_COL).toString();
        String productPrice = model.getValueAt(tblProduct.getSelectedRow(), ProductTable.PRECO_PROD_IMDICE_COL).toString();
        tfProductName.setText(productName);
        cbCategory.setSelectedItem(productCat);
        tfPrice.setText(productPrice);
        
    }//GEN-LAST:event_tblProductMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        if (tblProduct.getSelectedRow()==-1) {
            if (tblProduct.getRowCount()==0) {
               lMessage.setText("Não há produtos na tabela!");
            } else {
               lMessage.setText("Matheus Quilles é o Z1K4");
            }
        } else {
            model.removeRow(tblProduct.getSelectedRow());
        }   
        clearForm();
    }//GEN-LAST:event_bDeleteActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(this);
        File f = jfc.getSelectedFile();
        ultimoCaminhoFotoSel = f.getPath();
        try {
            Image img;
            img = ImageIO.read(f);
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lPhotoImg.getWidth(),
                                                            lPhotoImg.getHeight(),
                                                            Image.SCALE_SMOOTH));
            lPhotoImg.setIcon(imgIcon);            
        } catch (IOException ex) {
            Logger.getLogger(ProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPhotoActionPerformed

    
    private void clearForm() {
        tfProductName.setText("");
        tfPrice.setText("");
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
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JComboBox cbCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCategory;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lPhotoImg;
    private javax.swing.JLabel lPrice;
    private javax.swing.JLabel lProductName;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfProductName;
    // End of variables declaration//GEN-END:variables
}