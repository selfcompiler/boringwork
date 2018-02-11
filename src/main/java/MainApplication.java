import Config.BoringWorkConfiguration;
import DAO.InvoiceDAO;
import Pojo.Invoice;
import Resources.Invoice.InvoiceResourse;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<BoringWorkConfiguration> {

    final HibernateBundle<BoringWorkConfiguration> hibernate=new HibernateBundle<BoringWorkConfiguration>(Invoice.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(BoringWorkConfiguration configuration) {
            return configuration.getDatabaseConfiguration();
        }
    };

    public static void main(String args[]) throws Exception{

        new MainApplication().run(args);
    }
    @Override
    public String getName() {
        return "hello-world";
    }
    @Override
    public void run(BoringWorkConfiguration configuration, Environment environment) throws Exception {
        final InvoiceDAO invoiceDAO=new InvoiceDAO(hibernate.getSessionFactory());
        final InvoiceResourse invoiceResourse=new InvoiceResourse(invoiceDAO);
        environment.jersey().register(invoiceResourse);

    }

    @Override
    public void initialize(Bootstrap<BoringWorkConfiguration> bootstrap) {
        // nothing to do yet

        bootstrap.addBundle(hibernate);
    }

}
