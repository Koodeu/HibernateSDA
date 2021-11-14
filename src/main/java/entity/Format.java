package entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@ToString
@Table(name="formats")
public class Format extends BasicEntity {

    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;


}
