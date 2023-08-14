import Entity.Client;
import Entity.Planet;
import Service.ClientCrudService;
import Service.HibernateUtil;
import Service.PlanetCrudService;
import org.flywaydb.core.Flyway;

import java.util.Optional;

public class TestStart {
    public static void main(String[] args) {

        final String url = "jdbc:h2:./goit-javadev-hw10";
        final String user = "";
        final String password = "";

        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();
        flyway.migrate();

        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();
        
        HibernateUtil.getInstance().close();
    }
}





