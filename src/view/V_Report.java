
package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ij Lik
 */
public class V_Report extends View {

    public V_Report() {
        initComponents();
        disableMenu();
        disablePanel();
        disableEditAndDelete();
    }
    
    public void disablePanel(){
        editPanel.setVisible(false);
        viewPanel.setVisible(true);
    }
    
    @Override
    protected final void disableMenu(){
        homeButton1.setVisible(false);
        pengButton1.setVisible(false);
        reportButton1.setVisible(false);
        settingButton1.setVisible(false);
        infoButton1.setVisible(false);
        accountButton1.setVisible(false);
        logout1.setVisible(false);
        logout.setVisible(false);
    }
    //-------------------------------------------
    public String getEditTanggal(){
        return tanggal.getText();
    }
    
    public String getEditName(){
        return name1.getText();
    }
        
    public String getEditStatus(){
        return status.getSelectedItem().toString();
    }
    //==============================================
    public void setEditTanggal(String s){
        tanggal.setText(s);
    }
    
    public void setEditName(String s){
        name1.setText(s);
    }
    
    public void setEditStatus(String s){
        status.setSelectedItem(s);
    }
    //===============================================
    public void addTableListener(MouseListener listener) {
        tabelPengguna.addMouseListener(listener);
    }

    public void setTableModel(DefaultTableModel tm) {
        tabelPengguna.setModel(tm);
    }
    
    public int getSelectedRow() {
        return tabelPengguna.getSelectedRow();
    }
    
    public void addEditListener(ActionListener listener) {
        edit.addActionListener(listener);
    }
    
    public void addUpdateListener(ActionListener listener){
        update.addActionListener(listener);
    }
    //=================================================
    public void enableEditAndDelete() {
        edit.setEnabled(true);
    }

