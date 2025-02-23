/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;
import Controllers.StatistiqueController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PC
 */
public class StatistiqueView extends javax.swing.JInternalFrame {
    StatistiqueController sc= new StatistiqueController();
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    /**
     * Creates new form StatistiqueView
     */
    public StatistiqueView() {
        initComponents();
        viewTable1();
        viewTable2();
        viewTable3();
        viewTable4();
        
        try {
            viewAutres();
        } catch (SQLException ex) {
            Logger.getLogger(StatistiqueView.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nbrl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ne = new javax.swing.JLabel();
        ndcnn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ndc1 = new javax.swing.JLabel();
        ndc2 = new javax.swing.JLabel();
        ndc3 = new javax.swing.JLabel();
        ndc4 = new javax.swing.JLabel();
        nc = new javax.swing.JLabel();
        nl = new javax.swing.JLabel();
        nj = new javax.swing.JLabel();
        np = new javax.swing.JLabel();
        ncv = new javax.swing.JLabel();
        ndc = new javax.swing.JLabel();
        npr = new javax.swing.JLabel();
        npnr = new javax.swing.JLabel();
        vpnr = new javax.swing.JLabel();
        vpr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 640));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Les Documents les plus loues"));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Type", "le Document", "nombre de Reservation "
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Les Documents les plus loues"));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Type", "le Document", "nombre de reservation"
            }
        ));
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Les Documents les plus loues selon le type"));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 300));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Type", "le Document", "nombre de Reservation "
            }
        ));
        jScrollPane3.setViewportView(table3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Les Documents les plus loues selon le type"));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 300));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Type", "le Document", "nombre de reservation"
            }
        ));
        jScrollPane4.setViewportView(table4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Autres statistiques\n"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("nombres de  locations");

        nbrl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nbrl.setText("---");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("nombres de emprunts");

        ne.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ne.setText("---");

        ndcnn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndcnn.setText("Valeurs de les Penalites non regleés     ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("nombres de clients      ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("nombres de livres      ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("nombres de journal      ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("nombres de Cassette video");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("nombres de Periodique      ");

        ndc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndc1.setText("nombres de Disques Compacts");

        ndc2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndc2.setText("nombres de Penalites regleés");

        ndc3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndc3.setText("nombres de Penalites non regleés");

        ndc4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndc4.setText("Valeur de les Penalites regleés ");

        nc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nc.setText("---");

        nl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nl.setText("---");

        nj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nj.setText("---");

        np.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        np.setText("---");

        ncv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ncv.setText("---");

        ndc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ndc.setText("---");

        npr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        npr.setText("---");

        npnr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        npnr.setText("---");

        vpnr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vpnr.setText("---");

        vpr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vpr.setText("---");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(ndc1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ncv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(np, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ndc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nj, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ne, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbrl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ndc3)
                        .addGap(18, 18, 18)
                        .addComponent(npnr))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(vpnr))
                    .addComponent(ndcnn, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ndc2)
                            .addComponent(ndc4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vpr)
                            .addComponent(npr))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ne, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nc))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nl))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nj))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ncv))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(np)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ndc1)
                    .addComponent(ndc))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ndc2)
                    .addComponent(npr))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ndc4)
                    .addComponent(vpr))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ndc3)
                    .addComponent(npnr))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ndcnn)
                    .addComponent(vpnr))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void viewTable1()
    {
       
       
        ArrayList<String> list = null;
        try {
             list = sc.getSdao().listEnpruntTop5();
             System.out.println("Views.StatistiqueView.viewTable1()");
             System.out.println(list);
        } catch (SQLException ex) {
            Logger.getLogger(StatistiqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
        model1 = (DefaultTableModel) table1.getModel();
        model1.setRowCount(0);
 
        Object[] row = new Object[3];
        int size =  list==null ? 0 : list.size();
        System.out.println(list.size());
        System.out.println("size = " + size  );
        for(int i = 0; i<size; i=i+3)
        { 
            System.out.println("Views.StatistiqueView.viewTable1() for  i =  "+i);
            row[0] = list.get(i);
            row[1] = list.get(i+1);
            row[2] =list.get(i+2);
           
            model1.addRow(row);
           
        }
 
    }
    
     public void viewTable2()
    {
       
       
        ArrayList<String> list = null;
        try {
             list = sc.getSdao().listLocationtTop5();
             System.out.println("Views.StatistiqueView.viewTable2()");
             
             System.out.println(list);
        } catch (SQLException ex) {
            Logger.getLogger(StatistiqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
        model2 = (DefaultTableModel) table2.getModel();
        model2.setRowCount(0);
 
        Object[] row = new Object[3];
 
        int size =  list==null ? 0 : list.size();
        for(int i = 0; i<size; i=i+3)
        {
            row[0] = list.get(i);
            row[1] = list.get(i+1);
            row[2] =list.get(i+2);
           
            model2.addRow(row);
           
        }
 
    }
     
      public void viewTable4()
    {
       
       
        ArrayList<String> list = null;
        try {
             list = sc.getSdao().listEmpruntbytype();
        } catch (SQLException ex) {
            Logger.getLogger(StatistiqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
        model4 = (DefaultTableModel) table4.getModel();
        model4.setRowCount(0);
 
        Object[] row = new Object[3];
 
        int size =  list==null ? 0 : list.size();
        for(int i = 0; i<size; i=i+3)
        {
            row[0] = list.get(i);
            row[1] = list.get(i+1);
            row[2] =list.get(i+2);
           
            model4.addRow(row);
           
        }
 
    }
      
      public void viewTable3()
    {
       
       
        ArrayList<String> list = null;
        try {
             list = sc.getSdao().listLocationbytype();
        } catch (SQLException ex) {
            Logger.getLogger(StatistiqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
        model3 = (DefaultTableModel) table3.getModel();
        model3.setRowCount(0);
 
        Object[] row = new Object[3];
 
        int size =  list==null ? 0 : list.size();
        for(int i = 0; i<size; i=i+3)
        {
            row[0] = list.get(i);
            row[1] = list.get(i+1);
            row[2] =list.get(i+2);
           
            model3.addRow(row);
           
        }
 
    }
    
    public void viewAutres() throws SQLException{
        nbrl.setText(""+sc.getSdao().nbrLocation());
        ne.setText(""+sc.getSdao().nbrEmprunt());
        nc.setText(""+sc.getSdao().nbrClient());
        nl.setText(""+(sc.getSdao().nbrDoc("livreRegulier")+sc.getSdao().nbrDoc("livreDemander")));
        nj.setText(""+sc.getSdao().nbrDoc("journal"));
        np.setText(""+sc.getSdao().nbrDoc("periodic"));
        ndc.setText(""+sc.getSdao().nbrDoc("disqueCompact"));
        ncv.setText(""+sc.getSdao().nbrDoc("cassettesVideo"));
        npr.setText(""+sc.getSdao().nbrPenR(1));
        npnr.setText(""+sc.getSdao().nbrPenR(0));
        vpr.setText(""+sc.getSdao().valPenR(1));
        vpnr.setText(""+sc.getSdao().valPenR(0));
    }
      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nbrl;
    private javax.swing.JLabel nc;
    private javax.swing.JLabel ncv;
    private javax.swing.JLabel ndc;
    private javax.swing.JLabel ndc1;
    private javax.swing.JLabel ndc2;
    private javax.swing.JLabel ndc3;
    private javax.swing.JLabel ndc4;
    private javax.swing.JLabel ndcnn;
    private javax.swing.JLabel ne;
    private javax.swing.JLabel nj;
    private javax.swing.JLabel nl;
    private javax.swing.JLabel np;
    private javax.swing.JLabel npnr;
    private javax.swing.JLabel npr;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JLabel vpnr;
    private javax.swing.JLabel vpr;
    // End of variables declaration//GEN-END:variables
}
