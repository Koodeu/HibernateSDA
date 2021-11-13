package entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@ToString
@Entity
@Table(name="payment_types")
public class PaymentType extends  BasicEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

}
