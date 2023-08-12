package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data

public class Planet {

    @Enumerated(EnumType.STRING)
    @Id
    private Enum id;

    @Column(name = "name", length = 500)
    private String name;


}

/*
Planet (планета). Початковий або кінцевий пункт відправлення. Має наступні властивості:
id - ідентифікатор планети. Рядок, що складається виключно з латинських букв у верхньому регістрі та цифр. Наприклад,
MARS, VEN
name - назва планети, рядок від 1 до 500 символів включно
 */
