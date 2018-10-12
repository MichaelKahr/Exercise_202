package GUI;

import BL.SenderTableModel;
import BL.SenderTableRenderer;

/**
 *
 * @author mikeykahr
 */
public class RadioGUI extends javax.swing.JFrame {

    private SenderTableModel model = new SenderTableModel();
    
    public RadioGUI() {
        initComponents();
        jTOut.setModel(model);
        jTOut.setDefaultRenderer(Object.class, new SenderTableRenderer());
        jTOut.setShowGrid(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMadd = new javax.swing.JMenuItem();
        jMhide = new javax.swing.JMenuItem();
        jMshow = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOut = new javax.swing.JTable();

        jMadd.setText("Add");
        jMadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaddActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMadd);

        jMhide.setText("Hide");
        jMhide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMhideActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMhide);

        jMshow.setText("Show");
        jMshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMshowActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMshow);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setComponentPopupMenu(jPopupMenu1);

        jTOut.setModel(new javax.swing.table.DefaultTableModel(
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
        jTOut.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTOut);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaddActionPerformed
       SenderDlg dialog = new SenderDlg(this,true);
       dialog.setVisible(true);
       if(dialog.isOk()){
           model.add(dialog.getS());
       }
    }//GEN-LAST:event_jMaddActionPerformed

    private void jMhideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMhideActionPerformed
       model.setBand(false);
    }//GEN-LAST:event_jMhideActionPerformed

    private void jMshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMshowActionPerformed
        model.setBand(true);
    }//GEN-LAST:event_jMshowActionPerformed

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
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMadd;
    private javax.swing.JMenuItem jMhide;
    private javax.swing.JMenuItem jMshow;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTOut;
    // End of variables declaration//GEN-END:variables
}
