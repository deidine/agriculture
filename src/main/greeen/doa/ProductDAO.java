package greeen.doa;

import greeen.config.HibrnateUtils;
import greeen.models.Product;

import org.hibernate.Session;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import javax.swing.*;
import java.util.List;

public class ProductDAO {

    private SharedSessionContract session;

    // Method to fetch product count from database
    public int fetchDataCount(String table) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Number count = (Number) session.createQuery("select count(*) from " + table).uniqueResult();
            return count != null ? count.intValue() : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Method to fetch product info from database
    public List<Product> getProdInfo() {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            return session.createQuery("from Product order by productcode desc", Product.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to fetch product cost from database
    // public Double getProdCost(String prodCode) {
    //     try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
    //         Product product = session.get(Product.class, prodCode);
    //         return product != null ? product.getCostprice() : null;
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

    public List<Product> getProductSearch2(String text) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<Product> query = session.createQuery(
                    "from Product where productcode like :text or productname like :text or brand like :text",
                    Product.class);
            query.setParameter("text", "%" + text + "%");
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Product> getQueryResult(int limit, int offset) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<Product> query = session.createQuery("FROM Product", Product.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to fetch product sell price from database
    // public Double getProdSell(String prodCode) {
    //     try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
    //         Product product = session.get(Product.class, prodCode);
    //         return product != null ? product.getSellprice() : null;
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

    // Method to fetch product code from database based on product name
    public Product getProdCode(String prodName) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Product product = (Product) session.createQuery("from Product where productname = :name")
                    .setParameter("name", prodName)
                    .uniqueResult();
            return product != null ? product  : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to add a new product to the database
    @SuppressWarnings("deprecation")
    public void addProductDAO(Product product) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "le produit est enregister avec succes.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Make sure to close the session even if an exception occurs
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    // Method to update an existing product in the database
    public void editProdDAO(Product product) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(product);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "le produit est modifier.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Method to delete a product from the database
    public void deleteProductDAO(String code) {
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Product product = session.get(Product.class, code);
            if (product != null) {
                session.delete(product);
                JOptionPane.showMessageDialog(null, "le produit est suprimer.");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Method to check if quantity is valid
    public boolean validQuantity(int quantity, String code) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Product product = session.get(Product.class, code);
            return product != null && product.getQuantityPurchase() >= quantity;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to fetch current stock from the database
    public int currentStock(String code) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Product product = session.get(Product.class, code);
            return product != null ? product.getQuantityPurchase() : 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getProdSearch2Count(String txt) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT COUNT(p) FROM Product p WHERE p.productname LIKE :txt",
                    Long.class);
            query.setParameter("txt", "%" + txt + "%");
            return query.uniqueResult().intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }    public int getProductCount( ) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT COUNT(p) FROM Product ",
                    Long.class); 
            return query.uniqueResult().intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getRowsCount(String txt) {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.getProdSearch2Count(txt);
    }

    public List<Product> searchProducts(String txt) {
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Product p WHERE p.productname LIKE :txt OR p.productcode LIKE :txt";
            Query<Product> query = session.createQuery(hql, Product.class);
            query.setParameter("txt", "%" + txt + "%");
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updatePurchaseQuantite(int newQuntyt,String code) {
    
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Product product = session.get(Product.class, code );
              product.setQuantityPurchase(newQuntyt);
                 session.update(product);
              transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public void updateSalleQuantity(int newQuntyt,String code) {
    
        Transaction transaction = null;
        try (Session session = HibrnateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Product product = session.get(Product.class, code );
              product.setQuantitySalle(newQuntyt);
                 session.update(product);
              transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
