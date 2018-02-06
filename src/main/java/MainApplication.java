import Config.BoringWorkConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<BoringWorkConfiguration> {

    public static void main(String args[]) throws Exception{
        new MainApplication().run(args);
    }
    @Override
    public String getName() {
        return "hello-world";
    }
    @Override
    public void run(BoringWorkConfiguration configuration, Environment environment) throws Exception {

    }

    @Override
    public void initialize(Bootstrap<BoringWorkConfiguration> bootstrap) {
        // nothing to do yet
    }

}
