/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author MAURICIO
 */
public class Organizacion {
    private int idOrganizacion;
    private String nombreOrganizacion;
    private String descripcion;
    private byte [] logo;
    private byte [] imagenReferencial;
    

    public Organizacion(String nombreOrganizacion, String descripcion, byte[] logo, byte[] imagenReferencial) {
        this.nombreOrganizacion = nombreOrganizacion;
        this.descripcion = descripcion;
        this.logo = logo;
        this.imagenReferencial = imagenReferencial;
    }
    public Organizacion(int idOrganizacion,String nombreOrganizacion, String descripcion, byte[] logo, byte[] imagenReferencial) {
        this.idOrganizacion = idOrganizacion;
        this.nombreOrganizacion = nombreOrganizacion;
        this.descripcion = descripcion;
        this.logo = logo;
        this.imagenReferencial = imagenReferencial;
    }

    
    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getImagenReferencial() {
        return imagenReferencial;
    }

    public void setImagenReferencial(byte[] imagenReferencial) {
        this.imagenReferencial = imagenReferencial;
    }

    
    
}
