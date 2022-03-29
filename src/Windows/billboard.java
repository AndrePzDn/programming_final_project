
package Windows;

import billboard.Movie1;
import movies.Movie;
import movies.MovieManager;
import users.BasicFunctionOfUsers;

import javax.swing.ImageIcon;

public class billboard extends javax.swing.JFrame {


    public billboard() {
        initComponents();   
        this.setLocationRelativeTo(null);
        BasicFunctionOfUsers b = new BasicFunctionOfUsers();
        String nickname = b.getNickNameOfUserLogged();
        MovieManager IconMovie = new MovieManager();
        User.setText(nickname);
        Movie7.setIcon(new ImageIcon(getClass().getResource(IconMovie.getImageDirectory(7))));
        Movie8.setIcon(new ImageIcon(getClass().getResource(IconMovie.getImageDirectory(8))));
        Movie9.setIcon(new ImageIcon(getClass().getResource(IconMovie.getImageDirectory(9))));
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        ExitJButton = new javax.swing.JButton();
        billboardText1 = new javax.swing.JLabel();
        Movie1 = new javax.swing.JButton();
        Movie2 = new javax.swing.JButton();
        Movie3 = new javax.swing.JButton();
        Movie4 = new javax.swing.JButton();
        Movie5 = new javax.swing.JButton();
        Movie6 = new javax.swing.JButton();
        Movie7 = new javax.swing.JButton();
        Movie8 = new javax.swing.JButton();
        Movie9 = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        ImageUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1300, 1100));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1298, 1630));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setAlignmentY(0.2F);
        jPanelTitle.setPreferredSize(new java.awt.Dimension(534, 120));

        ExitJButton.setBackground(new java.awt.Color(51, 51, 255));
        ExitJButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ExitJButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitJButton.setText("Cerrar");
        ExitJButton.setActionCommand("");
        ExitJButton.setBorder(null);
        ExitJButton.setBorderPainted(false);
        ExitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitJButtonActionPerformed(evt);
            }
        });

        billboardText1.setFont(new java.awt.Font("Elephant", 1, 50)); // NOI18N
        billboardText1.setForeground(new java.awt.Color(255, 255, 255));
        billboardText1.setText("Cartelera");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTitleLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(billboardText1)
                    .addContainerGap(912, Short.MAX_VALUE)))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTitleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(billboardText1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addContainerGap()))
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

        Movie7.setBackground(new java.awt.Color(255, 255, 255));
        Movie7.setBorder(null);
        Movie7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie7ActionPerformed(evt);
            }
        });

        Movie8.setBackground(new java.awt.Color(255, 255, 255));
        Movie8.setBorder(null);
        Movie8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie8ActionPerformed(evt);
            }
        });

        Movie9.setBackground(new java.awt.Color(255, 255, 255));
        Movie9.setBorder(null);
        Movie9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movie9ActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        User.setToolTipText("");
        User.setAlignmentY(0.2F);

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User321.png"))); // NOI18N
        ImageUser.setAlignmentY(0.2F);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1274, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User)
                .addGap(50, 50, 50))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(Movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Movie4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Movie7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Movie6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageUser)
                    .addComponent(User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie6, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie9, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ExitJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dispose();
    }                                           

    private void Movie1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
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
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(1);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
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
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
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
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(5);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(6);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        }catch(Exception e  ){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(7);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(8);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true);
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      

    private void Movie9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie(9);
        movie.TitleMovie.setText(movie1.getName());        
        movie.Genre.setText("Genero: "+movie1.getGender());
        movie.Duration.setText("Duracion: "+movie1.getDuration());
        movie.Premier.setText("Estreno: "+movie1.getPremiere());
        movie.Synopsis.setText("<html><p style=\"width:423px\">Sinopsis:"+movie1.getSynopsis()+"</p></html>");
        movie.Image.setIcon(new ImageIcon(getClass().getResource(movie1.getImageDirectory())));
        movie.setVisible(true); 
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }                                      


    // Variables declaration - do not modify                     
    private javax.swing.JButton ExitJButton;
    private javax.swing.JLabel ImageUser;
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie2;
    private javax.swing.JButton Movie3;
    private javax.swing.JButton Movie4;
    private javax.swing.JButton Movie5;
    private javax.swing.JButton Movie6;
    private javax.swing.JButton Movie7;
    private javax.swing.JButton Movie8;
    private javax.swing.JButton Movie9;
    private javax.swing.JLabel User;
    private javax.swing.JPanel background;
    private javax.swing.JLabel billboardText1;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
