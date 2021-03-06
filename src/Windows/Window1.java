
package Windows;

import users.BasicFunctionOfUsers;

public class Window1 extends javax.swing.JFrame {

    public Window1() {
        initComponents();
        this.setLocationRelativeTo(null);
        BasicFunctionOfUsers b = new BasicFunctionOfUsers();
        String nickname = b.getNickNameOfUserLogged();
        User.setText(nickname);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Found = new javax.swing.JPanel();
        PanelTitle = new javax.swing.JPanel();
        TitleCineText = new javax.swing.JLabel();
        ExitJButton = new javax.swing.JButton();
        PanelMenu = new javax.swing.JPanel();
        SocialNetworksImage = new javax.swing.JLabel();
        RecomendatiosButton = new javax.swing.JButton();
        BillboardButton = new javax.swing.JButton();
        RewardsButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BillboardTextTitle = new javax.swing.JLabel();
        Movie1Image = new javax.swing.JLabel();
        Movie2Image = new javax.swing.JLabel();
        Movie3Image = new javax.swing.JLabel();
        ImageUser = new javax.swing.JLabel();
        User = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Found.setBackground(new java.awt.Color(255, 255, 255));
        Found.setPreferredSize(new java.awt.Dimension(1300, 1230));
        Found.setRequestFocusEnabled(false);

        PanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        PanelTitle.setPreferredSize(new java.awt.Dimension(300, 100));

        TitleCineText.setFont(new java.awt.Font("Elephant", 3, 50)); // NOI18N
        TitleCineText.setForeground(new java.awt.Color(255, 255, 255));
        TitleCineText.setText("Cine Code Crow");
        TitleCineText.setToolTipText("");

        ExitJButton.setBackground(new java.awt.Color(51, 51, 255));
        ExitJButton.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ExitJButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitJButton.setText("Salir");
        ExitJButton.setBorder(null);
        ExitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTitleLayout = new javax.swing.GroupLayout(PanelTitle);
        PanelTitle.setLayout(PanelTitleLayout);
        PanelTitleLayout.setHorizontalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(TitleCineText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        PanelTitleLayout.setVerticalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGroup(PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitleCineText, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(ExitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelMenu.setBackground(new java.awt.Color(32, 31, 31));
        PanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenu.setAlignmentX(0.0F);
        PanelMenu.setAlignmentY(0.0F);
        PanelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SocialNetworksImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redes sociales cine.png"))); // NOI18N

        RecomendatiosButton.setBackground(new java.awt.Color(32, 31, 31));
        RecomendatiosButton.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        RecomendatiosButton.setForeground(new java.awt.Color(255, 255, 255));
        RecomendatiosButton.setText("Recomendaciones");
        RecomendatiosButton.setBorder(null);
        RecomendatiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecomendatiosButtonActionPerformed(evt);
            }
        });

        BillboardButton.setBackground(new java.awt.Color(32, 31, 31));
        BillboardButton.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        BillboardButton.setForeground(new java.awt.Color(255, 255, 255));
        BillboardButton.setText("Cartelera");
        BillboardButton.setBorder(null);
        BillboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillboardButtonActionPerformed(evt);
            }
        });

        RewardsButton.setBackground(new java.awt.Color(32, 31, 31));
        RewardsButton.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        RewardsButton.setForeground(new java.awt.Color(255, 255, 255));
        RewardsButton.setText("Premios");
        RewardsButton.setBorder(null);
        RewardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RewardsButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(5, 100));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(5, 100));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BillboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(RecomendatiosButton)
                .addGap(49, 49, 49)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(RewardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(SocialNetworksImage, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SocialNetworksImage, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(RecomendatiosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BillboardButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RewardsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BillboardTextTitle.setFont(new java.awt.Font("Bodoni MT Black", 3, 50)); // NOI18N
        BillboardTextTitle.setText("Cartelera");

        Movie1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelicula (6).jpg"))); // NOI18N

        Movie2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelicula (2).jpg"))); // NOI18N

        Movie3Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelicula (4).jpg"))); // NOI18N

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User321.png"))); // NOI18N

        User.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        javax.swing.GroupLayout FoundLayout = new javax.swing.GroupLayout(Found);
        Found.setLayout(FoundLayout);
        FoundLayout.setHorizontalGroup(
            FoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FoundLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(FoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FoundLayout.createSequentialGroup()
                        .addComponent(BillboardTextTitle)
                        .addContainerGap(960, Short.MAX_VALUE))
                    .addGroup(FoundLayout.createSequentialGroup()
                        .addComponent(Movie1Image)
                        .addGap(58, 58, 58)
                        .addComponent(Movie2Image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Movie3Image)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FoundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User)
                .addGap(60, 60, 60))
        );
        FoundLayout.setVerticalGroup(
            FoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoundLayout.createSequentialGroup()
                .addGroup(FoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageUser)
                    .addComponent(User))
                .addGap(1, 1, 1)
                .addComponent(PanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(BillboardTextTitle)
                .addGap(55, 55, 55)
                .addGroup(FoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2Image)
                    .addComponent(Movie1Image)
                    .addComponent(Movie3Image))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Found);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillboardButtonActionPerformed
        billboard billboardMovie = new billboard();
        billboardMovie.setVisible(true);     
    }//GEN-LAST:event_BillboardButtonActionPerformed

    private void RecomendatiosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecomendatiosButtonActionPerformed
        Ranking RankingMovie = new Ranking();
        RankingMovie.setVisible(true);
    }//GEN-LAST:event_RecomendatiosButtonActionPerformed

    private void RewardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RewardsButtonActionPerformed
        Points PointsMovie = new Points();
        PointsMovie.setVisible(true);
    }//GEN-LAST:event_RewardsButtonActionPerformed

    private void ExitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitJButtonActionPerformed
        BasicFunctionOfUsers basicFunctionOfUsers = new BasicFunctionOfUsers();
        basicFunctionOfUsers.logOut();
        System.exit(0);
    }//GEN-LAST:event_ExitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BillboardButton;
    private javax.swing.JLabel BillboardTextTitle;
    private javax.swing.JButton ExitJButton;
    private javax.swing.JPanel Found;
    private javax.swing.JLabel ImageUser;
    private javax.swing.JLabel Movie1Image;
    private javax.swing.JLabel Movie2Image;
    private javax.swing.JLabel Movie3Image;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelTitle;
    private javax.swing.JButton RecomendatiosButton;
    private javax.swing.JButton RewardsButton;
    private javax.swing.JLabel SocialNetworksImage;
    private javax.swing.JLabel TitleCineText;
    private javax.swing.JLabel User;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
