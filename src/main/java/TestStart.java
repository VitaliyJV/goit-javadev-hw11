import Entity.Client;
import Entity.Ticket;
import Service.ClientCrudService;
import Service.HibernateUtil;
import Service.PlanetCrudService;
import Service.TicketCrudService;
import org.flywaydb.core.Flyway;
import org.hibernate.cfg.Configuration;

public class TestStart {
    public static void main(String[] args) {
        Configuration conf1 = new Configuration();
        Flyway flyway = Flyway.configure().dataSource(conf1.getProperty("url"), conf1.getProperty("username"), conf1.getProperty("password")).load();
        flyway.migrate();









//        ClientCrudService clientCrudService = new ClientCrudService();
//        PlanetCrudService planetCrudService = new PlanetCrudService();
//        TicketCrudService ticketCrudService = new TicketCrudService();
//
//        System.out.println(clientCrudService.get(2L));
//        Client client = clientCrudService.get(4L).orElseThrow();
//        client.setName("Update Name");
//        clientCrudService.update(client);
//        System.out.println(clientCrudService.get(4L));
//        Client newClient = Client.builder().name("New client").build();
//        clientCrudService.create(newClient);
//        System.out.println(clientCrudService.get(11L));
//        clientCrudService.delete(6L);
//        System.out.println("Client id=3 has next tickets: " + clientCrudService.get(3L).orElseThrow().getTickets());
//
//        System.out.println(planetCrudService.get("CAL"));
//        System.out.println("Planet id=CAL has next tickets to itself: " + planetCrudService.get("CAL").orElseThrow().getToPlanets());
//        System.out.println("Planet id=CAL has next tickets from itself: " + planetCrudService.get("CAL").orElseThrow().getFromPlanets());
//
//        System.out.println(ticketCrudService.get(1L));
//        Ticket ticket = ticketCrudService.get(1L).orElseThrow();
//        ticket.setClient(clientCrudService.get(7L).orElseThrow());
//        ticketCrudService.update(ticket);
//        System.out.println(ticketCrudService.get(1L));
//
//        HibernateUtil.getInstance().close();

    }
}



