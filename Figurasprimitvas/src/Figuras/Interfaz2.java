
package Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Interfaz2 extends javax.swing.JFrame {
    int giro = 0, forma = 0;
    int escaladoX = 0, escaladoY = 0;
    int X = 0, Y = 0, X2 = 0, Y2 = 0, opc = 0, Colores1 = 0, ColorLi = 0;
    int XCir = 0, YCir = 0, AnchoCir = 0, AltoCir = 0, ColorCir = 0;
    int XCua = 0, YCua = 0, AnchoCua = 0, AltoCua = 0, ColorCua = 0;
    int XRec = 0, YRec = 0, AnchoRec = 0, AltoRec = 0, ColorRec = 0;
    int XTri = 0, YTri = 0, AnchoTri = 0, AltoTri = 0, ColorTri = 0;
    int XRom = 0, YRom = 0, AnchoRom = 0, AltoRom = 0, ColorRom = 0;
    ArrayList<Linea> ListaLinea = null;
    ArrayList<Circulo> ListaCirculos = null;
    ArrayList<Cuadrado> ListaCuadrados = null;
    ArrayList<Rombo> listaRombos = null;
    ArrayList<Triangulo> ListaTriangulos = null;

    public Interfaz2() {

        initComponents();
    }

    /**
     * .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorX = new javax.swing.JTextField();
        txtCorY = new javax.swing.JTextField();
        txtCor2x = new javax.swing.JTextField();
        txtCor2y = new javax.swing.JTextField();
        Colores = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        figuras = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtCorX.setToolTipText("");
        txtCorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorXActionPerformed(evt);
            }
        });

        txtCorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorYActionPerformed(evt);
            }
        });

        txtCor2x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCor2xActionPerformed(evt);
            }
        });

        Colores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores", "Rojo", "Verde", "Azul", "Rosado", "Negro" }));
        Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Rotar");

        jCheckBox1.setText("Uniforme");

        jLabel2.setText("X=");

        jLabel3.setText("Y=");

        jLabel4.setText("Ancho=");

        jLabel5.setText("Altura=");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        figuras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "figuras", "linea", "triangulo", "cuadrilatero re", "circulo" }));
        figuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figurasActionPerformed(evt);
            }
        });

        jLabel6.setText("Escala v");

        jLabel7.setText("Escala h");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor2x, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCor2x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void figurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figurasActionPerformed
        // TODO add your handling code here:
        int forma = figuras.getSelectedIndex();
        Cargar(forma);
        
    }//GEN-LAST:event_figurasActionPerformed

    private void txtCorYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorYActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorYActionPerformed

    private void txtCorXActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorXActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorXActionPerformed

    private void txtCor2xActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCor2xActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCor2xActionPerformed





    private void ColoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ColoresActionPerformed
        Colores1 = Colores.getSelectedIndex();
    }// GEN-LAST:event_ColoresActionPerformed

    
    public void Cargar(int forma){ //Carga los valores de la Tabla
if (forma==1){
//realiza una linea
        X = Integer.parseInt(txtCorX.getText());
        Y = Integer.parseInt(txtCorY.getText());
        // txtCor2x
        X2 = Integer.parseInt(txtCor2x.getText());
        Y2 = Integer.parseInt(txtCor2y.getText());
        opc = 1;
} else if (forma==2){
    //realiza un tranulo
        XTri = Integer.parseInt(txtCorX.getText());
        YTri = Integer.parseInt(txtCorY.getText());
        AnchoTri = Integer.parseInt(txtCor2x.getText());
        AltoTri = Integer.parseInt(txtCor2y.getText());
        opc = 2;
}else if (forma==3){
    //realiza un cuadrado
    
        XCua = Integer.parseInt(txtCorX.getText());
        YCua = Integer.parseInt(txtCorX.getText());
        AnchoCua = Integer.parseInt(txtCor2x.getText());
        AltoCua = Integer.parseInt(txtCor2y.getText());
        opc = 3;
}else if (forma==4){
        //realiza un circulo
        XCir = Integer.parseInt(txtCorX.getText());
        YCir = Integer.parseInt(txtCorY.getText());
        AnchoCir = Integer.parseInt(txtCor2x.getText());
        AltoCir = Integer.parseInt(txtCor2y.getText());
        opc = 4;
}

}
    
    
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        switch (opc) {
            case 1:// linea
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.drawLine(X, Y, X2, Y2);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() < 10) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                break;
            case 2:// trianulo
               g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja el triangulo relleno y que pueda tomar los valores AnchoTri y
                // AltoTri
                g.fillPolygon(new int[] { XTri, XTri + AnchoTri, XTri + AnchoTri / 2 },
                        new int[] { YTri, YTri, YTri + AltoTri }, 3);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {// rotacion

                    @Override
                    public void stateChanged(ChangeEvent e) {// esta parte es para que se pueda girar el triangulo
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                break;
            case 3:// cuadrado
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillRect(XCua, YCua, AnchoCua, AltoCua);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    X = -10;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -10;
                    repaint();
                }
                break;
            case 4:// Circulo
               g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillOval(XCir, YCir, AnchoCir, AltoCir);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos el cuadrado en 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener el origen X
                    X = -10;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -10;
                    repaint();
                }
                break;

            case 5:// rombo
                
 g2d.scale(escaladoX, escaladoY);
                g2d.translate(X, Y);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja relleno, XRom y YRom son las coordenadas del centro del rombo
                g2d.fillPolygon(new int[] { XRom, XRom + 10, XRom, XRom - 10 },
                        new int[] { YRom - 10, YRom, YRom + 10, YRom },
                        4);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null) {// si el valor del spinner no es
                                                   // nulo se asigna a la variable
                                                   // escaladoX y se duplica el
                                                   // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                break;
        }
        repaint();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Colores;
    private javax.swing.JComboBox<String> figuras;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    public static javax.swing.JTextField txtCor2x;
    public static javax.swing.JTextField txtCor2y;
    public static javax.swing.JTextField txtCorX;
    public static javax.swing.JTextField txtCorY;
    // End of variables declaration//GEN-END:variables
}
