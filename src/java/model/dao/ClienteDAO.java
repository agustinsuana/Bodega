/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Cliente;

/**
 *
 * @author Agustin Suaña
 */
public interface ClienteDAO {
    public boolean registrar(Cliente cliente);

    public Cliente editar(int id);

    public boolean actualizar(Cliente cliente);

    public boolean eliminar(int id);

    public ArrayList<Cliente> listar();

    public ArrayList<Cliente> buscar(Cliente cliente);
}
