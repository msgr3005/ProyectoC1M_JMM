/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;
import imagenes.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAURICIO
 */
public interface Repository {
     
    void agregar(Usuario obj);
    void agregarImagen(ImagenAlmacen img);
    void agregarOrganizacion(Organizacion obj);
    void actualizar(Usuario obj1,Usuario obj2);
    void eliminar(Usuario obj);
    List<Usuario> listar();
    String ObtenerPassword(String comodin);
    
    List<Organizacion> listarOrganizacion(String combo,String texto);
    ArrayList cargarImagenes();
}
