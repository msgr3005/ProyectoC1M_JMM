/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;
import java.sql.*;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author MAURICIO
 */
public interface Repository {
    Connection conectar();
    
    //Metodos para usuario
    void agregarUsuario(Usuario obj);
    void actualizarUsuario(Usuario obj1,Usuario obj2);
    void eliminarUsuario(Usuario obj);
    String ObtenerPassword(String comodin);
    List<Usuario> listarUsuario();
    Usuario obtenerUsuario(String nombreUsuario);
    
    //Metodos para organizacion
    void agregarOrganizacion(String nombre, String descripcion,String rutaL,String rutaR);
    Organizacion buscarOrganizacion(String texto);
    void visualizarTabla(JTable tabla,ResultSet rs);
    ResultSet visualizar();
    ResultSet visualizarFiltro(String nombreOrg);
    void visualizarImagen(JLabel label,ResultSet rs);
   
    
}
