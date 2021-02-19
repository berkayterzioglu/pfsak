package tr.net.terzioglu.pfsak;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.ConfigBase;

public class CopyPasteDialog extends javax.swing.JDialog {

    DefaultComboBoxModel copyCombo;
    DefaultComboBoxModel pasteCombo;
    DefaultListModel list;

    private Map<String, Object[][]> profiller;

    public CopyPasteDialog(java.awt.Frame parent, boolean modal, Map<String, Object[][]> profiller) {
        super(parent, modal);
        this.profiller = profiller;
        initComponents();

        copyCombo = (DefaultComboBoxModel) copyComboBox.getModel();
        pasteCombo = (DefaultComboBoxModel) pasteComboBox.getModel();
        list = (DefaultListModel) copyList.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyScrollPane = new javax.swing.JScrollPane();
        copyList = new javax.swing.JList<>();
        copyComboBox = new javax.swing.JComboBox<>();
        pasteComboBox = new javax.swing.JComboBox<>();
        copyLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        pasteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Copy  -----> Paste");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        copyList.setModel(new javax.swing.DefaultListModel());
        copyList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        copyScrollPane.setViewportView(copyList);

        copyComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                copyComboBoxİtemStateChanged(evt);
            }
        });

        copyLabel.setText("       Copy            ----->");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        pasteLabel.setText("       Paste          ----->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copyScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(copyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pasteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pasteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(copyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(copyComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(copyScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pasteComboBox)
                    .addComponent(pasteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (String profiladi : profiller.keySet()) {
            copyCombo.addElement(profiladi);
            pasteCombo.addElement(profiladi);
        }
    }//GEN-LAST:event_formWindowOpened

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        int[] selectedIndexes = copyList.getSelectedIndices();
        String selectedCopy = (String) copyComboBox.getSelectedItem();
        String selectedPaste = (String) pasteComboBox.getSelectedItem();
        Object[][] copyConfigs = profiller.get(selectedCopy);
        Object[][] pasteConfigs = profiller.get(selectedPaste);
        Object[][] newConfigs = new Object[2][pasteConfigs[0].length + selectedIndexes.length];

        System.arraycopy(pasteConfigs[0], 0, newConfigs[0], 0, pasteConfigs[0].length);
        System.arraycopy(pasteConfigs[1], 0, newConfigs[1], newConfigs[1].length - pasteConfigs[1].length, pasteConfigs[1].length);
        for (int i = 0; i < selectedIndexes.length; i++) {
            ConfigBase config = (ConfigBase) copyConfigs[0][selectedIndexes[i]];
            try {
                newConfigs[0][pasteConfigs[0].length + i] = config.clone();
                newConfigs[1][selectedIndexes.length - 1 - i] = config.getInverse().clone();

            } catch (Exception ex) {
                Logger.getLogger(CopyPasteDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        profiller.put(selectedPaste, newConfigs);
        ((MainPage) getParent()).updateList();
    }//GEN-LAST:event_okButtonActionPerformed

    private void copyComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_copyComboBoxİtemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selcted = (String) evt.getItem();

            Object[][] configs = profiller.get(selcted);
            list.clear();
            if (configs != null) {

                for (int index = 0; index < configs[0].length; index++) {
                    list.addElement(configs[0][index]);
                }

            }
            copyList.repaint();
        }
    }//GEN-LAST:event_copyComboBoxİtemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> copyComboBox;
    private javax.swing.JLabel copyLabel;
    private javax.swing.JList<String> copyList;
    private javax.swing.JScrollPane copyScrollPane;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> pasteComboBox;
    private javax.swing.JLabel pasteLabel;
    // End of variables declaration//GEN-END:variables
}
