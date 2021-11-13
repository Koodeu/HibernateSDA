package entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "categories")
public class Category extends BasicEntity {


    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;





    }

