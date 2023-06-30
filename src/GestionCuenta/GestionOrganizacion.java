/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionCuenta;


import imagenes.RenderImagen;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import Repository.*;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
/**
 *
 * @author MAURICIO
 */
public class GestionOrganizacion extends javax.swing.JFrame {
    String RutaL="";
    String RutaR= "";
    DefaultTableModel mModeloTabla = new DefaultTableModel();
    RepositorioMySQL repo = new RepositorioMySQL();
    /**
     * Creates new form GestionOrganizacion
     */
    public GestionOrganizacion() {
        initComponents();
        
       // CargarImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreOrg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionOrg = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnExaminarL = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnExaminarR = new javax.swing.JButton();
        lblImagenR = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblImagenL = new javax.swing.JLabel();
        txtRuta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gestion de la cuenta de Organizacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setText("Imagen Referencial");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de la Organización");

        txtDescripcionOrg.setColumns(20);
        txtDescripcionOrg.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionOrg);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        btnExaminarL.setText("Examinar");
        btnExaminarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarLActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setText("Imagen Logo");

        btnExaminarR.setText("Examinar");
        btnExaminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarRActionPerformed(evt);
            }
        });

        lblImagenR.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lblImagenR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenR.setText("ImgRef");
        lblImagenR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblImagenL.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        lblImagenL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenL.setText("Logo");
        lblImagenL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtRuta.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExaminarL)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addComponent(lblImagenL, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(btnExaminarR))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(lblImagenR, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(txtRuta)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminarL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExaminarR)
                            .addComponent(txtNombreOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImagenL, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagenR, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(txtRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*private void CargarImagenes() {
        ArrayList Imagenes;
        Organizacion objOrganizacion;
        Object Datos[] = new Object[3];
        Imagenes = repo.cargarImagenes();

        if (Imagenes != null) {
            for (int i = 0; i < Imagenes.size(); i++) {
                mImagenAlmacen = (ImagenAlmacen) Imagenes.get(i);
                Datos[0] = String.valueOf(mImagenAlmacen.getIdImagen());
                try {
                    byte[] imagenLogo = mImagenAlmacen.getImagenLogo();
                    byte[] imagenReferencial = mImagenAlmacen.getImagenReferencial();
                    BufferedImage bufferedImageL = null;
                    BufferedImage bufferedImageR = null;
                    InputStream inputStreamL = new ByteArrayInputStream(imagenLogo);
                    InputStream inputStreamR = new ByteArrayInputStream(imagenReferencial);
                    bufferedImageL = ImageIO.read(inputStreamL);
                    bufferedImageR = ImageIO.read(inputStreamR);
                    ImageIcon mIconoL = new ImageIcon(bufferedImageL.getScaledInstance(60, 60, 0));
                    ImageIcon mIconoR = new ImageIcon(bufferedImageR.getScaledInstance(60, 60, 0));
                    Datos[1] = new JLabel(mIconoL);
                    Datos[2] = new JLabel(mIconoR);
                }catch (Exception e) {
                    Datos[1] = new JLabel("No imagen");
                    Datos[2] = new JLabel("No imagen");
                 }
            }
        }       
    }*/
    
    private byte[] getImagen(String Ruta) {
        File imagen = new File(Ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception ex) {
            return null;
        }
    }
    private void btnExaminarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarLActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int ap = fileChooser.showOpenDialog(this);
        
        if(ap == JFileChooser.APPROVE_OPTION){
            RutaL = fileChooser.getSelectedFile().getAbsolutePath();
            lblImagenL.setIcon(new ImageIcon(RutaL));
            lblImagenL.setText("");
        }
        /*FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            RutaL = fileChooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(RutaL).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenL.getWidth(), lblImagenL.getHeight(), 0));
            lblImagenL.setIcon(mIcono);
            lblImagenL.setText("");
            txtRuta.setText(RutaL);
        }*/
    }//GEN-LAST:event_btnExaminarLActionPerformed

    private void btnExaminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarRActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        int ap = fileChooser.showOpenDialog(this);
        
        if(ap == JFileChooser.APPROVE_OPTION){
            RutaR = fileChooser.getSelectedFile().getAbsolutePath();
            lblImagenR.setIcon(new ImageIcon(RutaR));
            lblImagenR.setText("");
        }
        /*FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            RutaR = fileChooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(RutaR).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagenR.getWidth(), lblImagenR.getHeight(), 0));
            lblImagenR.setIcon(mIcono);
            lblImagenR.setText("");
        }*/
    }//GEN-LAST:event_btnExaminarRActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            Organizacion org = new Organizacion();
            String nombre = txtNombreOrg.getText();
            String descripcion = txtDescripcionOrg.getText();
            String logo = RutaL;
            String imgRef=RutaR;
            org.setLogo(getImagen(RutaL));
            org.setImagenReferencial(getImagen(RutaR));
            repo.agregarOrganizacion(nombre,descripcion,RutaL,RutaR);
            
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOrganizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOrganizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExaminarL;
    private javax.swing.JButton btnExaminarR;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenL;
    private javax.swing.JLabel lblImagenR;
    private javax.swing.JTextArea txtDescripcionOrg;
    private javax.swing.JTextField txtNombreOrg;
    private javax.swing.JLabel txtRuta;
    // End of variables declaration//GEN-END:variables
}
