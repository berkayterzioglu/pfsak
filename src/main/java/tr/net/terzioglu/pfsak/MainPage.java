package tr.net.terzioglu.pfsak;

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
        createNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        createNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createNew.setText("Create ");
        createNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createNew.setFocusable(false);
        createNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        createNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewActionPerformed(evt);
            }
        });
        jToolBar1.add(createNew);

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "New events", "asdads" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                listAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseActionPerformed

        Options dialog = new Options(this, true);
        dialog.setVisible(true);

    }//GEN-LAST:event_pulseActionPerformed

    private void listAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listAncestorAdded

    private void listAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listAncestorRemoved

    private void createNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewActionPerformed


    }//GEN-LAST:event_createNewActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed


    }//GEN-LAST:event_minusActionPerformed

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
    private javax.swing.JButton createNew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton minus;
    private javax.swing.JButton pulse;
    // End of variables declaration//GEN-END:variables

    public String selection(String s) {

        switch (s) {

            case "databse":

                break;

            case "vt":

                break;

            case "compress":

                break;

            case "encode":

                break;

            case "encrypt":

                break;
        }

        return null;

    }

}
