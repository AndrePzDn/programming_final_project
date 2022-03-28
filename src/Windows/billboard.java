
package Windows;

import billboard.Movie1;
import movies.Movie;
import movies.MovieManager;
import javax.swing.ImageIcon;

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
        ExitJButton = new javax.swing.JButton();
        Movie1 = new javax.swing.JButton();
        Movie2 = new javax.swing.JButton();
        Movie3 = new javax.swing.JButton();
        Movie4 = new javax.swing.JButton();
        Movie5 = new javax.swing.JButton();
        Movie6 = new javax.swing.JButton();
        Movie7 = new javax.swing.JButton();
        Movie8 = new javax.swing.JButton();
        Movie9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 1100));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1300, 1100));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1298, 1630));

        jPanelTitle.setBackground(new java.awt.Color(51, 51, 255));
        jPanelTitle.setPreferredSize(new java.awt.Dimension(534, 120));

        billboardText.setFont(new java.awt.Font("Elephant", 1, 50)); // NOI18N
        billboardText.setForeground(new java.awt.Color(255, 255, 255));
        billboardText.setText("Cartelera");

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

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(billboardText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billboardText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Movie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Movie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Movie8, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie2)
                    .addComponent(Movie5)
                    .addComponent(Movie9, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie3)
                    .addComponent(Movie6))
                .addGap(151, 151, 151))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie1)
                    .addComponent(Movie2)
                    .addComponent(Movie3))
                .addGap(88, 88, 88)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Movie5)
                    .addComponent(Movie4)
                    .addComponent(Movie6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie9, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movie8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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

    private void ExitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitJButtonActionPerformed
        dispose();
    }//GEN-LAST:event_ExitJButtonActionPerformed

    private void Movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie1ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("Pacto con el diablo");
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
    }//GEN-LAST:event_Movie1ActionPerformed

    private void Movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie2ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("La llamada final");
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
    }//GEN-LAST:event_Movie2ActionPerformed

    private void Movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie3ActionPerformed
        try {
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
        }catch(Exception e){
            System.out.print("Error, No se encotro la direccion de la imagen");
        }
    }//GEN-LAST:event_Movie3ActionPerformed

    private void Movie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie4ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("Spider-Man No way home");
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
    }//GEN-LAST:event_Movie4ActionPerformed

    private void Movie5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie5ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("Sword art online - Movie");
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
    }//GEN-LAST:event_Movie5ActionPerformed

    private void Movie6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie6ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("Uncharted");
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
    }//GEN-LAST:event_Movie6ActionPerformed

    private void Movie7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie7ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("");
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
    }//GEN-LAST:event_Movie7ActionPerformed

    private void Movie8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie8ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("");
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
    }//GEN-LAST:event_Movie8ActionPerformed

    private void Movie9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movie9ActionPerformed
        try {
        Movie1 movie = new Movie1(this,true);
        MovieManager movieManager = new MovieManager();
        Movie movie1 = movieManager.readMovie("");
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
    }//GEN-LAST:event_Movie9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitJButton;
    private javax.swing.JButton Movie1;
    private javax.swing.JButton Movie2;
    private javax.swing.JButton Movie3;
    private javax.swing.JButton Movie4;
    private javax.swing.JButton Movie5;
    private javax.swing.JButton Movie6;
    private javax.swing.JButton Movie7;
    private javax.swing.JButton Movie8;
    private javax.swing.JButton Movie9;
    private javax.swing.JPanel background;
    private javax.swing.JLabel billboardText;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
