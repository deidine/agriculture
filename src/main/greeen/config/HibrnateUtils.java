package greeen.config;

import java.io.File;
import java.lang.System.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import greeen.models.Category;
import greeen.models.InputPurchaseProduct;
import greeen.models.InputSaleProduct;
import greeen.models.Product;
import greeen.models.User;
import jakarta.persistence.PersistenceException;
import java.util.logging.Level; 
import jakarta.persistence.Id;
/**
 *
 * @author deidine
 */
public class HibrnateUtils {
  private static final SessionFactory sessionFactory;

    static {
        try {
            File cfgFile = new File("src/main/resources/hibernate.cfg.xml");
            Configuration configuration = new Configuration().configure(cfgFile);
            configuration.addAnnotatedClass(Product.class);
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(InputSaleProduct.class);
            configuration.addAnnotatedClass(InputPurchaseProduct.class);
            configuration.addAnnotatedClass(Category.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
