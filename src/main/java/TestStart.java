import entity.Ticket;
import service.ClientCrudService;
import service.HibernateUtil;
import service.TicketCrudService;
import org.flywaydb.core.Flyway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        TicketCrudService ticketCrudService = new TicketCrudService();

        System.out.println(ticketCrudService.get(1L));
        Ticket ticket = ticketCrudService.get(1L).orElseThrow();
        ticket.setClient(clientCrudService.get(7L).orElseThrow());
        ticketCrudService.update(ticket);
        System.out.println(ticketCrudService.get(1L));

        HibernateUtil.getInstance().close();


    }
}



