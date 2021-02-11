package tr.net.terzioglu.pfsak.module;

public class EncryptConfigDialog extends javax.swing.JDialog {

    EncryptConfig ec;

    public EncryptConfigDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        typeComboBox = new javax.swing.JComboBox<>();
        encryptRadioButton = new javax.swing.JRadioButton();
        decryptRadioButton = new javax.swing.JRadioButton();
        okButton = new javax.swing.JButton();
        keyValueLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        keyValueScrollPane = new javax.swing.JScrollPane();
        keyValueTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encryption");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AES", "DES", "3DES" }));

        buttonGroup1.add(encryptRadioButton);
        encryptRadioButton.setSelected(true);
        encryptRadioButton.setText("Encrypt");

        buttonGroup1.add(decryptRadioButton);
        decryptRadioButton.setText("Decrypt");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        keyValueLabel.setText("Key Value: ");

        typeLabel.setText("Type:");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        keyValueTextArea.setColumns(20);
        keyValueTextArea.setLineWrap(true);
        keyValueTextArea.setRows(5);
        keyValueScrollPane.setViewportView(keyValueTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keyValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyValueScrollPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decryptRadioButton)
                                    .addComponent(encryptRadioButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(typeComboBox, 0, 298, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(keyValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(keyValueScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encryptRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decryptRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        int type = typeComboBox.getSelectedIndex();
        switch (type) {
            case 0:
                ec.setEncryptionType(EncryptConfig.Type.AES);

                break;
            case 1:
                ec.setEncryptionType(EncryptConfig.Type.DES);

                break;
            case 2:
                ec.setEncryptionType(EncryptConfig.Type.TRIPLE_DES);

                break;
        }
        if (encryptRadioButton.isSelected()) {
            ec.setEncrypt(true);
        } else {
            ec.setEncrypt(false);

        }
        ec.setKeyValue(keyValueTextArea.getText());
        ec.updateInverse();
        setVisible(false);
        dispose();


    }//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton decryptRadioButton;
    private javax.swing.JRadioButton encryptRadioButton;
    private javax.swing.JLabel keyValueLabel;
    private javax.swing.JScrollPane keyValueScrollPane;
    private javax.swing.JTextArea keyValueTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    void setEncryptConfig(EncryptConfig aThis) {
        ec = aThis;
        typeComboBox.setSelectedIndex(ec.getEncryptionType().ordinal());

        if (ec.isEncrypt()) {
            encryptRadioButton.setSelected(true);
            decryptRadioButton.setSelected(false);
        } else {
            encryptRadioButton.setSelected(false);
            decryptRadioButton.setSelected(true);
        }
        if (ec.getKeyValue() != null) {
            keyValueTextArea.setText(ec.getKeyValue());
        }
    }
}
