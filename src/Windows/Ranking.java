
package Windows;

import billboard.Movie1;
import billboard.Movie2;
import billboard.Movie3;
import billboard.Movie4;
import billboard.Movie5;
import billboard.Movie6;


public class Ranking extends javax.swing.JFrame {


    public Ranking() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Background = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Movie1 = new javax.swing.JButton();
        Movie3 = new javax.swing.JButton();
        Movie4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(1300, 140));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Ranking de peliculas");

        Exit.setBackground(new java.awt.Color(51, 51, 255));
        Exit.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Cerrar");
        Exit.setActionCommand("");
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 743, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel2.setText("Puntuacion");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setText("Puntuacion");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setText("Puntuacion");

        Movie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (1).jpg"))); // NOI18N
        Movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie1ActionPerformed(evt);
            }
        });

        Movie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (3).jpg"))); // NOI18N
        Movie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie3ActionPerformed(evt);
            }
        });

        Movie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (4).jpg"))); // NOI18N
        Movie4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addGap(293, 293, 293)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(187, 187, 187))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Movie1)
                .addGap(141, 141, 141)
                .addComponent(Movie3)
                .addGap(104, 104, 104)
                .addComponent(Movie4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Movie4)
                    .addComponent(Movie3)
                    .addComponent(Movie1))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)))
                .addContainerGap(413, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void Movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie1ActionPerformed
        Movie1 Movie = new Movie1(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie1ActionPerformed

    private void Movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie3ActionPerformed
        Movie3 Movie = new Movie3(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie3ActionPerformed

    private void Movie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie4ActionPerformed
        Movie4 Movie = new Movie4(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie3;
    private javax.swing.JButton Movie4;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
