package clases;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java 
 * Programación Orientada a Objetos
 */

/**
 *
 * @author Ana Sofía Rodríguez Castillo, 178815@upslp.edu.mx
 * @author Ana Sofía Rodriguez Castillo
 * @author 178815@upslp.edu.mx
 * @version 1.0
 */
public class Docentes {
    private final Connection con;
    private ArrayList<ArrayList<Object>> lista = new ArrayList<>();
    private final ArrayList<Object> IDEMPLEADO = new ArrayList();
    private String idEmpleado[];
    private int ultIdEmpleado=0;
    private Random rand = new Random();

    public Docentes(Connection con) {
        this.con = con;
    }
    
    public void altaDocente(String nombre, String grado){
        try{
            Statement sts = con.createStatement();
            sts.addBatch("INSERT INTO personal(nom_pers) VALUES ( '"+ nombre +"')"); 
            sts.executeBatch();
        }catch(SQLException e){
            System.out.println("Error " + e);
        }
    }
    
    public final void consultaDocente(){
        int reg = 0;
        try{
            getLista().clear();
            Statement sts = con.createStatement();
            sts.execute("SELECT * FROM personal");
            ResultSet rs = sts.getResultSet();
            while(rs.next()){
                getLista().add(new ArrayList<>());
                getLista().get(reg).add(rs.getInt("id_pers"));
                getLista().get(reg).add(rs.getString("nom_pers"));
                reg++;
            }
            Iterator miIterator = getLista().iterator();
            while(miIterator.hasNext()){
                System.out.println(miIterator.next()+ "\t");
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }
    
    public void modificaDocente(int idDocente, String nombre, String grado){
        try{
            Statement sts = con.createStatement();
            sts.executeUpdate("UPDATE personal set nom_pers= '"+nombre+"' WHERE id_pers="+idDocente);
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
    }
    
    public final DefaultTableModel actualizaTablaDocente(){
        DefaultTableModel modelo = new DefaultTableModel();
        Object datos[] = new Object[3];
        modelo.addColumn("Id Docente");
        modelo.addColumn("Nombre");
        
        consultaDocente();
        for (int j = 0; j < getLista().size(); j++) {
            datos[0] = getLista().get(j).get(0);
            datos[1] = getLista().get(j).get(1);
            datos[2] = getLista().get(j).get(2);
            modelo.addRow(datos);
        }
        return modelo;
    }

    public ArrayList<ArrayList<Object>> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ArrayList<Object>> lista) {
        this.lista = lista;
    }

    public String[] getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String[] idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getUltIdEmpleado() {
        return ultIdEmpleado;
    }

    public void setUltIdEmpleado(int ultIdEmpleado) {
        this.ultIdEmpleado = ultIdEmpleado;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    
    
}
