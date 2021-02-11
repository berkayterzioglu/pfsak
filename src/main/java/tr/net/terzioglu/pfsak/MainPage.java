package tr.net.terzioglu.pfsak;

import com.thoughtworks.xstream.XStream;
import java.awt.event.ItemListener;
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
    private byte[] currentKey;

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        profileComboBox = new javax.swing.JComboBox<>();
        runScrollPane = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        inverseRunScrollPane = new javax.swing.JScrollPane();
        inverseList = new javax.swing.JList<>();
        printScreenScrollPane = new javax.swing.JScrollPane();
        printScreen = new javax.swing.JList<>();
        runPipeLineButton = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();
        printLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
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

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plusButton.setText("+");
        plusButton.setFocusable(false);
        plusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plusButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        toolBar.add(plusButton);

        minusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minusButton.setText("-");
        minusButton.setFocusable(false);
        minusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minusButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        toolBar.add(minusButton);

        profileComboBox.setPrototypeDisplayValue("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        profileComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profileComboBoxItemStateChanged(evt);
            }
        });
        toolBar.add(profileComboBox);

        list.setModel(new javax.swing.DefaultListModel());
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        runScrollPane.setViewportView(list);

        inverseList.setModel(new javax.swing.DefaultListModel());
        inverseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inverseListMouseClicked(evt);
            }
        });
        inverseRunScrollPane.setViewportView(inverseList);

        printScreen.setModel(new javax.swing.DefaultListModel());
        printScreenScrollPane.setViewportView(printScreen);

        runPipeLineButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        runPipeLineButton.setText("Run >> ");
        runPipeLineButton.setActionCommand("");
        runPipeLineButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        runPipeLineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runPipeLineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        runPipeLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runPipeLineButtonActionPerformed(evt);
            }
        });

        inverseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inverseButton.setText("Inverse Run<<");
        inverseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inverseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        printLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        printLabel.setText("Prints -->");

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

        menuBar.add(fileMenu);

        passwordMenu.setText("Password");

        changePasswordMenuItem.setText("Change...");
        changePasswordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordMenuItemActionPerformed(evt);
            }
        });
        passwordMenu.add(changePasswordMenuItem);

        menuBar.add(passwordMenu);

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

        menuBar.add(profileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printScreenScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(runPipeLineButton)
                            .addComponent(runScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inverseButton)
                            .addComponent(inverseRunScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(runPipeLineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inverseRunScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(runScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printScreenScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1014, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed

        Options dialog = new Options(this, true);
        Options inverseDialog = new Options(this, true);

        dialog.setModel((DefaultListModel) list.getModel(), (DefaultListModel) inverseList.getModel());

        dialog.setVisible(true);
        minusButton.setEnabled(true);

    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        int index = list.getSelectedIndex();
        ((DefaultListModel) list.getModel()).remove(index);
        ((DefaultListModel) inverseList.getModel()).remove(inverseList.getModel().getSize() - index - 1);

        int size = list.getModel().getSize();

        if (size == 0) {
            minusButton.setEnabled(false);

        }

    }//GEN-LAST:event_minusButtonActionPerformed

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

    private void runPipeLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runPipeLineButtonActionPerformed
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

    }//GEN-LAST:event_runPipeLineButtonActionPerformed

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
            byte[] encripted = ee.encrypt(result.getBytes("UTF-8"), "AES", currentKey);

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

        File f = new File(System.getProperty("user.home") + "/pfsak.configs");

        if (f.exists()) {
            LoginDialog dialog = new LoginDialog(this, true);
            dialog.setVisible(true);
            currentKey = dialog.rs;

            byte[] decripted = null;
            FileProcessor fp = new FileProcessor();
            try {
                byte[] result = fp.read(f.getAbsolutePath());
                Encryption ee = new All_Encryption();
                decripted = ee.decrypt(result, "AES", currentKey);
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                String message = ex.getLocalizedMessage();
                JOptionPane.showMessageDialog(this, "Password may be wrong \n" + message, "Inane warning", JOptionPane.ERROR_MESSAGE);
                System.exit(-1);
            }
            load(decripted);

        } else {
            // If the user logs into the application for the first time.

            DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
            DefaultListModel inverListModel = (DefaultListModel) inverseList.getModel();
            DefaultComboBoxModel boxModel = (DefaultComboBoxModel) profileComboBox.getModel();
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
            currentKey = newPasswordDialog.rs;
            saveMenuItemActionPerformed(null);
        }
    }//GEN-LAST:event_formWindowOpened

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed

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
    }//GEN-LAST:event_inverseButtonActionPerformed

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

        Object[] options = {"Save", "Discard", "Cancel"};
        int response = JOptionPane.showOptionDialog(this,
                "Profiles may be lost if you didn't save",
                "Are you sure ?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        if (response == JOptionPane.YES_OPTION) {
            saveMenuItemActionPerformed(null);

        } else if ((response == JOptionPane.CANCEL_OPTION)) {
            return;

        }

        OldPasswordDialog oldPasswordDialog = new OldPasswordDialog(this, true);
        oldPasswordDialog.setVisible(true);
        byte[] checkKey = oldPasswordDialog.rs;

        if (!Arrays.equals(currentKey, checkKey)) {
            JOptionPane.showMessageDialog(this,
                    "Password is invalid",
                    "Inane warning",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            byte[] rs = null;
            byte[] decripted = null;
            try {
                File f = new File(System.getProperty("user.home") + "/pfsak.configs");
                FileProcessor fp = new FileProcessor();
                rs = fp.read(f.getAbsolutePath());

                Encryption ee = new All_Encryption();
                decripted = ee.decrypt(rs, "AES", currentKey);

            } catch (IOException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            load(decripted);

            NewPasswordDialog newPasswordDialog = new NewPasswordDialog(this, true);
            newPasswordDialog.setVisible(true);
            byte[] newKey = newPasswordDialog.rs;
            currentKey = newKey;
            saveMenuItemActionPerformed(null);
        }


    }//GEN-LAST:event_changePasswordMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void load(byte[] decripted) {
        XStream xstream = new XStream();
        DefaultListModel defaultListModel = (DefaultListModel) list.getModel();
        DefaultListModel inverListModel = (DefaultListModel) inverseList.getModel();
        DefaultComboBoxModel boxModel = (DefaultComboBoxModel) profileComboBox.getModel();
        String result = null;
        try {
            result = new String(decripted, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        profiller = (HashMap<String, Object[][]>) xstream.fromXML(result);
        for (ItemListener il : profileComboBox.getItemListeners()) {
            profileComboBox.removeItemListener(il);
        }

        boxModel.removeAllElements();
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

        profileComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profileComboBoxItemStateChanged(evt);
            }
        });
    }

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
    private javax.swing.JButton inverseButton;
    private javax.swing.JList<String> inverseList;
    private javax.swing.JScrollPane inverseRunScrollPane;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton minusButton;
    private javax.swing.JMenuItem newProfileMenuItem;
    private javax.swing.JMenu passwordMenu;
    private javax.swing.JButton plusButton;
    private javax.swing.JLabel printLabel;
    private javax.swing.JList<String> printScreen;
    private javax.swing.JScrollPane printScreenScrollPane;
    private javax.swing.JComboBox<String> profileComboBox;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JButton runPipeLineButton;
    private javax.swing.JScrollPane runScrollPane;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

}
