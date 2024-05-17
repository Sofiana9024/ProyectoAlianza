package interfaces;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JFrame;
import java.sql.*;

/**
 *
 * @author monse
 */
public class StockActual extends javax.swing.JFrame {

    private final Connection con;
    
    public StockActual(Connection con) {
        this.con = con;
        initComponents();
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        this.setTitle("Stock Actual");
        this.setResizable(false);
        
        mostrarMateriales();
        mostrarCantidadTotal();
        mostrarCantidadDisponible();
        
    }
    
    private void mostrarMateriales() {
        try {
            String query = "SELECT nom_mat FROM material";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            StringBuilder materiales = new StringBuilder();
            while (rs.next()) {
                materiales.append(rs.getString("nom_mat")).append("\n");
            }
            
            profe1.setText(materiales.toString());
        } catch (SQLException e) {
            System.out.println("Error al obtener los materiales: " + e.getMessage());
        }
    }
    
    private void mostrarCantidadTotal() {
        try {
            String query = "SELECT SUM(stock_mat) AS total FROM material";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                salon1.setText(Integer.toString(total));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la cantidad total: " + e.getMessage());
        }
    }
    
    private void mostrarCantidadDisponible() {
        try {
            String query = "SELECT SUM(stock_mat) AS total_stock FROM material";
            String queryPrestamo = "SELECT SUM(cant_pres) AS total_prestado FROM prestamo";

            PreparedStatement pstStock = con.prepareStatement(query);
            ResultSet rsStock = pstStock.executeQuery();
            int totalStock = 0;
            if (rsStock.next()) {
                totalStock = rsStock.getInt("total_stock");
            }

            PreparedStatement pstPrestamo = con.prepareStatement(queryPrestamo);
            ResultSet rsPrestamo = pstPrestamo.executeQuery();
            int totalPrestado = 0;
            if (rsPrestamo.next()) {
                totalPrestado = rsPrestamo.getInt("total_prestado");
            }

            int disponible = totalStock - totalPrestado;
            salon.setText(Integer.toString(disponible));
        } catch (SQLException e) {
            System.out.println("Error al obtener la cantidad disponible: " + e.getMessage());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salon = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        profe1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        salon1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 29, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 614, 65, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro-marcador-amarillo.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 60, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taller (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resaltador.png"))); // NOI18N
        jLabel11.setEnabled(false);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-alt-amarillo.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (3).png"))); // NOI18N
        jLabel4.setText("Cerrar Sesión");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deshacer.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1200, 50));

        jPanel3.setBackground(new java.awt.Color(204, 220, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(1, 75, 142));
        jLabel14.setFont(new java.awt.Font("Quicksand Bold", 1, 65)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Material Disponible");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2024-04-12 at 08.53.37.jpeg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -450, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1200, 160));

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(1, 75, 142));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Quicksand Light", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Resumen de material disponible ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1080, 60));

        salon.setEditable(false);
        salon.setBackground(new java.awt.Color(255, 255, 255));
        salon.setColumns(20);
        salon.setFont(new java.awt.Font("Quicksand Book", 0, 18)); // NOI18N
        salon.setRows(5);
        jScrollPane1.setViewportView(salon);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 340, 240));

        profe1.setEditable(false);
        profe1.setBackground(new java.awt.Color(255, 255, 255));
        profe1.setColumns(20);
        profe1.setFont(new java.awt.Font("Quicksand Book", 0, 18)); // NOI18N
        profe1.setRows(5);
        profe1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(profe1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 340, 240));

        salon1.setEditable(false);
        salon1.setBackground(new java.awt.Color(255, 255, 255));
        salon1.setColumns(20);
        salon1.setFont(new java.awt.Font("Quicksand Book", 0, 18)); // NOI18N
        salon1.setRows(5);
        jScrollPane3.setViewportView(salon1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 340, 240));

        jLabel1.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad total en existencia");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Quicksand Bold", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Disponibles");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 1200, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        new LogIn(con).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new PaginaPrincipal(con).setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
        new DocentesI(con).setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
        new Consultar(con).setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        new Ajustes(con).setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.dispose();
        new Material(con).setVisible(true);
    }//GEN-LAST:event_jLabel19MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea profe1;
    private javax.swing.JTextArea salon;
    private javax.swing.JTextArea salon1;
    // End of variables declaration//GEN-END:variables
}
