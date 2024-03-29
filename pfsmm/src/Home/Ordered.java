/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.awt.CardLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */

public class Ordered extends javax.swing.JPanel {

   // private Details_ord details = new Details_ord(2);
    
    Statement stt ;
    ResultSet rs,rs2,rs3;
    Connecter cnn = new Connecter();
    private int SlectedRow;
    private int generatedKey ;
    
    DefaultTableModel ct = new DefaultTableModel();
    /**
     * Creates new form Ordered
     */
    CardLayout crd;
    public Ordered() {
        initComponents();
     // crd = (CardLayout)(this.getLayout());
          ct = (DefaultTableModel)(OrderedTable.getModel());
          
        try{
            stt = cnn.obtenirconnexion().createStatement() ; 
          
           rs = stt.executeQuery("SELECT ordered.idcmd , provider.idProvider , provider.name_prov , provider.sur_prov ,ordered.date_ord\n" +
                                 "FROM ordered\n" +
                                 "INNER JOIN provider ON ordered.idProvider = provider.idProvider`") ;  
           
           while(rs.next()){
               //probleme a la date 
                ct.addRow(new Object [] {rs.getInt("idcmd"),rs.getInt("idProvider") , rs.getString("name_prov") ,rs.getString("sur_prov"),rs.getDate("date_ord")}) ;
           }
            
           rs2 = stt.executeQuery("SELECT * FROM provider") ;
           while(rs2.next()){
               String noProvider = rs2.getString("idProvider") ; 
              providercomb.addItem(noProvider) ; 
              
           }
           rs3 = stt.executeQuery("SELECT * FROM product");
           while(rs3.next()){
               String noproduct = rs3.getString("idProduct");
              productcomb.addItem(noproduct);
           }
          
          
        }catch(Exception e){
            System.err.print(e);
        }
        OrderedTable.setModel(ct);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idcmd = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        providercomb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderedTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Searching = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();
        AddProduct = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DATE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productcomb = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(247, 250, 250));

        jPanel1.setBackground(new java.awt.Color(247, 250, 250));

        jLabel1.setText("ID Ordered");

        idcmd.setEnabled(false);

        jLabel3.setText("Provider");

        providercomb.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel4.setText("Quantity");

        OrderedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCommande", "idProvider", "surname provider", "name provider", "date"
            }
        ));
        OrderedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderedTable);
        OrderedTable.getAccessibleContext().setAccessibleDescription("");

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

        Searching.setText("Search");
        Searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingActionPerformed(evt);
            }
        });

        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });

        AddProduct.setText("ADD PRODUCT");
        AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductActionPerformed(evt);
            }
        });

        jButton2.setText("END");

        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });

        jLabel6.setText("Date(yyyy-MM-dd)");

        jLabel2.setText("Date(yyyy-MM-dd)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idcmd)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AddProduct))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2))
                    .addComponent(productcomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(providercomb, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DATE)
                        .addGap(18, 18, 18)
                        .addComponent(Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(334, 334, 334)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(335, 335, 335)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tsearch)
                        .addComponent(providercomb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(EDIT)
                    .addComponent(Delete))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(jLabel6)
                    .addContainerGap(262, Short.MAX_VALUE)))
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

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        try{
            
         int provider = Integer.parseInt(providercomb.getSelectedItem().toString()) ;
        java.util.Date tdate = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(tdate.getTime());
        
         String query ="INSERT INTO `ordered`( `idProvider`, `date_ord`) VALUES ("+provider+","+sqlDate+")";
        stt.executeUpdate(query);
        ResultSet rs = stt.getGeneratedKeys();
         int generatedKey = 0;
        if (rs.next()) {
            generatedKey = rs.getInt(1);
        }
           JOptionPane.showMessageDialog(null, "commaande bien ajoutee" );
        }
        catch(Exception  e){
            JOptionPane.showMessageDialog(null, "error "+e.getLocalizedMessage());
        } 
        idcmd.setText(""+generatedKey) ;
    }//GEN-LAST:event_ADDActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
        
       /* ca cest la modification de le fournisseur ou la datte 
        try{
            if(JOptionPane.showConfirmDialog(null, "ARE YOU SURE", "EDIT",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
       // stt.executeUpdate("UPDATE employee SET name="+tnom.getText().toString()+" ,grp="+tgrp.getText().toString()+", pre="+tpre.getText().toString()+" WHERE idemp="+tcin.getText().toString());
        stt.executeUpdate("UPDATE ordered SET idProvider='" + providercomb.getSelectedItem().toString() + "' ,date_ord ='" +  Date.valueOf(DATE.getText())  + " ");
        //refresh();
        }
        }catch(Exception e){
            
        }*/
       // crd.show(this, "card6");
      // crd.show(this, "card5");
      
        System.out.println("BUTTON BIEN FONCTIONNE") ;
    }//GEN-LAST:event_EDITActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
           try
        {
        if(JOptionPane.showConfirmDialog(null, "Do you really want to delete that Ordered ?", "DELET", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        {
        if(idcmd.getText().length() != 0){
        stt.executeUpdate("DELETE FROM details WHERE idcmd ='" + Integer.valueOf(idcmd.getText()) + "'");
        stt.executeUpdate("DELETE FROM ordered WHERE idcmd ='" + Integer.valueOf(idcmd.getText()) + "'");
       // refresh();
        
        }else{
            JOptionPane.showMessageDialog(null, "No ID");
        }
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingActionPerformed
        // TODO add your handling code here:
      /*  try{
            vider();
            rs =  stt.executeQuery("SELECT * FROM product WHERE idProduct = '" + tsearch.getText() + "' OR nom_pro = '"+ tsearch.getText() + "'");
            while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idProduct"),rs.getString("nom_pro"),rs.getString("nomfam"),rs.getInt("quantity")
                    ,rs.getDouble("price_pro")});
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }*/
       
    }//GEN-LAST:event_SearchingActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
        /*try{
            if(tsearch.getText().equals("")){
                refresh();
            }else{
                vider();
                rs =  stt.executeQuery("SELECT * FROM product WHERE idProduct = '" + tsearch.getText() + "' OR nom_pro = '"+ tsearch.getText() + "'");
                while(rs.next()){
                    ct.addRow(new Object [] {rs.getInt("idProduct"),rs.getString("nom_pro"),rs.getString("nomfam"),rs.getInt("quantity")
                        ,rs.getDouble("price_pro")});
            }
        }
        }catch(Exception e){

        }
        if(tsearch.getText().equals("")){
            refresh();
        }*/
    }//GEN-LAST:event_tsearchActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DATEActionPerformed

    private void OrderedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderedTableMouseClicked
        // TODO add your handling code here:
     SlectedRow = OrderedTable.getSelectedRow();
     deplace(SlectedRow);
    }//GEN-LAST:event_OrderedTableMouseClicked

    private void AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductActionPerformed
       try{
           int idc = Integer.valueOf(idcmd.getText())  ;
           int provider = Integer.parseInt(providercomb.getSelectedItem().toString()) ;  
           int qte = Integer.parseInt(quantity.getText());
           stt.executeQuery("INSERT INTO `details`(`idcmd`,`idProduct`, `quantity`) VALUES ("+idc+" , "+provider+","+qte+")" );
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
       }
    }//GEN-LAST:event_AddProductActionPerformed
public void deplace(int i){
    try{
    idcmd.setText(ct.getValueAt(i, 0).toString());
    providercomb.setSelectedItem(ct.getValueAt(i, 1).toString());        
    DATE.setText(ct.getValueAt(i, 2).toString());
   
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton AddProduct;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton Delete;
    private javax.swing.JButton EDIT;
    private javax.swing.JTable OrderedTable;
    private javax.swing.JButton Searching;
    private javax.swing.JTextField idcmd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productcomb;
    private javax.swing.JComboBox<String> providercomb;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables

    
}
