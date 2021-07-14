/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SportsManagementSystem;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null); //centre form
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JPanel();
        labelAppName = new javax.swing.JLabel();
        labelMinimizeApp = new javax.swing.JLabel();
        labelCloseApp = new javax.swing.JLabel();
        panelComponents = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAddSport = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        panelEnrolled = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelNotEnrolled = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home ");
        setBackground(new java.awt.Color(40, 116, 166));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelTitle.setBackground(new java.awt.Color(0, 0, 0));
        panelTitle.setPreferredSize(new java.awt.Dimension(600, 29));

        labelAppName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelAppName.setForeground(new java.awt.Color(255, 255, 255));
        labelAppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAppName.setText("NSBM Sports Management System");

        labelMinimizeApp.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimizeApp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelMinimizeApp.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimizeApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizeApp.setText("-");
        labelMinimizeApp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelMinimizeApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizeAppMouseClicked(evt);
            }
        });

        labelCloseApp.setBackground(new java.awt.Color(255, 255, 255));
        labelCloseApp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCloseApp.setForeground(new java.awt.Color(255, 255, 255));
        labelCloseApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCloseApp.setText("x");
        labelCloseApp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelCloseApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCloseAppMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addComponent(labelAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(labelMinimizeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCloseApp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAppName)
                .addContainerGap())
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCloseApp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinimizeApp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelComponents.setBackground(new java.awt.Color(40, 116, 166));
        panelComponents.setPreferredSize(new java.awt.Dimension(600, 650));

        labelId.setBackground(new java.awt.Color(255, 255, 255));
        labelId.setForeground(new java.awt.Color(255, 255, 255));
        labelId.setText("ID :");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(40, 116, 166));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setFocusable(false);

        btnAddSport.setBackground(new java.awt.Color(40, 116, 166));
        btnAddSport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addSport.png"))); // NOI18N
        btnAddSport.setBorderPainted(false);
        btnAddSport.setContentAreaFilled(false);
        btnAddSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSportActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        panelEnrolled.setBackground(new java.awt.Color(0, 102, 153));
        panelEnrolled.setAutoscrolls(true);

        jTable2.setBackground(new java.awt.Color(0, 102, 153));
        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sport Id", "Sport", "Category", "Master in charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowSelectionAllowed(false);
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        labelNotEnrolled.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNotEnrolled.setForeground(new java.awt.Color(204, 204, 204));
        labelNotEnrolled.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNotEnrolled.setText("You are currently not enrolled in any sport or a club");

        javax.swing.GroupLayout panelEnrolledLayout = new javax.swing.GroupLayout(panelEnrolled);
        panelEnrolled.setLayout(panelEnrolledLayout);
        panelEnrolledLayout.setHorizontalGroup(
            panelEnrolledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnrolledLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelEnrolledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(labelNotEnrolled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelEnrolledLayout.setVerticalGroup(
            panelEnrolledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnrolledLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelNotEnrolled)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        labelNotEnrolled.setVisible(false);

        javax.swing.GroupLayout panelComponentsLayout = new javax.swing.GroupLayout(panelComponents);
        panelComponents.setLayout(panelComponentsLayout);
        panelComponentsLayout.setHorizontalGroup(
            panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComponentsLayout.createSequentialGroup()
                        .addGap(0, 264, Short.MAX_VALUE)
                        .addComponent(btnAddSport)
                        .addGap(250, 250, 250))
                    .addGroup(panelComponentsLayout.createSequentialGroup()
                        .addComponent(labelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelComponentsLayout.createSequentialGroup()
                                .addComponent(panelEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelComponentsLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut)))
                        .addContainerGap())))
        );
        panelComponentsLayout.setVerticalGroup(
            panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelId)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogOut))
                .addGap(38, 38, 38)
                .addComponent(panelEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnAddSport, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMinimizeAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizeAppMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMinimizeAppMouseClicked

    private void labelCloseAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCloseAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCloseAppMouseClicked

    private void btnAddSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSportActionPerformed
        Categories cf = new Categories();
        cf.txtId.setText(LogIn.jTextFieldId.getText()); //pass the id value to the categories
        cf.setVisible(true);
        cf.pack();
        cf.setLocationRelativeTo(null);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddSportActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_NEXT_COLUMN);
        TableColumnModel colModel=jTable2.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(20);         
        colModel.getColumn(2).setPreferredWidth(50); 
        colModel.getColumn(3).setPreferredWidth(150);
        
        try{
        //query to select sports enrolled from the database
        String query = "SELECT S.Sp_Id, S.Sp_Name, S.Sp_Category, S.Sp_MasterInCharge, U.Stu_Id FROM Sport S JOIN Enrolled E ON S.Sp_Id = E.SpId JOIN Student U ON U.Stu_Id = E.StuId;";
        Statement st = DbConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery(query);
        
            while(rs.next()){
                String stuId = txtId.getText();
                String stId = rs.getString("U.Stu_Id");
                String spId = rs.getString("S.Sp_Id");
                String name = rs.getString("S.Sp_Name");
                String cat = rs.getString("S.Sp_Category");
                String incharge = rs.getString("S.Sp_MasterInCharge");

                //set the panel to show 
                if (stuId.trim().contentEquals(stId)){
                    String tbData[] = {spId, name, cat, incharge};
                    DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
                    tblModel.addRow(tbData);
                    int rowCount = tblModel.getRowCount();
                    if (rowCount < 1){
                        labelNotEnrolled.setVisible(true);
                    }
                }
            }
        }
        catch(Exception ex){
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);   
        }      
    }//GEN-LAST:event_formWindowOpened

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        LogIn lg = new LogIn();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSport;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelAppName;
    private javax.swing.JLabel labelCloseApp;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelMinimizeApp;
    private javax.swing.JLabel labelNotEnrolled;
    private javax.swing.JPanel panelComponents;
    private javax.swing.JPanel panelEnrolled;
    private javax.swing.JPanel panelTitle;
    public static javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
