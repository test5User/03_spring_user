package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "address")
@Getter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String street;
}
