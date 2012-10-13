/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Producto;

/**
 *
 * @author Agustin Suaña
 */
public interface ProductoDAO {

    public boolean registrar(Producto producto);

    public Producto editar(int id);

    public boolean actualizar(Producto producto);

    public boolean eliminar(int id);

    public ArrayList<Producto> listar();

    public ArrayList<Producto> buscar(Producto producto);
}
