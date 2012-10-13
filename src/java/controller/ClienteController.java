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
import model.dao.ClienteDAO;
import model.dao.ClienteDAOImplement;
import model.entity.Cliente;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Agustin Suaña
 */
public class ClienteController extends ActionSupport implements ModelDriven {

    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO;
    ArrayList<Cliente> listaCliente = new ArrayList();
    private int id;
    public ClienteController() {
        clienteDAO = new ClienteDAOImplement();
    }

    public Cliente getModel() {
        return cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public String registrar() {
        clienteDAO.registrar(cliente);
        return "exito";
    }

    public String editar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        cliente = clienteDAO.editar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String actualizar() {
        clienteDAO.actualizar(cliente);
        return "exito";
    }

    public String eliminar() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        clienteDAO.eliminar(Integer.parseInt(request.getParameter("id")));
        return "exito";
    }

    public String listar() {
        listaCliente = clienteDAO.listar();
        return "exito";
    }
}
