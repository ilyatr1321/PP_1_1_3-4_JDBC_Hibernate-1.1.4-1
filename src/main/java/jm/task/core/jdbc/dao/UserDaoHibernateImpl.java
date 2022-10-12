package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Id;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {



    @Override
    public void createUsersTable() {
//        Transaction transaction = null;
//        try (Session session = Util.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.
    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        Transaction transaction = null;
//        try (Session session = Util.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(new User(name,lastName,age));
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
    }

    @Override
    public void removeUserById(long id) {
//        Transaction transaction = null;
//
//        try (Session session = Util.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            User user = session.get(User.class, id);
//            session.delete(user);
//            transaction.commit();
//        } catch (HibernateException e) {
//            if (transaction!=null) transaction.rollback();
//            e.printStackTrace();
//        }
    }

    @Override
    public List<User> getAllUsers() {
//        Session session = Util.getSessionFactory().openSession();
//        String hql = "from users";
//        List<User> userList = session.createQuery(hql).list();
//        session.close();
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
