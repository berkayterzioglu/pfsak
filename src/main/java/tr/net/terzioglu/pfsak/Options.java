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

public class Options extends javax.swing.JDialog {

    DefaultListModel model, imodel;
    DefaultListModel modelInverse;

    public void setModel(DefaultListModel model, DefaultListModel imodel) {
        this.model = model;
        this.imodel = imodel;
    }

    public Options(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options_button = new javax.swing.ButtonGroup();
        database_button = new javax.swing.JRadioButton();
        file_button = new javax.swing.JRadioButton();
        compress_button = new javax.swing.JRadioButton();
        encode_button = new javax.swing.JRadioButton();
        encrypt_button = new javax.swing.JRadioButton();
        ok_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        regex_button = new javax.swing.JRadioButton();
        url_button = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");

        options_button.add(database_button);
        database_button.setSelected(true);
        database_button.setText("Database");

        options_button.add(file_button);
        file_button.setText("File");

        options_button.add(compress_button);
        compress_button.setText("Compress");

        options_button.add(encode_button);
        encode_button.setText("Encode");

        options_button.add(encrypt_button);
        encrypt_button.setText("Encrypt");

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.setName(""); // NOI18N
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        options_button.add(regex_button);
        regex_button.setText("RegEx");

        options_button.add(url_button);
        url_button.setText("URL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ok_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(cancel_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encrypt_button)
                            .addComponent(file_button)
                            .addComponent(database_button)
                            .addComponent(compress_button)
                            .addComponent(encode_button)
                            .addComponent(regex_button)
                            .addComponent(url_button))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(database_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compress_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encode_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encrypt_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regex_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(url_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(cancel_button))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(195, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        UIConfig s = null;
        if (database_button.isSelected()) {
            s = new DatabaseConfig();

        } else if (file_button.isSelected()) {
            s = new FileConfig();

        } else if (compress_button.isSelected()) {
            s = new CompressConfig();

        } else if (encode_button.isSelected()) {
            s = new EncodeConfig();

        } else if (encrypt_button.isSelected()) {
            s = new EncryptConfig();

        } else if (regex_button.isSelected()) {
            s = new RegExConfig();

        } else if (url_button.isSelected()) {
            s = new URLConfig();
        }
        model.addElement(s);
        imodel.add(0, s.inverse());
        setVisible(false);
        dispose();

}//GEN-LAST:event_ok_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JRadioButton compress_button;
    private javax.swing.JRadioButton database_button;
    private javax.swing.JRadioButton encode_button;
    private javax.swing.JRadioButton encrypt_button;
    private javax.swing.JRadioButton file_button;
    private javax.swing.JButton ok_button;
    private javax.swing.ButtonGroup options_button;
    private javax.swing.JRadioButton regex_button;
    private javax.swing.JRadioButton url_button;
    // End of variables declaration//GEN-END:variables

}
