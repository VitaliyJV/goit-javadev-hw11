package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Planet {

    @Id
    private String id;

    @Column(name = "name")
    private String name;


}

/*
Planet (планета). Початковий або кінцевий пункт відправлення. Має наступні властивості:
id - ідентифікатор планети. Рядок, що складається виключно з латинських букв у верхньому регістрі та цифр. Наприклад,
MARS, VEN
name - назва планети, рядок від 1 до 500 символів включно
 */
