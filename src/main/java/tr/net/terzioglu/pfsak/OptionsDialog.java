package tr.net.terzioglu.pfsak;

import javax.swing.DefaultListModel;
import tr.net.terzioglu.pfsak.module.CompressConfig;
import tr.net.terzioglu.pfsak.module.ConstantConfig;
import tr.net.terzioglu.pfsak.module.DatabaseConfig;
import tr.net.terzioglu.pfsak.module.EncodeConfig;
import tr.net.terzioglu.pfsak.module.EncryptConfig;
import tr.net.terzioglu.pfsak.module.FileConfig;
import tr.net.terzioglu.pfsak.module.JSONConfig;
import tr.net.terzioglu.pfsak.module.RegExConfig;
import tr.net.terzioglu.pfsak.module.UIConfig;
import tr.net.terzioglu.pfsak.module.URLConfig;
import tr.net.terzioglu.pfsak.module.XMLConfig;

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
        constantButton = new javax.swing.JRadioButton();
        xmlButton = new javax.swing.JRadioButton();
        jsoButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");

        optionsButton.add(databaseButton);
        databaseButton.setText("Database");

        optionsButton.add(fileButton);
        fileButton.setText("File");

        optionsButton.add(compressButton);
        compressButton.setText("Compress");

        optionsButton.add(encodeButton);
        encodeButton.setText("Encode");

        optionsButton.add(encryptButton);
        encryptButton.setText("Encrypt");

        okButton.setText("Ok");
        okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        optionsButton.add(constantButton);
        constantButton.setSelected(true);
        constantButton.setText("Constant data");

        optionsButton.add(xmlButton);
        xmlButton.setText("XML extractor");

        optionsButton.add(jsoButton);
        jsoButton.setText("JSON extractor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encryptButton)
                    .addComponent(fileButton)
                    .addComponent(databaseButton)
                    .addComponent(compressButton)
                    .addComponent(encodeButton)
                    .addComponent(regExButton)
                    .addComponent(urlButton)
                    .addComponent(constantButton)
                    .addComponent(xmlButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(constantButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xmlButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(17, 17, 17))
        );

        setSize(new java.awt.Dimension(196, 344));
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

        } else if (constantButton.isSelected()) {
            s = new ConstantConfig();

        } else if (xmlButton.isSelected()) {
            s = new XMLConfig();

        } else if (jsoButton.isSelected()) {
            s = new JSONConfig();
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
    private javax.swing.JRadioButton constantButton;
    private javax.swing.JRadioButton databaseButton;
    private javax.swing.JRadioButton encodeButton;
    private javax.swing.JRadioButton encryptButton;
    private javax.swing.JRadioButton fileButton;
    private javax.swing.JRadioButton jsoButton;
    private javax.swing.JButton okButton;
    private javax.swing.ButtonGroup optionsButton;
    private javax.swing.JRadioButton regExButton;
    private javax.swing.JRadioButton urlButton;
    private javax.swing.JRadioButton xmlButton;
    // End of variables declaration//GEN-END:variables

}
