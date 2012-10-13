/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entity.Categoria;
import model.entity.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Agustin Suaña
 */
public class ClienteDAOImplement implements ClienteDAO {

    Transaction transaction = null;
    Session session = null;

    public boolean registrar(Cliente cliente) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(cliente);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
                return false;
            }
        }
        return true;
    }

    public Cliente editar(int id) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            return (Cliente) session.createQuery("from Cliente as c where c.id=" + id).uniqueResult();
        } catch (Exception ex) {
            return null;
        }

    }

    public boolean actualizar(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        session.update(cliente);
        transaction.commit();
        return true;
    }

    public boolean eliminar(int id) {
        transaction = session.beginTransaction();
        Cliente cliente = (Cliente) session.get(Cliente.class, id);
        session.delete(cliente);
        transaction.commit();
        return true;
    }

    public ArrayList<Cliente> listar() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        return (ArrayList<Cliente>) session.createQuery("from Cliente").list();
    }

    public ArrayList<Cliente> buscar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
