package greeen.doa;

import greeen.config.HibrnateUtils;
import greeen.models.Category; 
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDAO {

    // Create a new Category
    public void save(Category category) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Get a single Category by ID
    public Category getById(Long id) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.get(Category.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get all Categories
    public List<Category> getAll() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Category", Category.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Update an existing Category
    public void update(Category category) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(category);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Delete a Category by ID
    public void deleteById(Long id) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Category category = session.get(Category.class, id);
            if (category != null) {
                session.delete(category);
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
