/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.awt.CardLayout;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SELLING extends javax.swing.JPanel {

    /**
     * Creates new form dellivery
     */
    private int SlectedRow;
    Statement stt ;
    ResultSet rs,rs1,rs2,rs3;
    Connecter cnn = new Connecter();
   DefaultTableModel ct = new DefaultTableModel();
   SellingDetails delivery = new SellingDetails(-1);
   CardLayout crd;
   int idc ;
   Date dat ; 
    public SELLING() { 
        initComponents();
        crd = (CardLayout)(this.getLayout());
        ct = (DefaultTableModel)(DeliveryTable.getModel());
        try{
            stt = cnn.obtenirconnexion().createStatement() ; 
            rs = stt.executeQuery(" SELECT * from sellingg,Client where sellingg.noClient = Client.noClient\n" +
"                     ORDER BY ID_Selling" );
                    
           while(rs.next()){
               
                ct.addRow(new Object [] {rs.getInt("ID_Selling"),rs.getInt("noClient") , rs.getString("name_cli") ,rs.getDate("date"),rs.getString("city_cli")}) ;
           }
           rs1 = stt.executeQuery("SELECT * FROM Client") ;
           while(rs1.next()){
               String noProvider = rs1.getString("noClient") ; 
              Clientcomb.addItem(noProvider) ; 
              
           }
           rs3 = stt.executeQuery("SELECT * FROM product");
           while(rs3.next()){
               String noproduct = rs3.getString("idProduct");
              productcomb.addItem(noproduct);
           }
                  /*     String query4 = "SELECT SUM( product.price_pro*sellingdetails.quantity ) AS total\n" +
"                              FROM sellingdetails,product\n" +
"                              WHERE sellingdetails.idProduct = product.idProduct \n" +
"                              AND`id_selling` = "+idDelivery+" " ;
           rs2=stt.executeQuery(query4);
           while(rs2.next()){
                 Total.setText(""+rs2.getInt("total")+"  DA");
             }*/
                  
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
        DeliveryTable.setModel(ct);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryTable = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Clientcomb = new javax.swing.JComboBox<>();
        Adresse = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        ADDP = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        idliv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productcomb = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(247, 250, 250));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(247, 250, 250));

        jPanel2.setBackground(new java.awt.Color(0, 143, 187));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SHOW PRODUCT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DeliveryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Livraison", "id Client", "Name Client", "Date", "Adresse "
            }
        ));
        DeliveryTable.getTableHeader().setReorderingAllowed(false);
        DeliveryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DeliveryTable);

        jButton1.setText("Search");

        date.setEnabled(false);

        jLabel1.setText("ID Delivery");

        jLabel3.setText("ID Client");

        jLabel4.setText(" Delivery Adresse ");

        jLabel5.setText("ID Product");

        jLabel6.setText("Quantity");

        ADDP.setText("ADD PRODUCT");
        ADDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDPActionPerformed(evt);
            }
        });

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

        idliv.setEnabled(false);

        jLabel7.setText("Date");

        productcomb.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ADDP)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(date)
                            .addComponent(Adresse)
                            .addComponent(idliv)
                            .addComponent(Clientcomb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity)
                            .addComponent(productcomb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(search)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ADD)
                                .addComponent(EDIT)))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clientcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idliv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ADDP)))
                .addGap(35, 35, 35))
        );

        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        quantity.setVisible(false);
        ADDP.setVisible(false);

        add(jPanel1, "card2");
        add(delivery, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        delivery = new SellingDetails(this.getid());
        add(delivery, "card3");
        crd.show(this, "card3");
    }//GEN-LAST:event_jPanel2MouseClicked

    private void DeliveryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = DeliveryTable.getSelectedRow();
        deplace(SlectedRow);
        date.setEnabled(true);
        idc = Integer.parseInt(Clientcomb.getSelectedItem().toString());
         dat = Date.valueOf(date.getText());
         Enabled();
    }//GEN-LAST:event_DeliveryTableMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try{
            
            int client = Integer.parseInt(Clientcomb.getSelectedItem().toString());
       java.util.Date tdate = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(tdate.getTime());
        
        
        String query = "INSERT INTO `sellingg`( `noClient` , `date`) VALUES ("+client+"  , ' "+sqlDate+" ' )";
        stt.executeUpdate(query);
        
        JOptionPane.showMessageDialog(null, "The Delivery has been added Correctlly");
       Enabled();
        refresh();
        }
        catch(Exception  e){
        JOptionPane.showMessageDialog(null, "error "+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
 try{
        if(JOptionPane.showConfirmDialog(null, "ARE YOU SURE", "EDIT",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
       // stt.executeUpdate("UPDATE employee SET name="+tnom.getText().toString()+" ,grp="+tgrp.getText().toString()+", pre="+tpre.getText().toString()+" WHERE idemp="+tcin.getText().toString());
       String query = "UPDATE `sellingg` SET `noClient`=" +Clientcomb.getSelectedItem().toString()+" ,`date` = '"+Date.valueOf(date.getText())+" '  WHERE ID_Selling = "+Integer.valueOf(idliv.getText())+"" ;
    
       stt.executeUpdate(query) ;
      //String query1 = "UPDATE `selling` SET `noClient`=" +Clientcomb.getSelectedItem().toString()+" ,`date` = '"+Date.valueOf(date.getText())+" ' WHERE noClient = "+idc+" AND date = ' "+dat+" ' " ; 
         JOptionPane.showMessageDialog(null, "EDIT THIS PRODUCT ON THE TABLE SELLING") ;
      refresh();
        }
        }
        catch(Exception e)
        {
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_EDITActionPerformed

    private void ADDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDPActionPerformed
      try{
        int client = Integer.valueOf(Clientcomb.getSelectedItem().toString());
           java.util.Date tdate = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(tdate.getTime());
            int id = Integer.valueOf(idliv.getText()) ;
            String product = productcomb.getSelectedItem().toString() ;
            int quantitysold = Integer.parseInt(quantity.getText());
            int qte = 0;
            
            
            rs =stt.executeQuery("SELECT * FROM product WHERE idProduct= '" + product + "'");
        while(rs.next()){
            qte = Integer.parseInt(rs.getString("quantity"));
        }
        int sum ;
        sum = qte - quantitysold;
        /*test for amount of the product*/
        if( sum >= 0  ){
        stt.executeUpdate("INSERT INTO selling(idProduct, noClient, selling_date,quantity_sold)"
                + " VALUES ('"+product+"','"+client+"','"+sqlDate+"','"+quantitysold+"')");
        /* mind the quantity that we have sold from the quantity that we have in the stock */
        
        stt.executeUpdate("UPDATE product SET  quantity='" + sum
                 + "' WHERE idProduct ='" + product + "'");
        /*----------------------------------------------------------------------------------*/
        stt.executeUpdate("INSERT INTO `sellingdetails`(`ID_Selling`,`idProduct`, `quantity`) VALUES ("+id+" , "+product+","+quantitysold+")" );
            
            
        JOptionPane.showMessageDialog(null, "You have sold Correctlly");
        JOptionPane.showMessageDialog(null, "The product has been added in this sellingg ");
        }else{
        JOptionPane.showMessageDialog(null, "You Can not Sold more than what you have ");
        }

            refresh();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_ADDPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ADDP;
    private javax.swing.JTextField Adresse;
    private javax.swing.JComboBox<String> Clientcomb;
    private javax.swing.JTable DeliveryTable;
    private javax.swing.JButton EDIT;
    private javax.swing.JTextField date;
    private javax.swing.JTextField idliv;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JComboBox<String> productcomb;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
 private void refresh() {
         vider();
        try{
          stt = cnn.obtenirconnexion().createStatement();
           rs = stt.executeQuery(" SELECT * from sellingg,Client where sellingg.noClient = Client.noClient\n" +
"                     ORDER BY ID_Selling" );
                    
           while(rs.next()){
               
                ct.addRow(new Object [] {rs.getInt("ID_Selling"),rs.getInt("noClient") , rs.getString("name_cli") ,rs.getDate("date"),rs.getString("city_cli")}) ;
           }
           date.setText("");
           Clientcomb.setSelectedIndex(0);
        
        }catch(Exception e){
            System.err.print(e);
        }
        DeliveryTable.setModel(ct);
    }

   public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }
    public void deplace(int i){
    try{
    idliv.setText(ct.getValueAt(i, 0).toString());
    Clientcomb.setSelectedItem(ct.getValueAt(i, 1).toString()); 
    date.setText(ct.getValueAt(i, 3).toString());
    Adresse.setText(ct.getValueAt(i, 4).toString()) ;
    
   
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
    }
}
    public int getid(){ 
        int id =Integer.valueOf(idliv.getText()) ;
      return id ;
    
}
     public void Enabled(){
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        productcomb.setVisible(true);
        quantity.setVisible(true);
        ADDP.setVisible(true);
    }
}


