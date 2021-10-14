/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class OrderedDetails extends javax.swing.JPanel {
Statement stt ;
    ResultSet rs , rs1;
    Connecter cnn = new Connecter();
    private int SlectedRow;
    String idp;
   // Ordered o ;
    //int id = o.getid() ;
    //int a = o.getid();
    //int id = 14 ;
    
    DefaultTableModel ct = new DefaultTableModel();
    /**
     * Creates new form Details
     */
    public OrderedDetails(int idCmd) {
        
        initComponents();
        ct = (DefaultTableModel)(OrderedTable.getModel());
       
         try{
             
            stt = cnn.obtenirconnexion().createStatement() ; 
            //rs = stt.executeQuery(" SELECT * from details,product where details.idProduct = product.idProduct ");
            
            rs = stt.executeQuery(" SELECT * from details,product where details.idProduct = product.idProduct AND idcmd = "+idCmd+" ");
                                  
           
           while(rs.next()){
               //probleme a la date 
                ct.addRow(new Object [] {rs.getInt("idcmd"),rs.getInt("idProduct") , rs.getString("nom_pro") ,rs.getInt("quantity")}) ;
           }
             rs1 = stt.executeQuery("SELECT * FROM product");
           while(rs1.next()){
               String noproduct = rs1.getString("idProduct");
              productcomb.addItem(noproduct);
           }
           idcmd.setText(""+idCmd);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
        OrderedTable.setModel(ct);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idcmd = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderedTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        productcomb = new javax.swing.JComboBox<>();

        jScrollPane2.setViewportView(jTree1);

        setBackground(new java.awt.Color(247, 250, 250));

        jPanel1.setBackground(new java.awt.Color(247, 250, 250));

        jLabel1.setText("ID Ordered");

        idcmd.setEnabled(false);

        jLabel4.setText("Quantity");

        OrderedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCommande", "idProduct", "nom produit", "Quantity"
            }
        ));
        OrderedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderedTable);

        jLabel5.setText("Product Name");

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productcomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(EDIT)
                    .addComponent(Delete))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrderedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderedTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = OrderedTable.getSelectedRow();
        deplace(SlectedRow);
         idp = productcomb.getSelectedItem().toString() ;
        
    }//GEN-LAST:event_OrderedTableMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        try{
            
            int id = Integer.valueOf(idcmd.getText()) ;
            String product = productcomb.getSelectedItem().toString() ;
            int qte = Integer.parseInt(quantity.getText());
            stt.executeUpdate("INSERT INTO `details`(`idcmd`,`idProduct`, `quantity`) VALUES ("+id+" , "+product+","+qte+")" );
            JOptionPane.showMessageDialog(null, "The product has been added in this ordered ");
            refresh();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }

    }//GEN-LAST:event_ADDActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
       try{ 
           
            if(JOptionPane.showConfirmDialog(null, "ARE YOU SURE", "EDIT",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
                
               
                // stt.executeUpdate("UPDATE employee SET name="+tnom.getText().toString()+" ,grp="+tgrp.getText().toString()+", pre="+tpre.getText().toString()+" WHERE idemp="+tcin.getText().toString());
               String query = "UPDATE details SET idProduct=" + productcomb.getSelectedItem().toString() + " , quantity= "
                    + Integer.valueOf(quantity.getText()) + " WHERE `idProduct`= "+idp+" AND idcmd = "+Integer.valueOf(idcmd.getText()) +"";
                stt.executeUpdate(query);
                refresh();
            }
        }
        catch(Exception e)
        {
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_EDITActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
       try
        {
            if(JOptionPane.showConfirmDialog(null, "Do you really want to delete that ligne de commande ?", "DELET", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
            {
                if(idcmd.getText().length() != 0){
                    stt.executeUpdate("DELETE FROM details WHERE idcmd ='" + idcmd.getText() + "' AND idProduct = "+productcomb.getSelectedItem().toString()+" AND quantity = "+Integer.valueOf(quantity.getText()+""));
                     

                }else{
                    JOptionPane.showMessageDialog(null, "No ID");
                }
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
       refresh();
    }//GEN-LAST:event_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Delete;
    private javax.swing.JButton EDIT;
    private javax.swing.JTable OrderedTable;
    private javax.swing.JTextField idcmd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JComboBox<String> productcomb;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
private void refresh() {
         vider();
        try{
            
            int id = Integer.valueOf(idcmd.getText()) ;
          stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery(" SELECT * from details,product where details.idProduct = product.idProduct AND idcmd = "+id+" ");
           while(rs.next()){
                
                ct.addRow(new Object [] {rs.getInt("idcmd"),rs.getInt("idProduct") , rs.getString("nom_pro") ,rs.getInt("quantity")}) ;
           }
           quantity.setText("");
           productcomb.setSelectedIndex(0);
        
        }catch(Exception e){
            System.err.print(e);
        }
        OrderedTable.setModel(ct);
    }

   public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }
    public void deplace(int i){
    try{
    idcmd.setText(ct.getValueAt(i, 0).toString());
    productcomb.setSelectedItem(ct.getValueAt(i, 1).toString()); 
    quantity.setText(ct.getValueAt(i, 3).toString());
   
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
    }
}
}
