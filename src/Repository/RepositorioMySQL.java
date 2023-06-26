/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;


import imagenes.RenderImagen;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
     @Override
    public Connection conectar() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL,usuario,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    
    @Override
    public void agregarUsuario(Usuario obj) {
        
        String sql = "insert into tbl_usuario(nombre,nombreUsuario,contraseña,numero,email,informacion) values(?,?,MD5(?),?,?,?)";
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, obj.getNombre());
            statement.setString(2,obj.getNombreUsuario());
            statement.setString(3,obj.getContraseña());
            statement.setInt(4, obj.getNumero());
            statement.setString(5, obj.getEmail());
            statement.setString(6, obj.getInformacion());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Usuario obj1,Usuario obj2) {
        
    }

    @Override
    public void eliminarUsuario(Usuario obj) {
        
    }

    @Override
    public List<Usuario> listarUsuario() {
       List<Usuario> listaUsuario = new ArrayList<>();
       String sql = "select * from tbl_usuario where username like ?";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
               int idUsuario = resultSet.getInt("idUsuario");
               String nombre = resultSet.getString("nombre");
               String nombreUsuario = resultSet.getString("nombreUsuario");
               String contraseña = resultSet.getString("contraseña");
               int numero = resultSet.getInt("numero");
               String email = resultSet.getString("email");
               String informacion = resultSet.getString("informacion");
               Usuario objUsuario = new Usuario(idUsuario,nombre,nombreUsuario,contraseña,numero,email,informacion);
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
       String sql = "select contraseña from tbl_usuario where nombreUsuario like ?";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1,comodin);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
                contraseña = resultSet.getString("contraseña");
                
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return contraseña;
    }

    @Override
    public List<Organizacion> listarOrganizacion(String texto) {
        List<Organizacion> listaOrganizacion = new ArrayList<>();
       String sql = "select * from tbl_organizacion where nombreOrganizacion like ?";
       try{
           Connection connection = DriverManager.getConnection(URL,usuario,password);
           PreparedStatement statement = connection.prepareStatement(sql);
           
           statement.setString(1,texto);
           ResultSet resultSet = statement.executeQuery();
           while(resultSet.next()){
               int idOrganizacion = resultSet.getInt("idOrganizacion");
               String nombre = resultSet.getString("nombreOrganizacion");
               String descripcion = resultSet.getString("descripcion");
               byte[] logo = resultSet.getBytes("logo");
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
    public void agregarOrganizacion(String nombre, String descripcion,String rutaL,String rutaR) {
        
        String sql = "insert into tbl_organizacion(nombreOrganizacion,descripcion,Logo,imagenReferencial) values(?,?,?,?)";
        FileInputStream fiL,fiR = null;
        PreparedStatement statement = null;
        try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            File fileL = new File(rutaL);
            File fileR = new File(rutaR);
            fiL =new FileInputStream(fileL);
            fiR =new FileInputStream(fileR);
            
            statement = connection.prepareStatement(sql);
            statement.setString(1,nombre);
            statement.setString(2,descripcion);
            //statement.setBytes(3, obj.getLogo());
            statement.setBinaryStream(3,fiL);
            //statement.setBytes(4, obj.getImagenReferencial());
            statement.setBinaryStream(4,fiR);
            statement.executeUpdate();
        }catch(Exception e){
           
            e.printStackTrace();
        }
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
       Usuario objUsuario=  null;
       String sql = "select * from tbl_usuario where nombreUsuario like ?";
       try{
            Connection connection = DriverManager.getConnection(URL,usuario,password);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,nombreUsuario);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
            int idUsuario = resultSet.getInt("idUsuario");
            String nombre = resultSet.getString("nombre");
            String contrasena = resultSet.getString("contraseña");
            int numero = resultSet.getInt("numero");
            String email = resultSet.getString("email");
            String informacion = resultSet.getString("informacion");
            objUsuario = new Usuario(idUsuario,nombre,nombreUsuario,contrasena,numero,email,informacion);
            }
            return objUsuario;
           }catch(Exception e){
               e.printStackTrace();
               return null;
       }
       
      
    }
    @Override
    public ResultSet visualizar(){
        Connection con = conectar();
        ResultSet resultSet= null;
        try{
            PreparedStatement preparedStatement = con.prepareStatement("select * from tbl_organizacion");
            resultSet = preparedStatement.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
     @Override
    public ResultSet visualizarFiltro(String nombreOrg) {
        Connection con = conectar();
       ResultSet resultSet = null;
       String sql = "select * from tbl_organizacion where nombreOrganizacion like ?";
       try{
           PreparedStatement statement = con.prepareStatement(sql);
           statement.setString(1,nombreOrg);
            resultSet = statement.executeQuery();
           /*while(resultSet.next()){
               int idOrganizacion = resultSet.getInt("idOrganizacion");
               String nombre = resultSet.getString("nombreOrganizacion");
               String descripcion = resultSet.getString("descripcion");
               byte[] logo = resultSet.getBytes("logo");
               byte[] imgRef = resultSet.getBytes("imagenReferencial");
               Organizacion objOrganizacion = new Organizacion(idOrganizacion,nombre,descripcion,logo,imgRef);
               listaOrganizacion.add(objOrganizacion);
           }*/
       }
       catch(Exception e){
           e.printStackTrace();
       }
      return resultSet;
    }

    @Override
    public void visualizarTabla(JTable tabla, ResultSet rs) {
        Connection con = conectar();
        
        tabla.setDefaultRenderer(Object.class, new RenderImagen());
        DefaultTableModel dt = new DefaultTableModel();
        
        dt.addColumn("nombreOrganizacion");
        dt.addColumn("descripcion");
        dt.addColumn("logo");
        
        try{
            while(rs.next()){
                Object[] fila = new Object[4];
                fila[0] = rs.getObject("nombreOrganizacion");
                fila[1] = rs.getObject("descripcion");
                       
                Blob blobLogo = rs.getBlob("logo");
                Blob blobRef = rs.getBlob("imagenReferencial");
                byte[] logoByte = blobLogo.getBytes(1, (int)blobLogo.length());
                byte[] imgRefByte = blobRef.getBytes(1, (int)blobRef.length());
                BufferedImage imgLogo= null,imgRef = null;
                try{
                    imgLogo = ImageIO.read(new ByteArrayInputStream(logoByte));
                    imgRef = ImageIO.read(new ByteArrayInputStream(imgRefByte));
                }catch(Exception e){
                    e.printStackTrace();
                }
                ImageIcon iconoLogo = new ImageIcon(imgLogo);
                ImageIcon iconoRef = new ImageIcon(imgRef);
                fila[2] = new JLabel(iconoLogo);
                fila[3] = new JLabel(iconoRef);
                
                dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(200);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

   

   



    
    
}
