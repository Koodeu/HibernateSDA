package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@MappedSuperclass
public class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

}
