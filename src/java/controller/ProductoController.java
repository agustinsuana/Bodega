/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import model.dao.CategoriaDAO;
import model.dao.ProductoDAO;
import model.dao.ProductoDAOImplement;
import model.entity.Categoria;
import model.entity.Producto;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Agustin Suaña
 */
public class ProductoController extends ActionSupport implements ModelDriven {

    Producto producto = new Producto();
    ProductoDAO productoDAO;
    CategoriaDAO categoriaDAO;
    ArrayList<Producto> listaProducto = new ArrayList();
    ArrayList<Categoria> listaCategoria = new ArrayList();
    Categoria categoria = new Categoria();
    
    private int id;

    public ProductoController() {
        productoDAO = new ProductoDAOImplement();
    }

    public Producto getModel() {
        return producto;
    }

    public String registrar() {
        productoDAO.registrar(producto);
        return "exito";
    }

    public String editar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        producto = productoDAO.editar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String actualizar() {
        productoDAO.actualizar(producto);
        return "exito";
    }
    
    public String eliminar(){
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        productoDAO.eliminar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }
    
    public String listar(){
        listaProducto = productoDAO.listar();
        return "exito";
    }
    
    public String listarCategoria(){
        listaCategoria = categoriaDAO.listar();
        return "exito";
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
    
}
