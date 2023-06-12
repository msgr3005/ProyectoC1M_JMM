/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

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
    public void setDataBase(String str){
        this.database = str;
    }
    public String getDataBase(){
        return this.database;
    }
    
    public void agregar(Usuario obj) {
        //falta añadir la tabla
        String sql = "insert into tbl_usuario(username,password) values(?,?)";
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

    
    
}
