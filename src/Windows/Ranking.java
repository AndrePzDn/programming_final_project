
package Windows;

import billboard.Movie1;
import movies.Movie;
import movies.MovieManager;

import javax.swing.ImageIcon;


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
        ScoreText1 = new javax.swing.JLabel();
        ScoreText2 = new javax.swing.JLabel();
        ScoreText3 = new javax.swing.JLabel();
        Movie1 = new javax.swing.JButton();
        Movie2 = new javax.swing.JButton();
        Movie3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(1300, 1200));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(1300, 120));

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
                .addGap(72, 72, 72)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        ScoreText1.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ScoreText1.setText("Puntuacion");

        ScoreText2.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ScoreText2.setText("Puntuacion");

        ScoreText3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        ScoreText3.setText("Puntuacion");

        Movie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (1).jpg"))); // NOI18N
        Movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie1ActionPerformed(evt);
            }
        });

        Movie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (3).jpg"))); // NOI18N
        Movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie2ActionPerformed(evt);
            }
        });

        Movie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Redimiencionado formato Mediano (4).jpg"))); // NOI18N
        Movie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie3ActionPerformed(evt);
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
                .addGap(124, 124, 124)
                .addComponent(Movie1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Movie2)
                .addGap(104, 104, 104)
                .addComponent(Movie3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(ScoreText1)
                .addGap(252, 252, 252)
                .addComponent(ScoreText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScoreText3)
                .addGap(188, 188, 188))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2)
                    .addComponent(Movie1)
                    .addComponent(Movie3))
                .addGap(31, 31, 31)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreText1)
                    .addComponent(ScoreText2)
                    .addComponent(ScoreText3))
                .addContainerGap(506, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Background);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void Movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie1ActionPerformed
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("King - Regreso a casa");
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        
    }//GEN-LAST:event_Movie1ActionPerformed

    private void Movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie2ActionPerformed
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("King - Regreso a casa");
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
    }//GEN-LAST:event_Movie2ActionPerformed

    private void Movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie3ActionPerformed
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("King - Regreso a casa");
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
    }//GEN-LAST:event_Movie3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie2;
    private javax.swing.JButton Movie3;
    private javax.swing.JLabel ScoreText1;
    private javax.swing.JLabel ScoreText2;
    private javax.swing.JLabel ScoreText3;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
