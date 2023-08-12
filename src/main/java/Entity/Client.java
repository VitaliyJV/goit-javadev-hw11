package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class Client {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private long id;

        @Column(name = "name", length = 200)
        private String name;
}




/*
Client (клієнт) - клієнт компанії. Має наступні властивості:
id - ідентифікатор, первинний сурогатний ключ, автоінкрементне число.
name - ім'я, від 3 до 200 символів включно
 */
