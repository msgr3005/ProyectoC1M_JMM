/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author MAURICIO
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String nombreUsuario;
    private String contrasena;
   // private int numero;
    private String correo;
    private String informacion;
    private int idTipo;
    private int idOrganizacion;

    public Usuario(int idUsuario,String nombre, String nombreUsuario, String contrasena/*, int numero*/, String correo, String informacion,int idTipo, int idOrganizazcion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
       // this.numero = numero;
        this.correo = correo;
        this.informacion = informacion;
        this.idTipo = idTipo;
        this.idOrganizacion = idOrganizacion;
    }
    public Usuario( String nombre,String nombreUsuario, String contrasena/*, int numero*/, String correo, String informacion,int idTipo,int idOrganizacion) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        //this.numero = numero;
        this.correo = correo;
        this.informacion = informacion;
        this.idTipo = idTipo;
        this.idOrganizacion = idOrganizacion;
    }
    public Usuario( String nombre,String nombreUsuario, String contrasena/*, int numero*/, String correo, String informacion,int idTipo) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        //this.numero = numero;
        this.correo = correo;
        this.informacion = informacion;
        this.idTipo = idTipo;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   /* public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }*/

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    public int getIdTipo(){
        return this.idTipo;
    }

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }
   
    
}
