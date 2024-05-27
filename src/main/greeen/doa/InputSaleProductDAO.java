package greeen.doa;

import greeen.config.HibrnateUtils;
import greeen.models.InputSaleProduct; 
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class InputSaleProductDAO {

    // Create a new InputSaleProduct
    public void save(InputSaleProduct product) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Get a single InputSaleProduct by ID
    public InputSaleProduct getById(Long id) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.get(InputSaleProduct.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get all InputSaleProducts
    public List<InputSaleProduct> getAll() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from InputSaleProduct", InputSaleProduct.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Update an existing InputSaleProduct
    public void update(InputSaleProduct product) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Delete an InputSaleProduct by ID
    public void deleteById(Long id) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            InputSaleProduct product = session.get(InputSaleProduct.class, id);
            if (product != null) {
                session.delete(product);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
