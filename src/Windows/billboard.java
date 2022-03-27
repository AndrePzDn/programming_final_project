
package Windows;

import billboard.Movie1;
import billboard.Movie2;
import billboard.Movie3;
import billboard.Movie4;
import billboard.Movie5;
import billboard.Movie6;

public class billboard extends javax.swing.JFrame {


    public billboard() {
        initComponents();   
        this.setLocationRelativeTo(null);
    }




    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        billboardText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Movie1 = new javax.swing.JButton();
        Movie2 = new javax.swing.JButton();
        Movie3 = new javax.swing.JButton();
        Movie4 = new javax.swing.JButton();
        Movie5 = new javax.swing.JButton();
        Movie6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1300, 1100));

        background.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));

        billboardText.setFont(new java.awt.Font("Elephant", 1, 50)); // NOI18N
        billboardText.setForeground(new java.awt.Color(255, 255, 255));
        billboardText.setText("Cartelera");

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(billboardText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billboardText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        Movie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (1).jpg"))); // NOI18N
        Movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie1ActionPerformed(evt);
            }
        });

        Movie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (2).jpg"))); // NOI18N
        Movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie2ActionPerformed(evt);
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

        Movie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (5).jpg"))); // NOI18N
        Movie5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie5ActionPerformed(evt);
            }
        });

        Movie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (6).jpg"))); // NOI18N
        Movie6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie4)
                    .addComponent(Movie1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2)
                    .addComponent(Movie5))
                .addGap(100, 100, 100)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie3)
                    .addComponent(Movie6))
                .addGap(151, 151, 151))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(Movie1)
                        .addGap(80, 80, 80)
                        .addComponent(Movie4))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Movie2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Movie3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(80, 80, 80)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Movie6)
                            .addComponent(Movie5))))
                .addGap(101, 101, 101))
        );

        jScrollPane1.setViewportView(background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie1ActionPerformed
        Movie1 Movie = new Movie1(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie1ActionPerformed

    private void Movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie2ActionPerformed
        Movie2 Movie = new Movie2(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie2ActionPerformed

    private void Movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie3ActionPerformed
        Movie3 Movie = new Movie3(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie3ActionPerformed

    private void Movie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie4ActionPerformed
        Movie4 Movie = new Movie4(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie4ActionPerformed

    private void Movie5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie5ActionPerformed
        Movie5 Movie = new Movie5(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie5ActionPerformed

    private void Movie6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie6ActionPerformed
        Movie6 Movie = new Movie6(this,true);
        Movie.setVisible(true);
    }//GEN-LAST:event_Movie6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie2;
    private javax.swing.JButton Movie3;
    private javax.swing.JButton Movie4;
    private javax.swing.JButton Movie5;
    private javax.swing.JButton Movie6;
    private javax.swing.JPanel background;
    private javax.swing.JLabel billboardText;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
