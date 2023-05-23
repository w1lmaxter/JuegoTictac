package JuegoTictac;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//se agrega comentario en git hub
public class JuegoTictac extends javax.swing.JFrame {

    private String IniciarJuego = "x";
    private int contadorx = 0;
    private int contadoro = 0;
    boolean p1 = false, p2 = false, p3 = false, p4 = false, p5 = false, p6 = false, p7 = false, p8 = false, p9 = false;
    public boolean estado = true;
    private static String[] matriz = new String[9];

    public JuegoTictac() {
        initComponents();
    }

    private void puntuacion() {
        Jugadorx.setText(String.valueOf(contadorx));
        Jugadoro.setText(String.valueOf(contadoro));
    }

    private void cambiar_jugador() {
        if (IniciarJuego.equalsIgnoreCase("x")) {//ignora si son mayusculas o miniusculas
            IniciarJuego = "o";
        } else {
            IniciarJuego = "x";
        }

    }

    private void Ganador() {
        String b1 = Boton1.getText();
        String b2 = Boton2.getText();
        String b3 = Boton3.getText();
        String b4 = Boton4.getText();
        String b5 = Boton5.getText();
        String b6 = Boton6.getText();
        String b7 = Boton7.getText();
        String b8 = Boton8.getText();
        String b9 = Boton9.getText();
        if (b1 == "x" && b2 == "x" && b3 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton1.setBackground(Color.orange);
            Boton2.setBackground(Color.orange);
            Boton3.setBackground(Color.orange);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b3 == "x" && b5 == "x" && b7 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton3.setBackground(Color.orange);
            Boton5.setBackground(Color.orange);
            Boton7.setBackground(Color.orange);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b4 == "x" && b5 == "x" && b6 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton4.setBackground(Color.CYAN);
            Boton5.setBackground(Color.CYAN);
            Boton6.setBackground(Color.CYAN);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b7 == "x" && b8 == "x" && b9 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton7.setBackground(Color.green);
            Boton8.setBackground(Color.green);
            Boton9.setBackground(Color.green);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b1 == "x" && b5 == "x" && b9 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton1.setBackground(Color.pink);
            Boton5.setBackground(Color.pink);
            Boton9.setBackground(Color.pink);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b1 == "x" && b4 == "x" && b7 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton1.setBackground(Color.blue);
            Boton4.setBackground(Color.blue);
            Boton7.setBackground(Color.blue);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b2 == "x" && b5 == "x" && b8 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton2.setBackground(Color.yellow);
            Boton5.setBackground(Color.yellow);
            Boton8.setBackground(Color.yellow);
            estado = false;
            contadorx++;
            puntuacion();

        }
        if (b3 == "x" && b6 == "x" && b9 == "x") {
            JOptionPane.showMessageDialog(null, "Jugador X Gana");
            Boton3.setBackground(Color.pink);
            Boton6.setBackground(Color.pink);
            Boton9.setBackground(Color.pink);
            estado = false;
            contadorx++;
            puntuacion();

        }
      
        //cuando gana o
         if (b1 == "o" && b2 == "o" && b3 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton1.setBackground(Color.orange);
            Boton2.setBackground(Color.orange);
            Boton3.setBackground(Color.orange);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b3 == "o" && b5 == "o" && b7 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton3.setBackground(Color.orange);
            Boton5.setBackground(Color.orange);
            Boton7.setBackground(Color.orange);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b4 == "o" && b5 == "o" && b6 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton4.setBackground(Color.CYAN);
            Boton5.setBackground(Color.CYAN);
            Boton6.setBackground(Color.CYAN);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b7 == "o" && b8 == "o" && b9 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton7.setBackground(Color.green);
            Boton8.setBackground(Color.green);
            Boton9.setBackground(Color.green);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b1 == "o" && b5 == "o" && b9 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton1.setBackground(Color.pink);
            Boton5.setBackground(Color.pink);
            Boton9.setBackground(Color.pink);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b1 == "o" && b4 == "o" && b7 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton1.setBackground(Color.blue);
            Boton4.setBackground(Color.blue);
            Boton7.setBackground(Color.blue);
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b2 == "o" && b5 == "o" && b8 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton2.setBackground(Color.yellow);
            Boton5.setBackground(Color.yellow);
            Boton8.setBackground(Color.yellow); 
            estado = false;
            contadoro++;
            puntuacion();

        }
        if (b3 == "o" && b6 == "o" && b9 == "o") {
            JOptionPane.showMessageDialog(null, "Jugador O Gana");
            Boton3.setBackground(Color.pink);
            Boton6.setBackground(Color.pink);
            Boton9.setBackground(Color.pink);
            estado = false;
            contadoro++;
            puntuacion();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jugadoro = new javax.swing.JLabel();
        Jugadorx = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Buttonsalir = new javax.swing.JButton();
        BotonJuegoNuevo = new javax.swing.JButton();
        Botonreinicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jugador O:");
        jLabel1.setOpaque(true);
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 100));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Jugador X:");
        jLabel2.setOpaque(true);
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 100));

        Jugadoro.setBackground(new java.awt.Color(204, 204, 204));
        Jugadoro.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Jugadoro.setForeground(new java.awt.Color(0, 0, 0));
        Jugadoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugadoro.setText("0");
        Jugadoro.setOpaque(true);
        jPanel5.add(Jugadoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 260, 100));

        Jugadorx.setBackground(new java.awt.Color(204, 204, 204));
        Jugadorx.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Jugadorx.setForeground(new java.awt.Color(0, 0, 0));
        Jugadorx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugadorx.setText("0");
        Jugadorx.setOpaque(true);
        jPanel5.add(Jugadorx, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 260, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 230));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonsalir.setBackground(new java.awt.Color(204, 204, 204));
        Buttonsalir.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Buttonsalir.setForeground(new java.awt.Color(0, 0, 0));
        Buttonsalir.setText("SALIR");
        Buttonsalir.setMaximumSize(new java.awt.Dimension(200, 158));
        Buttonsalir.setMinimumSize(new java.awt.Dimension(200, 158));
        Buttonsalir.setPreferredSize(new java.awt.Dimension(200, 158));
        Buttonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsalirActionPerformed(evt);
            }
        });
        jPanel6.add(Buttonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 210, 140));

        BotonJuegoNuevo.setBackground(new java.awt.Color(204, 204, 204));
        BotonJuegoNuevo.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        BotonJuegoNuevo.setForeground(new java.awt.Color(0, 0, 0));
        BotonJuegoNuevo.setText("JUEGO NUEVO");
        BotonJuegoNuevo.setMaximumSize(new java.awt.Dimension(200, 158));
        BotonJuegoNuevo.setMinimumSize(new java.awt.Dimension(200, 158));
        BotonJuegoNuevo.setPreferredSize(new java.awt.Dimension(200, 158));
        BotonJuegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoNuevoActionPerformed(evt);
            }
        });
        jPanel6.add(BotonJuegoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 140));

        Botonreinicio.setBackground(new java.awt.Color(204, 204, 204));
        Botonreinicio.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Botonreinicio.setForeground(new java.awt.Color(0, 0, 0));
        Botonreinicio.setText("REINICIAR");
        Botonreinicio.setMaximumSize(new java.awt.Dimension(200, 158));
        Botonreinicio.setMinimumSize(new java.awt.Dimension(200, 158));
        Botonreinicio.setPreferredSize(new java.awt.Dimension(200, 158));
        Botonreinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonreinicioActionPerformed(evt);
            }
        });
        jPanel6.add(Botonreinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 320, 140));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 560, 310));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 600, 590));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 168, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 520, 220));

        Boton3.setBackground(new java.awt.Color(204, 204, 204));
        Boton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton3.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton3.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton3.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 180, 190));

        Boton2.setBackground(new java.awt.Color(204, 204, 204));
        Boton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton2.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton2.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton2.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, 190));

        Boton4.setBackground(new java.awt.Color(204, 204, 204));
        Boton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton4.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton4.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton4.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 190));

        Boton5.setBackground(new java.awt.Color(204, 204, 204));
        Boton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton5.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton5.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton5.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 190));

        Boton6.setBackground(new java.awt.Color(204, 204, 204));
        Boton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton6.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton6.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton6.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 180, 190));

        Boton7.setBackground(new java.awt.Color(204, 204, 204));
        Boton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton7.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton7.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton7.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 180, 180));

        Boton8.setBackground(new java.awt.Color(204, 204, 204));
        Boton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton8.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton8.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton8.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 180, 180));

        Boton9.setBackground(new java.awt.Color(204, 204, 204));
        Boton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton9.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton9.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton9.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 180, 180));

        Boton1.setBackground(new java.awt.Color(204, 204, 204));
        Boton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Boton1.setMaximumSize(new java.awt.Dimension(200, 158));
        Boton1.setMinimumSize(new java.awt.Dimension(200, 158));
        Boton1.setPreferredSize(new java.awt.Dimension(200, 158));
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        jPanel4.add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 190));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 580, 600));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tic Tac Game ");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1150, 90));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1170, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private JFrame frame;
    private void ButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsalirActionPerformed
        frame = new JFrame("Salir");
        if (JOptionPane.showConfirmDialog(frame, "Salir del Juego? ", "",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
    }//GEN-LAST:event_ButtonsalirActionPerformed

    private void BotonreinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonreinicioActionPerformed
        //TODOS LOS VALORES VUELVEN A CERO EXCEPTO EL CONTADOR DE PARTIDAS GANADAS
        Boton1.setEnabled(true);
        Boton2.setEnabled(true);
        Boton3.setEnabled(true);
        Boton4.setEnabled(true);
        Boton5.setEnabled(true);
        Boton6.setEnabled(true);
        Boton7.setEnabled(true);
        Boton8.setEnabled(true);
        Boton9.setEnabled(true);

        Boton1.setText("");
        Boton2.setText("");
        Boton3.setText("");
        Boton4.setText("");
        Boton5.setText("");
        Boton6.setText("");
        Boton7.setText("");
        Boton8.setText("");
        Boton9.setText("");

        Boton1.setBackground(Color.LIGHT_GRAY);
        Boton2.setBackground(Color.LIGHT_GRAY);
        Boton3.setBackground(Color.LIGHT_GRAY);
        Boton4.setBackground(Color.LIGHT_GRAY);
        Boton5.setBackground(Color.LIGHT_GRAY);
        Boton6.setBackground(Color.LIGHT_GRAY);
        Boton7.setBackground(Color.LIGHT_GRAY);
        Boton8.setBackground(Color.LIGHT_GRAY);
        Boton9.setBackground(Color.LIGHT_GRAY);
        estado = true;
        p1 = false;
        p2 = false;
        p3 = false;
        p4 = false;
        p5 = false;
        p6 = false;
        p7 = false;
        p8 = false;
        p9 = false;

    }//GEN-LAST:event_BotonreinicioActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        if (estado == true && p6 == false) {
            Boton6.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p6 = true;
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed

        if (estado == true && p2 == false) {
            Boton2.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p2 = true;
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        if (estado == true && p5 == false) {
            Boton5.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p5 = true;
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        if (estado == true && p1 == false) {
            Boton1.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p1 = true;
    }//GEN-LAST:event_Boton1ActionPerformed

    private void BotonJuegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoNuevoActionPerformed
        //TODOS LOS VALORES VUELVEN A CERO
        Boton1.setEnabled(true);
        Boton2.setEnabled(true);
        Boton3.setEnabled(true);
        Boton4.setEnabled(true);
        Boton5.setEnabled(true);
        Boton6.setEnabled(true);
        Boton7.setEnabled(true);
        Boton8.setEnabled(true);
        Boton9.setEnabled(true);

        Jugadorx.setText("0");
        Jugadoro.setText("0");

        Boton1.setText("");
        Boton2.setText("");
        Boton3.setText("");
        Boton4.setText("");
        Boton5.setText("");
        Boton6.setText("");
        Boton7.setText("");
        Boton8.setText("");
        Boton9.setText("");

        Boton1.setBackground(Color.LIGHT_GRAY);
        Boton2.setBackground(Color.LIGHT_GRAY);
        Boton3.setBackground(Color.LIGHT_GRAY);
        Boton4.setBackground(Color.LIGHT_GRAY);
        Boton5.setBackground(Color.LIGHT_GRAY);
        Boton6.setBackground(Color.LIGHT_GRAY);
        Boton7.setBackground(Color.LIGHT_GRAY);
        Boton8.setBackground(Color.LIGHT_GRAY);
        Boton9.setBackground(Color.LIGHT_GRAY);
        contadorx = 0;
        contadoro = 0;
        estado = true;
        p1 = false;
        p2 = false;
        p3 = false;
        p4 = false;
        p5 = false;
        p6 = false;
        p7 = false;
        p8 = false;
        p9 = false;

    }//GEN-LAST:event_BotonJuegoNuevoActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        if (estado == true && p3 == false) {
            Boton3.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p3 = true;
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        if (estado == true && p7 == false) {
            Boton7.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p7 = true;
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        if (estado == true && p8 == false) {
            Boton8.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p8 = true;
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        if (estado == true && p9 == false) {
            Boton9.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p9 = true;
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        if (estado == true && p4 == false) {
            Boton4.setText(IniciarJuego);
            cambiar_jugador();
            Ganador();
        }
        p4 = true;
    }//GEN-LAST:event_Boton4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoTictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoTictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoTictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoTictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoTictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonJuegoNuevo;
    private javax.swing.JButton Botonreinicio;
    private javax.swing.JButton Buttonsalir;
    private javax.swing.JLabel Jugadoro;
    private javax.swing.JLabel Jugadorx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
