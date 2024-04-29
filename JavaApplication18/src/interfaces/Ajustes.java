package interfaces;

import java.awt.Color;
import javax.swing.JFrame;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import clases.*;

/**
 *
 * @author monse
 */
public class Ajustes extends javax.swing.JFrame {

    private final Connection con;
    
    public Ajustes(Connection con) {
        this.con = con;
        initComponents();
        setLocationRelativeTo(null);
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
        btnAjustes = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JLabel();
        btnDocentes = new javax.swing.JLabel();
        btnMaterial = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JLabel();
        btnPagPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        Agregar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPassword = new javax.swing.JPanel();
        Eliminar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 29, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes (1).png"))); // NOI18N
        btnAjustes.setEnabled(false);
        jPanel1.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 614, 65, -1));

        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro-marcador-amarillo.png"))); // NOI18N
        btnPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrestamosMouseClicked(evt);
            }
        });
        jPanel1.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 60, 70));

        btnDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taller (1).png"))); // NOI18N
        btnDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDocentesMouseClicked(evt);
            }
        });
        jPanel1.add(btnDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resaltador.png"))); // NOI18N
        btnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaterialMouseClicked(evt);
            }
        });
        jPanel1.add(btnMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-alt-amarillo.png"))); // NOI18N
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnPagPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar.png"))); // NOI18N
        btnPagPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagPrincipalMouseClicked(evt);
            }
        });
        jPanel1.add(btnPagPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogIn.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        btnLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (3).png"))); // NOI18N
        btnLogIn.setText("Cerrar Sesión");
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });
        jPanel2.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1200, 50));

        jPanel3.setBackground(new java.awt.Color(204, 220, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(1, 75, 142));
        jLabel14.setFont(new java.awt.Font("Quicksand Bold", 1, 65)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ajustes");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-12 at 08.53.37.jpeg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -420, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1200, 220));

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(1, 75, 142));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Quicksand Light", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qúe quieres modificar?");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 1100, 66));

        btnUsuario.setBackground(new java.awt.Color(1, 75, 142));
        btnUsuario.setPreferredSize(new java.awt.Dimension(260, 260));
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });
        btnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setFont(new java.awt.Font("Quicksand Bold", 0, 36)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Usuario");
        btnUsuario.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 43));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-bnco.png"))); // NOI18N
        btnUsuario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 113, -1, -1));

        jPanel4.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        btnPassword.setBackground(new java.awt.Color(1, 75, 142));
        btnPassword.setPreferredSize(new java.awt.Dimension(260, 260));
        btnPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPasswordMouseClicked(evt);
            }
        });
        btnPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setFont(new java.awt.Font("Quicksand Bold", 0, 36)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Contraseña");
        btnPassword.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 43));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave.png"))); // NOI18N
        btnPassword.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 113, -1, -1));

        jPanel4.add(btnPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 1200, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked
        this.dispose();
        new LogIn(con).setVisible(true);
        //LogIn ventana = new LogIn(); // Crea una instancia de Ventana2
        //ventana.setVisible(true);
    }//GEN-LAST:event_btnLogInMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnPagPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagPrincipalMouseClicked
        this.dispose();
        new PaginaPrincipal(con).setVisible(true);
    }//GEN-LAST:event_btnPagPrincipalMouseClicked

    private void btnDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocentesMouseClicked

        
    }//GEN-LAST:event_btnDocentesMouseClicked

    private void btnMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseClicked
        this.dispose();
        new Material(con).setVisible(true);
    }//GEN-LAST:event_btnMaterialMouseClicked

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        this.dispose();
        new Consultar(con).setVisible(true);
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMouseClicked
        this.dispose();
        new Prestamos(con).setVisible(true);
    }//GEN-LAST:event_btnPrestamosMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        this.dispose();
        new Usuario(con).setVisible(true);
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasswordMouseClicked
        this.dispose();
        new Password(con).setVisible(true);
    }//GEN-LAST:event_btnPasswordMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel btnAjustes;
    private javax.swing.JLabel btnConsultar;
    private javax.swing.JLabel btnDocentes;
    private javax.swing.JLabel btnLogIn;
    private javax.swing.JLabel btnMaterial;
    private javax.swing.JLabel btnPagPrincipal;
    private javax.swing.JPanel btnPassword;
    private javax.swing.JLabel btnPrestamos;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
