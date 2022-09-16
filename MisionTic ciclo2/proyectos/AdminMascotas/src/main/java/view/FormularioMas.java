/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ClasesMascotas.Mascota;
import ClasesMascotas.Perro;
import controller.CtolMascotas;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class FormularioMas extends javax.swing.JFrame {
    
    LinkedList<Perro> perroObjectList = new LinkedList<>();
    private CtolMascotas ctolMascotas;
    /**
     * Creates new form NewJFrame
     */
    public FormularioMas() {
        initComponents();
        this.ctolMascotas = new CtolMascotas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        ListMascotas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMascUnid = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoDog = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreDog = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnioNacDog = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColorDog = new javax.swing.JTextField();
        cboxEstadoSalDog = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        BtnCrearDog = new javax.swing.JButton();
        btnBuscarDog = new javax.swing.JButton();
        btnEditarDog = new javax.swing.JButton();
        btnEliminarDog = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboxRazaDog = new javax.swing.JComboBox<>();
        jCheckBoxPeligriDog = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtPeligriDog = new javax.swing.JLabel();
        txtPeligriDogg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        listaMascUnid.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. mascota", "2. Mascota", "3 Mascota" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaMascUnid);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        ListMascotas.addTab("List Mascotas", jPanel1);

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        txtNombreDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDogActionPerformed(evt);
            }
        });

        jLabel4.setText("Añio Nac");

        txtAnioNacDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioNacDogActionPerformed(evt);
            }
        });

        jLabel5.setText("Color");

        cboxEstadoSalDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saludable", "Enfermo", "Cirugia" }));
        cboxEstadoSalDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEstadoSalDogActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado Salud");

        BtnCrearDog.setText("Crear");
        BtnCrearDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearDogActionPerformed(evt);
            }
        });

        btnBuscarDog.setText("Buscar");
        btnBuscarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDogActionPerformed(evt);
            }
        });

        btnEditarDog.setText("Editar");
        btnEditarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDogActionPerformed(evt);
            }
        });

        btnEliminarDog.setText("Eliminar");
        btnEliminarDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDogActionPerformed(evt);
            }
        });

        jLabel7.setText("Raza");

        cboxRazaDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criollo", "Casta", "Otro" }));

        jCheckBoxPeligriDog.setText("Peligri");
        jCheckBoxPeligriDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPeligriDogActionPerformed(evt);
            }
        });

        jLabel8.setText("Peligri");

        txtPeligriDogg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeligriDoggActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAnioNacDog))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoDog, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(txtPeligriDog, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(txtPeligriDogg))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(cboxEstadoSalDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreDog, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxRazaDog, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnCrearDog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarDog)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarDog)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarDog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxPeligriDog)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtAnioNacDog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboxEstadoSalDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboxRazaDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPeligriDog)
                    .addComponent(txtPeligriDogg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearDog)
                    .addComponent(btnBuscarDog)
                    .addComponent(btnEditarDog)
                    .addComponent(btnEliminarDog)
                    .addComponent(jCheckBoxPeligriDog))
                .addGap(33, 33, 33))
        );

        ListMascotas.addTab("PerroManager", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manegador Mascotas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ListMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ListMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioNacDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioNacDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioNacDogActionPerformed

    private void txtNombreDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDogActionPerformed
  
    private void BtnCrearDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearDogActionPerformed
       //JOptionPane.showConfirmDialog(this, "esto es una prueba");
       try {   
       String codigo = txtCodigoDog.getText();
       String nombre = txtNombreDog.getText();
       String color = txtColorDog.getText();
       int anhioNac = Integer.parseInt(txtAnioNacDog.getText());
       String estadoSalud = cboxEstadoSalDog.getSelectedItem().toString();
       String raza = cboxRazaDog.getSelectedItem().toString();
       //boolean peligriMenu = jCheckBoxPeligriDog.isSelected();
       String peligri = txtPeligriDogg.getText();
       
       if( !codigo.equals("") || !nombre.equals("")|| !color.equals("")|| !peligri.equals("")){
       // Perro perroFormulario = new Perro(raza, peligri, codigo, nombre, anhioNac, color, estadoSalud);
       // perroObjectList.add(perroFormulario);
        this.mostarLista();
        JOptionPane.showMessageDialog(this, "registro exitoso");
          }else{
           JOptionPane.showMessageDialog(this, "Por favor ingrese todos los campos");
       }
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Por favor ingrese valor valido en  el añio de nacimiento");
       }
        
    }//GEN-LAST:event_BtnCrearDogActionPerformed
    
    private void mostarLista(){
         DefaultListModel model = new DefaultListModel();
         int index = 0;
         for( Perro per : perroObjectList){
             String data = per.getNombre()+ " - " + per.getRaza();
             model.add(index, data);
             index++;
         }
         listaMascUnid.setModel(model);
    }
    
    private void btnBuscarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDogActionPerformed
        String codigo = txtCodigoDog.getText();
        Perro perro = (Perro)ctolMascotas.buscarMascota(codigo, "Perro");
         if(perro == null){
            JOptionPane.showMessageDialog(this, "codigo no encontrado");
         } else {
             txtNombreDog.setText(perro.getNombre());
                txtColorDog.setText(perro.getColor());
                txtAnioNacDog.setText(perro.getAnhioNac()+ "");
               // txtPeligriDogg.setText(perro.getPeligri());
                cboxEstadoSalDog.setSelectedItem(perro.getEstadoSalud());
                cboxRazaDog.setSelectedItem(perro.getRaza());
         }
        
        
        /*String codigo = txtCodigoDog.getText();
        boolean found = false;//encontrar
        for( Perro perr : perroObjectList){
            if(perr.getCodigo().equals(codigo)){
                txtNombreDog.setText(perr.getNombre());
                txtColorDog.setText(perr.getColor());
                txtAnioNacDog.setText(perr.getAnhioNac()+ "");
                txtPeligriDogg.setText(perr.getPeligri());
                cboxEstadoSalDog.setSelectedItem(perr.getEstadoSalud());
                cboxRazaDog.setSelectedItem(perr.getRaza());
                found = true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(this, "codigo no encontrado");
        }*/
    }//GEN-LAST:event_btnBuscarDogActionPerformed

    private void btnEditarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDogActionPerformed
        String codigo = txtCodigoDog.getText();
        boolean found = false;//encontrar
        for( Perro perr : perroObjectList){
            if(perr.getCodigo().equals(codigo)){
                String nombre = txtNombreDog.getText();
                String color =  txtColorDog.getText();
                int anioNac = Integer.parseInt(txtAnioNacDog.getText());
                String peligri = txtPeligriDogg.getText();
                String estadoSalud = cboxEstadoSalDog.getSelectedItem().toString();
                String raza = cboxRazaDog.getSelectedItem().toString();
                
                perr.setNombre(nombre);
                perr.setAnhioNac(anioNac);
                perr.setColor(color);
                perr.setEstadoSalud(estadoSalud);
                perr.setRaza(raza);
                //perr.setPeligri(peligri);
                this.clearPerroCampos();//limpio
                this.mostarLista();//actualizar la lista
                JOptionPane.showMessageDialog(this, "Se ha realizado la actualizacion");
                found = true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(this, "codigo no encontrado");
        }
    }//GEN-LAST:event_btnEditarDogActionPerformed
    private void clearPerroCampos(){
       txtAnioNacDog.setText("");
       txtCodigoDog.setText("");
       txtColorDog.setText("");
       txtPeligriDogg.setText("");
       cboxEstadoSalDog.setSelectedIndex(0);
       cboxRazaDog.setSelectedIndex(0);
    
    }
    
    private void cboxEstadoSalDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEstadoSalDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEstadoSalDogActionPerformed

    private void jCheckBoxPeligriDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPeligriDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPeligriDogActionPerformed

    private void txtPeligriDoggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeligriDoggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeligriDoggActionPerformed

    private void btnEliminarDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDogActionPerformed
        String codigo = txtCodigoDog.getText();
        boolean found = false;//encontrar
        for( Perro perr : perroObjectList){
            if(perr.getCodigo().equals(codigo)){
                this.perroObjectList.remove(perr);
                this.clearPerroCampos();//limpio
                this.mostarLista();//actualizar la lista
                JOptionPane.showMessageDialog(this, "Se ha eliminado registro");
                found = true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(this, "codigo no encontrado");
        }
    }//GEN-LAST:event_btnEliminarDogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearDog;
    private javax.swing.JTabbedPane ListMascotas;
    private javax.swing.JButton btnBuscarDog;
    private javax.swing.JButton btnEditarDog;
    private javax.swing.JButton btnEliminarDog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxEstadoSalDog;
    private javax.swing.JComboBox<String> cboxRazaDog;
    private javax.swing.JCheckBox jCheckBoxPeligriDog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMascUnid;
    private javax.swing.JTextField txtAnioNacDog;
    private javax.swing.JTextField txtCodigoDog;
    private javax.swing.JTextField txtColorDog;
    private javax.swing.JTextField txtNombreDog;
    private javax.swing.JLabel txtPeligriDog;
    private javax.swing.JTextField txtPeligriDogg;
    // End of variables declaration//GEN-END:variables
}
