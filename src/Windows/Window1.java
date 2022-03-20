
package Windows;


public class Window1 extends javax.swing.JFrame {

    public Window1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label3 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        billboard = new java.awt.Button();
        Comment = new java.awt.Button();
        Ranking = new java.awt.Button();
        Puntos = new java.awt.Button();
        SingUp = new java.awt.Button();
        Login = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();

        label3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 51, 51));
        label3.setText("Cartelera");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        billboard.setActionCommand("Cartelera");
        billboard.setBackground(new java.awt.Color(0, 0, 255));
        billboard.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        billboard.setForeground(new java.awt.Color(255, 255, 255));
        billboard.setLabel("Cartelera");
        billboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billboardActionPerformed(evt);
            }
        });

        Comment.setActionCommand("Cartelera");
        Comment.setBackground(new java.awt.Color(0, 0, 255));
        Comment.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Comment.setForeground(new java.awt.Color(255, 255, 255));
        Comment.setLabel("Comentar");
        Comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentActionPerformed(evt);
            }
        });

        Ranking.setActionCommand("Cartelera");
        Ranking.setBackground(new java.awt.Color(0, 0, 255));
        Ranking.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Ranking.setForeground(new java.awt.Color(255, 255, 255));
        Ranking.setLabel("Ranking");
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        Puntos.setActionCommand("Cartelera");
        Puntos.setBackground(new java.awt.Color(0, 0, 255));
        Puntos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Puntos.setForeground(new java.awt.Color(255, 255, 255));
        Puntos.setLabel("Puntos");
        Puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(billboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        billboard.getAccessibleContext().setAccessibleDescription("");
        billboard.getAccessibleContext().setAccessibleParent(this);

        SingUp.setActionCommand("Cartelera");
        SingUp.setBackground(new java.awt.Color(255, 255, 255));
        SingUp.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        SingUp.setLabel("Registrarse");
        SingUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingUpActionPerformed(evt);
            }
        });

        Login.setActionCommand("Cartelera");
        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        Login.setLabel("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("¿Que veremos hoy?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SingUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SingUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
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

    private void SingUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingUpActionPerformed
        singUp WindowSingUp = new singUp();
        WindowSingUp.setVisible(true);
        
    }//GEN-LAST:event_SingUpActionPerformed

    private void billboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billboardActionPerformed
        billboard WindowBillboard = new billboard();      
        WindowBillboard.setVisible(true);
    }//GEN-LAST:event_billboardActionPerformed

    private void CommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentActionPerformed
        billboard Cartelera = new billboard();      
        Cartelera.setVisible(true); 
    }//GEN-LAST:event_CommentActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        Ranking WindowRanking = new Ranking();      
        WindowRanking.setVisible(true);        
    }//GEN-LAST:event_RankingActionPerformed

    private void PuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntosActionPerformed
       Points WindowPoints = new Points();
       WindowPoints.setVisible(true);
    }//GEN-LAST:event_PuntosActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login WindowLogin = new Login();
        WindowLogin.setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Comment;
    private java.awt.Button Login;
    private java.awt.Button Puntos;
    private java.awt.Button Ranking;
    private java.awt.Button SingUp;
    private java.awt.Button billboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
