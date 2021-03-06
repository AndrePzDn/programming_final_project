
package Windows;

import billboard.Movie1;
import movies.Movie;
import movies.MovieManager;
import movies.ScoreManager;
import users.BasicFunctionOfUsers;

import javax.swing.ImageIcon;


public class Ranking extends javax.swing.JFrame {


    public Ranking() {
        initComponents();
        this.setLocationRelativeTo(null);
        BasicFunctionOfUsers b = new BasicFunctionOfUsers();
        String nickname = b.getNickNameOfUserLogged();
        User.setText(nickname);
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
        CommentsShowText = new javax.swing.JLabel();
        CommentsShowText1 = new javax.swing.JLabel();
        CommentsShowText2 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        ImageUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(1300, 1230));

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

        CommentsShowText.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CommentsShowText.setText("<html><p style=\"width:384px\">Puntuada con: 72 Es la mejor Secula imprecionando a medida que se va construyendo la trama, momentos dramaticos, perspectivas cambiantes</p></html>");
        CommentsShowText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CommentsShowText1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CommentsShowText1.setText("<html><p style=\"width:384px\">Puntuada con: 93 'Spider-Man: No Way Home' mola. saber equilibrar el espect???culo para fans con un arco narrativo que permita seguir creciendo a su protagonista no era tan sencillo. Y lo consigue ofreciendo un grand???simo entretenimiento que deja claro que el Universo Marvel todav???a puede ofrecernos cosas muy estimulantes.</p></html>");
        CommentsShowText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CommentsShowText2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CommentsShowText2.setText("<html><p style=\"width:384px\">Puntuada con: 79 Lo mejor que tiene este largometraje de 105 minutos sin dudas es el mensaje que sobrevuela durante todo el tiempo y es el de la oposici???n constante al maltrato animal, lo que lleva a que los protagonistas tomen un rol decisivo con tal de que King, en este caso, llegue a su hogar para no estar en las manos equivocadas. En el fondo tambi???n es notable el sentimiento de la p???rdida por parte de In???s, principalmente, quien ha atravesado por un gran dolor junto a su hermano y es lo que al final puede desencadenar algunas l???grimas entre los espectadores</p></html>");
        CommentsShowText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        User.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User321.png"))); // NOI18N
        ImageUser.setAlignmentY(0.3F);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(ScoreText1)
                .addGap(252, 252, 252)
                .addComponent(ScoreText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScoreText3)
                .addGap(188, 188, 188))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Movie1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Movie2)
                .addGap(104, 104, 104)
                .addComponent(Movie3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(CommentsShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(CommentsShowText2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CommentsShowText1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(ImageUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User)
                        .addGap(50, 50, 50))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageUser)
                    .addComponent(User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2)
                    .addComponent(Movie1)
                    .addComponent(Movie3))
                .addGap(31, 31, 31)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreText1)
                    .addComponent(ScoreText2)
                    .addComponent(ScoreText3))
                .addGap(34, 34, 34)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommentsShowText1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CommentsShowText2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CommentsShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
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
        Movie movie1 = movieManager.readMovie(2);
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
        Movie movie1 = movieManager.readMovie(3);
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
        Movie movie1 = movieManager.readMovie(4);
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
    private javax.swing.JLabel CommentsShowText;
    private javax.swing.JLabel CommentsShowText1;
    private javax.swing.JLabel CommentsShowText2;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ImageUser;
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie2;
    private javax.swing.JButton Movie3;
    private javax.swing.JLabel ScoreText1;
    private javax.swing.JLabel ScoreText2;
    private javax.swing.JLabel ScoreText3;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel User;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
