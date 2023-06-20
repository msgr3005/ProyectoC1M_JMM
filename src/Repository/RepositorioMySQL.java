/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import imagenes.ImagenAlmacen;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAURICIO
 */
public class RepositorioMySQL implements Repository{
    private String database= "proyecto";
    private String URL= "jdbc:mysql://localhost:3306/"+database;
    private String usuario = "root";
    private String password = "";

   
    public RepositorioMySQL(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conexion MySQL exitosa!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void agregar(Usuario obj) {
        
        String sql = "insert into tbl_(username,password) values(?,MD5(?))";
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,obj.getUsername());
            statement.setString(2,obj.getPassword());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Usuario obj1,Usuario obj2) {
        
    }

    @Override
    public void eliminar(Usuario obj) {
        
    }

    @Override
    public List<Usuario> listar() {
       List<Usuario> listaUsuario = new ArrayList<>();
       String sql = "select * from tbl_usuario";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
               int idUsuario = resultSet.getInt("idUsuario");
               String username = resultSet.getString("username");
               String contraseña = resultSet.getString("password");
               Usuario objUsuario = new Usuario(idUsuario,username,contraseña);
               listaUsuario.add(objUsuario);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return listaUsuario;
    }

    @Override
    public String ObtenerPassword(String comodin){
       String contraseña = "";
       String sql = "select password from tbl_ where username like ?";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1,comodin);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
                contraseña = resultSet.getString("password");
                
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return contraseña;
    }

    @Override
    public List<Organizacion> listarOrganizacion(String combo,String texto) {
        List<Organizacion> listaOrganizacion = new ArrayList<>();
       String sql = "select * from tbl_organizacion where ? likes ?";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, combo);
           statement.setString(2,texto);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
               int idOrganizacion = resultSet.getInt("idOrganizacion");
               String nombre = resultSet.getString("nombre");
               String descripcion = resultSet.getString("descripcion");
               byte[] logo = resultSet.getBytes("Logo");
               byte[] imgRef = resultSet.getBytes("imagenReferencial");
               Organizacion objOrganizacion = new Organizacion(idOrganizacion,nombre,descripcion,logo,imgRef);
               listaOrganizacion.add(objOrganizacion);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return listaOrganizacion;
    }
    

    @Override
    public void agregarImagen(ImagenAlmacen img) {
        String sql = "insert into tbl_imagen(imagenLogo,imagenReferencial) values(?,?)";
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBytes(1,img.getImagenLogo());
            statement.setBytes(2,img.getImagenReferencial());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList cargarImagenes() {
        ArrayList imagenes = new ArrayList();
        String sql= "select * from tbl_imagen";
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                ImagenAlmacen mImagen= new ImagenAlmacen();
                mImagen.setIdImagen(resultSet.getInt("idImagen"));
               
                mImagen.setImagenLogo(resultSet.getBytes("imagenLogo"));
                mImagen.setImagenReferencial(resultSet.getBytes("imagenReferencial"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return imagenes;
    }

    @Override
    public void agregarOrganizacion(Organizacion obj) {
        String sql = "insert into tbl_organizacion(nombreOrganizacion,descripcion) values(?,?)";
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,obj.getNombreOrganizacion());
            statement.setString(2,obj.getDescripcion());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    
}
