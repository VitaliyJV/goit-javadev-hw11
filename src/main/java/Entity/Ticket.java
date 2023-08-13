package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Ticket {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "created_at")
    private ZonedDateTime created_at;

    @Column(name = "client_id")
    private long client_id;

    @Column(name = "from_planet_id")
    private String from_planet_id;

    @Column(name = "to_planet_id")
    private String to_planet_id;



}

/*
Ticket (квиток). Має наступні властивості:
id - ідентифікатор квитка, первинний сурогатний ключ, автоінкрементне число.
created_at - TIMESTAMP в UTC, коли був створений цей квиток
client_id - ідентифікатор клієнта, якому належить цей квиток.
from_planet_id - ідентифікатор планети, звідки відправляється пасажир
to_planet_id - ідентифікатор планети, куди летить пасажир
 */
