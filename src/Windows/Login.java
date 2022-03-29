
package Windows;
import javax.swing.JOptionPane;
import users.BasicFunctionOfUsers;
import users.User;
import users.UserAdmin;
import users.UserClient;
public class Login extends javax.swing.JFrame {

    public UserClient user;
    public BasicFunctionOfUsers basicFunctionOfUsers = new BasicFunctionOfUsers();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        UserClient user = null;
        this.user = user;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SingUp = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        EmailText = new javax.swing.JLabel();
        EmailJTextField = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        JPasswordField = new javax.swing.JPasswordField();
        SingUpText = new javax.swing.JLabel();
        Login = new java.awt.Button();
        SingUp1 = new java.awt.Button();
        showPassJCheckBox = new javax.swing.JCheckBox();

        SingUp.setBackground(new java.awt.Color(255, 0, 0));
        SingUp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SingUp.setForeground(new java.awt.Color(255, 255, 255));
        SingUp.setLabel("Registrate");
        SingUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingUpActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        EmailText.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        EmailText.setText("Email");

        EmailJTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmailJTextField.setToolTipText("");

        PasswordText.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        PasswordText.setText("Password");

        JPasswordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        SingUpText.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SingUpText.setText("Aun no tienes una cuenta?");

        Login.setBackground(new java.awt.Color(255, 0, 0));
        Login.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setLabel("Ingresar");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        SingUp1.setBackground(new java.awt.Color(255, 0, 0));
        SingUp1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SingUp1.setForeground(new java.awt.Color(255, 255, 255));
        SingUp1.setLabel("Registrate");
        SingUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingUp1ActionPerformed(evt);
            }
        });

        showPassJCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        showPassJCheckBox.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        showPassJCheckBox.setText("Show Password");
        showPassJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassJCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SingUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassJCheckBox)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PasswordText)
                                .addComponent(EmailJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(JPasswordField)
                                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(SingUpText)
                                    .addGap(23, 23, 23))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PasswordText)
                .addGap(38, 38, 38)
                .addComponent(JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showPassJCheckBox)
                .addGap(6, 6, 6)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(SingUpText)
                .addGap(29, 29, 29)
                .addComponent(SingUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SingUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingUp1ActionPerformed
        singUp WindowSingUp = new singUp();
        WindowSingUp.setVisible(true);
    }//GEN-LAST:event_SingUp1ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String Email = EmailJTextField.getText();
        String Password = "";
        char[] PasswordArray = JPasswordField.getPassword();
        for(int i = 0; i < PasswordArray.length; i++){
            Password += PasswordArray[i];
        }
        User user = this.basicFunctionOfUsers.logIn(Email, Password);
        if(user != null){
            if (user.getClass().toString().equalsIgnoreCase("class users.UserClient")){    
                UserClient userClient = (UserClient) user;
                this.user = userClient;
                Window1 Windows = new Window1();
                Windows.setVisible(true);
                dispose();
            }else{
                dispose();
                UserAdmin userAdmin = (UserAdmin) user;
                userAdmin.adminProgram();
                Login Loginwindows= new Login();
                Loginwindows.setVisible(true);
                // dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error, Datos Incorrectos");
        }


    }//GEN-LAST:event_LoginActionPerformed

    private void SingUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingUpActionPerformed

    }//GEN-LAST:event_SingUpActionPerformed

    private void showPassJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassJCheckBoxActionPerformed
        if(showPassJCheckBox.isSelected()){
            JPasswordField.setEchoChar((char)0);
        }else{
            JPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassJCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailJTextField;
    private javax.swing.JLabel EmailText;
    private javax.swing.JPasswordField JPasswordField;
    private java.awt.Button Login;
    private javax.swing.JLabel PasswordText;
    private java.awt.Button SingUp;
    private java.awt.Button SingUp1;
    private javax.swing.JLabel SingUpText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox showPassJCheckBox;
    // End of variables declaration//GEN-END:variables
}
