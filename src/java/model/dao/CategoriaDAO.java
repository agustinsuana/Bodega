/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Categoria;

/**
 *
 * @author Agustin Suaña
 */
public interface CategoriaDAO {

    public boolean registrar(Categoria categoria);

    public Categoria editar(int id);

    public boolean actualizar(Categoria categoria);

    public boolean eliminar(int id);

    public ArrayList<Categoria> listar();

    public ArrayList<Categoria> buscar(Categoria categoria);
}