    private void disableEditAndDelete() {
        edit.setEnabled(false);
    }
    public void clearInput(){
        tanggal.setText("");
        name1.setText("");
        status.setSelectedItem(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();
        homeButton1 = new javax.swing.JLabel();
        pengButton = new javax.swing.JLabel();
        pengButton1 = new javax.swing.JLabel();
        reportButton = new javax.swing.JLabel();
        reportButton1 = new javax.swing.JLabel();
        settingButton = new javax.swing.JLabel();
        settingButton1 = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();
        infoButton1 = new javax.swing.JLabel();
        pengguna = new javax.swing.JPanel();
        viewPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPengguna = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        name1 = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        cancel1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        accountButton = new javax.swing.JLabel();
        accountButton1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(333, 144));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/homeButton.png"))); // NOI18N
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
        });
        jPanel2.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        homeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/homeButton-hover.png"))); // NOI18N
        homeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButton1MouseExited(evt);
            }
        });
        jPanel2.add(homeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        pengButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pengButton.png"))); // NOI18N
        pengButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pengButtonMouseEntered(evt);
            }
        });
        jPanel2.add(pengButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, -1));

        pengButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/pengButton-hover.png"))); // NOI18N
        pengButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pengButton1MouseExited(evt);
            }
        });
        jPanel2.add(pengButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, -1));

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/reportButton.png"))); // NOI18N
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportButtonMouseEntered(evt);
            }
        });
        jPanel2.add(reportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 50, -1));

        reportButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/reportButton-hover.png"))); // NOI18N
        reportButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportButton1MouseExited(evt);
            }
        });
        jPanel2.add(reportButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 50, -1));

        settingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/settingButton.png"))); // NOI18N
        settingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingButtonMouseEntered(evt);
            }
        });
        jPanel2.add(settingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 50, -1));

        settingButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/settingButton-hover.png"))); // NOI18N
        settingButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingButton1MouseExited(evt);
            }
        });
        jPanel2.add(settingButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 50, -1));

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/infoButton.png"))); // NOI18N
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoButtonMouseEntered(evt);
            }
        });
        jPanel2.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 50, -1));

        infoButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/infoButton-hover.png"))); // NOI18N
        infoButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoButton1MouseExited(evt);
            }
        });
        jPanel2.add(infoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 420));

        pengguna.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPanel.setBackground(new java.awt.Color(231, 244, 252));
        viewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelPengguna.setBackground(new java.awt.Color(231, 244, 252));
        tabelPengguna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelPengguna.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        tabelPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelPengguna.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tabelPengguna);

        viewPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 310));

        edit.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(19, 121, 206));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/edit.png"))); // NOI18N
        edit.setText("edit");
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        viewPanel.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        pengguna.add(viewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        editPanel.setBackground(new java.awt.Color(231, 244, 252));
        editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setEditable(false);
        name1.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        name1.setToolTipText("");
        editPanel.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 200, 30));

        tanggal.setEditable(false);
        tanggal.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        editPanel.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 200, 30));

        cancel1.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        cancel1.setText("Cancel");
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        editPanel.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, 30));

        update.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        update.setText("Update");
        editPanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 30));

        jLabel6.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        jLabel6.setText("Name");
        editPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        jLabel8.setText("Status");
        editPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        jLabel9.setText("Tanggal");
        editPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 30));

        status.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telat", "Masuk" }));
        editPanel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 200, 30));

        pengguna.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        getContentPane().add(pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 670, 390));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/accountButton.png"))); // NOI18N
        accountButton.setText("jLabel2");
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButtonMouseEntered(evt);
            }
        });
        jPanel1.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, -1));

        accountButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/accountButton-hover.png"))); // NOI18N
        accountButton1.setText("jLabel2");
        accountButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButton1MouseExited(evt);
            }
        });
        jPanel1.add(accountButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, -1));

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Play", 1, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 55, 90, 30));

        logout1.setBackground(new java.awt.Color(255, 51, 51));
        logout1.setFont(new java.awt.Font("Play", 1, 12)); // NOI18N
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logout-hover.png"))); // NOI18N
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout1MouseExited(evt);
            }
        });
        jPanel1.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 55, 90, 30));

        jLabel10.setFont(new java.awt.Font("Play", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rekap Absensi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 26, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dashboard.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        homeButton1.setVisible(true);
        homeButton.setVisible(false);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void pengButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengButtonMouseEntered
        // TODO add your handling code here:
        pengButton1.setVisible(true);
        pengButton.setVisible(false);
    }//GEN-LAST:event_pengButtonMouseEntered

    private void reportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseEntered
        // TODO add your handling code here:
        reportButton1.setVisible(true);
        reportButton.setVisible(false);
    }//GEN-LAST:event_reportButtonMouseEntered

    private void settingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButtonMouseEntered
        // TODO add your handling code here:
        settingButton1.setVisible(true);
        settingButton.setVisible(false);
    }//GEN-LAST:event_settingButtonMouseEntered

    private void infoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseEntered
        // TODO add your handling code here:
        infoButton1.setVisible(true);
        infoButton.setVisible(false);
    }//GEN-LAST:event_infoButtonMouseEntered

    private void homeButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton1MouseExited
        // TODO add your handling code here:
        homeButton1.setVisible(false);
        homeButton.setVisible(true);
    }//GEN-LAST:event_homeButton1MouseExited

    private void pengButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengButton1MouseExited
        // TODO add your handling code here:
        pengButton1.setVisible(false);
        pengButton.setVisible(true);
    }//GEN-LAST:event_pengButton1MouseExited

    private void reportButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButton1MouseExited
        // TODO add your handling code here:
        reportButton1.setVisible(false);
        reportButton.setVisible(true);
    }//GEN-LAST:event_reportButton1MouseExited

    private void settingButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButton1MouseExited
        // TODO add your handling code here:
        settingButton1.setVisible(false);
        settingButton.setVisible(true);
    }//GEN-LAST:event_settingButton1MouseExited

    private void infoButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButton1MouseExited
        // TODO add your handling code here:
        infoButton1.setVisible(false);
        infoButton.setVisible(true);
    }//GEN-LAST:event_infoButton1MouseExited

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        editPanel.setVisible(true);
        viewPanel.setVisible(false);
    }//GEN-LAST:event_editActionPerformed

    private void accountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseEntered
        // TODO add your handling code here:
        accountButton.setVisible(false);
        accountButton1.setVisible(true);
    }//GEN-LAST:event_accountButtonMouseEntered

    private void accountButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButton1MouseClicked
        // TODO add your handling code here:
        logout.setVisible(true);
    }//GEN-LAST:event_accountButton1MouseClicked

    private void accountButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButton1MouseExited
        // TODO add your handling code here:
        accountButton.setVisible(true);
        accountButton1.setVisible(false);
        logout.setVisible(false);
        logout1.setVisible(false);
    }//GEN-LAST:event_accountButton1MouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout1.setVisible(true);
        logout.setVisible(false);
    }//GEN-LAST:event_logoutMouseEntered

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            new main.Main().Login();
        } catch (SQLException ex) {
            Logger.getLogger(V_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout1MouseClicked

    private void logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseExited
        // TODO add your handling code here:
        logout1.setVisible(false);
        logout.setVisible(false);
    }//GEN-LAST:event_logout1MouseExited

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
        editPanel.setVisible(false);
        viewPanel.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void pengButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengButton1MouseClicked
        try {
            new main.Main().Pengguna();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(V_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pengButton1MouseClicked

    private void settingButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButton1MouseClicked
        try {
            new main.Main().Pengaturan();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(V_Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_settingButton1MouseClicked

    private void reportButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButton1MouseClicked
        try {
            new main.Main().Absensi();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(V_Scedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountButton;
    private javax.swing.JLabel accountButton1;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton edit;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel homeButton1;
    private javax.swing.JLabel infoButton;
    private javax.swing.JLabel infoButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel pengButton;
    private javax.swing.JLabel pengButton1;
    private javax.swing.JPanel pengguna;
    private javax.swing.JLabel reportButton;
    private javax.swing.JLabel reportButton1;
    private javax.swing.JLabel settingButton;
    private javax.swing.JLabel settingButton1;
    private javax.swing.JComboBox status;
    private javax.swing.JTable tabelPengguna;
    private javax.swing.JTextField tanggal;
    private javax.swing.JButton update;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}
