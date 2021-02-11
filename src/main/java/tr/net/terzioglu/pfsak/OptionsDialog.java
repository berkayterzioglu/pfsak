package tr.net.terzioglu.pfsak;

import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.CompressConfig;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;
import tr.net.terzioglu.pfsak.module.EncodeConfig;
import tr.net.terzioglu.pfsak.module.EncryptConfig;
import tr.net.terzioglu.pfsak.module.FileConfig;
import tr.net.terzioglu.pfsak.module.RegExConfig;
import tr.net.terzioglu.pfsak.module.UIConfig;
import tr.net.terzioglu.pfsak.module.URLConfig;

public class OptionsDialog extends javax.swing.JDialog {

    DefaultListModel model, imodel;

    public void setModel(DefaultListModel model, DefaultListModel imodel) {
        this.model = model;
        this.imodel = imodel;
    }

    public OptionsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsButton = new javax.swing.ButtonGroup();
        databaseButton = new javax.swing.JRadioButton();
        fileButton = new javax.swing.JRadioButton();
        compressButton = new javax.swing.JRadioButton();
        encodeButton = new javax.swing.JRadioButton();
        encryptButton = new javax.swing.JRadioButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        regExButton = new javax.swing.JRadioButton();
        urlButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");

        optionsButton.add(databaseButton);
        databaseButton.setSelected(true);
        databaseButton.setText("Database");

        optionsButton.add(fileButton);
        fileButton.setText("File");

        optionsButton.add(compressButton);
        compressButton.setText("Compress");

        optionsButton.add(encodeButton);
        encodeButton.setText("Encode");

        optionsButton.add(encryptButton);
        encryptButton.setText("Encrypt");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setName(""); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        optionsButton.add(regExButton);
        regExButton.setText("RegEx");

        optionsButton.add(urlButton);
        urlButton.setText("URL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encryptButton)
                            .addComponent(fileButton)
                            .addComponent(databaseButton)
                            .addComponent(compressButton)
                            .addComponent(encodeButton)
                            .addComponent(regExButton)
                            .addComponent(urlButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(databaseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compressButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encodeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regExButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urlButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(195, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        UIConfig s = null;
        if (databaseButton.isSelected()) {
            s = new DatabaseConfig();

        } else if (fileButton.isSelected()) {
            s = new FileConfig();

        } else if (compressButton.isSelected()) {
            s = new CompressConfig();

        } else if (encodeButton.isSelected()) {
            s = new EncodeConfig();

        } else if (encryptButton.isSelected()) {
            s = new EncryptConfig();

        } else if (regExButton.isSelected()) {
            s = new RegExConfig();

        } else if (urlButton.isSelected()) {
            s = new URLConfig();
        }
        model.addElement(s);
        imodel.add(0, s.inverse());
        setVisible(false);
        dispose();

}//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton compressButton;
    private javax.swing.JRadioButton databaseButton;
    private javax.swing.JRadioButton encodeButton;
    private javax.swing.JRadioButton encryptButton;
    private javax.swing.JRadioButton fileButton;
    private javax.swing.JButton okButton;
    private javax.swing.ButtonGroup optionsButton;
    private javax.swing.JRadioButton regExButton;
    private javax.swing.JRadioButton urlButton;
    // End of variables declaration//GEN-END:variables

}
