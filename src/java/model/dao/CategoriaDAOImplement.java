/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Categoria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Agustin Suaña
 */
public class CategoriaDAOImplement implements CategoriaDAO {

    Transaction transaction;
    Session session;

    public boolean registrar(Categoria categoria) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(categoria);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
                return false;
            }
        }
        return true;
    }

    public Categoria editar(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        return (Categoria) session.createQuery("from Categoria as d where d.id=" + id).uniqueResult();
    }

    public boolean actualizar(Categoria categoria) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
//        Categoria cat = (Categoria)session.get(Categoria.class, categoria.getClass());
//        cat.setNombre(categoria.getNombre());
//        cat.setDescripcion(categoria.getDescripcion());
        session.update(categoria);
        transaction.commit();
        return true;
    }

    public boolean eliminar(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        Categoria categoria = (Categoria) session.get(Categoria.class, id);
        session.delete(categoria);
        transaction.commit();
        return true;
    }

    public ArrayList<Categoria> listar() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        return (ArrayList<Categoria>) session.createQuery("from Categoria").list();
    }

    public ArrayList<Categoria> buscar(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
