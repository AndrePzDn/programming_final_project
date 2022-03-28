
package Windows;

public class singUp extends javax.swing.JFrame {

    public singUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SingUpTextTitle = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        NameJTextField = new javax.swing.JTextField();
        NickNameText = new javax.swing.JLabel();
        NickNamejTextField = new javax.swing.JTextField();
        GenreText = new javax.swing.JLabel();
        GenreJTextField = new javax.swing.JTextField();
        EmailText = new javax.swing.JLabel();
        EmailJTextField = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        PasswordJPasswordField = new javax.swing.JPasswordField();
        SingUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        SingUpTextTitle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        SingUpTextTitle.setText("Registro");

        NameText.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        NameText.setText("Nombre");

        NickNameText.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        NickNameText.setText("NickName");

        GenreText.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        GenreText.setText("Genero");

        GenreJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreJTextFieldActionPerformed(evt);
            }
        });

        EmailText.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        EmailText.setText("Correo");

        PasswordText.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        PasswordText.setText("Contraseña");

        PasswordJPasswordField.setPreferredSize(new java.awt.Dimension(63, 22));
        PasswordJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordJPasswordFieldActionPerformed(evt);
            }
        });

        SingUpButton.setBackground(new java.awt.Color(255, 0, 0));
        SingUpButton.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        SingUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SingUpButton.setText("Registrarse");
        SingUpButton.setToolTipText("");
        SingUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NickNamejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(NickNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SingUpTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenreText)
                    .addComponent(EmailText)
                    .addComponent(PasswordText)
                    .addComponent(GenreJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(NameJTextField)
                    .addComponent(PasswordJPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SingUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(EmailJTextField))
                .addGap(0, 159, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(SingUpTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NickNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NickNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(SingUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordJPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordJPasswordFieldActionPerformed

    private void SingUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingUpButtonActionPerformed
        Login Loginwindows= new Login();
        Loginwindows.setVisible(true);
        dispose();
    }//GEN-LAST:event_SingUpButtonActionPerformed

    private void GenreJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreJTextFieldActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField EmailJTextField;
    private javax.swing.JLabel EmailText;
    private javax.swing.JTextField GenreJTextField;
    private javax.swing.JLabel GenreText;
    private javax.swing.JTextField NameJTextField;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel NickNameText;
    private javax.swing.JTextField NickNamejTextField;
    private javax.swing.JPasswordField PasswordJPasswordField;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton SingUpButton;
    private javax.swing.JLabel SingUpTextTitle;
    // End of variables declaration//GEN-END:variables
}
