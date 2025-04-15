package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "user")
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fio")
    private String name;
    private String email;
}
