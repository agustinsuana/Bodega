/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Proveedor;

/**
 *
 * @author Agustin Suaña
 */
public interface ProveedorDAO {
    public boolean registrar(Proveedor proveedor);

    public Proveedor editar(int id);

    public boolean actualizar(Proveedor proveedor);

    public boolean eliminar(int id);

    public ArrayList<Proveedor> listar();

    public ArrayList<Proveedor> buscar(Proveedor Proveedor);
    
}
