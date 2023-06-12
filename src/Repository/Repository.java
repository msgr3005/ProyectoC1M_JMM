/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author MAURICIO
 */
public interface Repository {
    void agregar(Usuario obj);
    void actualizar(Usuario obj1,Usuario obj2);
    void eliminar(Usuario obj);
    List<Usuario> listar();
}
