/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Delivery extends javax.swing.JPanel {

    /**
     * Creates new form dellivery
     */
    private int SlectedRow;
    Statement stt ;
    ResultSet rs,rs2,rs3;
    Connecter cnn = new Connecter();
   DefaultTableModel ct = new DefaultTableModel();
   
    public Delivery() {
        initComponents();
         ct = (DefaultTableModel)(CmdTable.getModel());
         try{
             stt = cnn.obtenirconnexion().createStatement() ; 
           rs = stt.executeQuery("SELECT * FROM `ordered`") ;  
            while(rs.next()){
               //probleme a la date 
                ct.addRow(new Object [] {rs.getInt("idcmd"),rs.getInt("idProvider") ,rs.getInt("date_ord")});
           }
            rs2 = stt.executeQuery("SELECT * FROM provider") ;
           while(rs2.next()){
               String noProvider = rs2.getString("idProvider") ; 
              Providercomb.addItem(noProvider) ; 
              
           }
           rs3 = stt.executeQuery("SELECT * FROM product");
           while(rs3.next()){
               String noproduct = rs3.getString("idProduct");
              Providercomb.addItem(noproduct);
           }
             
           
         }catch(Exception e ){
              JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
         }
         CmdTable.setModel(ct);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        CmdTable = new javax.swing.JTable();
        show = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();
        Providercomb = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(247, 250, 250));

        jPanel1.setBackground(new java.awt.Color(247, 250, 250));

        CmdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id commande", "id provider", "date"
            }
        ));
        CmdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CmdTable);

        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
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

        Providercomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvidercombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Providercomb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SEARCH)
                .addGap(18, 18, 18)
                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsearch)
                    .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Providercomb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CmdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdTableMouseClicked
        // TODO add your handling code here:
        SlectedRow = CmdTable.getSelectedRow();
       
    }//GEN-LAST:event_CmdTableMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_showActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
       try{
            vider();
            rs =  stt.executeQuery("SELECT * FROM Ordered WHERE idcmd = '" + tsearch.getText() + "' OR idProvider = '"+ Providercomb.getSelectedItem().toString()+ "'");
            while(rs.next()){
                ct.addRow(new Object [] {rs.getInt("idcmd"),rs.getInt("idProvider"),rs.getInt("date_ord")});
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erroo"+e.getLocalizedMessage());
        }

    }//GEN-LAST:event_SEARCHActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
       
    }//GEN-LAST:event_tsearchActionPerformed

    private void ProvidercombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvidercombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvidercombActionPerformed
 public void vider(){
            int n = ct.getRowCount();
        for(int i=0;i<n;i++){
            ct.removeRow(0);
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CmdTable;
    private javax.swing.JComboBox<String> Providercomb;
    private javax.swing.JButton SEARCH;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables
}

