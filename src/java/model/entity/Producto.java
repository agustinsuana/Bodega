package model.entity;
// Generated 08-jul-2012 20:26:27 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer id;
     private Categoria categoria;
     private String descripcion;
     private BigDecimal precio;
     private BigDecimal cantidad;
     private String umedida;
     private Set<Detalle> detalles = new HashSet<Detalle>(0);

    public Producto() {
    }

    public Producto(Categoria categoria, String descripcion, BigDecimal precio, BigDecimal cantidad, String umedida, Set<Detalle> detalles) {
       this.categoria = categoria;
       this.descripcion = descripcion;
       this.precio = precio;
       this.cantidad = cantidad;
       this.umedida = umedida;
       this.detalles = detalles;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public String getUmedida() {
        return this.umedida;
    }
    
    public void setUmedida(String umedida) {
        this.umedida = umedida;
    }
    public Set<Detalle> getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(Set<Detalle> detalles) {
        this.detalles = detalles;
    }




}


