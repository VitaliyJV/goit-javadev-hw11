import Entity.Client;
import Entity.Ticket;
import Service.ClientCrudService;
import Service.HibernateUtil;
import Service.PlanetCrudService;
import Service.TicketCrudService;
import org.flywaydb.core.Flyway;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestStart {
    public static void main(String[] args) {

        Properties prop = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/main/resources/hibernate.properties");
        } catch (FileNotFoundException e) {
            System.out.println("Config file not found!");
            throw new RuntimeException(e);
        }
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Flyway flyway = Flyway.configure().dataSource(prop.getProperty("hibernate.connection.url") , prop.getProperty("hibernate.connection.user"), prop.getProperty("hibernate.connection.password")).load();
        flyway.migrate();

        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();
        TicketCrudService ticketCrudService = new TicketCrudService();

        System.out.println(ticketCrudService.get(1L));

        HibernateUtil.getInstance().close();


    }
}



