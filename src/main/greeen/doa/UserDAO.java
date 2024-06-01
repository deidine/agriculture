package greeen.doa;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import greeen.config.HibrnateUtils;
import greeen.dto.UserDTO;
import greeen.models.InputPurchaseProduct;
import greeen.models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class UserDAO {

    // Constructor method
    public UserDAO() {}

    public List<User> getUserSearch(String text) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User u WHERE u.username LIKE :text OR u.phone LIKE :text OR u.fullName LIKE :text";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("text", "%" + text + "%");
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addUserDAO(UserDTO userDTO, String userType ) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "FROM User u WHERE u.fullName = :fullName AND u.location = :location AND u.phone = :phone AND u.userType = :userType";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("fullName", userDTO.getFullName());
            query.setParameter("location", userDTO.getLocation());
            query.setParameter("phone", userDTO.getPhone());
            query.setParameter("userType", userDTO.getUserType());

            if (query.uniqueResult() != null) {
                JOptionPane.showMessageDialog(null, "l'utilisateur est deja existe");
            } else {
                addFunction(userDTO, userType);
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void addFunction(UserDTO userDTO, String userType) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            User user = new User();
            user.setFullName(userDTO.getFullName());
            user.setLocation(userDTO.getLocation());
            user.setPhone(userDTO.getPhone());
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setUserType(userDTO.getUserType());
           
            session.save(user);

            if ("ADMINISTRATOR".equals(userType)) {
                JOptionPane.showMessageDialog(null, "nouvelle admin ajouter.");
            } else {
                JOptionPane.showMessageDialog(null, "nouvelle employee ajouter ");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void editUserDAO(UserDTO userDTO) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "UPDATE User SET fullName = :fullName, location = :location, phone = :phone, userType = :userType, password = :password WHERE username = :username";
            Query<?> query = session.createQuery(hql);
            query.setParameter("fullName", userDTO.getFullName());
            query.setParameter("location", userDTO.getLocation());
            query.setParameter("phone", userDTO.getPhone());
            query.setParameter("userType", userDTO.getUserType());
            query.setParameter("password", userDTO.getPassword());
            query.setParameter("username", userDTO.getUsername());

            query.executeUpdate();
            transaction.commit();
            JOptionPane.showMessageDialog(null, "l'information est modifier.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteUserDAO(int id) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
                JOptionPane.showMessageDialog(null, "user suprimer.");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<User> getQueryResult() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User";
            Query<User> query = session.createQuery(hql, User.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public List<User> getQueryResult(int limit, int offset ) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<User> query = session.createQuery("FROM User ", User.class);
             query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public User getUserDAO(String username) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User u WHERE u.username = :username";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public User login(String username,String password) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User WHERE username = :username and password=:password";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getFullName(UserDTO userDTO, String username) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User u WHERE u.username = :username";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);

            User user = query.uniqueResult();
            if (user != null) {
                userDTO.setFullName(user.getFullName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Object[]> getUserLogsDAO() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT u.fullName, ul.username, ul.inTime, ul.outTime, u.location FROM UserLog ul JOIN ul.user u";
            Query<Object[]> query = session.createQuery(hql, Object[].class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   
    
    public User getPassDAO(String username, String password) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM User u WHERE u.username = :username AND u.password = :password";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void changePass(String username, String password) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "UPDATE User SET password = :password WHERE username = :username";
            Query<?> query = session.createQuery(hql);
            query.setParameter("password", password);
            query.setParameter("username", username);

            query.executeUpdate();
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Password has been changed.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public DefaultTableModel buildTableModel(List<User> userList) {
        Vector<String> columnNames = new Vector<>();
        columnNames.add("ID");
        columnNames.add("NAME");
        columnNames.add("LOCATION");
        columnNames.add("PHONE");
        columnNames.add("USERNAME");
        columnNames.add("PASSWORD");
        columnNames.add("USERTYPE");
        columnNames.add("CANLOAN");

        Vector<Vector<Object>> data = new Vector<>();
        for (User user : userList) {
            Vector<Object> vector = new Vector<>();
            vector.add(user.getId());
            vector.add(user.getFullName());
            vector.add(user.getLocation());
            vector.add(user.getPhone());
            vector.add(user.getUsername());
            vector.add(user.getPassword());
            vector.add(user.getUserType());

            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }
}
