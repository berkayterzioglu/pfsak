package tr.net.terzioglu.pfsak;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewPasswordDialog extends javax.swing.JDialog {

    protected byte[] rs;

    public NewPasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLabel = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        passwordLabel.setText("Type new password:");

        confirmLabel.setText("Confirm password:");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        PBDKF2 pbdkf2 = new PBDKF2();
        String firstPass = new String(passwordField.getPassword());
        String secondPass = new String(confirmPasswordField.getPassword());

        if (firstPass.equals(secondPass)) {
            try {
                rs = pbdkf2.hashPassword(new String(passwordField.getPassword()));
            } catch (Exception ex) {
                Logger.getLogger(NewPasswordDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Password is not same",
                    "Inane warning",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_okButtonActionPerformed

    private void confirmPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyTyped
        // TODO add your handling code here:
        okButton.setEnabled(true);
    }//GEN-LAST:event_confirmPasswordFieldKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        confirmPasswordField.setEnabled(false);
        okButton.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        // TODO add your handling code here:
        confirmPasswordField.setEnabled(true);
    }//GEN-LAST:event_passwordFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
