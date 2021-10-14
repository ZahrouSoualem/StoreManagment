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
public class Provider extends javax.swing.JPanel {

    /**
     * Creates new form Provider
     */
     DefaultTableModel ct = new DefaultTableModel();
    Statement stt ;
    ResultSet rs;
    Connecter cnn = new Connecter();
    private int SlectedRow;
    public Provider() {
        initComponents();
        ct = (DefaultTableModel)(ProviderTable.getModel());
        try{
            stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery("SELECT * FROM provider") ;
           while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idProvider"),rs.getString("name_prov"),rs.getString("sur_prov"),rs.getString("city_prov")
                                                     ,rs.getString("loc_prov"),rs.getInt("pho_cli"),rs.getInt("postal_code")});
                
           }
        this.idprovider.setText("");
        this.Name.setText("");
        this.Surname.setText("");
        cities.setSelectedIndex(0);
        this.location.setText("");
        this.phone.setText("");
        this.postal.setText("");
        tsearch.setText("");  
        }catch(Exception e){
            System.err.print(e);
        }
        ProviderTable.setModel(ct);
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
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Surname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        postal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProviderTable = new javax.swing.JTable();
        cities = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        idprovider = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(247, 250, 250));

        jLabel1.setText("Name");

        jLabel2.setText("Surname");

        jLabel3.setText("City");

        jLabel4.setText("Location");

        jLabel5.setText("Postal code");

        jLabel6.setText("Phone");

        ProviderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProvider", "name", "surname", "city", "location", "phone", "Postale code"
            }
        ));
        ProviderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProviderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProviderTable);

        cities.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adrar","Chlef","Laghouat","Oum El Bouaghi","Batna","Béjaïa","Biskra","Béchar","Blida","Bouira","Tamanrasset","Tébessa","Tlemcen","Tiaret","Tizi Ouzou","Alger","Djelfa","Jijel","Sétif","Saïda","Skikda","Sidi Bel Abbès","Annaba","Guelma","Constantine","Médéa","Mostaganem","M'Sila","Mascara","Ouargla","Oran","El Bayadh","Illizi","Bordj Bou Arreridj","Boumerdès","El Tarf","Tindouf","Tissemsilt","El Oued","Khenchela","Souk Ahras","Tipaza","Mila","Aïn Defla","Naâma","Aïn Témouchent","Ghardaïa","Relizane" }));

        jLabel7.setText("Provider");

        idprovider.setEnabled(false);

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

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Name)
                                    .addComponent(Surname, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idprovider, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(cities, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(postal, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ADD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EDIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DELETE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SEARCH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idprovider, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cities, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(EDIT)
                    .addComponent(DELETE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        String name= Name.getText();
        String surname = Surname.getText();
        String city = cities.getSelectedItem().toString();
        String location = this.location.getText();
        int phone = Integer.parseInt(this.phone.getText());
        int postal = Integer.parseInt(this.postal.getText());
        try{
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        stt.executeUpdate("INSERT INTO provider(name_prov, sur_prov, city_prov,loc_prov,postal_code,pho_cli)"
                + " VALUES ('"+name+"','"+surname+"','"+city+"','"+location+"','"+postal+"','"+phone+"')");
        JOptionPane.showMessageDialog(null, "The Provider has been added Correctlly");
        
        refresh();
       
        }
        catch(Exception  e){
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
              try{
        if(JOptionPane.showConfirmDialog(null, "ARE YOU SURE", "EDIT",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
       // stt.executeUpdate("UPDATE employee SET name="+tnom.getText().toString()+" ,grp="+tgrp.getText().toString()+", pre="+tpre.getText().toString()+" WHERE idemp="+tcin.getText().toString());
        stt.executeUpdate("UPDATE provider SET name_prov='" + Name.getText() + "' ,sur_prov='" + Surname.getText() + "', city_prov='"
                + cities.getSelectedItem().toString() + "' ,loc_prov='" + location.getText() + "' ,postal_code='" + postal.getText() + "' ,pho_cli='" + phone.getText() + "' WHERE idProvider='" + Integer.parseInt(idprovider.getText()) + "'");
        refresh();
        }
        }
        catch(Exception e)
        {
        System.err.print(e);
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_EDITActionPerformed

    private void ProviderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProviderTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = ProviderTable.getSelectedRow();
        deplace(SlectedRow);
    }//GEN-LAST:event_ProviderTableMouseClicked

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
             try
        {
        if(JOptionPane.showConfirmDialog(null, "Do you really want to delete that Provider ?", "DELET", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        {
        if(idprovider.getText().length() != 0){
        stt.executeUpdate("DELETE FROM Provider WHERE idProvider ='" + idprovider.getText() + "'");
        refresh();
        
        }else{
            JOptionPane.showMessageDialog(null, "No ID");
        }
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
          try{
            vider();
           rs =  stt.executeQuery("SELECT * FROM provider WHERE idProvider = '" + tsearch.getText() + "' OR name_prov = '"+ tsearch.getText() + "'");
           while(rs.next()){
              ct.addRow(new Object [] {rs.getInt("idProvider"),rs.getString("name_prov"),rs.getString("sur_prov"),rs.getString("city_prov")
                                                     ,rs.getString("loc_prov"),rs.getInt("pho_cli"),rs.getInt("postal_code")});
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_SEARCHActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchActionPerformed

    public void refresh(){
        vider();
       try{
            stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery("SELECT * FROM provider");
           while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idProvider"),rs.getString("name_prov"),rs.getString("sur_prov"),rs.getString("city_prov")
                                                     ,rs.getString("loc_prov"),rs.getInt("pho_cli"),rs.getInt("postal_code")});
                
           }
        this.idprovider.setText("");
        this.Name.setText("");
        this.Surname.setText("");
        cities.setSelectedIndex(0);
        this.location.setText("");
        this.phone.setText("");
        this.postal.setText("");
        tsearch.setText("");   
        }catch(Exception e){
            System.err.print(e);
        }
        ProviderTable.setModel(ct);
    } // to refresh the table after updating it 
    public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }  // to void the table
    public void deplace(int i){
    try{
    idprovider.setText(ct.getValueAt(i, 0).toString());
    Name.setText(ct.getValueAt(i, 1).toString());
    Surname.setText(ct.getValueAt(i, 2).toString());
    cities.setSelectedItem(ct.getValueAt(i, 3).toString());        
    location.setText(ct.getValueAt(i, 4).toString());
    phone.setText(ct.getValueAt(i, 5).toString());
    postal.setText(ct.getValueAt(i, 6).toString());
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
    }
} // to set every cell into its textField that allow us to edit provider's information so easilly
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JTextField Name;
    private javax.swing.JTable ProviderTable;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField Surname;
    private javax.swing.JComboBox<String> cities;
    private javax.swing.JTextField idprovider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField postal;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables
}