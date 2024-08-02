package FinalTPBomberosApp.Vistas;


import FinalTPBomberosApp.AccesoADatos.BomberoData;
import FinalTPBomberosApp.AccesoADatos.BrigadaData;
import FinalTPBomberosApp.Entidades.Bombero;
import FinalTPBomberosApp.Entidades.Brigada;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionPersonalView extends javax.swing.JInternalFrame {

    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();

    private Bombero bombero = new Bombero();
    private BomberoData bomberoData = new BomberoData();
    private List<Bombero> listarBomberos = bomberoData.ListarBomberos();

    public GestionPersonalView() {
        initComponents();
        JBGuardarModificaciones.setEnabled(false);
        CargarComboBox();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JRBEstado = new javax.swing.JRadioButton();
        JBGuardarModificaciones = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        JBBuscarPorID = new javax.swing.JButton();
        JTFCodigo = new javax.swing.JTextField();
        JTFNombres = new javax.swing.JTextField();
        JTFDni = new javax.swing.JTextField();
        JTFTelefono = new javax.swing.JTextField();
        JDCFechaDeNacimiento = new com.toedter.calendar.JDateChooser();
        JTFApellidos = new javax.swing.JTextField();
        JBBuscarPorDni = new javax.swing.JButton();
        JCBGrupoSanguineo = new javax.swing.JComboBox<>();
        JCBCodigoDeBrigada = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        JCBNombreClave = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Personal");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Nombre/s");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Apellido/s");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Codigo De Brigada");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Fecha De Nacimiento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Grupo Sanguineo");

        JRBEstado.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEstado.setText("Estado");

        JBGuardarModificaciones.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBGuardarModificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBGuardar.jpg"))); // NOI18N
        JBGuardarModificaciones.setText("Guardar Modificaciones");
        JBGuardarModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarModificacionesActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Codigo/ID");

        JBBuscarPorID.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscarPorID.setText("Buscar");
        JBBuscarPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorIDActionPerformed(evt);
            }
        });

        JTFNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombresKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFNombresKeyReleased(evt);
            }
        });

        JTFTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFTelefonoKeyReleased(evt);
            }
        });

        JTFApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFApellidosKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFApellidosKeyReleased(evt);
            }
        });

        JBBuscarPorDni.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalTPBomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscarPorDni.setText("Buscar");
        JBBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorDniActionPerformed(evt);
            }
        });

        JCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel18.setText("Nombre Clave");

        JCBNombreClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alfa", "Beta", "Gama", "Omega", "Zetta" }));
        JCBNombreClave.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCBCodigoDeBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBGuardarModificaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JRBEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBNombreClave, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBBuscarPorID))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFApellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscarPorDni)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(JTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBBuscarPorID)
                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel2)
                        .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBBuscarPorDni)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JDCFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCBCodigoDeBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(JCBNombreClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JRBEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardarModificaciones)
                    .addComponent(JBSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarModificacionesActionPerformed

        try {
                    // Obtener la fecha seleccionada y calcular la edad
        java.util.Date fechaNacimientoDate = JDCFechaDeNacimiento.getDate();
        LocalDate fechaNacimiento = fechaNacimientoDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        // Validar que la edad sea mayor o igual a 18 años
        if (edad < 18) {
            JOptionPane.showMessageDialog(this, "La edad debe ser mayor o igual a 18 años.");
            return; // Salir del método si la edad no es válida
        }
            Brigada brigada = new Brigada();
            bombero.setApellido(JTFApellidos.getText());
            bombero.setNombre(JTFNombres.getText());
            bombero.setFecha_nacimiento(JDCFechaDeNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            brigada.setId_brigada((int) JCBCodigoDeBrigada.getSelectedItem());
            bombero.setBrigada(brigada);
            bombero.setGrupo_sanguineo((String) JCBGrupoSanguineo.getSelectedItem());
            bombero.setNombre_clave((String) JCBNombreClave.getSelectedItem());
            bombero.setCelular(JTFTelefono.getText());
            bombero.setDni(Integer.parseInt(JTFDni.getText()));

            if (JRBEstado.isSelected() == true) {
                bombero.setEstado(true);
            } else {
                bombero.setEstado(false);
            }
            bomberoData.ModificarBombero(bombero);
            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos " + e.getMessage());
        }
    }//GEN-LAST:event_JBGuardarModificacionesActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorDniActionPerformed

        try {
            if (bombero != null) {
                String dni = JTFDni.getText();
                Bombero bombero = bomberoData.BuscarBomberoPorDni(dni);

                JTFCodigo.setText(String.valueOf(bombero.getId_bombero()));//toma valor del id_bombero y lo convierte a String para despues mostrarle al usuario.
                JTFApellidos.setText(bombero.getApellido());
                JTFNombres.setText(bombero.getNombre());
                JDCFechaDeNacimiento.setDate(Date.from(bombero.getFecha_nacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                JCBCodigoDeBrigada.setSelectedItem(bombero.getBrigada().getId_brigada());
                JCBGrupoSanguineo.setSelectedItem(bombero.getGrupo_sanguineo());
                JCBNombreClave.setSelectedItem(bombero.getNombre_clave());
                JTFTelefono.setText(bombero.getCelular());
                if (bombero.isEstado()) {
                    JRBEstado.setSelected(true);
                }
                if (bombero.isEstado() == false) {
                    JRBEstado.setSelected(false);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese números sin puntos ni comas " + e.getMessage());
        }
    }//GEN-LAST:event_JBBuscarPorDniActionPerformed

    private void JBBuscarPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorIDActionPerformed

        try {
            int id = Integer.parseInt(JTFCodigo.getText());
            Bombero bombi = bomberoData.BuscarBombero(id);

            if (bombi != null) {
                JTFApellidos.setText(bombi.getApellido());
                JTFNombres.setText(bombi.getNombre());
                JTFDni.setText(String.valueOf(bombi.getDni()));
                JDCFechaDeNacimiento.setDate(Date.from(bombi.getFecha_nacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                JCBCodigoDeBrigada.setSelectedItem(bombi.getBrigada().getId_brigada());
                JCBGrupoSanguineo.setSelectedItem(bombi.getGrupo_sanguineo());
                JCBNombreClave.setSelectedItem(bombi.getNombre_clave());
                JTFTelefono.setText(bombi.getCelular());
                JRBEstado.setSelected(bombi.isEstado());

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un bombero con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
    }//GEN-LAST:event_JBBuscarPorIDActionPerformed

    private void JTFNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombresKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese Solo Letras. ");
        }
    }//GEN-LAST:event_JTFNombresKeyTyped

    private void JTFApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFApellidosKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese Solo Letras. ");
        }
    }//GEN-LAST:event_JTFApellidosKeyTyped

    private void JTFNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombresKeyReleased
        ComprobarCampos();
    }//GEN-LAST:event_JTFNombresKeyReleased

    private void JTFApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFApellidosKeyReleased
        ComprobarCampos();
    }//GEN-LAST:event_JTFApellidosKeyReleased

    private void JTFTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFTelefonoKeyReleased
        ComprobarCampos();
    }//GEN-LAST:event_JTFTelefonoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarPorDni;
    private javax.swing.JButton JBBuscarPorID;
    private javax.swing.JButton JBGuardarModificaciones;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Integer> JCBCodigoDeBrigada;
    private javax.swing.JComboBox<String> JCBGrupoSanguineo;
    private javax.swing.JComboBox<String> JCBNombreClave;
    private com.toedter.calendar.JDateChooser JDCFechaDeNacimiento;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFApellidos;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDni;
    private javax.swing.JTextField JTFNombres;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void CargarComboBox() {
        JCBCodigoDeBrigada.removeAllItems();

        for (Brigada brigada : listarBrigada) {
            int idBrigada = brigada.getId_brigada();
            JCBCodigoDeBrigada.addItem(idBrigada);
        }
    }

    public void limpiar() {
        JTFCodigo.setText("");
        JTFApellidos.setText("");
        JTFDni.setText("");
        JTFNombres.setText("");
        JTFTelefono.setText("");
        JRBEstado.setSelected(false);
        JCBCodigoDeBrigada.setSelectedIndex(0);
        JCBGrupoSanguineo.setSelectedIndex(0);
        JCBNombreClave.setSelectedIndex(0);
    }
private void ComprobarCampos(){
    boolean name = !(JTFNombres.getText().equals(""));
    boolean surname = !(JTFApellidos.getText().equals(""));
    boolean phone = !(JTFTelefono.getText().equals(""));
    
    if (name && surname && phone){
        JBGuardarModificaciones.setEnabled(true);
    }else {
        JBGuardarModificaciones.setEnabled(false);
        } 
    }
}