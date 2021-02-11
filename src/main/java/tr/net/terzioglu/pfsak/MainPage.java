package tr.net.terzioglu.pfsak;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tr.net.terzioglu.pfsak.module.CompressConfig;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;
import tr.net.terzioglu.pfsak.module.EncodeConfig;
import tr.net.terzioglu.pfsak.module.EncryptConfig;
import tr.net.terzioglu.pfsak.module.FileConfig;
import tr.net.terzioglu.pfsak.module.RegExConfig;
import tr.net.terzioglu.pfsak.module.UIConfig;
import tr.net.terzioglu.pfsak.module.URLConfig;

public class MainPage extends javax.swing.JFrame {

    private HashMap<String, Object[][]> profiller = new HashMap<>();
    private String currentProfil;
    private byte[] key;

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        pulse = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        profileComboBox = new javax.swing.JComboBox<>();
        run_jScrollPane = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        inverseRun_jScrollPane = new javax.swing.JScrollPane();
        inverseList = new javax.swing.JList<>();
        printScreen_jScrollPane = new javax.swing.JScrollPane();
        printScreen = new javax.swing.JList<>();
        runPipeline = new javax.swing.JButton();
        inverse_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        passwordMenu = new javax.swing.JMenu();
        changePasswordMenuItem = new javax.swing.JMenuItem();
        profileMenu = new javax.swing.JMenu();
        newProfileMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

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
        jToolBar.add(pulse);

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
        jToolBar.add(minus);

