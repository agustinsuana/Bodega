/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Producto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Agustin Suaña
 */
public class ProductoDAOImplement implements ProductoDAO {

    Transaction transaction = null;
    Session session = null;
    
    public boolean registrar(Producto producto) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(producto);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
                return false;
            }
        }
        return true;
    }

    public Producto editar(int id) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            return (Producto) session.createQuery("from Producto as p where p.id=" + id).uniqueResult();
        } catch (Exception ex) {
            return null;
        }

    }

    public boolean actualizar(Producto producto) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        session.update(producto);
        transaction.commit();
        return true;
    }

    public boolean eliminar(int id) {
        transaction = session.beginTransaction();
        Producto producto = (Producto) session.get(Producto.class, id);
        session.delete(producto);
        transaction.commit();
        return true;
    }

    public ArrayList<Producto> listar() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        return (ArrayList<Producto>) session.createQuery("from Producto").list();
    }

    public ArrayList<Producto> buscar(Producto Producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
