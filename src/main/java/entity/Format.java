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
public class Format {

    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;


}