        profileComboBox.setPrototypeDisplayValue("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        profileComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profileComboBoxItemStateChanged(evt);
            }
        });
        jToolBar.add(profileComboBox);

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

        inverse_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inverse_Button.setText("Inverse Run<<");
        inverse_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inverse_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inverse_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverse_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Prints -->");

        fileMenu.setText("File");

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        passwordMenu.setText("Password");

        changePasswordMenuItem.setText("Change...");
        changePasswordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordMenuItemActionPerformed(evt);
            }
        });
        passwordMenu.add(changePasswordMenuItem);

        jMenuBar1.add(passwordMenu);

        profileMenu.setText("Profile");

        newProfileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newProfileMenuItem.setText("New...");
        newProfileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProfileMenuItemActionPerformed(evt);
            }
        });
        profileMenu.add(newProfileMenuItem);

        deleteMenuItem.setText("Delete...");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        profileMenu.add(deleteMenuItem);

        jMenuBar1.add(profileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(inverse_Button)
                            .addComponent(inverseRun_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inverse_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

            profiller.put(currentProfil, configs);
            String result = xstream.toXML(profiller);
            PBDKF2 pbdkf2 = new PBDKF2();

            Encryption ee = new All_Encryption();
            byte[] encripted = ee.encrypt(result.getBytes("UTF-8"), "AES", key);

            FileProcessor fileProcessor = new FileProcessor();
            fileProcessor.write(System.getProperty("user.home") + "/pfsak.configs", encripted);
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
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
        DefaultComboBoxModel boxModel = (DefaultComboBoxModel) profileComboBox.getModel();

        DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
        DefaultListModel inverListModel = (DefaultListModel) inverseList.getModel();

        if (f.exists()) {
            LoginDialog dialog = new LoginDialog(this, true);
            dialog.setVisible(true);
            key = dialog.rs;

            byte[] decripted = null;
            FileProcessor fp = new FileProcessor();
            try {
                byte[] result = fp.read(f.getAbsolutePath());
                Encryption ee = new All_Encryption();
                decripted = ee.decrypt(result, "AES", key);
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                //messaj göster okeye basılın kapt sistemi
                String message = ex.getLocalizedMessage();

//                JOptionPane.showMessageDialog(printScreen, "System is going to close.");
                JOptionPane.showMessageDialog(this,
                        "Password may be wrong \n" + message,
                        "Inane warning",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(-1);
            }

            String result = null;
            try {
                result = new String(decripted, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            profiller = (HashMap<String, Object[][]>) xstream.fromXML(result);

            for (String profiladi : profiller.keySet()) {
                boxModel.addElement(profiladi);

            }
            currentProfil = (String) boxModel.getElementAt(0);

            // We need to clear the listS when loading the data at the first startup because
            // the combobox method acts as if it was a new data entry when first opened. 
            // ın short, if we do not make clear, the data is duplicated.
            defaultListModel.clear();
            inverListModel.clear();
            Object[][] configs = profiller.get(currentProfil);
            for (int index = 0; index < configs[0].length; index++) {
                defaultListModel.addElement(configs[0][index]);
            }
            for (int index = 0; index < configs[1].length; index++) {
                inverListModel.addElement(configs[1][index]);

            }

        } else {
            // If the user logs into the application for the first time.

            profiller.put("Default profile", new Object[2][0]);
            for (String profiladi : profiller.keySet()) {
                boxModel.addElement(profiladi);

            }
            currentProfil = (String) boxModel.getElementAt(0);

            // We need to clear the listS when loading the data at the first startup because
            // the combobox method acts as if it was a new data entry when first opened. 
            // ın short, if we do not make clear, the data is duplicated.
            defaultListModel.clear();
            inverListModel.clear();

            NewPasswordDialog newPasswordDialog = new NewPasswordDialog(this, true);
            newPasswordDialog.setVisible(true);
            key = newPasswordDialog.rs;
            saveMenuItemActionPerformed(null);
        }
    }//GEN-LAST:event_formWindowOpened

    private void inverse_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverse_ButtonActionPerformed

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
    }//GEN-LAST:event_inverse_ButtonActionPerformed

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

    private void newProfileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProfileMenuItemActionPerformed
        // TODO add your handling code here:
        NewPipeLineDialog newPipeLineDialog = new NewPipeLineDialog(this, true, (DefaultComboBoxModel) profileComboBox.getModel());
        newPipeLineDialog.setVisible(true);

    }//GEN-LAST:event_newProfileMenuItemActionPerformed

    private void profileComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_profileComboBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            currentProfil = (String) evt.getItem();
            DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
            DefaultListModel invereList = (DefaultListModel) inverseList.getModel();

            Object[][] configs = new Object[2][defaultListModel.size()];

            for (int index = 0; index < defaultListModel.size(); index++) {
                configs[0][index] = defaultListModel.get(index);
            }
            for (int index = 0; index < invereList.size(); index++) {
                configs[1][index] = invereList.get(index);
            }

            profiller.put(currentProfil, configs);

        } else if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            currentProfil = (String) evt.getItem();
            DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
            DefaultListModel invereList = (DefaultListModel) inverseList.getModel();
            Object[][] configs = profiller.get(currentProfil);
            defaultListModel.clear();
            invereList.clear();
            if (configs != null) {

                for (int index = 0; index < configs[0].length; index++) {
                    defaultListModel.addElement(configs[0][index]);
                }
                for (int index = 0; index < configs[1].length; index++) {
                    invereList.addElement(configs[1][index]);
                }
            }
        }

    }//GEN-LAST:event_profileComboBoxItemStateChanged

    private void changePasswordMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordMenuItemActionPerformed
        // TODO add your handling code here:

        // profiles may be lost if you didn't save -> Save Cancel
        File f = new File(System.getProperty("user.home") + "/pfsak.configs");

        byte[] result = null;
        try {
            FileProcessor fp = new FileProcessor();
            result = fp.read(f.getAbsolutePath());

            Encryption ee = new All_Encryption();
            byte[] decripted = ee.decrypt(result, "AES", key);

        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        LoginDialog loginDialog = new LoginDialog(this, true);
        loginDialog.setVisible(true);

        byte[] newkey = loginDialog.rs;
        if (!Arrays.equals(key, newkey)) {
            // password geçersiz uyarısı ver
            return;
        }

        // Password change dialog 2 kere iste
        // key = passwordChangeDialog.rs;
        saveMenuItemActionPerformed(evt);
    }//GEN-LAST:event_changePasswordMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItemActionPerformed

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
    private javax.swing.JMenuItem changePasswordMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JList<String> inverseList;
    private javax.swing.JScrollPane inverseRun_jScrollPane;
    private javax.swing.JButton inverse_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JList<String> list;
    private javax.swing.JButton minus;
    private javax.swing.JMenuItem newProfileMenuItem;
    private javax.swing.JMenu passwordMenu;
    private javax.swing.JList<String> printScreen;
    private javax.swing.JScrollPane printScreen_jScrollPane;
    private javax.swing.JComboBox<String> profileComboBox;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JButton pulse;
    private javax.swing.JButton runPipeline;
    private javax.swing.JScrollPane run_jScrollPane;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
