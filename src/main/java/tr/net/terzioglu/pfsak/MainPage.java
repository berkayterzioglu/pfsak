package tr.net.terzioglu.pfsak;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.CompressConfig;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;
import tr.net.terzioglu.pfsak.module.EncodeConfig;
import tr.net.terzioglu.pfsak.module.EncryptConfig;
import tr.net.terzioglu.pfsak.module.FileConfig;
import tr.net.terzioglu.pfsak.module.UIConfig;

public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        pulse = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        runPipeline = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");

        jToolBar1.setRollover(true);

        pulse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pulse.setText("+");
        pulse.setFocusable(false);
        pulse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pulse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseActionPerformed(evt);
            }
        });
        jToolBar1.add(pulse);

        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.setFocusable(false);
        minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jToolBar1.add(minus);

        runPipeline.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        runPipeline.setText("Run >> ");
        runPipeline.setActionCommand("");
        runPipeline.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        runPipeline.setFocusable(false);
        runPipeline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runPipeline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        runPipeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runPipelineActionPerformed(evt);
            }
        });
        jToolBar1.add(runPipeline);

        list.setModel(new javax.swing.DefaultListModel());
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(646, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseActionPerformed

        Options dialog = new Options(this, true);
        dialog.setModel((DefaultListModel) list.getModel());
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);

    }//GEN-LAST:event_pulseActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        int index = list.getSelectedIndex();
        ((DefaultListModel) list.getModel()).remove(index);
        int size = list.getModel().getSize();

        if (size == 0) {
            minus.setEnabled(false);

        }

    }//GEN-LAST:event_minusActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            // Double-click detected
            int index = list.locationToIndex(evt.getPoint());
            DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
            UIConfig config = (UIConfig) defaultListModel.get(index);
            config.showConfigDialog(this);

        }
    }//GEN-LAST:event_listMouseClicked

    private void runPipelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runPipelineActionPerformed
        // TODO add your handling code here:

        DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
        byte[] sonuc = new byte[0];

        int size = list.getModel().getSize();

        for (int index = 0; index < size; index++) {

            if (defaultListModel.get(index) instanceof DatabaseConfig) {
                DatabaseConfig config = (DatabaseConfig) defaultListModel.get(index);
                DatabaseExecutor databaseExecutor = new DatabaseExecutor();

                try {
                    sonuc = databaseExecutor.execute(config, sonuc);
                    System.out.println(Base64.getMimeEncoder().encodeToString(sonuc));
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof CompressConfig) {
                CompressConfig config = (CompressConfig) defaultListModel.get(index);
                CompressExecutor compressExecutor = new CompressExecutor();

                try {
                    sonuc = compressExecutor.execute(config, sonuc);
                    System.out.println(Base64.getMimeEncoder().encodeToString(sonuc));
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof EncodeConfig) {
                EncodeConfig config = (EncodeConfig) defaultListModel.get(index);
                EncodeExecutor encodeExecutor = new EncodeExecutor();

                try {
                    sonuc = encodeExecutor.execute(config, sonuc);
                    System.out.println(Base64.getMimeEncoder().encodeToString(sonuc));
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (defaultListModel.get(index) instanceof EncryptConfig) {
                EncryptConfig config = (EncryptConfig) defaultListModel.get(index);
                EncryptionExecutor encryptionExecutor = new EncryptionExecutor();

                try {
                    sonuc = encryptionExecutor.execute(config, sonuc);
                    System.out.println(Base64.getMimeEncoder().encodeToString(sonuc));
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof FileConfig) {
                FileConfig config = (FileConfig) defaultListModel.get(index);
                FileExecutor fileExecutor = new FileExecutor();

                try {
                    sonuc = fileExecutor.execute(config, sonuc);
                    System.out.println(Base64.getMimeEncoder().encodeToString(sonuc));
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }//GEN-LAST:event_runPipelineActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton minus;
    private javax.swing.JButton pulse;
    private javax.swing.JButton runPipeline;
    // End of variables declaration//GEN-END:variables

}
