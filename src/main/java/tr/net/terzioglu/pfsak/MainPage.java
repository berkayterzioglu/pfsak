package tr.net.terzioglu.pfsak;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.CompressConfig;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;
import tr.net.terzioglu.pfsak.module.EncodeConfig;
import tr.net.terzioglu.pfsak.module.EncryptConfig;
import tr.net.terzioglu.pfsak.module.FileConfig;
import tr.net.terzioglu.pfsak.module.RegExConfig;
import tr.net.terzioglu.pfsak.module.UIConfig;
import tr.net.terzioglu.pfsak.module.URLConfig;

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
        run_jScrollPane = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        inverseRun_jScrollPane = new javax.swing.JScrollPane();
        inverseList = new javax.swing.JList<>();
        printScreen_jScrollPane = new javax.swing.JScrollPane();
        printScreen = new javax.swing.JList<>();
        runPipeline = new javax.swing.JButton();
        Inverse_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        list.setModel(new javax.swing.DefaultListModel());
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        run_jScrollPane.setViewportView(list);

        inverseList.setModel(new javax.swing.DefaultListModel());
        inverseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inverseListMouseClicked(evt);
            }
        });
        inverseRun_jScrollPane.setViewportView(inverseList);

        printScreen.setModel(new javax.swing.DefaultListModel());
        printScreen_jScrollPane.setViewportView(printScreen);

        runPipeline.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        runPipeline.setText("Run >> ");
        runPipeline.setActionCommand("");
        runPipeline.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        runPipeline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runPipeline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        runPipeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runPipelineActionPerformed(evt);
            }
        });

        Inverse_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Inverse_Button.setText("Inverse Run<<");
        Inverse_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Inverse_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Inverse_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inverse_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Prints -->");

        fileMenu.setText("File");

        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printScreen_jScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(runPipeline)
                            .addComponent(run_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inverse_Button)
                            .addComponent(inverseRun_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inverse_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(runPipeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inverseRun_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(run_jScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printScreen_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1014, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseActionPerformed

        Options dialog = new Options(this, true);
        Options inverseDialog = new Options(this, true);

        dialog.setModel((DefaultListModel) list.getModel(), (DefaultListModel) inverseList.getModel());

        dialog.setVisible(true);
        minus.setEnabled(true);

    }//GEN-LAST:event_pulseActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        int index = list.getSelectedIndex();
        ((DefaultListModel) list.getModel()).remove(index);
        ((DefaultListModel) inverseList.getModel()).remove(inverseList.getModel().getSize() - index - 1);

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
            inverseList.repaint();
        }
    }//GEN-LAST:event_listMouseClicked

    private void runPipelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runPipelineActionPerformed
        // TODO add your handling code here:

        DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
        DefaultListModel printListModel = (DefaultListModel) printScreen.getModel();
        printListModel.clear();
        printListModel.addElement("---------------- R U N ----------------");
        byte[] sonuc = new byte[0];

        int size = list.getModel().getSize();

        for (int index = 0; index < size; index++) {

            if (defaultListModel.get(index) instanceof DatabaseConfig) {
                DatabaseConfig config = (DatabaseConfig) defaultListModel.get(index);
                DatabaseExecutor databaseExecutor = new DatabaseExecutor(printListModel);
                try {
                    sonuc = databaseExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof CompressConfig) {
                CompressConfig config = (CompressConfig) defaultListModel.get(index);
                CompressExecutor compressExecutor = new CompressExecutor(printListModel);

                try {
                    sonuc = compressExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof EncodeConfig) {
                EncodeConfig config = (EncodeConfig) defaultListModel.get(index);
                EncodeExecutor encodeExecutor = new EncodeExecutor(printListModel);

                try {
                    sonuc = encodeExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (defaultListModel.get(index) instanceof EncryptConfig) {
                EncryptConfig config = (EncryptConfig) defaultListModel.get(index);
                EncryptionExecutor encryptionExecutor = new EncryptionExecutor(printListModel);

                try {
                    sonuc = encryptionExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof FileConfig) {
                FileConfig config = (FileConfig) defaultListModel.get(index);
                FileExecutor fileExecutor = new FileExecutor(printListModel);

                try {
                    sonuc = fileExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (defaultListModel.get(index) instanceof RegExConfig) {
                RegExConfig config = (RegExConfig) defaultListModel.get(index);
                RegExExecutor regExExecutor = new RegExExecutor(printListModel);

                try {
                    sonuc = regExExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (defaultListModel.get(index) instanceof URLConfig) {
                URLConfig config = (URLConfig) defaultListModel.get(index);
                URLExecutor uRLExecutor = new URLExecutor(printListModel);

                try {
                    sonuc = uRLExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }//GEN-LAST:event_runPipelineActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        try {
            // serialization
            DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
            DefaultListModel invereList = (DefaultListModel) inverseList.getModel();

            Object[][] configs = new Object[2][defaultListModel.size()];

            for (int index = 0; index < defaultListModel.size(); index++) {
                configs[0][index] = defaultListModel.get(index);
            }
            for (int index = 0; index < invereList.size(); index++) {
                configs[1][index] = invereList.get(index);
            }
            XStream xstream = new XStream();

            String result = xstream.toXML(configs);
            FileProcessor fileProcessor = new FileProcessor();
            fileProcessor.write(System.getProperty("user.home") + "/pfsak.configs", result.getBytes("UTF-8"));
            System.out.println(result);
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);

    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        XStream xstream = new XStream();
        File f = new File(System.getProperty("user.home") + "/pfsak.configs");
        DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
        DefaultListModel inverListModel = (DefaultListModel) inverseList.getModel();

        Object[][] configs = (Object[][]) xstream.fromXML(f);
        for (int index = 0; index < configs[0].length; index++) {
            defaultListModel.addElement(configs[0][index]);
        }
        for (int index = 0; index < configs[1].length; index++) {
            inverListModel.addElement(configs[1][index]);
        }
    }//GEN-LAST:event_formWindowOpened

    private void Inverse_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inverse_ButtonActionPerformed

        DefaultListModel inverseListModel = (DefaultListModel) inverseList.getModel();
        DefaultListModel printListModel = (DefaultListModel) printScreen.getModel();
        printListModel.clear();
        printListModel.addElement("---------------- I N V E R S E   R U N ----------------");

        byte[] sonuc = new byte[0];

        int size = inverseList.getModel().getSize();

        for (int index = 0; index < size; index++) {

            if (inverseListModel.get(index) instanceof DatabaseConfig) {
                DatabaseConfig config = (DatabaseConfig) inverseListModel.get(index);
                DatabaseExecutor databaseExecutor = new DatabaseExecutor(printListModel);

                try {
                    sonuc = databaseExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (inverseListModel.get(index) instanceof CompressConfig) {
                CompressConfig config = (CompressConfig) inverseListModel.get(index);
                CompressExecutor compressExecutor = new CompressExecutor(printListModel);

                try {
                    sonuc = compressExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (inverseListModel.get(index) instanceof EncodeConfig) {
                EncodeConfig config = (EncodeConfig) inverseListModel.get(index);
                EncodeExecutor encodeExecutor = new EncodeExecutor(printListModel);

                try {
                    sonuc = encodeExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (inverseListModel.get(index) instanceof EncryptConfig) {
                EncryptConfig config = (EncryptConfig) inverseListModel.get(index);
                EncryptionExecutor encryptionExecutor = new EncryptionExecutor(printListModel);

                try {
                    sonuc = encryptionExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (inverseListModel.get(index) instanceof FileConfig) {
                FileConfig config = (FileConfig) inverseListModel.get(index);
                FileExecutor fileExecutor = new FileExecutor(printListModel);

                try {
                    sonuc = fileExecutor.execute(config, sonuc);
                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (inverseListModel.get(index) instanceof RegExConfig) {
                RegExConfig config = (RegExConfig) inverseListModel.get(index);
                RegExExecutor regExExecutor = new RegExExecutor(printListModel);

                try {
                    sonuc = regExExecutor.execute(config, sonuc);

                } catch (Exception ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_Inverse_ButtonActionPerformed

    private void inverseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inverseListMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {

            // Double-click detected
            int index = inverseList.locationToIndex(evt.getPoint());

            DefaultListModel defaultListModel = (DefaultListModel) inverseList.getModel();
            UIConfig config = (UIConfig) defaultListModel.get(index);

            if (config instanceof RegExConfig || config instanceof URLConfig) {
                config.showConfigDialog(this);
                inverseList.repaint();
            }

        }

    }//GEN-LAST:event_inverseListMouseClicked

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
    private javax.swing.JButton Inverse_Button;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JList<String> inverseList;
    private javax.swing.JScrollPane inverseRun_jScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton minus;
    private javax.swing.JList<String> printScreen;
    private javax.swing.JScrollPane printScreen_jScrollPane;
    private javax.swing.JButton pulse;
    private javax.swing.JButton runPipeline;
    private javax.swing.JScrollPane run_jScrollPane;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
