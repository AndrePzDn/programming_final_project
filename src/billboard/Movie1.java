
package billboard;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

import Windows.billboard;
import movies.Movie;
import movies.MovieManager;
import movies.ScoreManager;

public class Movie1 extends javax.swing.JDialog {
    public int score;
    public Movie1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Background = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        TitleCineText = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        TitleMovie = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        Duration = new javax.swing.JLabel();
        Premier = new javax.swing.JLabel();
        Synopsis = new javax.swing.JLabel();
        CommentText = new javax.swing.JLabel();
        CommentTextField = new javax.swing.JTextField();
        CommentButton = new javax.swing.JButton();
        CommentsShowText = new javax.swing.JLabel();
        ScoreText = new javax.swing.JLabel();
        ScoreTextField = new javax.swing.JTextField();
        ScoreShowText = new javax.swing.JLabel();
        ScoreButton = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        ImageUser = new javax.swing.JLabel();
        User = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(1300, 1400));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(1300, 120));

        TitleCineText.setFont(new java.awt.Font("Elephant", 3, 50)); // NOI18N
        TitleCineText.setForeground(new java.awt.Color(255, 255, 255));
        TitleCineText.setText("Cine Code Crow");
        TitleCineText.setToolTipText("");

        Exit.setBackground(new java.awt.Color(51, 51, 255));
        Exit.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Cerrar");
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
                .addGap(36, 36, 36)
                .addComponent(TitleCineText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 688, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleCineText, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TitleMovie.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        TitleMovie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Genre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Duration.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Premier.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Synopsis.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Synopsis.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CommentText.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        CommentText.setText("Agregar un Comentario:");

        CommentTextField.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        CommentButton.setBackground(new java.awt.Color(255, 0, 0));
        CommentButton.setForeground(new java.awt.Color(255, 255, 255));
        CommentButton.setText("Comentar");
        CommentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentButtonActionPerformed(evt);
            }
        });

        CommentsShowText.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CommentsShowText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ScoreText.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ScoreText.setText("Agrege una Puntuacion (1-100):");

        ScoreTextField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ScoreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreTextFieldActionPerformed(evt);
            }
        });

        ScoreShowText.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        ScoreButton.setBackground(new java.awt.Color(255, 0, 0));
        ScoreButton.setForeground(new java.awt.Color(255, 255, 255));
        ScoreButton.setText("Puntuar");
        ScoreButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreButtonActionPerformed(evt);
            }
        });

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User321.png"))); // NOI18N
        ImageUser.setAlignmentY(0.3F);

        User.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CommentText)
                            .addComponent(CommentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommentsShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(265, 265, 265))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreText)
                    .addComponent(ScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(ScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(ImageUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Duration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(Premier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Synopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(TitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageUser)
                    .addComponent(User))
                .addGap(2, 2, 2)
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(CommentText)
                                .addGap(18, 18, 18)
                                .addComponent(CommentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(ScoreText)
                                .addGap(18, 18, 18)
                                .addComponent(ScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGap(5, 5, 5)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CommentsShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Premier, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Synopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(Background);

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

    private void ScoreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreTextFieldActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void ScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreButtonActionPerformed
        try {
            String ranking = ScoreTextField.getText();
            int rankingInt = Integer.parseInt(ranking);
            this.score=rankingInt;
            ScoreManager sopademacaco= new ScoreManager();
            MovieManager zzz= new MovieManager();
            int asd = Windows.billboard.idMovie;
            Movie mov1=zzz.readMovie(asd);
            sopademacaco.createScore(rankingInt,mov1.getName());
            if(rankingInt >= 1 && rankingInt <= 100){
                ScoreShowText.setText("<html><p style=\\\"width:384px\\\">Muchas gracias usted le dio a la pelicula: "+ranking+" puntos</p></html>");
            }else{
                JOptionPane.showMessageDialog(null, "Error, por favor introduzca un valor entre 1 y 100");
            }
        }catch(HeadlessException | NumberFormatException e){
            System.out.print("Error, Indroducir solo numeros");
        }
    }//GEN-LAST:event_ScoreButtonActionPerformed

    private void CommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentButtonActionPerformed
        String coment = CommentTextField.getText();
        CommentsShowText.setText("<html><p style=\"width:384px\">"+coment+"</p></html>");
        
    }//GEN-LAST:event_CommentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CommentButton;
    private javax.swing.JLabel CommentText;
    private javax.swing.JTextField CommentTextField;
    private javax.swing.JLabel CommentsShowText;
    public javax.swing.JLabel Duration;
    private javax.swing.JButton Exit;
    public javax.swing.JLabel Genre;
    public javax.swing.JLabel Image;
    private javax.swing.JLabel ImageUser;
    public javax.swing.JLabel Premier;
    private javax.swing.JButton ScoreButton;
    private javax.swing.JLabel ScoreShowText;
    private javax.swing.JLabel ScoreText;
    private javax.swing.JTextField ScoreTextField;
    public javax.swing.JLabel Synopsis;
    private javax.swing.JLabel TitleCineText;
    public javax.swing.JLabel TitleMovie;
    private javax.swing.JLabel User;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
