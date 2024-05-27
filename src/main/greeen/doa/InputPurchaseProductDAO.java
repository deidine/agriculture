package greeen.doa;

import greeen.config.HibrnateUtils;
import greeen.models.InputPurchaseProduct;

import greeen.doa.InputPurchaseProductDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class InputPurchaseProductDAO {

    // Create a new InputPurchaseProduct
    public void save(InputPurchaseProduct product) {
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

    // Get a single InputPurchaseProduct by ID
    public InputPurchaseProduct getById(Long id) {
        try (@SuppressWarnings("resource")
        Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.get(InputPurchaseProduct.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get all InputPurchaseProducts
    public List<InputPurchaseProduct> getAll() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from InputPurchaseProduct", InputPurchaseProduct.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Update an existing InputPurchaseProduct
    public void update(InputPurchaseProduct product) {
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

    // Delete an InputPurchaseProduct by ID
    public void deleteById(Long id) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            InputPurchaseProduct product = session.get(InputPurchaseProduct.class, id);
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

        public List<InputPurchaseProduct> getQueryResult(int limit, int offset) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<InputPurchaseProduct> query = session.createQuery("FROM InputPurchaseProduct", InputPurchaseProduct.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
