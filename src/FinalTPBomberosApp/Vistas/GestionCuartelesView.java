package FinalTPBomberosApp.Vistas;


import FinalTPBomberosApp.AccesoADatos.CuartelData;
import FinalTPBomberosApp.Entidades.Cuartel;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GestionCuartelesView extends javax.swing.JInternalFrame {

    private Cuartel cuartel = new Cuartel();
    private CuartelData cuartelData = new CuartelData();
    private List<Cuartel> listarCuarteles = cuartelData.ListarCuarteles();
    
    public GestionCuartelesView() {
        initComponents();
        JBAgregarCuartel.setEnabled(false);
        JBGuardarModificaciones.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBGuardarModificaciones = new javax.swing.JButton();
        JBAgregarCuartel = new javax.swing.JButton();
        JTFCodigo = new javax.swing.JTextField();
        JTFDireccion = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFCoordX = new javax.swing.JTextField();
        JTFTelefono = new javax.swing.JTextField();
        JTFCorreo = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        JTFCoordY = new javax.swing.JTextField();
        JRBEstado = new javax.swing.JRadioButton();
        JBSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Cuarteles");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Codigo/ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Coordenada X");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Coordenada Y");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Correo");

        JBGuardarModificaciones.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBGuardarModificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBGuardar.jpg"))); // NOI18N
        JBGuardarModificaciones.setText("Guardar Modificaciones");
        JBGuardarModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarModificacionesActionPerformed(evt);
            }
        });

        JBAgregarCuartel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBAgregarCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/agregar-contacto.jpg"))); // NOI18N
        JBAgregarCuartel.setText("Agregar Cuartel");
        JBAgregarCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarCuartelActionPerformed(evt);
            }
        });

        JTFDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFDireccionKeyReleased(evt);
            }
        });

        JTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFNombreKeyReleased(evt);
            }
        });

        JTFCoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFCoordXKeyReleased(evt);
            }
        });

        JTFTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFTelefonoKeyReleased(evt);
            }
        });

        JTFCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFCorreoKeyReleased(evt);
            }
        });

        JBBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JTFCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFCoordYKeyReleased(evt);
            }
        });

        JRBEstado.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEstado.setText("Estado");
        JRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBEstadoActionPerformed(evt);
            }
        });

        JBSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBSalir.png.jpg"))); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(JBGuardarModificaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBBuscar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(JRBEstado)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFDireccion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBAgregarCuartel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBEstado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardarModificaciones)
                    .addComponent(JBSalir)
                    .addComponent(JBAgregarCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed

        try {
            int id = Integer.parseInt(JTFCodigo.getText());
            Cuartel cuartelito = cuartelData.BuscarCuartelPorId(id);

            if (cuartelito != null) {
                JTFNombre.setText(cuartelito.getNombre_cuartel());
                JTFDireccion.setText(cuartelito.getDireccion());
                JTFCoordX.setText(String.valueOf(cuartelito.getCoord_X()));
                JTFCoordY.setText(String.valueOf(cuartelito.getCoord_Y()));
                JTFTelefono.setText(cuartelito.getTelefono());
                JTFCorreo.setText(cuartelito.getCorreo());
                JRBEstado.setSelected(cuartelito.isEstado());

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }

    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBGuardarModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarModificacionesActionPerformed

        try {
            cuartel.setId_cuartel(Integer.parseInt(JTFCodigo.getText()));
            cuartel.setNombre_cuartel(JTFNombre.getText());
            cuartel.setDireccion(JTFDireccion.getText());
            cuartel.setCoord_X(Double.parseDouble(JTFCoordX.getText())); //---
            cuartel.setCoord_Y(Double.parseDouble(JTFCoordY.getText())); //----
            cuartel.setTelefono(JTFTelefono.getText());
            cuartel.setCorreo(JTFCorreo.getText());
            cuartel.setTelefono(JTFTelefono.getText());

            if (JRBEstado.isSelected()) {
                cuartel.setEstado(true);
            } else {
                cuartel.setEstado(false);
            }
            cuartelData.ModificarCuartel(cuartel);
            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos. " + e.getMessage());
        }

    }//GEN-LAST:event_JBGuardarModificacionesActionPerformed

    private void JBAgregarCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarCuartelActionPerformed

        try {
            cuartel.setNombre_cuartel(JTFNombre.getText());
            cuartel.setDireccion(JTFDireccion.getText());
            cuartel.setCoord_X(Double.parseDouble(JTFCoordX.getText())); 
            cuartel.setCoord_Y(Double.parseDouble(JTFCoordY.getText())); 
            cuartel.setTelefono(JTFTelefono.getText());
            cuartel.setCorreo(JTFCorreo.getText());
            cuartel.setTelefono(JTFTelefono.getText());

            if (JRBEstado.isSelected()) {
                cuartel.setEstado(true);
            } else {
                cuartel.setEstado(false);
            }
            cuartelData.GuardarCuartel(cuartel);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en los campos de coordenadas. " + e.getMessage());
            limpiar();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos. " + e.getMessage());
        }

    }//GEN-LAST:event_JBAgregarCuartelActionPerformed

    private void JRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBEstadoActionPerformed
      
    }//GEN-LAST:event_JRBEstadoActionPerformed

    private void JTFCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCorreoKeyReleased

                controlarCampos();
    }//GEN-LAST:event_JTFCorreoKeyReleased
    
    private void JTFTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFTelefonoKeyReleased
       controlarCampos();
    }//GEN-LAST:event_JTFTelefonoKeyReleased

    private void JTFNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreKeyReleased
        controlarCampos();
    }//GEN-LAST:event_JTFNombreKeyReleased

    private void JTFDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDireccionKeyReleased
        controlarCampos();
    }//GEN-LAST:event_JTFDireccionKeyReleased

    private void JTFCoordXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCoordXKeyReleased
        controlarCampos();
    }//GEN-LAST:event_JTFCoordXKeyReleased

    private void JTFCoordYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCoordYKeyReleased
        controlarCampos();
    }//GEN-LAST:event_JTFCoordYKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarCuartel;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBGuardarModificaciones;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFCoordX;
    private javax.swing.JTextField JTFCoordY;
    private javax.swing.JTextField JTFCorreo;
    private javax.swing.JTextField JTFDireccion;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        JTFCodigo.setText("");
        JTFNombre.setText("");
        JTFDireccion.setText("");
        JTFCoordX.setText("");
        JTFCoordY.setText("");
        JTFTelefono.setText("");
        JTFCorreo.setText("");
        JRBEstado.setSelected(false);
    }
    private void controlarCampos(){
       boolean nom = !(JTFNombre.getText().equals(""));
       boolean dir = !(JTFDireccion.getText().equals(""));
       boolean cx= !(JTFCoordX.getText().equals(""));
       boolean cy= !(JTFCoordY.getText().equals(""));
       boolean corr= !(JTFCorreo.getText().equals(""));
       boolean tel= !(JTFNombre.getText().equals(""));
       
       String numero = JTFTelefono.getText();
       Pattern patn = Pattern.compile("^[0-9]{10,}$");
       Matcher Match = patn.matcher(numero);
       if (Match.matches()) {
           tel=true;
           
       }else {
           tel=false;
           
           JBAgregarCuartel.setEnabled(false);
           JBGuardarModificaciones.setEnabled(false);
       }
       
        String correo= JTFCorreo.getText();
        Pattern patt = Pattern.compile("\\w+[@](hotmail|gmail|yahoo|outlook)(.)(com)((.)[a-z]{2})*");
        Matcher match = patt.matcher(correo);

        if(match.matches()){
           corr=true;
        }else{
           corr=false;
        }
        
       if(nom&&dir&&cx&&cy&&corr&&tel) {
           
           JBAgregarCuartel.setEnabled(true);
           JBGuardarModificaciones.setEnabled(true);
       }
       else{
           JBAgregarCuartel.setEnabled(false);
           JBGuardarModificaciones.setEnabled(false);
       }
       
    }
}