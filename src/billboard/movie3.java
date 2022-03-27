
package billboard;

public class Movie3 extends javax.swing.JDialog {


    public Movie3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        TitleCineText = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        TitleMovie = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        Duration = new javax.swing.JLabel();
        Premier = new javax.swing.JLabel();
        Synopsis = new javax.swing.JLabel();
        ScoreText = new javax.swing.JLabel();
        CommentTextField = new javax.swing.JTextField();
        Score = new javax.swing.JButton();
        CommentText = new javax.swing.JLabel();
        ScoreTextField = new javax.swing.JTextField();
        Comment = new javax.swing.JButton();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(1300, 140));

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
                .addComponent(TitleCineText, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TitleMovie.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        TitleMovie.setText("                 Titulo");
        TitleMovie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Genre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Genre.setText("Genero:");

        Duration.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Duration.setText("Duracion:");

        Premier.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Premier.setText("Estreno:");

        Synopsis.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Synopsis.setText("Sinopsis:");

        ScoreText.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ScoreText.setText("Agrege una Puntuacion (1-100):");

        Score.setBackground(new java.awt.Color(255, 0, 0));
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("Puntuar:");
        Score.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CommentText.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        CommentText.setText("Agregar un Comentario:");

        ScoreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreTextFieldActionPerformed(evt);
            }
        });

        Comment.setBackground(new java.awt.Color(255, 0, 0));
        Comment.setForeground(new java.awt.Color(255, 255, 255));
        Comment.setText("Comentar");
        Comment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelicula (3).jpg"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Image)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Duration)
                            .addComponent(Genre)
                            .addComponent(Premier)
                            .addComponent(Synopsis)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CommentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CommentText)))))
                                .addGap(73, 73, 73)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ScoreText))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitleMovie)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Genre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Premier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Synopsis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CommentText)
                            .addComponent(ScoreText))
                        .addGap(29, 29, 29)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(410, 410, 410))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Image)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScoreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreTextFieldActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Comment;
    private javax.swing.JLabel CommentText;
    private javax.swing.JTextField CommentTextField;
    private javax.swing.JLabel Duration;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Genre;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Premier;
    private javax.swing.JButton Score;
    private javax.swing.JLabel ScoreText;
    private javax.swing.JTextField ScoreTextField;
    private javax.swing.JLabel Synopsis;
    private javax.swing.JLabel TitleCineText;
    private javax.swing.JLabel TitleMovie;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
}
