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
public class Familly extends javax.swing.JPanel {

    /**
     * Creates new form Familly
     */
    DefaultTableModel ct = new DefaultTableModel();
    Statement stt ;
    ResultSet rs,rs2;
    Connecter cnn = new Connecter();
    private int SlectedRow;
    private String name;
    private String descreption;
    public Familly() {
        initComponents();
        ct = (DefaultTableModel)(FamillyTable.getModel());
        try{
            stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery("SELECT * FROM familly");
           while(rs.next()){
                ct.addRow(new Object [] {rs.getString("nomfam"),rs.getString("desc_fam")});
           }
           nameText.setText("");
           descFam.setText("");
           refresh();
        }catch(Exception e){
            System.err.print(e);
        }
        FamillyTable.setModel(ct);
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
        FamillyTable = new javax.swing.JTable();
        nameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descFam = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        ARCHIVING = new javax.swing.JButton();
        search = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(247, 250, 250));

        FamillyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Familly Name", "Descreption "
            }
        ));
        FamillyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FamillyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FamillyTable);
        if (FamillyTable.getColumnModel().getColumnCount() > 0) {
            FamillyTable.getColumnModel().getColumn(0).setResizable(false);
            FamillyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Familly Name");

        jLabel2.setText("Descreption");

        descFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descFamActionPerformed(evt);
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

        ARCHIVING.setText("Archiving");
        ARCHIVING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARCHIVINGActionPerformed(evt);
            }
        });

        search.setText("jButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameText)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descFam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ARCHIVING))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tsearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDIT)
                    .addComponent(ADD)
                    .addComponent(ARCHIVING))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descFam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void descFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descFamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descFamActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
         try{
        if(JOptionPane.showConfirmDialog(null, "confirm modfification", "modification",JOptionPane.YES_NO_OPTION )== JOptionPane.OK_OPTION ){
       // stt.executeUpdate("UPDATE employee SET name="+tnom.getText().toString()+" ,grp="+tgrp.getText().toString()+", pre="+tpre.getText().toString()+" WHERE idemp="+tcin.getText().toString());
        stt.executeUpdate("UPDATE familly SET nomfam='" + nameText.getText() + "' , desc_fam='" + descFam.getText() + "' WHERE nomfam ='" + name + "'");
        refresh();
        }
        }
        catch(Exception e)
        {
        
        JOptionPane.showMessageDialog(null, "Error "+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_EDITActionPerformed

    private void ARCHIVINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARCHIVINGActionPerformed
        // TODO add your handling code here:
        try
        {
        if(JOptionPane.showConfirmDialog(null, "Do you really want to archive this Familly ?", "DELET", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        {
        if(nameText.getText().length() != 0){
        stt.executeUpdate("DELETE FROM familly WHERE nomfam ='" +  nameText.getText() + "'");
        refresh();
        
        }else{
            JOptionPane.showMessageDialog(null, "No ID");
        }
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "You can not archive this product , Many Products are using This Familly . ");
        }
    }//GEN-LAST:event_ARCHIVINGActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        try{
        String namepro= nameText.getText();
        String familypro = descFam.getText();
        
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        stt.executeUpdate("INSERT INTO familly(nomfam, desc_fam)"
                + " VALUES ('"+namepro+"','"+familypro+"')");
        JOptionPane.showMessageDialog(null, "The Familly of Product has been added Correctlly");
       //String [] row = new String[] {cin,name,surname,grp};
       // ct.addRow(row);
        refresh();
        }
        catch(Exception  e){
        JOptionPane.showMessageDialog(null, "error "+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void FamillyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FamillyTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = FamillyTable.getSelectedRow();
        deplace(SlectedRow);
        name = nameText.getText();
       
    }//GEN-LAST:event_FamillyTableMouseClicked

    public void refresh(){
        vider();
       ct = (DefaultTableModel)(FamillyTable.getModel());
        try{
            stt = cnn.obtenirconnexion().createStatement();
            rs = stt.executeQuery("SELECT * FROM familly");
           while(rs.next()){
                ct.addRow(new Object [] {rs.getString("nomfam"),rs.getString("desc_fam")});
           }
           nameText.setText("");
           descFam.setText("");
        }catch(Exception e){
            System.err.print(e);
        }
        FamillyTable.setModel(ct);
    } // to refresh the table after updating it 
    public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }
    
    public void deplace(int i){
    try{
    nameText.setText(ct.getValueAt(i, 0).toString());
    descFam.setText(ct.getValueAt(i, 1).toString());
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERROR : "+e.getLocalizedMessage());
             }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ARCHIVING;
    private javax.swing.JButton EDIT;
    private javax.swing.JTable FamillyTable;
    private javax.swing.JTextField descFam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton search;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables
}