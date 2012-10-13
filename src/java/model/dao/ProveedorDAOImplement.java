/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Proveedor;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Agustin Suaña
 */
public class ProveedorDAOImplement implements ProveedorDAO {

    Transaction trasaction;
    Session session;

    public boolean registrar(Proveedor proveedor) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            trasaction = session.beginTransaction();
            session.save(proveedor);
            trasaction.commit();
        } catch (Exception ex) {
            if (trasaction != null) {
                trasaction.rollback();
                return false;
            }
        }
        return true;
    }

    public Proveedor editar(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        trasaction = session.beginTransaction();
        return (Proveedor) session.createQuery("from Proveedor as p where p.id=" + id).uniqueResult();
    }

    public boolean actualizar(Proveedor proveedor) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        trasaction = session.beginTransaction();
        session.update(proveedor);
        trasaction.commit();
        return true;
    }

    public boolean eliminar(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        trasaction = session.beginTransaction();
        Proveedor proveedor = (Proveedor) session.get(Proveedor.class, id);
        session.delete(proveedor);
        trasaction.commit();
        return true;
    }

    public ArrayList<Proveedor> listar() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        trasaction = session.beginTransaction();
        return (ArrayList<Proveedor>)session.createQuery("from Proveedor").list();
    }

    public ArrayList<Proveedor> buscar(Proveedor Proveedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
