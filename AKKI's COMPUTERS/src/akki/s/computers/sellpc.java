/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LAPPI_2.O
 */
package akki.s.computers;

import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sellpc extends javax.swing.JFrame {

    /**
     * Creates new form sellpc
     */
    public sellpc() {
        initComponents();
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jButton1.setVisible(false);
        
        
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 44));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photography.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(336, 336, 336))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jComboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUDGET FRIENDLY PC", "MID-RANGE PC", "HIGH END PC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton2.setText("SHOW PC!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PC ID", "PROCESSOR", "MOTHERBOARD", "MEMEORY", "GRAPHICS CARD", "STORAGE", "CABINET", "COOLER", "PSU", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ENTER PC ID to SELL");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Execute!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(67, 67, 67))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //        String type=(String)jComboBox1.getSelectedItem();
        //
        //        try
        //        {
            //             Connection con=ConnectionProvider.getcon();
            //
            //             String qry="SELECT `id`,`processor`, `motherboard`, `memory`, `graphics_card`, `storage`, `cabinet`, `cooler`, `psu`, `price` FROM `pcinfo` WHERE `type`="+type+"'";
            //
            //             Statement st=con.createStatement();
            //             ResultSet rs=st.executeQuery(qry);
            //
            //             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            //
            //
            //
            ////             PreparedStatement p= con.prepareStatement(qry);
            ////             p.setString(1,type);
            ////
            ////             ResultSet rs=p.executeUpdate();
            //        }
        //        catch(Exception e)
        //        {
            //            JOptionPane.showMessageDialog(null,"Error!!!!!");
            //            setVisible(false);
            //            new showpc().setVisible(true);
            //        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //yaha se hoga

        String type=(String)jComboBox1.getSelectedItem();

        try
        {
            jLabel2.setVisible(true);
            jTextField1.setVisible(true);
            jButton1.setVisible(true);
            
            Connection con=ConnectionProvider.getcon();

            String qry="SELECT `id`,`processor`, `motherboard`, `memory`, `graphics_card`, `storage`, `cabinet`, `cooler`, `psu`, `price` FROM `pcinfo` WHERE `type`="+"'"+type+"'";

            System.out.println(type);

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(qry);

            while(rs.next())
            {
                String id=String.valueOf(rs.getInt("id"));
                //String type=(String)jComboBox1.getSelectedItem();
                String pro=rs.getString("processor");
                String mo=rs.getString("motherboard");
                String mem=rs.getString("memory");
                String gc=rs.getString("graphics_card");
                String sto=rs.getString("storage");
                String cab=rs.getString("cabinet");
                String col=rs.getString("cooler");
                String psu=rs.getString("psu");
                String price=rs.getString("price");

                String tbdata[] = {id,pro,mo,mem,gc,sto,cab,col,psu,price};

                DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();

                tb.addRow(tbdata);
            }

            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            //             PreparedStatement p= con.prepareStatement(qry);
            //             p.setString(1,type);
            //
            //             ResultSet rs=p.executeUpdate();

        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error!!!!!");
            setVisible(false);
            new showpc().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new sellpc().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //first insert then delete
        
        String pcid=jTextField1.getText();
        
        if(pcid.isEmpty() )
        {
            JOptionPane.showMessageDialog(null,"Please Enter PC ID");
        } 
        else
        {
            try
            {
                 Connection con=ConnectionProvider.getcon();
                 String qry="SELECT * FROM `pcinfo` WHERE `id`="+"'"+pcid+"'";
                 
                 Statement st=con.createStatement();
                 ResultSet rs=st.executeQuery(qry);
                 
                 //inserting
                 String id;
                String type;
                String pro;
                String mo;
                String mem;
                String gc;
                String sto;
                String cab;
                String col;
                String psu;
                String price;
    
                 while(rs.next())
                 {
                      id=String.valueOf(rs.getInt("id"));
                      type=rs.getString("type");
                     pro=rs.getString("processor");
                     mo=rs.getString("motherboard");
                     mem=rs.getString("memory");
                     gc=rs.getString("graphics_card");
                     sto=rs.getString("storage");
                     cab=rs.getString("cabinet");
                     col=rs.getString("cooler");
                     psu=rs.getString("psu");
                     price=rs.getString("price");
                     
                     
                     String qry1="INSERT INTO `pcsold`(`id`, `type`, `processor`, `motherboard`, `memory`, `garphics_card`, `storage`, `cabinet`, `cooler`, `psu`, `price`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p= con.prepareStatement(qry1);
                
                System.out.println("ins");
                
                p.setString(1,id);
                p.setString(2,type);
                p.setString(3,pro);
                p.setString(4,mo);
                p.setString(5,mem);
                p.setString(6,gc);
                p.setString(7,sto);
                p.setString(8,cab);
                p.setString(9,col);
                p.setString(10,psu);
                p.setString(11,price);
                
                p.executeUpdate();
                
    
                 }
                            
                
                
                         //DELETE FROM `pcinfo` WHERE id=
                String qry2="DELETE FROM `pcinfo` WHERE id=?";
                PreparedStatement p1= con.prepareStatement(qry2);
                p1.setString(1,pcid);
                p1.executeUpdate();
                
                
                JOptionPane.showMessageDialog(null,"Transaction Successfully");
         
                setVisible(false);
                new sellpc().setVisible(true);
                
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error!!!!!");
                setVisible(false);
                new sellpc().setVisible(true);
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(sellpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
