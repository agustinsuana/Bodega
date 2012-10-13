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
import model.dao.CategoriaDAOImplement;
import model.entity.Categoria;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Agustin Suaña
 */
public class CategoriaController extends ActionSupport implements ModelDriven {

    Categoria categoria = new Categoria();
    CategoriaDAO categoriaDAO;
    ArrayList<Categoria> listaCategoria = new ArrayList();
    private int id;

    public CategoriaController() {
        categoriaDAO = new CategoriaDAOImplement();
    }

    public Categoria getModel() {
        return categoria;
    }

    public String registrar() {
        categoriaDAO.registrar(categoria);
        return "exito";
    }

    public String editar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        categoria = categoriaDAO.editar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String actualizar() {
        categoriaDAO.actualizar(categoria);
        return "exito";
    }

    public String eliminar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        categoriaDAO.eliminar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String listar() {
        listaCategoria = categoriaDAO.listar();
        return "exito";
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
