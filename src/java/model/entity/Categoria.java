package model.entity;
// Generated 08-jul-2012 20:26:27 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String descripcion;
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Categoria() {
    }

	
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    public Categoria(String nombre, String descripcion, Set<Producto> productos) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}


