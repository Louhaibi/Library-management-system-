/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Models.Users;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Acueill extends javax.swing.JFrame {
    private Users user;

    
    
    
    /**
     * Creates new form Acueill
     */
    public Acueill() {
        initComponents();
this.setExtendedState(getExtendedState() | this.MAXIMIZED_BOTH);
    }
    
    public Acueill(Users user) {
        initComponents();
        this.user = user;
       this.setExtendedState(getExtendedState() | this.MAXIMIZED_BOTH);
        if (user.getType().equals("client")) {
            BC.setVisible(false);
            BE.setVisible(false);
            BP.setVisible(false);
            BR.setVisible(false);
            BS.setVisible(false);
            BDMouseClicked(null);
        }
        else if(user.getType().equals("assistant")){
            BE.setVisible(false);
            BS.setVisible(false);
            BCMouseClicked(null);

        
        }
        else if(user.getType().equals("bibliothécaire")){
            BC.setVisible(false);
            BP.setVisible(false);
            BR.setVisible(false);
            BS.setVisible(false);
            BDMouseClicked(null);
        
        }
        else  {
        BDMouseClicked(null);

         }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BC = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        BD = new javax.swing.JButton();
        BS = new javax.swing.JButton();
        BE = new javax.swing.JButton();
        BR = new javax.swing.JButton();
        desk = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setMaximumSize(new java.awt.Dimension(1070, 640));
        panel.setMinimumSize(new java.awt.Dimension(1070, 640));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navigation"));
        jPanel1.setPreferredSize(new java.awt.Dimension(179, 640));

        BC.setText("Gestion Clients");
        BC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCMouseClicked(evt);
            }
        });
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        BP.setText("Gestion Penalites");
        BP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BPMouseClicked(evt);
            }
        });
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });

        BD.setText("Gestion Documents");
        BD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BDMouseClicked(evt);
            }
        });
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });

        BS.setText("Statistique");
        BS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSMouseClicked(evt);
            }
        });
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });

        BE.setText("Gestion Exemplaires");
        BE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEMouseClicked(evt);
            }
        });
        BE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEActionPerformed(evt);
            }
        });

        BR.setText("Gestion Reservations");
        BR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BRMouseClicked(evt);
            }
        });
        BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
            .addComponent(BS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BE, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(BR, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BD, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        desk.setPreferredSize(new java.awt.Dimension(884, 0));

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desk, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desk, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCActionPerformed

    private void BCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCMouseClicked
        // TODO add your handling code here:
        this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
        ClientInterface ci = new ClientInterface(this , user);
        desk.add(ci);
        try {
            ci.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        ci.show();
        ci.viewUserssInTheTable();
        
        
        
    }//GEN-LAST:event_BCMouseClicked

    private void BPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPMouseClicked
        // TODO add your handling code here:
         this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
        PenaliteView pv = new PenaliteView();
        desk.add(pv);
        try {
            pv.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        pv.show();
        
    }//GEN-LAST:event_BPMouseClicked

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPActionPerformed

    private void BDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BDMouseClicked
        // TODO add your handling code here:
           // TODO add your handling code here:
         this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
        livreView lv = new livreView(user);
        desk.add(lv);
        try {
            lv.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        lv.show();
    }//GEN-LAST:event_BDMouseClicked

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDActionPerformed

    private void BSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSMouseClicked
        // TODO add your handling code here:
       // TODO add your handling code here:
           // TODO add your handling code here:
         this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
        StatistiqueView lv = new StatistiqueView();
        desk.add(lv);
        try {
            lv.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        lv.show();
       
       
    }//GEN-LAST:event_BSMouseClicked

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSActionPerformed

    private void BEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEMouseClicked
        // TODO add your handling code here:
          this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
        ExemplaireView ev = new ExemplaireView();
        desk.add(ev);
        try {
            ev.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        ev.show();
    }//GEN-LAST:event_BEMouseClicked

    private void BEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BEActionPerformed

    private void BRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BRMouseClicked
         this.desk.removeAll();
        this.desk.repaint();
        //UsersGUI ug = new UsersGUI(this);
        //NewJInternalFrame ug = new NewJInternalFrame();
       
        try {
             GestionReservation grv;
             grv = new GestionReservation();
             desk.add(grv);
             grv.setMaximum(true);
             grv.show();
        } catch (SQLException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (PropertyVetoException ex) {
            Logger.getLogger(Acueill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BRMouseClicked

    private void BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRActionPerformed

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
            java.util.logging.Logger.getLogger(Acueill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acueill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acueill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acueill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acueill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BC;
    private javax.swing.JButton BD;
    private javax.swing.JButton BE;
    private javax.swing.JButton BP;
    private javax.swing.JButton BR;
    private javax.swing.JButton BS;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
