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
import model.dao.ProveedorDAO;
import model.dao.ProveedorDAOImplement;
import model.entity.Proveedor;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Agustin Suaña
 */
public class ProveedorController extends ActionSupport implements ModelDriven {

    Proveedor proveedor = new Proveedor();
    ProveedorDAO proveedorDAO;
    ArrayList<Proveedor> listaProveedor = new ArrayList();
    private int id;

    public ProveedorController() {
        proveedorDAO = new ProveedorDAOImplement();
    }

    public Proveedor getModel() {
        return proveedor;
    }

    public String registrar() {
        proveedorDAO.registrar(proveedor);
        return "exito";
    }

    public String editar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        proveedor = proveedorDAO.editar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String actualizar() {
        proveedorDAO.actualizar(proveedor);
        return "exito";
    }

    public String eliminar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        proveedorDAO.eliminar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String listar() {
        listaProveedor = proveedorDAO.listar();
        return "exito";
    }

    public ArrayList<Proveedor> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(ArrayList<Proveedor> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
}
