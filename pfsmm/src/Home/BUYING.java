/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BUYING extends javax.swing.JPanel {

    /**
     * Creates new form BUYING
     */
    DefaultTableModel ct = new DefaultTableModel();
    Statement stt;
    ResultSet rs,rs2,rs3;
    Connecter cnn = new Connecter();
    private int SlectedRow;
    String ndate,idpv,idp;
    int nqte; 
    public BUYING() {
        initComponents() ; 
        ct = (DefaultTableModel)(BuyingTable.getModel());
        try{
            stt = cnn.obtenirconnexion().createStatement() ; 
            rs = stt.executeQuery("select buying.`idProvider` as idprov , provider.name_prov,buying.`idProduct` as idpro , product.nom_pro,Buying_date,quantity_bought\n" +
                                  "from buying \n" +
                                  "INNER JOIN provider on buying.`idProvider` = provider.`idProvider`\n" +
                                  "INNER JOIN product on buying.`idProduct` = product.`idProduct`;") ; 
           while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idprov"),rs.getString("name_prov"),rs.getInt("idpro"),rs.getString("nom_pro")
                        ,rs.getDate("Buying_date"),rs.getInt("quantity_bought")}) ;
           } 
           rs2 = stt.executeQuery("SELECT * FROM provider");
           while(rs2.next()){
               String noProvider = rs2.getString("idProvider") ; 
              providercomb.addItem(noProvider) ; 
           }
           rs3 = stt.executeQuery("SELECT * FROM product");
           while(rs3.next()){
               String noproduct = rs3.getString("idProduct");
              productcomb.addItem(noproduct);
           }
           refresh();
        }catch(Exception e){
            System.err.print(e);
        }
        BuyingTable.setModel(ct);
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
        providercomb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        productcomb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BuyingTable = new javax.swing.JTable();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 250, 250));

        jLabel1.setText("ID Provider");

        providercomb.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel2.setText("Reference (ID PRODUCT)");

        productcomb.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel3.setText("Date(yyyy-MM-dd)");

        jLabel4.setText("Quantity /Amount");

        BuyingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Provider", "Provider's Name", "ID Product", "Product's Name", "Buying Date", "Quantity"
            }
        ));
        BuyingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BuyingTable);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(providercomb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productcomb, 0, 189, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date)
                    .addComponent(quantity)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(providercomb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        try{
        int provider = Integer.parseInt(providercomb.getSelectedItem().toString()) ;
        int product = Integer.parseInt(productcomb.getSelectedItem().toString()) ; 
        int quantitybought =Integer.parseInt(quantity.getText());
        int qte= 0;
        java.util.Date tdate = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(tdate.getTime());
        
        rs =stt.executeQuery("SELECT * FROM product WHERE idProduct= '" + product + "'");
        while(rs.next()){
            qte = Integer.parseInt(rs.getString("quantity"));
        }
        int sum ;
        sum = qte + quantitybought;
        /* amount of the product*/
        
        stt.executeUpdate("INSERT INTO buying(idProduct, idProvider, Buying_date,quantity_bought)"
                + " VALUES ('"+product+"','"+provider+"','"+sqlDate+"','"+quantitybought+"')");
        /* mind the quantity that we have sold from the quantity that we have in the stock */
        
        stt.executeUpdate("UPDATE product SET  quantity='" + sum
                 + "' WHERE idProduct ='" + product + "'");
        /*----------------------------------------------------------------------------------*/
        JOptionPane.showMessageDialog(null, "You have sold Correctlly");
        

        refresh();
        
        }
        catch(Exception  e){
        JOptionPane.showMessageDialog(null, "error "+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void BuyingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyingTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = BuyingTable.getSelectedRow();
        date.setEnabled(true);
        deplace(SlectedRow);
        ndate = date.getText();
        idpv = providercomb.getSelectedItem().toString() ;
        idp = productcomb.getSelectedItem().toString() ;
        nqte=Integer.parseInt(quantity.getText());
        
    }//GEN-LAST:event_BuyingTableMouseClicked

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
        try{
        int product = Integer.parseInt(productcomb.getSelectedItem().toString()) ;
        int quantitybought =Integer.parseInt(quantity.getText());
        int qte=0;
        if(JOptionPane.showConfirmDialog(null, "confirm modfification", "modification",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
        rs =stt.executeQuery("SELECT * FROM product WHERE idProduct= '" + idp + "'");
        while(rs.next()){
            qte = Integer.parseInt(rs.getString("quantity"));
        }
        int sum ;
        sum = qte - nqte;
        sum = sum + quantitybought;
        if(sum >= 0){
            stt.executeUpdate("UPDATE buying SET quantity_bought='" + Integer.parseInt(quantity.getText()) +
                                            "' ,idProvider='" + providercomb.getSelectedItem().toString()                             +
                                            "' ,idProduct ='" + productcomb.getSelectedItem().toString()  +
                                            "' ,Buying_date ='" + Date.valueOf(date.getText()) +
                           /*Where Clause*/ "' WHERE idProduct='" + idp +
                                            "' AND idProvider='" + idpv + "' "
                                            + "AND  Buying_date ='" + Date.valueOf(ndate) + "'");
        
        /* mind the quantity that we have sold from the quantity that we have in the stock */
        
        stt.executeUpdate("UPDATE product SET  quantity='" + sum
                 + "' WHERE idProduct ='" + product + "'");
        /*----------------------------------------------------------------------------------*/
        JOptionPane.showMessageDialog(null, "You have bought Correctlly");
        }else{
        JOptionPane.showMessageDialog(null, "You Can not Sold more than what you have ");   
        }
        
        refresh();
        }
        }
        catch(Exception e)
        {
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_EDITActionPerformed

    public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }
    public void refresh(){
        vider();
        try{
            stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery("select buying.`idProvider` as idprov ,provider.name_prov,buying.`idProduct` as idpro ,product.nom_pro,Buying_date,quantity_bought\n" +
                                  "from buying \n" +
                                  "INNER JOIN provider on buying.`idProvider` = provider.`idProvider`\n" +
                                  "INNER JOIN product on buying.`idProduct` = product.`idProduct`;");
           while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idprov"),rs.getString("name_prov"),rs.getInt("idpro"),rs.getString("nom_pro")
                        ,rs.getDate("Buying_date"),rs.getInt("quantity_bought")});
           }
        providercomb.setSelectedIndex(0);
        productcomb.setSelectedIndex(0);
        date.setText("");
        quantity.setText("");
        }catch(Exception e){
            System.err.print(e);
        }
        BuyingTable.setModel(ct);
    }
    public void deplace(int i){
         try{
         
         providercomb.setSelectedItem(ct.getValueAt(i, 0).toString()); 
         productcomb.setSelectedItem(ct.getValueAt(i, 2).toString());
         date.setText(ct.getValueAt(i, 4).toString());
         quantity.setText(ct.getValueAt(i, 5).toString());
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "error"+e.getLocalizedMessage());
         }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTable BuyingTable;
    private javax.swing.JButton EDIT;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productcomb;
    private javax.swing.JComboBox<String> providercomb;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
